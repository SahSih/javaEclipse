package genericTest;

import org.junit.*;

import static org.junit.Assert.*;
import java.util.*;
import java.util.function.Predicate;


public class Test1
{
	@Test public void test1()
	{
	   Pair<String> p = new Pair<>("Able", "Baker");
	   assertTrue(Util.testBoth(p, s -> s.length() <= 5));
	   assertFalse(Util.testBoth(p, s -> s.contains("a")));
	}

	@Test public void test2()
	{
	   Pair<Integer> p = new Pair<>(2, 4);
	   assertTrue(Util.testBoth(p, n -> n % 2 == 0));
	   Predicate<Object> hasEvenHashCode = obj -> obj.hashCode() % 2 == 0;
	   assertTrue(Util.testBoth(p, hasEvenHashCode));
	}
}


/*
@Test public void test1()
{
   Pair<String> p = new Pair<>("Able", "Baker");
   assertTrue(Util.testBoth(p, s -> s.length() <= 5));
   assertFalse(Util.testBoth(p, s -> s.contains("a")));
}

@Test public void test2()
{
   Pair<Integer> p = new Pair<>(2, 4);
   assertTrue(Util.testBoth(p, n -> n % 2 == 0));
   Predicate<Object> hasEvenHashCode = obj -> obj.hashCode() % 2 == 0;
   assertTrue(Util.testBoth(p, hasEvenHashCode));
}*/