
public class SleepyBug extends Bug {
	private int count = 0;
	
	@Override
	public void move(int amount)
	   {			
	    if (count == 3) {
	    	super.move(0);
	    	count = 0;
	    } else {
	    	++count;
		super.move(amount);
	    }  
	   }
}
