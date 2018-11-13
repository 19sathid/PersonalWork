package decisions;

public class CashRegister {
	private double balance;
	private int transactions;

	public CashRegister() {
		balance = 500;
		transactions = 0;
	}

	public void setBalance(double newBalance) {
		if (newBalance < 0) {
			newBalance = 0;
		}
		balance = newBalance;
	}

	public double getBalance() {
		return balance;
	}

	public void sellSomething(double amount) {
		if (amount < 0) {
			amount = 0;
		}
		balance = balance + amount;
		transactions++;
	}

	public void returnSomething(double returnAmount) {
		if (returnAmount < 0) {
			returnAmount = 0;
		}
		balance = balance - returnAmount;
		if (balance < 0) {
			balance = 0;
		}
		transactions++;
	}
}
