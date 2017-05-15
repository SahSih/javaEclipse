package cloneTesting;
import java.util.*;

public class Person
{  
   public Person(String name) { this.name = name; }
   
   public void befriend(Person p) { friends.add(p); }
   public Person getFriend(int i)
   {
      return 0 <= i && i < friends.size() ? friends.get(i) : null;
   }

   public String toString()
   {
      String result = name + ", friends =";
      for (Person f : friends) result += " " + f.name;      
      return result;
   }

   public Person clone() { try {
	return (Person) super.clone();
} catch (CloneNotSupportedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
return null; }
   
   private String name;
   private ArrayList<Person> friends = new ArrayList<>();
}