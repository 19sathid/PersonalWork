package decisions;

public class CashRegisterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
CashRegister reg = new CashRegister();
reg.setBalance(1200);
reg.sellSomething(45.67);
System.out.println("Balance:" + reg.getBalance());
reg.returnSomething(20.34);
	}

}
