/**
   A question with a text and an answer.
*/
public class Question
{
   private String text;
   private String answer;

   /**
      Constructs a question with empty text and empty answer.
   */
   public Question() 
   {
      text = "";
      answer = "";
   }

   /**
      Sets the answer for this question.
      @param correctResponse the answer
   */
   public void setAnswer(String correctResponse)
   {
      answer = correctResponse;
   }

   /**
      Checks a given response for correctness.
      @param response the response to check
      @return true if the response was correct, false otherwise
   */
   public boolean checkAnswer(String response)
   {
      return response.equals(answer);
   }

   /**
      Add a line of text to the question text.
   */
   public void addLine(String line)
   {
      text = text + line + "\n";
   }

   /**
      Displays this question.
   */
   public void display()
   {
      System.out.print(text);
   }
}
