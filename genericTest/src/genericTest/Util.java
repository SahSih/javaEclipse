package genericTest;

import java.util.*;
import java.util.function.*;


public class Util {

	public static <T, E extends T> boolean testBoth(Pair<E> p, Predicate<T> t) {
		// TODO Auto-generated method stub
		
		return t.test(p.getFirst()) && t.test(p.getSecond());
	}
	
	public static <E> boolean testBoth(Pair<E> a, Predicate<? super E> p) {
		
	}

	
	
	
	/*public static <T extends Comparable> Pair<T> getMinMax(List<T> a) {
	      T max = a.get(0);
	      T min = a.get(0);
	      for (T t : a) {
	         if (t.compareTo(max) > 0) {
	            max = t;
	         }
	         if (t.compareTo(min) <= 0) {
	            min = t;
	         }
	      }
	     
	      return new Pair<T>(min, max);
	}*/
	
	/*public static <T, S extends T> Pair<T> putFirstLast(List<S> a, Pair<T> p){
		p.setFirst(a.get(0));
		p.setSecond(a.get(a.size() - 1));
		return p;	
	}
	

	public static <T> void swapFirstLast(List<T> element) {
		// TODO Auto-generated method stub
		int h = element.size() - 1;
		T temp;
		temp = element.get(h);
		element.set(h, element.get(0));
		element.set(0, temp);
	}

	public static <T, E> Pair<T> getFirstLast(List<E> list) {
		// TODO Auto-generated method stub
		T first = list.get(0);
		T last = list.get(list.size() - 1);
		return new Pair<>(first, last);
	}*/
	
	



}
