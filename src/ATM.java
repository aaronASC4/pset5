/**
 * Just like last time, the ATM class is responsible for managing all
 * of the user interaction. This means login procedures, displaying the
 * menu, and responding to menu selections. In the enhanced version, the
 * ATM class will have the added responsibility of interfacing with the
 * Database class to write and read information to and from the database.
 * 
 * Most of the functionality for this class should have already been
 * implemented last time. You can always reference my Github repository
 * for inspiration (https://github.com/rwilson-ucvts/java-sample-atm).
 */

import java.util.Scanner;

public class ATM {
	private Scanner in;
	
	private BankAccount bankAccount;
	
	public ATM(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}

	public static void main(String args[]) {
		ATM atm = new ATM(
				new BankAccount(						// create new BankAccount
					0,							// initial balance is 0
					new User(						// create new User
						1234,						// PIN is 1234
						"Aaron Graves",					// name is Aaron Graves
						"December 9, 2000",				// date of birth is December 9, 2000
						"123 street",
						"Hillside",
						"908Keon",
						"NJ",
						"07205"// address is 123 street
					)
				)
			);

		atm.run();
	}
	
	public void run() {
		in = new Scanner(System.in);
		boolean secure = false;
		
		while(!secure) {
			System.out.print("Account # : ");
			long accountNumber = in.nextLong();
			System.out.print("    PIN # : ");
			int PIN = in.nextInt();
			if (this.bankAccount.getAccountNumber() == accountNumber && this.bankAccount.getAccountHolder().getPIN() == PIN) {
				secure = true;
			}
			else {
				System.out.println("Invalid account number and/or PIN.");
			}
		}
		
		System.out.print("\nHi " + this.bankAccount.getAccountHolder().getName() + "! What can I help you with?");
		
		menu();
	}
	
	public void menu() {
		in = new Scanner(System.in);
		int menu = 0;
		
		System.out.print("\n\n   [1] Deposit\r\n" + 
				"   [2] Withdraw\r\n" + 
				"   [3] View Balance\r\n" + 
				"   [4] Exit\r\n" + 
				"\r\n" + 
				"Make a selection: ");
		
		while(menu == 0) {
			switch(in.nextInt()) {
			case 1:
				System.out.print("\nAlright, so we're depositing some money.\r\n" + 
						"\r\n" + 
						"Enter Amount: ");
				double deposit = in.nextDouble();
				
				if(this.bankAccount.deposit(deposit) == 0) {
					System.out.print("\nAmount must be greater than $0.00.");
				} else {
					System.out.print("\nDeposited $" + deposit + ". Updated balance is $" + this.bankAccount.getBalance() + ".");
				}
				
				menu();
			case 2:
				if (this.bankAccount.getBalance() == 0) {
					System.out.print("\nYou don't have any money to withdraw. Try depositing money first.");
				}
				else {
					System.out.print("\nAlright, so we're withdrawing some money.\r\n" + 
							"\r\n" + 
							"Enter Amount: ");
					
					double withdraw = in.nextDouble();
					
					if(this.bankAccount.withdraw(withdraw) == 2) {
						System.out.print("\nWithdrew $" + withdraw + ". Updated balance is $" + this.bankAccount.getBalance() + ".");
					} 
					else if(this.bankAccount.withdraw(withdraw) == 1) {
						System.out.print("\nAmount must be greater than $0.00.");
					} 
					else {
						System.out.print("\nInsufficient funds.");
					}
				}

				menu();
			case 3:
				System.out.print("\nCurrent balance is $" + this.bankAccount.getBalance() + ".");
				menu();
			case 4:
				System.out.print("\nGoodye!");
				break;
			default: 
				menu();
			}
		}
		in.close();
	}	
}