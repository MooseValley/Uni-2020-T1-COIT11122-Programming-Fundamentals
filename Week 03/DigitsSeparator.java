/*
 Author: Mike O
 File:   DigitsSeparator.java
 Desc:   Week 03: Tutorial Question 5.

Question Five
Write an application which inputs one number consisting of five digits
from the user, separates the number into its individual digits and
prints the digits separated from one another by three spaces each.
For example, if the user types in the number 42339, the program
should print "4 2 3 3 9.” Assume that the user enters the correct
number of digits.
*/
import java.util.Scanner;

public class DigitsSeparator
{
   public static void main (String[] args)
   {
      Scanner kb = new Scanner (System.in);

      // Get 5 digit number from user
      System.out.print ("Enter 5 digit number: ");
      int num = kb.nextInt();

      // Pull of digits and output separated by 3 spaces:

      int divisor   = 10_000;
      int remainder = num;
      int digit     = 0;

      // 42339 / 10000 = 4
      // 42339 % 10000 = 2339

      // 2339 / 1000 = 2
      // 2339 % 1000 = 339

      // 339 / 100 = 3
      // 339 % 100 = 39


      /*
      digit     = remainder / divisor;
      remainder = remainder % divisor;
      divisor   = divisor / 10;
      System.out.print (digit + "   ");

      digit     = remainder / divisor;
      remainder = remainder % divisor;
      divisor   = divisor / 10;
      System.out.print (digit + "   ");

      digit     = remainder / divisor;
      remainder = remainder % divisor;
      divisor   = divisor / 10;
      System.out.print (digit + "   ");

      digit     = remainder / divisor;
      remainder = remainder % divisor;
      divisor   = divisor / 10;
      System.out.print (digit + "   ");

      digit     = remainder / divisor;
      remainder = remainder % divisor;
      divisor   = divisor / 10;
      System.out.print (digit + "   ");
      */

      //count = count + 1;
      //count++;

      for (int count = 1; count <= 5; count = count + 1)
      {
         digit     = remainder / divisor;
         remainder = remainder % divisor;
         divisor   = divisor / 10;
         System.out.print (digit + "   ");
      }

      System.out.println ();

      String numStr = "" + num;

      for (int count = 1; count <= 5; count = count + 1)
      {
         System.out.print (numStr.charAt (count - 1) + "   ");
      }

      System.out.println ();

/*

      for (int count = 1; ; count = count + 1)
      {
         System.out.print ("Hi");
      }

      for (;;) // Infinite loop
      {
         System.out.print ("Hi");
      }


      for (int count = 1; count <= 5; count = count + 1)
      for (int count = 1; count <= 5; count += 1)
      for (int count = 1; count <= 5; count++)

      for (int count = 1; count <= 5; count = count - 1)
      for (int count = 1; count <= 5; count -= 1)
      for (int count = 1; count <= 5; count--)

      count**; //
      count = count * 10;
      count *= 10;
      count *= count;

      for (int count = 1; count > 5; count = count + 1)
      {
         System.out.print (numStr.charAt (count - 1) + "   ");
      }
      ::::


      for (;;) // Infinite loop - until midnight on 31-Dec-2020.
      {
         System.out.print ("Hi");

         Date date = new Date ();
         if (date.getYear() > 2020)
            break;
      }
      ::::

      for (:::::)
      {
         for (:::::)
         {
            ::::::
              break;
         }
         ::::
      }

*/
   }
}