package com.cdac.dao;

import java.sql.SQLException;
import java.util.List;

import com.cdac.pojos.User;

public interface UserDao {
	//add a method to fetch user details by role
	List<User> fetchUserDetailsByRole(String role) throws SQLException;
	
	// Registration 
	String registerVoter(User newVoter) throws SQLException;
	
	// Change Password
	String changePassword(String email, String password) throws SQLException;
	
	// Delete the voter
	String deleteVoter(int id) throws SQLException;
	
	// Sign in
	User signin(String email, String password) throws SQLException;
	
	//add a method to clean up DB resources;
	void cleanUp() throws SQLException;

	
}
