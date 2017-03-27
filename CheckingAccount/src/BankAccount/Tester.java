package BankAccount;

public class Tester {
	public static void main(String[] args)
	   {   
	      BankAccount account1 = new CheckingAccount(10000);
	      account1.withdraw(5000);
	      account1.withdraw(1000);
	      System.out.println("Balance: " + account1.getBalance());
	      System.out.println("Expected: 4000");
	      account1.withdraw(2000);
	      System.out.println("Balance: " + account1.getBalance());
	      System.out.println("Expected: 1990");
	      account1.deposit(1000);  
	      account1.withdraw(500);
	      System.out.println("Balance: " + account1.getBalance());
	      System.out.println("Expected: 2490");

	      BankAccount account2 = new CheckingAccount(16000);
	      account2.withdraw(1000);
	      account2.withdraw(1000);
	      account2.withdraw(1000);
	      account2.withdraw(1000);
	      System.out.println("Balance: " + account2.getBalance());
	      System.out.println("Expected: 11980");
	      account2.deposit(20);
	      account2.withdraw(4000);
	      System.out.println("Balance: " + account2.getBalance());
	      System.out.println("Expected: 8000");
	   }
}
