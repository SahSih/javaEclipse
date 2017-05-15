package genericPre;

import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;
import java.util.function.*;

public class Test3
{
   @Test public void sortTest()
   {
      Pair<GregorianCalendar> p = new Pair<>(
         new GregorianCalendar(2017, Calendar.DECEMBER, 24),
         new GregorianCalendar(2017, Calendar.JULY, 4));
      p.sort();
      assertEquals(new GregorianCalendar(2017, Calendar.JULY, 4), p.getFirst());
      assertEquals(new GregorianCalendar(2017, Calendar.DECEMBER, 24), p.getSecond());
   }

   @Test public void swapToTest()
   {
      Pair<GregorianCalendar> p = new Pair<>(
         new GregorianCalendar(2017, Calendar.MARCH, 14),
         new GregorianCalendar(2017, Calendar.JULY, 4));
      Pair<Calendar> q = new Pair<>(
         new GregorianCalendar(2017, Calendar.JANUARY, 1),
         new GregorianCalendar(2017, Calendar.DECEMBER, 24));
      p.swapTo(q);
      assertEquals(p.getFirst(), q.getSecond());
      assertEquals(p.getSecond(), q.getFirst());
   }

   @Test public void swapIfTest()
   {
      BiPredicate<Object, Object> eq = (o1, o2) -> o1 != o2;
      Pair<String> p = new Pair<>("Able", "Baker");
      p.swapIf(eq);
      assertEquals("Baker", p.getFirst());
      assertEquals("Able", p.getSecond());
   }
}
