/*
Author: Mike OMalley
Source: Dogs.java

Java - Basic Console App - Week 08
Question Two
See Dog.java.
d. Create another class in the same folder called Dogs, in Dogs create an array of three Dog objects
e. In the Dogs class's constructor populate the array (using new and the parameterised constructor) use: Fido, 3; Rover, 8 and Deefer, 2;
f. Create a main method in Dogs and create an object of type Dogs.
g. Create a method in Dogs displayDogs to display the three dogs.
h. Call the method displayDogs in the main using the Dogs object you have created in section f.

See Dog.java.
*/

import java.util.*;  // Special thanks to Andrew !! :)

public class Dogs
{
   //public static final int MAX_SIZE      = 3;

   //private Dog[] dogsArray = new Dog [MAX_SIZE];
   ArrayList<Dog> dogsArrayList = new ArrayList<Dog>();


   public Dogs ()
   {
      /*
      dogsArray[0] = new Dog ("Fido",   3);
      dogsArray[1] = new Dog ("Rover",  8);
      dogsArray[2] = new Dog ("Deefer", 2);
      */
      dogsArrayList.add (new Dog ("Fido",   3) );
      dogsArrayList.add (new Dog ("Rover",  8) );
      dogsArrayList.add (new Dog ("Deefer", 2) );
   }


   // *** Accessors:

   public String get (String dogName)
   {
      String resultStr = "Not Found";
      int index        = search (dogName);

      if (index >= 0) // Did we find a match ?
      {
         resultStr = dogsArrayList.get(index).toString();
      }

      return resultStr;
   }

   private int search (String dogName)
   {
      int indexLocation = -1; // Not found

      for (int i = 0; i < dogsArrayList.size(); i++)
      {
         if (dogName.equalsIgnoreCase (dogsArrayList.get(i).getDogName() ) == true)
         {
            indexLocation = i;        // Indicate found
            i = dogsArrayList.size(); // Exit Loop
         }
      }

      return indexLocation;
   }

   // Special thanks to Andrew !! :)
   public void displayDogs()
   {
      /*
      for (int i = 0; i < dogsArray.length; i++)
      {
         System.out.println (dogsArray[i].toString() );
      }
      */
      for (int i = 0; i < dogsArrayList.size(); i++) // Thanks Andrew and Byron !!
      {
         System.out.println (dogsArrayList.get(i).toString() );
      }

   }


   // *** Mutators:

   public void add (String dogName, int dogAge)
   {
      dogsArrayList.add (new Dog (dogName, dogAge) );
   }

   public void sort ()
   {
      boolean swapped = true;

      while (swapped == true)
      {
         swapped = false;

         for (int i = 0; i < dogsArrayList.size() - 1; i++) // - 1 ==> very important
         {
            if (dogsArrayList.get(i).getDogName().compareTo (dogsArrayList.get(i+1).getDogName()) > 0)
            {
               // do the swap
               Dog temp = dogsArrayList.get (i);
               dogsArrayList.set (i, dogsArrayList.get (i+1));
               dogsArrayList.set (i+1, temp);

               swapped = true;
            }
         }
      }
   }

   public boolean remove (String dogName)
   {
      boolean removed = false;

      int index        = search (dogName);

      if (index >= 0) // Did we find a match ?
      {
         dogsArrayList.remove (index); // Remove the dog.

         removed = true;
      }

      return removed;
   }

} // public class Dogs