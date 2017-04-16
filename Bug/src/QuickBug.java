
public class QuickBug extends Bug {
	private int x = 0;
	private int amount;
	
	public QuickBug(int i) {
		amount = i;
	}
	
	@Override
	 public int getPosition()
	   {  
		  x = 0;
	      x = super.getPosition();
	      x = x + amount;
	      super.move(x);
	      return super.getPosition();
	   }
}
