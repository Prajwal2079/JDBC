package com.dal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.pojo.BankAccount;
import com.util.ConnectionToDatabase;

public class AccountDALImp implements AccountDAL{
	
	private Connection con;
	private PreparedStatement pstmt;
	private CallableStatement cstmt;
	private Statement stmt;
	
	public AccountDALImp() throws SQLException {
		con = ConnectionToDatabase.getConnection();
		stmt  = con.createStatement();		
		
	}

	@Override
	public List<BankAccount> getAllAccounts() throws SQLException {
		stmt.execute("Select * from bankaccount");
		return null;
	}

	@Override
	public void insertAccount(BankAccount account) {
		
	}

	@Override
	public void deleteAccountByNo(int accNo) {
		
	}

	@Override
	public void updateAccount(int accNo, BankAccount account) {
		
	}

	@Override
	public BankAccount getAccountByNo(int accNo) {
		return null;
	}

}
