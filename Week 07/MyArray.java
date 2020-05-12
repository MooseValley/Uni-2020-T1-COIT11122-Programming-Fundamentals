/*
Author: Mike OMalley
Source: MyArray.java

Java - Basic Console App - Week 07
Question Two

a. Declare and create an integer array called numbers with the following numbers in a class called MyArray 42, 56, 34, 27, 72, 12, 98, 85, 33, 67

b. Write a for loop which traverses the array and outputs the numbers on a line separated by spaces

c. Write an enhanced for loop which does the same as part b.

d. Write a loop which adds the values in the array and also finds the minimum and maximum.

e. Write a method which will accept the array as a parameter and an integer (key) as a parameter, the method will search the array for the key value and will return the index of the found value or -1 if the value is not found. Write code to test it.

*/
public class MyArray
{
   // Example use:
   //   int index = search (numbers, 12);  // 5  = index of found value
   //   int index = search (numbers,  3);  // -1 = value not found
   public static int search (int[] array, int searchVal)
   {
      int foundIndex = -1;

      for(int k = 0; k < array.length; k++)
      {
         if (array[k] == searchVal)
         {
            foundIndex = k;
            k = array.length;  // Exit loop.
         }
      }

      return foundIndex;
   }


   public static void main (String[] args)
   {
                     // 0   1   2   3   4   5   6   7   8   9
      int[] numbers = {42, 56, 34, 27, 72, 12, 98, 85, 33, 67};

      System.out.println ("Counter Controlled For Loop:");
      for(int k = 0; k < numbers.length; k++)
      {
         System.out.print (numbers[k] + " ");
      }
      System.out.println ();

      System.out.println ("Enhanced For Loop:");
      for(int val : numbers)
      {
         System.out.print (val + " ");
      }
      System.out.println ();


      int total = 0;
      for(int val : numbers)
      {
         total += val;
      }

      int max = numbers[0];
      int min = numbers[0];
      for(int k = 1; k < numbers.length; k++) // Skip 1st item in array
      {
         if(numbers[k] > max) max = numbers[k];
         if(numbers[k] < min) min = numbers[k];
      }

      int    intAverage = total / numbers.length;
      double dblAverage = 1.0 * total / numbers.length;

      System.out.println ("Max:   " + max);
      System.out.println ("Min:   " + min);
      System.out.println ("Total: " + total);
      System.out.println ("Avg i: " + intAverage);
      System.out.println ("Avg d: " + dblAverage);


      int index1 = search (numbers, 12);  // 5  = index of found value
      System.out.println ("Search for 12: " + index1);

      int index2 = search (numbers,  3);  // -1 = value not found
      System.out.println ("Search for 3: " + index2);


      // Wayne's code:
      for(int i = 0; i < numbers.length; ++i)
      {
         int rand = (int) Math.floor((Math.random() * numbers.length));
         System.out.println("The number " + numbers[rand] + " is at array index :" +
                        search(numbers, numbers[rand]));
      }


   }
}