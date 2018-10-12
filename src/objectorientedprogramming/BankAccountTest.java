package objectorientedprogramming;

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount bob = new BankAccount();
		System.out.println("Account number:" + bob.getAccount());
		System.out.println("Balance:" + bob.getBalance());

		bob = new BankAccount(600, 456789, 0.10);
		bob.withdraw(250);
		bob.deposit(400);
		bob.addInterest();
		System.out.println("Account number:" + bob.getAccount());
		System.out.println("Balance:" + bob.getBalance());

	}

}
