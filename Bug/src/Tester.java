public class Tester
{
   public static void main(String[] args)
   {
      Bug quickie = new QuickBug(100);
      quickie.move(5);
      System.out.println(quickie.getPosition());
      System.out.println("Expected: 110");
      quickie.move(10);
      System.out.println(quickie.getPosition());
      System.out.println("Expected: 130");
      Bug quickie2 = new QuickBug(105);
      quickie2.move(5);
      System.out.println(quickie2.getPosition());
      System.out.println("Expected: 115");
   }   
}