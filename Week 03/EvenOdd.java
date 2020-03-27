/*
1. Write an application that asks a user to enter an integer. Display a statement that
indicates whether the integer is even or odd. Save the file as EvenOdd.java.
*/
import java.util.Scanner;

public class EvenOdd
{
   public static void main (String[] args)
   {
      // Get integer from user:
      Scanner kb = new Scanner (System.in);

      for (;;)
      {
         System.out.println ("Enter an integer (0 to Quit): ");
         int num = kb.nextInt();

         if (num == 0)
            break;

         // Determine Odd or Even:
         // Tell user
         if (num % 2 == 0)
            System.out.println ("Number is Even");
         else
            System.out.println ("Number is Odd");
      }

      System.out.println ("\nHave a nice day !!\n");

   }
}