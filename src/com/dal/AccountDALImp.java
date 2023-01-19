package com.dal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.pojo.BankAccount;
import com.util.ConnectionToDatabase;

public class AccountDALImp implements AccountDAL{
	
	private Connection con;
	private PreparedStatement pstmt,pstmt2;
	private CallableStatement cstmt;
	private Statement stmt;
	private ResultSet result;
	private int answer; 
	
	public AccountDALImp() throws SQLException, ClassNotFoundException {
		
		con = ConnectionToDatabase.openConnection();
		stmt  = con.createStatement();	
		pstmt = con.prepareStatement("insert into bankaccount values(default,?,?,?)");
		pstmt2 = con.prepareStatement("Delete from bankaccount where accountno = ?");
	}

	@Override
	public List<BankAccount> getAllAccounts() throws SQLException {
		List<BankAccount> allacounts = new ArrayList<BankAccount>();
		BankAccount acc;
		result = stmt.executeQuery("Select * from bankaccount");
		while(result.next()) {
			acc = new BankAccount(result.getInt("accountno"), result.getInt("balance"), result.getString("accounttype"),result.getString("status"));
			allacounts.add(acc);
			}
		return allacounts;
	}

	@Override
	public int insertAccount(BankAccount account) throws SQLException {
//		pstmt.setInt(1,account.getAccountNo());
		pstmt.setInt(1,account.getBalance());
		pstmt.setString(2,account.getAccType());
		pstmt.setString(3, account.getStatus());
		answer = pstmt.executeUpdate();
		return answer;
	}

	@Override
	public int deleteAccountByNo(int accNo) throws SQLException {
		pstmt2.setInt(1,accNo);
		answer = pstmt2.executeUpdate();
		return answer;
		
	}

	@Override
	public int updateAccount(int accNo, BankAccount account) {
		
		return answer;
		
	}

	@Override
	public BankAccount getAccountByNo(int accNo) {
		return null;
	}

}
