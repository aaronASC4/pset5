import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * This class will serve as the intermediary between our ATM program and
 * the database of BankAccounts. It'll be responsible for fetching accounts
 * when users try to login, as well as updating those accounts after any
 * changes are made.
 */

public class Database {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
	
		try(BufferedReader br = new BufferedReader(new FileReader("accounts-db.txt"))) {
		 	String line;
		 while ((line = br.readLine()) !=null) {
		 }
}
		//try {
		//    Database.write(Paths.get("myfile.txt"), "the text".getBytes(), StandardOpenOption.APPEND);
	//	}catch (IOException e) {
		//    //exception handling left as an exercise for the reader
		}
}
//}