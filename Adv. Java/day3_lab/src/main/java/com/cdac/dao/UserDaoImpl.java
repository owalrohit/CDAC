package com.cdac.dao;

import java.sql.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

import com.cdac.pojos.User;
import static com.cdac.utils.DBUtils.*;

public class UserDaoImpl implements UserDao {
	//state - 
	private Connection connection;
	private PreparedStatement pst1,pst2,pst3;
	//ctor
	public UserDaoImpl() throws SQLException{
		// 1. Invoke DButils' method to get cn
		connection=getConnection();
		//2. Create PST
		pst1=connection.prepareStatement("select * from users where role=?");
		pst2=connection.prepareStatement("select * from users where email=? and password=?");
		pst3=connection.prepareStatement("insert into users values(default,?,?,?,?,?,?,?)");
		System.out.println("user dao created !");
	}

	@Override
	public List<User> fetchUserDetailsByRole(String role) throws SQLException {
		//0. create empty list
		List<User> users=new ArrayList<>();
		//1. set IN param
		pst1.setString(1, role);
		//2 exec query -> process RST
		try (ResultSet rst=pst1.executeQuery()) {
			/*
			 * int userId, String firstName, String lastName, 
			 * String email, String password, Date dob, boolean status,
			String userRole
			 */
			while(rst.next()) {
				users.add(new User(rst.getInt(1),rst.getString(2),
						rst.getString(3),rst.getString(4),rst.getString(5),
						rst.getDate(6),rst.getBoolean(7),rst.getString(8))
						);
			}
		}
		return users;//dao layer rets list of selected users --> Tester
	}
	

	@Override
	public User authenticateUser(String email, String password) throws SQLException {
		// 1. set IN params
		pst2.setString(1, email);
		pst2.setString(2, password);
		//exec method - execQuery
		try(ResultSet rst=pst2.executeQuery() )
		{
			if(rst.next())
				return new User(rst.getInt(1),rst.getString(2),
						rst.getString(3),rst.getString(4),rst.getString(5),
						rst.getDate(6),rst.getBoolean(7),rst.getString(8));
				
		}
		//invalid login
		return null;
	}
	
	

	public String registerVoter(User newVoter) throws SQLException {
		//read from newVoter and set In Parameter
		// id | first_name | last_name | email  password | dob| status | role	
		LocalDate dob = newVoter.getDob().toLocalDate(); // Convert java.sql.Date to LocalDate
	    LocalDate currentDate = LocalDate.now();
	    int age = Period.between(dob, currentDate).getYears();

	    // Check if age is less than 18
	    if (age < 18) {
	        return "Error_Age";
	        
	    }
		pst3.setString(1,newVoter.getFirstName());
		pst3.setString(2,newVoter.getLastName());
		pst3.setString(3,newVoter.getEmail() );
		pst3.setString(4,newVoter.getPassword());
		pst3.setDate(5,newVoter.getDob());
		pst3.setBoolean(6,newVoter.isStatus());
		pst3.setString(7,newVoter.getUserRole());
		
		//exec query - exec update - DDl | DML
		//public int executeUpdate() throws SQlException;
		
		int updateCount=pst3.executeUpdate();
		if(updateCount == 1)
		{
			return "Success";
		}
		return "Failed";
	}

	@Override
	public void cleanUp() throws SQLException {
		//close pst1 n pst2
		if(pst1 != null)
			pst1.close();	
		if(pst2 != null)
			pst2.close();
		if(pst3 != null)
			pst3.close();
		System.out.println("user dao cleaned up !");
		
	}
	

}
