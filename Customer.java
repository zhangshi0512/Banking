package banking;
/**
 * Represents a customer of a bank
 */
public class Customer {
	//instance vars
	
	/**
	 * Name of customer
	 */
	String name;
	
	/**
	 * Address of customer.
	 */
	String address;
	
	//constructor
	/**
	 * creates a customer with the given name.
	 * @param name of customer
	 */
	public Customer(String name) {
		//set the instance var name to given name
		this.name = name;
	}
	
	//method
	/**
	 * sets the address of customer to be given address
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	/**
	 * returns customer's name
	 * @return name of customer
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * returns customer's address
	 * @return address of customer
	 */
	public String getAddress() {
		return this.address;
	}
}
