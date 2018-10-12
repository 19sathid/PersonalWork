package objectorientedprogramming;

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount bob = new BankAccount();
		System.out.println("Account number:" + bob.getAccount());
		System.out.println("Balance:" + bob.getBalance());

		bob = new BankAccount(500, 123456, 0.20);
		bob.deposit(100);
		bob.addInterest();
		System.out.println("Account number:" + bob.getAccount());
		System.out.println("Balance:" + bob.getBalance());

		bob = new BankAccount(2000, 456789, 0.18);
		bob.withdraw(1000);
		bob.financecharge(50);
		System.out.println("Account number:" + bob.getAccount());
		System.out.println("Balance:" + bob.getBalance());
	}

}
