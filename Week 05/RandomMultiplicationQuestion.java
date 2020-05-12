/*
Author: Mike OMalley
Source: RandomMultiplicationQuestion.java

Java - Basic Console App - Week 05
Question Five

Computers are playing an increasing role in education. Write a program that will help an elementary school student learn multiplication. Use a Random object to produce two positive one-digit integers. The program should then prompt the user with a question, such as How much is 6 times 7? The student then inputs the answer. Next, the program checks the student's answer. If it is correct, display the message "Very good!" and ask another multiplication question. If the answer is wrong, display the message "No. Please try again." and let the student try the same question repeatedly until the student finally gets it right. A separate method should be used to generate each new question. This method should be called once when the application begins execution and each time the user answers the question correctly. The program will terminate if the user enters a negative number.


CHAT: I've done random before while practicing and didn't have to import random, using int Random = (int)(Math.random()*100);

Math.random()
Random // Pseudo random

SecureRandom

CHAT: Is there a way to generate "real" random, not using math.rand()?

CHAT: So I did this question by creating a separate class, mostly just as practice, I'd like you to look at it if we have time at the end.


nextQuestion ()
// generate the question - 2 random numbers and display "What is x times y ?"  (two positive one-digit integers).
// while (answer is wrong) AND (while answer >= 0)
//    ask the user for an answer
//    if the answer is wrong display "No. Please try again."
//    else if the answer is right display "Very good!"
//    else if answer is negative - terminate the program ...

main
// call nextQuestion ()
// while (1==1)
//    nextQuestion ()

*/
import java.util.Random;
import java.util.Scanner;

public class RandomMultiplicationQuestion
{

   private static boolean nextQuestion()
   {
      Scanner kb        = new Scanner (System.in);
      Random  generator = new Random();
      int num1 =  generator.nextInt(9) + 1; // 1-9
      int num2 =  generator.nextInt(9) + 1; // 1-9
      int rightAnswer = num1 * num2;
      int userAnswer = 0;

      boolean answerRight = false;
      boolean exitProgram = false;

      while ((answerRight == false) && (exitProgram == false))
      {
         System.out.println ("What is " + num1 + " x " + num2 + " ?");
         userAnswer = kb.nextInt();

         // if answer is negative - terminate the program ...
         if (userAnswer < 0)
         {
            exitProgram = true;
            //   System.out.println ("Have a nice day !");
            //   System.exit (0); // All OK, no error.
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

      return exitProgram;

   } // private static void nextQuestion()


   public static void main (String[] args)
   {
      /*
      int answer = 0;

      while (answer >= 0)
      {
         answer = nextQuestion();
      }
      */

      boolean stopLooping = false;

      while (stopLooping == false)
      {
         stopLooping = nextQuestion();
      }

      System.out.println ("Have a nice day !");
   }
} // public class RandomMultiplicationQuestion