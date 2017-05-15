// Complete this Pair class so that all three test cases
// compile and pass.
// The swap method swaps the first and second element of the pair.
// The swapFrom method receives a second pair and sets this
// pair to the swap of the given pair.
// The getMin method yields the smaller of the two elements. You
// should come up with an appropriate bound for the type parameter
// to ensure that the elements are comparable.

package genericPre;

//compile and pass.
//The sort method sorts the pair so that the first element is <= the
//second elements. You
//should come up with an appropriate bound for the type parameter
//to ensure that the elements are comparable.
//The swapTo method puts a swapped copy of this pair into the
//given pair.
//The swapIf method swaps this pair if the given bipredicate
//is true when evaluated with the first and second element.

import java.util.function.BiPredicate;
import java.util.function.Predicate;

class Pair<T extends Comparable, E>
//class Pair<T extneds Comparable<? super T>>
{
	public Pair(T first, T second)
	{
		this.first = first;
		this.second = second;
	}
	public T getFirst() { return first; }
	public T getSecond() { return second; }
	public void setFirst(T first) { this.first = first; }
	public void setSecond(T second) { this.second = second; }
	
	private T first;
	private T second;

	public void swapIf(BiPredicate<E, E> p) {
		//public void swapIf(BiPredicate<? super T, ? super T> p)
		// TODO Auto-generated method stub
		if (p.test(getFirst(), getSecond())) {
			swap();
		}
	}
	
	public  void swap() {
		// TODO Auto-generated method stub
		T temp = first;
		first = second;
		setSecond(temp);
		
	}
	
	public void sort() {
		// TODO Auto-generated method stub
		if (getFirst().compareTo(getSecond()) > 0) {
			swap();
		}
	}
	
	public void swapTo(Pair p) {
		p.setFirst(getSecond());
		p.setSecond(getFirst());
	}
}






/*import java.math.BigInteger;
import java.util.*;

class Pair<T> implements Comparable<T>
{
   public Pair(T first, T second)
   {
      this.first = first;
      this.second = second;
   }
   public T getFirst() { return first; }
   public T getSecond() { return second; }
   
   
   
   public void setFirst(T first) {
	this.first = first;
	}
	public void setSecond(T second) {
		this.second = second;
	}

	public  void swap() {
		// TODO Auto-generated method stub
		T temp = first;
		first = second;
		setSecond(temp);
		
	}
	public void swapFrom(Pair<T> q) {
		// TODO Auto-generated method stub
		first = q.getSecond();
		second = q.getFirst();
	}
	public T getMin() {
		// TODO Auto-generated method stub
		int c = this.getFirst().compareTo(this.getSecondt());
		if (c == 0) {
			return this.getSecond().compareTo(this.getSecond());
		}
		return c;
	}
	
	@Override
    public int compareTo(T o) {
        return getFirst().compareTo(o.getFirst());
    }
   
   private T first;
   private T second;

}*/
