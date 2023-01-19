package com.tester;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.dal.AccountDALImp;
import com.pojo.BankAccount;

public class Driver {

	public static void main(String[] args) throws ClassNotFoundException {
		try(Scanner sc = new Scanner(System.in);){
			int choice = 0;
			AccountDALImp accounts = new AccountDALImp();

			do {
				System.out.println("1:Show all Accounts\r\n" + 
						"2:Add New Account\r\n" + 
						"3:Delete Account\r\n" + 
						"4:Update/Edit Account\r\n" + 
						"5:Deposite for specific account\r\n" + 
						"6:Withdraw for specific account\r\n" + 
						"7:Transfer Money from one account to Other Account(use stored procedure)"+
						"8:Exit");

				System.out.println("Enter your choice");

				switch(sc.nextInt()) {
				case 1:
					System.out.println("All Accounts");
					List<BankAccount> allAccounts = accounts.getAllAccounts();
					allAccounts.forEach(acc->System.out.println(acc));
					break;
				case 2:
					System.out.println("Enter balance,AccountTypeand status");
					BankAccount acc = new BankAccount(sc.nextInt(),sc.next(),sc.next());
					if(accounts.insertAccount(acc)>0) {
						System.out.println("Account added successfully");
					}
					break;
				case 3:
					System.out.println("Enter accountNo to be deleted");
					if(accounts.deleteAccountByNo(sc.nextInt())>0) {
						System.out.println("Account deleted succesfully");
					}
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					break;
				case 7:
					break;
				default:
					break;
				}

			}while(choice!=5);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
