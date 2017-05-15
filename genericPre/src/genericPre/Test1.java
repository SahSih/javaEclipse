package genericPre;

import org.junit.*;
import static org.junit.Assert.*;

public class Test1
{
   @Test public void swapIfTest()
   {
      Pair<String> p = new Pair<>("Fred", "Wilma");
      p.swapIf((s, t) -> s.length() < t.length());
      assertEquals("Wilma", p.getFirst());
      assertEquals("Fred", p.getSecond());
      p.swapIf((s, t) -> s.charAt(0) < t.charAt(0));
      assertEquals("Wilma", p.getFirst());
      assertEquals("Fred", p.getSecond());
   }

   @Test public void swapToTest()
   {
      Pair<String> p = new Pair<>("A", "B");
      Pair<String> q = new Pair<>("C", "D");
      p.swapTo(q);
      assertEquals("A", p.getFirst());
      assertEquals("B", p.getSecond());
      assertEquals("B", q.getFirst());
      assertEquals("A", q.getSecond());      
   }
}
