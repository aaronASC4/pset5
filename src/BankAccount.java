import java.util.Scanner;
/**
 * Just like last time, the BankAccount class is primarily responsible
 * for depositing and withdrawing money. In the enhanced version, there
 * will be the added requirement of transfering funds between accounts.
 * 
 * Most of the functionality for this class should have already been
 * implemented last time. You can always reference my Github repository
 * for inspiration (https://github.com/rwilson-ucvts/java-sample-atm).
 */

public class BankAccount {
	
	private long accountNumber;
	private static long maxNum;
	private double balance;
	private User user;
	
	/**
	 * Constructor for BankAccount class.
	 * 
	 * @param balance
	 * @param user
	 */
	
	/**BankAccount(Database database) {
		maxNum = database.maxNumber() + 1;
	}**/
	
	public BankAccount(long accountNumber, double balance, User user) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.user = user;
	}
	
	/////////////////////////////////// GETTERS AND SETTERS ///////////////////////////////////
	
	/**
	 * Retrieves the account number.
	 * 
	 * @return accountNumber
	 */
	
	BankAccount(Database database) {
		maxNum = database.maxNumber() + 1;
	}
	
	BankAccount(Scanner in) {
		this.user = new User(in);
		this.accountNumber = maxNum++;
		this.balance = 0;
	}
	
	public long getAccountNumber() {
		return accountNumber; 
	}

	
	/**
	 * Retrieves the balance.
	 * 
	 * @return balance
	 */
	
	public double getBalance() {
		return balance;
	}
	
	/**
	 * Retrieves the user.
	 * 
	 * @return user
	 */
	
	public User getUser() {
		return user;
	}
	
	/**
	 * Sets the value of accountNumber.
	 * 
	 * @param accountNumber the new account number
	 */
	
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	/**
	 * Sets the value of balance.
	 * 
	 * @param balance the new balance
	 */
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	/**
	 * Sets the value of user.
	 * 
	 * @param user the new user
	 */
	
	public void setUser(User user) {
		this.user = user;
	}
	
	/////////////////////////////////// INSTANCE METHODS ///////////////////////////////////
	
	/**
	 * Deposits money into this account.
	 * 
	 * @param amount the money to deposit
	 * @return a status code (0: invalid amount, 1: success)
	 */
	public void transfer() {
		
	}
	
	public int deposit(double amount) {
		if (amount <= 0) {
			return 0;
		} else {
			balance = balance + amount;
			
			return 1;
		}
	}
	
	/**
	 * Withdraws money from this account.
	 * 
	 * @param amount the money to withdraw
	 * @return a status code (0: insufficient funds, 1: invalid amount, 2: success)
	 */
	
	public int withdraw(double amount) {
		if (amount > balance) {
			return 0;
		} else if (amount <= 0) {
			return 1;
		} else {
			balance = balance - amount;
			return 2;
		}
	}
	
	@Override
	public String toString() {
		String account = String.format("%-2s", Long.toString(getAccountNumber()));
		account += String.format("%-4s", Integer.toString(this.user.getPIN()));
		account += String.format("%-15s", Double.toString(this.getBalance()));
		account += String.format("%-20s", this.user.getlastName());
		account += String.format("%-15s", this.user.getfirstName());
		account += String.format("%-8s", this.user.getDOB());
		account += String.format("%-10s", this.user.getPhone());
		account += String.format("%-30s", this.user.getstreetAddress());
		account += String.format("%-30s", this.user.getCity());
		account += String.format("%-2s", this.user.getState());
		account += String.format("%-5s", this.user.getpostalCode());
		account += String.format("%-1s", Character.toString(this.user.getStatus()));
		return account;
	}
}