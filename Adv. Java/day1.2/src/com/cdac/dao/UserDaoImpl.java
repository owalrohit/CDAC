package com.cdac.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.cdac.pojos.User;
import static com.cdac.utils.DBUtils.*;

public class UserDaoImpl implements UserDao {
	// state -
	private Connection connection;
	private PreparedStatement pst1, pst2, pst3, pst4, pst5;

	// ctor
	public UserDaoImpl() throws SQLException {
		// 1. Invoke DButils' method to open cn
		connection = openConnection();
		// 2. Create PST
		pst1 = connection.prepareStatement("select * from users where role=?");
		pst2 = connection.prepareStatement("insert into users values(default,?,?,?,?,?,?,?)");
		pst3 = connection.prepareStatement("select password ,role from users where email=?");
		pst4 = connection.prepareStatement("update users set password=? where email=?");
		pst5 = connection.prepareStatement("delete from users where id=?");
		System.out.println("user dao created !");
	}

	@Override
	public List<User> fetchUserDetailsByRole(String role) throws SQLException {
		// 0. create empty list
		List<User> users = new ArrayList<>();
		// 1. set IN param
		pst1.setString(1, role);
		// 2 exec query -> process RST
		try (ResultSet rst = pst1.executeQuery()) {
			/*
			 * int userId, String firstName, String lastName, String email, String password,
			 * Date dob, boolean status, String userRole
			 */
			while (rst.next()) {
				users.add(new User(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4),
						rst.getString(5), rst.getDate(6), rst.getBoolean(7), rst.getString(8)));
			}
		}
		return users;// dao layer rets list of selected users --> Tester
	}

	@Override
	public void cleanUp() throws SQLException {
		// close pst1
		if (pst1 != null)
			pst1.close();
		if (pst2 != null)
			pst2.close();
		if (pst3 != null)
			pst3.close();
		if (pst4 != null)
			pst4.close();
		if (pst5 != null)
			pst5.close();
		// close connection
		closeConnection();
		System.out.println("user dao cleaned up !");

	}

	@Override
	public String registerVoter(User newVoter) throws SQLException {
		// 1.Readfrom newVoter and set IN params
		pst2.setString(1, newVoter.getFirstName());
		pst2.setString(2, newVoter.getLastName());
		pst2.setString(3, newVoter.getEmail());
		pst2.setString(4, newVoter.getPassword());
		pst2.setDate(5, newVoter.getDob());
		pst2.setBoolean(6, newVoter.isStatus());
		pst2.setString(7, newVoter.getUserRole());

		// exe query -->
		int updateCount = pst2.executeUpdate();
		if (updateCount == 1)
			return "user registerd";
		return "user registration failed !!!!!";
	}

	@Override
	public String changePassword(String email, String newPassword, String oldPassword) throws SQLException {
		pst3.setString(1, email);
		ResultSet rst = pst3.executeQuery();
		// System.out.println("inside change password");
		if (rst.next()) {
			String oldPW = rst.getString("password");
			// System.out.println(oldPW);
			if (oldPW.equals(oldPassword)) {
				pst4.setString(1, newPassword);
				pst4.setString(2, email);

				int updateCount = pst4.executeUpdate();
				if (updateCount == 1)
					System.out.println("Password Updated!!");
			} else {
				System.out.println("Password Incorrect!!");
			}
		} else {
			System.out.println("Invaild Email!!");
		}
		return "Password Updation Failed!!";
	}

	@Override
	public String deleteVoter(int id) throws SQLException {
		pst5.setInt(1, id);
		int updateCount = pst5.executeUpdate();
		if (updateCount == 1) {
			System.out.println("voter deleted");
			return "voter deleted";
		}
		return "invalid id";
	}

	@Override
	public String signIn(String email, String password) throws SQLException {
		pst3.setString(1, email);
		ResultSet rst = pst3.executeQuery();
		if (rst.next()) {
			String oldPass = rst.getString("password");
			
			if (oldPass.equals(password)) {
				String res = rst.getString("role");
				return res;
			} else {
				return "wrong password";
			}

		}
		return "invalid email !!!";
	}
}