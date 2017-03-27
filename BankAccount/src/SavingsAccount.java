
public class SavingsAccount extends BankAccount {
	private double balance;

	@Override 
	public void withdraw(double amount)
	   {  
	      if ((super.getBalance() - amount) >= 1000) {
	    	  super.withdraw(amount);
	      } else if ((super.getBalance() - amount) < 1000 && (super.getBalance() - amount) > 0) {
	    	  super.withdraw(amount);
	    	  super.withdraw(10);
	      }
	   }
}
