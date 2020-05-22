/*
Question Six
Write an application that reads a line of text and prints a table indicating
the number of occurrences of each different word in the text. The application
should include the words in the table in the same order in which they appear
in the text.

Extras:
* Display words and counts in sorted order by word.

Collections / Iterators
* very powerful
* we could sort the array by name or count with 1 line of code
* outside the scope of this course.


Outside the scope:
 Model - data classes
 Brains - processsing - Words
 Views / Interface - main

TODO:
* Adapt CharCounter.java to work for words.
  Need 2 arrays - one for words and one counts.

* Adapt CharCounter.java to work like the Word, Words, classes below.
  What do you need to change ??  Think carefully - it's not much !!  :)

*/
import java.util.ArrayList;

class Word
{
   private String word;
   private int    count;

   public Word()
   {
      this ("");
   }

   public Word (String word)
   {
      this.word = word;
      count     = 1;
   }

   public String getWord()
   {
      return word;
   }

   public int getCount()
   {
      return count;
   }

   public void incCount()
   {
      count++;
   }

   public String toString()
   {
      return String.format ("%-25s", word) + String.format ("%5d", count);
   }
}

class Words
{
   private ArrayList<Word> wordsArrayList;

   public Words ()
   {
      wordsArrayList = new ArrayList<Word> ();
   }

   public int search(String wordStr)
   {
      int index = -1; // Not found.

      // Loop through the arraylist and search for the word
      // if it is there, return it's index.
      for (int k = 0; k < wordsArrayList.size(); k++)
      {
         if (wordsArrayList.get(k).getWord().compareTo (wordStr) == 0)
         {
            index = k;                     // Found a match.
            k     = wordsArrayList.size(); // Exit loop
         }
      }

      return index;
   }


   /*
   I've seen a saying "I had a problem and I tried to solve it with REGEX,
   now I have two problems"
   */
   public void addWords (String wordsStr)
   {
      // REGEX: shiver run up your spine.

      System.out.println("wordsStr: " + wordsStr);

      // Remove: .,; etc
      wordsStr = wordsStr.replace ('.', ' ');
      wordsStr = wordsStr.replace (',', ' ');
      wordsStr = wordsStr.replace (';', ' ');

      // Remove double spaces
      wordsStr = wordsStr.replaceAll ("  ", " ");

      System.out.println("wordsStr: " + wordsStr);

      // Get an array of the words in wordsStr
      System.out.println("wordsArray: ");
      String[] wordsArray = wordsStr.split (" ");

      for (int k = 0; k < wordsArray.length; k++)
      {
         System.out.print (wordsArray[k] + " ");
      }
      System.out.println();

      // For each word, see if it is in our arraylist
      // if it is, add 1 to count
      // if it is not: add it to the arraylist and set its count to 1;
      for (int w = 0; w < wordsArray.length; w++)
      {
         String wordStr = wordsArray [w];

         // Is it in our arraylist already ?
         int index = search (wordStr);

         if (index < 0)
         {
            // Add the word to our arraylist
            wordsArrayList.add (new Word (wordStr) );
         }
         else
         {
            // Increment the count of the word in our arraylist
            wordsArrayList.get(index).incCount();
         }

      }

   }

   /*
   If you find yourself copy code and changing the arraylist name, the method names, etc
   data types, etc
   STOP.
   Generic methods: to make a method work for any type of data.
   i.e. there are better ways to do it.
   */
   public void sort ()
   {
      boolean swapped = true;

      while (swapped == true)
      {
         swapped = false;

         for (int i = 0; i < wordsArrayList.size() - 1; i++) // - 1 ==> very important
         {
            if (wordsArrayList.get(i).getWord().compareToIgnoreCase (wordsArrayList.get(i+1).getWord()) > 0)
            {
               // do the swap
               Word temp = wordsArrayList.get (i);
               wordsArrayList.set (i, wordsArrayList.get (i+1));
               wordsArrayList.set (i+1, temp);

               swapped = true;
            }
         }
      }
   }


   public void displayWordCounts ()
   {
      for (int k = 0; k < wordsArrayList.size(); k++)
      {
         System.out.println (wordsArrayList.get(k).toString() );
      }
   }
}


public class WordCounter
{
   public static void main (String[] args)
   {
      //
      //String[] words  = new String [100000];
      //String[] counts = new String [100000];

      Words words = new Words ();

      words.addWords
         ("Question Six " +
          "Write an application that reads a line of text and prints a table indicating " +
          "the number of occurrences of each different word in the text. The application " +
          "should include the words in the table in the same order in which they appear " +
          "in the text."
         );

      System.out.println ("\n" + "In original word order:");
      words.displayWordCounts();

      System.out.println ("\n" + "Sorted");
      words.sort ();
      words.displayWordCounts();

   }
}