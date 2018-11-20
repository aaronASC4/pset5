/**
 * Just like last time, the User class is responsible for retrieving
 * (i.e., getting), and updating (i.e., setting) user information.
 * This time, though, you'll need to add the ability to update user
 * information and display that information in a formatted manner.
 * 
 * Most of the functionality for this class should have already been
 * implemented last time. You can always reference my Github repository
 * for inspiration (https://github.com/rwilson-ucvts/java-sample-atm).
 */

public class User {
	
	private int pin;
	private String name;
	private String dob;
	private String address;
	private String city;
	private String phone;
	private String state;
	private String postal;
	
	/**
	 * Constructor for User class.
	 * 
	 * @param name
	 * @param dob
	 * @param address
	 */
	
	public User(int pin, String name, String dob, String address, String city, String phone, String state, String postal) {
		this.pin = pin;
		this.name = name;
		this.dob = dob;
		this.address = address;
		this.city = city;
		this.phone = phone;
		this.state = state;
		this.postal = postal;
	}
	
	/////////////////////////////////// GETTERS AND SETTERS ///////////////////////////////////
	
	/**
	 * Retrieves the user's PIN.
	 * 
	 * @return pin
	 */
	
	public int getPIN() {
		return pin;
	}
	
	/**
	 * Retrieves the user's name.
	 * 
	 * @return name
	 */
	
	public String getName() {
		return name;
	}
	
	public String getState() {
		return state;
	}

	public String getPostal() {
		return postal;
	}
	
	/**
	 * Retrieves the user's phone
	 * 
	 * @return name
	 */
	
	public String getPhone() {
		return phone;
	}
	/**
	 * Retrieves the user's date of birth.
	 * 
	 * @return dob
	 */
	
	public String getDOB() {
		return dob;
	}
	
	/**
	 * Retrieves the user's address.
	 * 
	 * @return address
	 */
	
	public String getAddress() {
		return address;
	}
	
	public String getCity() {
		return city;
	}
	
	/**
	 * Sets the value of the user's PIN.
	 * 
	 * @param pin the new PIN
	 */
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public void setPIN(int pin) {
		this.pin = pin;
	}
	
	/**
	 * Sets the value of the user's name.
	 * 
	 * @param name the new name
	 */
	
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Sets the value of the user's phone.
	 * 
	 * @param name the new name
	 */
	
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	/**
	 * Sets the value of the user's date of birth.
	 * 
	 * @param dob the new date of birth
	 */
	
	public void setDOB(String dob) {
		this.dob = dob;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setPostal(String postal) {
		this.postal = postal;
	}
	/**
	 * Sets the value of the user's address.
	 * 
	 * @param address the new address
	 */
	
	public void setAddress(String address) {
		this.address = address;
	}
}