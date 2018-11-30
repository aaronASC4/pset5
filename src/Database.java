import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 * This class will serve as the intermediary between our ATM program and
 * the database of BankAccounts. It'll be responsible for fetching accounts
 * when users try to login, as well as updating those accounts after any
 * changes are made.
 */

public class Database {
	
	private String[] accounts;
	
	public getAllAccounts;
	
	public BankAccount getAccount(long accountNumber) throws FileNotFoundException, IOException {
		   BankAccount account = null;
		
		try(BufferedReader br = new BufferedReader(new FileReader("accounts-db.txt"))) {
		 	String line;
		 while ((line = br.readLine()) !=null) {
			 long acctNum = Long.parseLong(line.substring(0,9));
				
				if (acctNum == accountNumber && line.charAt(148) == 'Y') {
					int pin = Integer.parseInt(line.substring(9, 13));
					double balance = Double.parseDouble(line.substring(13, 28));
					String lname = line.substring(28, 48).trim();
					String fname = line.substring(48, 63).trim();
					String dob = line.substring(63, 71);
					long phone = Long.parseLong(line.substring(71, 81));
					String address = line.substring(81, 111).trim();
					String city = line.substring(111, 141).trim();
					String state = line.substring(141, 143);
					String postal = line.substring(143, 148);
					
					account = new BankAccount(acctNum, balance, new User(pin, fname, lname, dob, address, city, phone, state, postal));
					break;
					}
		 		}
			}
			return account;
		}
		public void updateAccount(BankAccount account, BankAccount destaination) throws IOException {
			accounts = getAllAccounts();
			
			try (BufferedWriter bw = new BufferedWriter(new FileWriter("accounts-db.txt"))) {
				
				if(account != null) {
					for (int i = 0; i < accounts.length; i++) {
						if (accounts[i].startsWith(String.valueOf(account.getAccountNumber()))) {
							accounts[i] = account.toString();
							newAccount = false;
						}
					}
					
					
				}
			}
		}

		private Object getAllAccounts() {
			// TODO Auto-generated method stub
			return null;
		}
	
	//MR Wilson Im cheating hehehehehehe https://i.kym-cdn.com/entries/icons/original/000/000/091/TrollFace.jpg
	
}