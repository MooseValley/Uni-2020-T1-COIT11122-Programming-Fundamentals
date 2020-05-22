/*
Author: Mike OMalley
Source: CharCounter.java

Question Five
Write an application that reads a line of text and prints a table indicating
the number of occurrences of each letter of the alphabet in the text.

Treat uppercase and lower case the same.

Example: The fox jumped five feet.
a  0
b  0
c  0
d  1
:::
f   3
:::
t   2

*/
import java.util.Scanner;

public class CharCounter
{
   public static final int  MAX_CHARS    = 26;  // Alphabet size.
   public static final char FIRST_LETTER = 'A'; // Fist uppercase letter in alphabet.

   public static void main(String[] args)
   {

      // Declare an array to contains the counts (all 0).
      int[] countsArray = new int [MAX_CHARS];

      // Get user input (Scanner)
      Scanner scanner = new Scanner (System.in);

      System.out.println ("Enter a line of text:");
      String inputStr = scanner.nextLine();

      // Loop through all chars of input and count them
      // Ignore numbers, spaces, tabs, full stops, etc ....
      for (int c = 0; c < inputStr.length(); c++)
      {
         if (Character.isLetter(inputStr.charAt (c)) == true)
         {
            char upperChar = Character.toUpperCase(inputStr.charAt (c) );
            int index      = upperChar - FIRST_LETTER;
            countsArray[index] += 1;
         }
      }

      // Display the counts to the user (loop)
      int count = 0;
      for (int c = 0; c < countsArray.length; c++)
      {
         char countChar = (char) (c + FIRST_LETTER);

         System.out.print (countChar + ": " + String.format ("%3d", countsArray[c]) + "    ");

         count++;
         if (count == 4) // Every 4 columns, output a new line.
         {
            System.out.println();
            count = 0;
         }
      }

      System.out.println();
   }
}