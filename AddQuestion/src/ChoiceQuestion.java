/**
   A question with multiple choices.
*/
public class ChoiceQuestion extends Question
{
   // Add any needed instance variables, but don't store the choices
   // The choices should be added to the text of the superclass
   private int count = 0;
   /**
      Constructs a choice question with a given text and no choices.
      @param questionText the text of this question
   */
   public ChoiceQuestion(String questionText)
   {
      super.addLine(questionText);
   }

   /**
      Adds an answer choice to this question.
      @param choice the choice to add
      @param correct true if this is the correct choice, false otherwise
   */
   public void addChoice(String choice, boolean correct)
   { 
	  count++;
	  String setCount = Integer.toString(count);
	  choice = setCount + ": " + choice;
      super.addLine(choice);
      
      if (correct) {
    	  if (correct) 
          {
             String choiceString = "" + setCount;
             setAnswer(choiceString);
          }
      }
   }
}
