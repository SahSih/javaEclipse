/**
   A bug that lives on a line and occupies integer positions.
*/
public class Bug
{
   private int x;

   /**
      Constructs a bug with position zero.
   */
   public Bug()
   {
      x = 0;
   }

   /**
      Constructs a bug with a given initial position.
      @param the initial position
   */
   public Bug(int initialPosition)
   {
      x = initialPosition;
   }

   /**
      Gets the position of this bug.
      @return the position
   */
   public int getPosition()
   {
      return x;
   }

   /**
      Moves this bug by a given amount.
      @param amount the amount to move by
   */
   public final void move(int amount)
   {
      x = x + amount;
   }
}