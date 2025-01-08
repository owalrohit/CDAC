package com.cdac.dao;

import java.sql.SQLException;

public interface BankAccountDao {
	
	//add a method to exec stored proc - to transfer funds
	String transferFundsProcedure(int srcId, int destId, double transferAmount) throws SQLException;
	
	//add a method to exec stored proc - to transfer funds
	String transferFundsFunction(int srcId, int destId, double transferAmount) throws SQLException;
		
	//add a method to clean up dao
	void cleanUp() throws SQLException;
}
