/*
Question Four
Write a method minimum3 that returns the smallest of three floating-point numbers. Use the Math.min() method to implement minimum3. Incorporate the method into an application Minimum3 that reads three values from the user, determines the smallest value and displays the result.
*/
public class Minimum3
{
   private static double minimum3 (double val1, double val2, double val3)
   {
      double min = Math.min(val1, val2);

      min = Math.min(min, val3);

      return min;
   }

   public static void main (String[] args)
   {
      // Students TODO: get user input for 3 numbers.

      System.out.println ( minimum3 (4.561, 1.234, 9.81) );
   }
}