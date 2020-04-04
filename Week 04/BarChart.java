/*
Author: Mike OMalley
Source: BarChart.java

Java - Basic Console App - Week 04
13. The Huntington High School basketball team has five players named
Moose, Frankie, Bella, Teenie, and Sam. Accept the number of points scored
by each player in a game and create a bar chart that illustrates the
points scored.
Save the file as BarChart.java.

------------------------------------------------------------
Enter points scored by Moose:    3
Enter points scored by Frankie:  12
Enter points scored by Bella:    8
Enter points scored by Teenie:   6
Enter points scored by Sam:      15

Points Bar Graph:
Moose    ***
Frankie  ************
Bella    ********
Teenie   ******
Sam      ***************
------------------------------------------------------------
*/
import java.util.Scanner;

public class BarChart
{

   private static int getPlayerPoints (String name)
   {
      Scanner kb = new Scanner (System.in);

      System.out.print ("Enter points for " + name + ": ");
      int points = kb.nextInt();

      // TODO: add validation: points must be >= 0 and <= 20.

      return points;
   }

   private static void plotPlayerPoints (String name, int points)
   {
      System.out.printf ("%-10s", name);
      for (int p = 0; p < points; p++)
         System.out.print ("*");

      System.out.println ();
   }

   public static void main (String[] args)
   {

      // Prompt for point scored for each player
      /*
      System.out.print ("Enter points for Moose: ");
      int moosePoints = kb.nextInt();

      System.out.print ("Enter points for Troy: ");
      int troyPoints = kb.nextInt();

      System.out.print ("Enter points for Byron: ");
      int byronPoints = kb.nextInt();
      */

      int moosePoints   = getPlayerPoints ("Moose");
      int troyPoints    = getPlayerPoints ("Troy");
      int byronPoints   = getPlayerPoints ("Byron");
      int waynePoints   = getPlayerPoints ("Wayne");



      // Graph the points scored by each player:
      System.out.println ("\nPoints Bar Graph:");

      /*
      System.out.print ("Moose");
      for (int p = 0; p < moosePoints; p++)
         System.out.print ("*");
      System.out.println ();

      System.out.print ("Troy");
      for (int p = 0; p < troyPoints; p++)
         System.out.print ("*");
      System.out.println ();

      System.out.print ("Byron");
      for (int p = 0; p < byronPoints; p++)
         System.out.print ("*");
      System.out.println ();
      */

      plotPlayerPoints ("Moose",  moosePoints);
      plotPlayerPoints ("Troy",   troyPoints);
      plotPlayerPoints ("Byron",  byronPoints);
      plotPlayerPoints ("Wayne",  waynePoints);
   }
}