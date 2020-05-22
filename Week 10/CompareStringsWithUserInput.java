/*
Author: Mike OMalley
Source: CharCounter.java

Question Three
Modify the application in Exercise 2(a) so that it compares two strings
input by the user. The application should output whether the first string
is less than, equal to or greater than the second.
*/
import java.util.*;

public class CompareStringsWithUserInput
{
   public static void main( String args[] )
   {
      // get two strings
      String firstString  = ""; //"Java";
      String secondString = ""; // "java";

      Scanner scanner = new Scanner(System.in);

      System.out.println ("Enter 2 words: ");
      firstString  = scanner.next();
      secondString = scanner.next();

      // compare two strings
      int value = firstString.compareTo( secondString );

      // display result
      System.out.println( "\nCompare Result:" );

      if ( value == 0 )
         System.out.printf("%s == %s\n", firstString, secondString );
      else if ( value > 0 )
         System.out.printf( "%s > %s\n", firstString, secondString );
      else
         System.out.printf( "%s < %s\n", firstString, secondString );
   } // end main
} // end class CompareStrings

