/*
Author: Mike OMalley
Source: BarChart.java

Java - Basic Console App - Week 04
2. a. Write an application that counts by three from 3 through 300 inclusive, and
that starts a new line after every multiple of 30 (30, 60, 90, and so on). Save the file
as CountByThrees.java.

b. Modify the CountByThrees application so that the user enters the value to count
by. Start each new line after 10 values have been displayed. Save the file as
CountByAnything.java.
*/
public class CountByThrees
{
   final static int INCREMENT = 3;
   final static int START_VAL = 3;
   final static int END_VAL   = 300; // Inclusive
   final static int NEW_LINE  = 30;  // new line every multiple of 30


   public static void main(String[] args)
   {
      for (int count = START_VAL; count <= END_VAL; count += INCREMENT)
      {
         //System.out.printf ("%5d", count);
         System.out.print (String.format ("%5d", count) );

         if (count % NEW_LINE == 0)
            System.out.println ();
      }
   }
}