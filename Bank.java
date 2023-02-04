package banking;

import java.util.Scanner;

/**
 * Represents a bank for managing customers and their bank accounts
 * @author Shi Zhang
 *
 */
public class Bank {

	public static void main(String[] args) {
		
		//creates new instance of bank class
		Bank bank = new Bank();
		//call the run method in the bank class
		bank.run();
		
	}
	/**
	 * runs the program by initializing and managing, bank accounts and customers
	 */
	public void run()	{
		System.out.println("Welcome to the Bank! What is your name?");
		
		// create scanner to get user input
		Scanner scanner = new Scanner(System.in);
		
		// get the next token (word), which is the customer's name
		String name = scanner.next();
		
		System.out.println("Hello "+name+"! We are creating checking and savings accounts for you.");
		
		// create customer with given name
		Customer customer = new Customer(name);
		
		// get address
		System.out.println("What is your address?");
		
		// get the next token (word), which is the customer's address?
		String address = scanner.next();
		
		// set the customer's address
		customer.setAddress(address);
		
		// create a checking account for customer
		BankAccount checkingAccount = new BankAccount("checking", customer);
		
		// create a savings account for customer
		BankAccount savingsAccount = new BankAccount("savings", customer);
		
		// gets and prints the customer info associated with the checking account
		System.out.println();
		System.out.println("Customer info: ");
		System.out.println(checkingAccount.getCustomerInfo());
		
		// gets and prints the account info for checking account
		System.out.println("Checking account: ");
		System.out.println(checkingAccount.getAccountInfo());
		// gets and prints the account info for checking account
		System.out.println("Savings account: ");
		System.out.println(savingsAccount.getAccountInfo());
		
		// deposits
		
		// into checking
		System.out.println();
		System.out.println("Amount (decimal) to deposit into your checking account?");
		double amount = scanner.nextDouble();
		checkingAccount.deposit(amount);
		
		// into savings
		System.out.println();
		System.out.println("Amount (decimal) to deposit into your saving account?");
		amount = scanner.nextDouble();
		savingsAccount.deposit(amount);
		
		System.out.println(checkingAccount.getAccountInfo());
		System.out.println(savingsAccount.getAccountInfo());
		
		// withdraws
		
		// from checking
		System.out.println();
		System.out.println("Amount (decimal) to withdraw from your checking account?");
		amount = scanner.nextDouble();
		
		try {
			checkingAccount.withdraw(amount);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		// from savings
		System.out.println();
		System.out.println("Amount (decimal) to withdraw from your savings account?");
		amount = scanner.nextDouble();
		
		try {
			savingsAccount.withdraw(amount);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println(e.getMessage());
		}
		// print new balance after deposit and withdraw complete
		// gets and prints the account info for checking account
		System.out.println("Checking account: ");
		System.out.println(checkingAccount.getAccountInfo());
		// gets and prints the account info for checking account
		System.out.println("Savings account: ");
		System.out.println(savingsAccount.getAccountInfo());
		
		scanner.close();
	}

}
