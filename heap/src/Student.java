public class Student implements Comparable<Student>
{
   private String name;
   private double gpa = 0;
   private int units = 0;
   public int keys;
   
   public Student(String name)
   {
      this.name = name;
   }
   
   public Student(String name, int units, double gpa, int key)
   {
      this.name = name;
      this.units = units;
      this.gpa = gpa;
      this.keys = key;
   }

   
   public String getName()
   {
      return name;
   }
   
   public double gpa()
   {
      return gpa;
   }
   
   public void setGPA(double newGPA)
   {
      gpa = newGPA;
   }
   
   public int units()
   {
      return units;
   }
   
   public void setUnits(int newUnits)
   {
      units = newUnits;
   }
   
   public int compareTo(Student other)
   {
      double difference = gpa - other.gpa;
      if(difference == 0) return 0;
      if(difference > 0) return 1;
      return -1;
   }
}
