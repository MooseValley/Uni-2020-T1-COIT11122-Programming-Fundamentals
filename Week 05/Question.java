import java.util.Random;
import java.util.Scanner;

public class Question
{
   private int     num1;
   private int     num2;
   private int     userAnswer;
   private int     rightAnswer;
   private boolean answerRight;
   private boolean exitProgram;

   public Question ()
   {
      Random  generator = new Random();

      num1 =  generator.nextInt(9) + 1; // 1-9
      num2 =  generator.nextInt(9) + 1; // 1-9

      rightAnswer = num1 * num2;

      userAnswer  = 0;
      answerRight = false;
      exitProgram = false;
   }


   public void askQuestion ()
   {
      Scanner kb = new Scanner (System.in);

      while ((answerRight == false) && (exitProgram == false))
      {
         System.out.println ("What is " + num1 + " x " + num2 + " ?");
         userAnswer = kb.nextInt();

         // if answer is negative - terminate the program ...
         if (userAnswer < 0)
         {
            exitProgram = true;
         }
         // elseif the answer is wrong display "No. Please try again."
         else if (userAnswer != rightAnswer)
         {
            System.out.println ("No. Please try again.");
         }
         //  else if the answer is right display "Very good!"
         else //if (userAnswer == rightAnswer)
         {
            System.out.println ("Very good!");
            answerRight = true;
         }
      } // while ((answerRight == false) && (exitProgram == false))
   }

   public boolean isUserAnswerRight ()
   {
      return answerRight;
   }

   public boolean doesUserWantToExitProgram ()
   {
      return exitProgram;
   }

}