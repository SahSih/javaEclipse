
public class HungryBug extends Bug{
	private int count = 0;
	private int dount;
	
	public HungryBug(int i) {
		eat(i);
	}
	
	public int eat(int i) {
		return dount = i;
	}
	
	@Override
	public void move(int amount)
	   {
		if (count == dount) {
	    	super.move(0);
	    	count = 0;
	    } else {
	    	++count;
		super.move(amount);
	    }  
	   }

}
