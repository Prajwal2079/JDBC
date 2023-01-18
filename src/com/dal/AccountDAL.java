package com.dal;

import java.sql.SQLException;
import java.util.List;

import com.pojo.BankAccount;

public interface AccountDAL {
	
	List<BankAccount> getAllAccounts() throws SQLException;
	
	void insertAccount(BankAccount account);
	
	void deleteAccountByNo(int accNo);
	
	void updateAccount(int accNo,BankAccount account);
	
	BankAccount getAccountByNo(int accNo);

}
