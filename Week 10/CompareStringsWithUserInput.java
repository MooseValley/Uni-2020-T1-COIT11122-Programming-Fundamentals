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

