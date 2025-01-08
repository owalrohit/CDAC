package com.cdac.dao;

import java.sql.SQLException;
import java.util.List;

import com.cdac.pojos.User;

public interface UserDao {
//add a method to fetch user details by role
	List<User>   fetchUserDetailsByRole(String role) throws SQLException;
	
	//method to register voter 
	public String registerVoter(User newVoter) throws SQLException;
	
	//method to change password
	public String changePassword(String email,String oldPassword,String newPassword) throws SQLException;
	
	//create method to delete voter
	public String deleteVoter(int id) throws SQLException;
	
	//sign in 
	public String signIn(String email, String password) throws SQLException;
	
	//add a method to clean up DB resources;
	void cleanUp() throws SQLException;
}
