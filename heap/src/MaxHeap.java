import java.util.ArrayList;
import java.util.Collection;

public class MaxHeap
{
   private ArrayList<Student> students;
   
   public MaxHeap(int capacity)
   {
      students = new ArrayList<Student>(capacity);
   }
      
   public MaxHeap(Collection<Student> collection)
   {
      students = new ArrayList<Student>(collection);
      for(int i = size()/2; i >= 0; i--)
      {
         maxHeapify(i);
      }
   }
   
   public Student getMax()
   {
      if(size() < 1)
      {
         throw new IndexOutOfBoundsException("No maximum value:  the heap is empty.");
      }
      return students.get(0);
   }
   
   public Student extractMax()
   {
      Student value = getMax();
      students.set(0, students.get(size() - 1));
      students.remove(size()-1);
      maxHeapify(0);
      return value;
   }
   
   
   //Since we have a keys[] to store key for each student
   //I save the key value in index key when every time we insert a student
   //If we siftUp or mixHeapify, we swap the two student, in the same time
   //we swap the two keys for these two students.
   public void insert(Student elt)
   {
      //Please write me.
	  int key = size();
	  elt.keys = key;
	  students.add(key, elt);
	  siftUp(key);
   }
   
   public void siftUp(int index) {
	   int parentIndex;
	   
	   if (index != 0) {
		   parentIndex = parent(index);
		   if (students.get(parentIndex).gpa() < students.get(index).gpa()) {
			   //My idea in here is since I know these two will switch there position in the heap
			   //then I switch there key value.
			   swap(index, parentIndex);
			   siftUp(parentIndex);
		   }
	   }
	   
   }
   
   //Set the newGPA to student s.
   //Apply siftUp and maxHeapify, if its value bigger than its parents,
   //siftUp applied, otherwise maxHeapify applied.
   public void changeKey(Student s, double newGPA)
   {
      //Please write me.
	  s.setGPA(newGPA);
	  siftUp(s.keys);
	  maxHeapify(s.keys);
   }

   private int parent(int index)
   {
      return (index - 1)/2;
   }
   
   private int left(int index)
   {
      return 2 * index + 1;
   }
   
   private int right(int index)
   {
      return 2 * index + 2;
   }
   
   private int size()
   {
      return students.size();
   }
   
   //Add keys swap. Also swap the keys value during each exchange.
   private void swap(int from, int to)
   {
      Student val = students.get(from);
      Student val2 = students.get(to);
      int temp = val.keys;
      val.keys = val2.keys;
      val2.keys = temp;
      students.set(from,  students.get(to));
      students.set(to,  val);
      
   }
   
   private void maxHeapify(int index)
   {
      int left = left(index);
      int right = right(index);
      int largest = index;
      if (left <  size() && students.get(left).compareTo(students.get(largest)) > 0)
      {
         largest = left;
      }
      if (right <  size() && students.get(right).compareTo(students.get(largest)) > 0)
      {
         largest = right;
      }
      if (largest != index)
      {
         swap(index, largest);
         maxHeapify(largest);
      }  
   }   
}
