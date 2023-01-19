package com.dal;

import java.sql.SQLException;
import java.util.List;

import com.pojo.BankAccount;

public interface AccountDAL {
	
	List<BankAccount> getAllAccounts() throws SQLException;
	
	int insertAccount(BankAccount account) throws SQLException;
	
	int deleteAccountByNo(int accNo) throws SQLException;
	
	int updateAccount(int accNo,BankAccount account);
	
	BankAccount getAccountByNo(int accNo);

}
