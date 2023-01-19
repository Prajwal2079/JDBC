package com.pojo;

public class BankAccount {

	private int accountNo;
	private int balance;
	private String accType;
	private String status;
	
	
	public BankAccount(int accountNo, int balance, String accType, String status) {
		super();
		this.accountNo = accountNo;
		this.balance = balance;
		this.accType = accType;
		this.status = status;
	}
	public BankAccount(int balance, String accType, String status) {
		super();
		this.balance = balance;
		this.accType = accType;
		this.status = status;
	}
	
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "BankAccount [accountNo=" + this.accountNo + ", balance=" + this.balance + ", accType=" + accType.toString() + ", status="
				+ status + "]";
	}





}
