package com.tester;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.dal.AccountDALImp;
import com.pojo.BankAccount;

public class Driver {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in);){
			int choice = 0;
			AccountDALImp accounts = new AccountDALImp();

			do {
				System.out.println("1:Show all Accounts\r\n" + 
						"2:Add New Account\r\n" + 
						"3:Update/Edit Account\r\n" + 
						"4:Delete Account\r\n" + 
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
					
					break;
				case 3:
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
