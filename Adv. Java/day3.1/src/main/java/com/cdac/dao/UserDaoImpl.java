package com.cdac.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

import com.cdac.pojos.User;
import static com.cdac.utils.DBUtils.*;


public class UserDaoImpl implements UserDao {
	//state - 
	private Connection connection;
	private PreparedStatement pst1;
	private PreparedStatement pst2;
	private PreparedStatement pst3;
	private PreparedStatement pst4;
	private PreparedStatement pst5;
	
	
	//ctor
	public UserDaoImpl() throws SQLException{
		// 1. Invoke DButils' method to open cn
		connection = getConnection();
		//2. Create PST
		pst1=connection.prepareStatement("select * from users where role=?");
		System.out.println("user dao created !");
		
		pst2 = connection.prepareStatement("insert into users values(default,?,?,?,?,?,?,?)");
		
		pst3 = connection.prepareStatement("update users set password = ? where email = ?");
		
		pst4 = connection.prepareStatement("delete from users where id = ?");
		
		pst5 = connection.prepareStatement("select * from users where email = ? and password = ?");
		
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

	
	public String registerVoter(User newVoter) throws SQLException{
		//1. read from new voter n set IN params
		pst2.setString(1, newVoter.getFirstName());
		pst2.setString(2, newVoter.getLastName());
		pst2.setString(3, newVoter.getEmail());
		pst2.setString(4, newVoter.getPassword());
		pst2.setDate(5, newVoter.getDob());
		pst2.setBoolean(6, newVoter.isStatus());
		pst2.setString(7, newVoter.getUserRole());
		
		LocalDate dob = newVoter.getDob().toLocalDate(); // Convert java.sql.Date to LocalDate
	    LocalDate currentDate = LocalDate.now();
	    int age = Period.between(dob, currentDate).getYears();

	    // Check if age is less than 18
	    if (age < 18) {
	    	return "User registration failed!!! Age is below 18";
	        
	    }
	    else {
	    	//execute query - executeUpdate - DDL | DML
			int updateCount = pst2.executeUpdate();
			if(updateCount == 1)
				return "User Registerd!";
			else
				return "User registration failed!!! Age is below 18";
	    }
		
		
	}
	
	public String changePassword(String email, String newPassword) throws SQLException{
		
		pst3.setString(1, newPassword);
		pst3.setString(2, email);
		
		int rowUpdated = pst3.executeUpdate();
		if(rowUpdated > 0)
			return "Password Updated Successfully!";
		return "Password update failed";
	}
	
	public String deleteVoter(int voterId) throws SQLException{
		pst4.setInt(1, voterId);
		int rowDeleted = pst4.executeUpdate();
		if(rowDeleted > 0)
			return "User deleted successfully!";
		return "Something went wrong!";
		
	}
	
	public User signin(String email, String password) throws SQLException{
		
		pst5.setString(1, email);
		pst5.setString(2, password);
		
		// Resultset maching email and password
		try(ResultSet rst=pst5.executeQuery()){
			
			if(rst.next()) {
				return new User(rst.getInt(1),rst.getString(2),
						rst.getString(3),rst.getString(4),rst.getString(5),
						rst.getDate(6),rst.getBoolean(7),rst.getString(8))
						;
			}
		}
		return null;
		
	}
	
	
	@Override
	public void cleanUp() throws SQLException {
		//close pst1
		if(pst1 != null)
			pst1.close();
	
		System.out.println("user dao cleaned up !");
		
	}


}
