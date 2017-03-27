package BankAccount;

public class CheckingAccount extends BankAccount {
	private int transactionCount;

	private static final double fees = 10.0;
	
	public CheckingAccount(double i) {
		// TODO Auto-generated constructor stub
		super(i);
	      
	      // Initialize transaction count
	   transactionCount = 0; 
	}
	
	@Override
	public void withdraw(double amount)
	{   
		transactionCount++;
	      // Now subtract amount from balance 
		if (transactionCount > 2) {
			super.withdraw(amount); 
			super.withdraw(fees);
		} else {
			super.withdraw(amount);
		}
	    
	}
	
	@Override
	public void deposit(double amount)
	{  
		transactionCount = 0;
	      // Now add amount to balance 
	    super.deposit(amount); 
	}
	
}
