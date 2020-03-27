/*
 Author: Mike O
 File:   ProcessThreeIntegers.java
 Desc:   Week 03: Tutorial Question 4.

Question Four
Write an application which inputs three integers from the user and displays
the sum, average, product, smallest and largest of the numbers.
[Note: The calculation of the average in this exercise should result in
an integer representation of the average. So if the sum of the values
is 7, the average should be 2, not 2.3333...]
*/
import java.util.Scanner;

public class ProcessThreeIntegers
{
   public static void main (String[] args)
   {
      // Prompt the user for 3 integers
      Scanner kb = new Scanner(System.in);
      System.out.print ("Enter 3 integers: ");
      int int1, int2, int3;
      int1 = kb.nextInt();
      int2 = kb.nextInt();
      int3 = kb.nextInt();

      // Sum
      int sum = int1 + int2 + int3;

      // Product
      int prod = int1 * int2 * int3;

      // Smallest
      int smallest = int1;
      if (int2 < smallest)
         smallest = int2;
      if (int3 < smallest)
         smallest = int3;

      // Largest
      int largest = int1;
      if (int2 > largest)
         largest = int2;
      if (int3 > largest)
         largest = int3;

      // Average
      int avg =  sum / 3; // Integer average.

      // Display the results
      System.out.println ("Sum:       " + sum);
      System.out.println ("Product:   " + prod);
      System.out.println ("Smalllest: " + smallest);
      System.out.println ("Largest:   " + largest);
      System.out.println ("Average:   " + avg);
   }
}