package genericPre;

import org.junit.*;
import static org.junit.Assert.*;
import java.math.*;

public class Test2
{
   @Test public void sortTest()
   {
      Pair<String> p = new Pair<>("B", "C");
      Pair<String> q = new Pair<>("D", "A");
      p.sort();
      q.sort();
      assertEquals("B", p.getFirst());
      assertEquals("C", p.getSecond());      
      assertEquals("A", q.getFirst());
      assertEquals("D", q.getSecond());      
   }

   @Test public void sortTest2()
   {
      Pair<BigInteger> p = new Pair<>(new BigInteger("1234567890123456"),
         new BigInteger("123456789012345"));
      p.sort();
      assertEquals(new BigInteger("123456789012345"), p.getFirst());
      assertEquals(new BigInteger("1234567890123456"), p.getSecond());
   }
}
