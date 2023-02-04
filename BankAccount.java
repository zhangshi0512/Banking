package banking;


/**
 * represents a checking/saving bank account for a customer
 * @author Shi Zhang
 *
 */
public class BankAccount {
	//instance vars
	/**
	 * Type of account (checking/savings)
	 */
	String accountType;
	/**
	 * Balance of bank account
	 */
	double balance;
	/**
	 * customer for this account
	 */
	Customer customer;
	
	/**
	 * Fixed amount for withdrawals.
	 */
	double fastCashAmount;
	
	//constructor
	/**
	 * creates a bank account of given type for given customer.
	 * @param accountType for bank account
	 * @param customer for bank account
	 */
	
	public BankAccount(String accountType, Customer customer) {
		this.accountType = accountType;
		this.customer = customer;
		
		//set initial default value for fast cash amount
		this.fastCashAmount = 60;
		
	}
	
	//methods
	/**
	 * deposits the given amount to add to balance, if greater than 0.
	 * @param amount
	 */
	public void deposit(double amount) {
		if (amount>0) {
			this.balance += amount;
		}
	}
	
	/**
	 * Withdraws the given amount from balance 
	 * @param amount
	 * @throws Exception if given amount is larger than available balance
	 */
	public void withdraw(double amount) throws Exception {
		if (amount > this.balance) {
			throw new Exception("Amount is greater than available balance.");
		}
		this.balance -= amount;
	}
	
	/**
	 * withdraws the fast cash amount
	 * @throws Exception if given fast cash amount is greater than available balance
	 */
	public void fastWithdraw() throws Exception {
		// withdraw the given fast cash amount
		this.withdraw(this.fastCashAmount);
	}
	
	/**
	 * sets the fast cash amount if greater than 0
	 * @param amount to set as fast cash
	 */
	public void setFastCashAmount(double amount) {
		if (amount > 0) {
			this.fastCashAmount = amount;
		}
	}
	
	/**
	 * returns account type and balance for this bank account.
	 * @return String with all the info
	 */
	public String getAccountInfo() {
		return this.accountType + ": " + this.balance;
	}
	
	/**
	 * returns the customer name and address for this bank account.
	 * @return string with all the info.
	 */
	public String getCustomerInfo() {
		return this.customer.getName()+" from "+ this.customer.getAddress();
	}
}
