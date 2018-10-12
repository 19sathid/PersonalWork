package objectorientedprogramming;

public class BankAccount {
//instance fields
	private double balance;
	private int account;
	private double interestrate;
	
//constructors
	public BankAccount() {
		balance = 99.0;
		account = 99;
		interestrate = 99.0;
	}

	public BankAccount(double newBalance, int newAccount, double newInterestrate) {
		balance = newBalance;
		account = newAccount;
		interestrate = newInterestrate;
	}
	
	//Mutator methods
	public void setBalance(double newBalance) {
	}
	public void setInterestrate(double newInterestrate) {
	}
	public void setAccount(int newAccount) {
	}
	public void setDeposit(double newDeposit) {
	}
	public void setWithdraw(double newWithdraw) {
	}
	
	//Accessor methods
	public double getBalance() {
		return balance +  ;
	}
	public int getAccount() {
		return account;
	}
	public double getInterestrate() {
		return interestrate;
	
	}
}
