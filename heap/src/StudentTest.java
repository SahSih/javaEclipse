import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;


public class StudentTest
{
   private MaxHeap heap;


   @Before
   public void setUp() throws Exception
   {
      heap = new MaxHeap(10);
      heap.insert(new Student("Susan", 60, 3.5));
      heap.insert(new Student("Ben", 70, 3.4));
      heap.insert(new Student("Reed", 120, 4.0));
      heap.insert(new Student("Johnny", 50, 1.2));
   }

   @Test
   public void test()
   {
      assertEquals(4.0, heap.extractMax().gpa(), .000001);
      assertEquals(3.5, heap.extractMax().gpa(), .000001);
   }
   
   public void setUp2() throws Exception
   {
      heap = new MaxHeap(0);
   }

   @Test
   public void test2()
   {
      assertEquals(4.0, heap.extractMax().gpa(), .000001);
      assertEquals(3.5, heap.extractMax().gpa(), .000001);
   }
   
   public void setUp3() throws Exception
   {
      heap = new MaxHeap(10);
      heap.insert(new Student("Susan", 60, 3.5));
      heap.insert(new Student("Ben", 70, 3.4));
      heap.insert(new Student("Reed", 120, 4.0));
      heap.insert(new Student("Johnny", 50, 1.2));
      heap.insert(new Student("Reed", 120, 3.8));
   }

   @Test
   public void test3()
   {
      assertEquals(4.0, heap.extractMax().gpa(), .000001);
      assertEquals(3.5, heap.extractMax().gpa(), .000001);
   }

}