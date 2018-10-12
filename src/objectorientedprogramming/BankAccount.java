package objectorientedprogramming;

public class BankAccount {
//instance fields
	private double balance;
	private int account;
	private double interestrate;

//constructors
	public BankAccount() {
		balance = 99.0;
		account = 123456;
		interestrate = 0.50;
	}

	public BankAccount(double newBalance, int newAccount, double newInterestrate) {
		balance = newBalance;
		account = newAccount;
		interestrate = newInterestrate;
	}

	// Mutator methods
	public void setBalance(double newBalance) {
		balance = newBalance;
	}
	
	public void setInterestrate(double newInterestrate) {
		interestrate = newInterestrate;
	}

	public void deposit(double amount) {
		balance = balance + amount;
	}

	public void withdraw(double amount) {
		balance = balance - amount;
	}

	public void addInterest() {
		balance = balance + (balance * interestrate);
	}
	public void financecharge(double charge) {
		balance = balance - charge;
	}

	// Accessor methods
	public double getBalance() {
		return balance;
	}

	public int getAccount() {
		return account;
	}

}
