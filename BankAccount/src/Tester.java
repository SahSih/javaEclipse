
public class Tester {

	public static void main(String[] args) {
		BankAccount account1 = new SavingsAccount();
	      account1.deposit(10000);
	      account1.withdraw(5000);
	      System.out.println("Balance: " + account1.getBalance());
	      System.out.println("Expected: 5000");
	      account1.withdraw(4500);
	      System.out.println("Balance: " + account1.getBalance());
	      System.out.println("Expected: 490");


	      BankAccount account2 = new SavingsAccount();
	      account2.deposit(15000);
	      account2.withdraw(10000);
	      System.out.println("Balance: " + account2.getBalance());
	      System.out.println("Expected: 5000");
	      account2.withdraw(4000);
	      System.out.println("Balance: " + account2.getBalance());
	      System.out.println("Expected: 1000");
	   }

}

