/*
Author: Mike OMalley
Source: LargestInteger.java

Java - Basic Console App - Week 04
*/
import java.util.Scanner;

public class LargestInteger
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner (System.in);
      int number  = 0;
      int counter = 1;
      int largest = 0;

      // loop 10 times
      while (counter <= 10)
      {
         // get number from user
         System.out.print("Please input number " + counter + " ==> ");
         number = kb.nextInt();

         // if number is greater than largest number
         //    largest number = number
         if (number > largest)
            largest = number;

         counter++;
      } // end loop

      // display largest number to user
      System.out.println("Largest: " + largest);
   }
}