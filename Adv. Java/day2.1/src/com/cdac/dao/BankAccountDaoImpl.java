package com.cdac.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

import static com.cdac.utils.DBUtils.*;

public class BankAccountDaoImpl implements BankAccountDao {

	private Connection connection;
	private CallableStatement cst1, cst2;

	// def ctor
	public BankAccountDaoImpl() throws SQLException {
		// 1.get connection
		connection = openConnection();
		String sql = "{call transfer_funds_proc(?,?,?,?,?)}";
		// 2.create CST
		cst1 = connection.prepareCall(sql);
		// 3.register OUT params
		cst1.registerOutParameter(4, Types.DOUBLE);
		cst1.registerOutParameter(5, Types.DOUBLE);
		System.out.println("bank account dao created");

		// 4.prepare callable statement for store function
		String sqlFunc = "{? = call transfer_funds_func()?,?,?}";
		cst2 = connection.prepareCall(sqlFunc);

	}

	@Override
	public String transferFundsProcedure(int srcId, int destId, double transferAmount) throws SQLException {

		// 1.Set IN params(using inherited API from PreparedStatement)
		cst1.setInt(1, srcId);
		cst1.setInt(2, destId);
		cst1.setDouble(3, transferAmount);
		// 2. execute store procedure
		cst1.execute();
		return "updated src balance : " + cst1.getDouble(4) + " Dest. balance : " + cst1.getDouble(5);

	}

	@Override
	public String transferFundsFunction(int srcId, int destId, double transferAmount) throws SQLException {

		cst2.setInt(2, srcId);
		cst2.setInt(3, destId);
		cst2.setDouble(4, transferAmount);
		cst2.execute();

		return "updated balance of  destId id : " + cst2.getInt(destId) + " is : " + cst2.getDouble(1);
	}

	@Override
	public void cleanUp() throws SQLException {
		if (cst1 != null)
			cst1.close();
		closeConnection();
	}

}