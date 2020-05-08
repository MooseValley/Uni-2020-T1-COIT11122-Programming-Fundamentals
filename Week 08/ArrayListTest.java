/*
Author: Andrew
Source: Salesperson.java

All Code: special thanks to Andrew !!  :)

Java - Basic Console App - Week 08
Question Three
a. Create a class called ArrayListTest within the main method create an ArrayList of strings called names
b. Add the names Tom, Dick and Harry to the ArrayList (in main)
c. Using the enhanced for loop print out these names (in main)
d. Remove Dick from the list and then add George.
e. Insert John into the beginning of the list
f. Use a traditional for loop (counter controlled) to print out the updated list

*/
import java.util.*;

public class ArrayListTest
{
   public static void main (String[] args)
   {
      // All Code: special thanks to Andrew !!  :)

      // a. Create a class called ArrayListTest within the main method create an ArrayList of strings called names
      ArrayList<String> name = new ArrayList<>();

      // b. Add the names Tom, Dick and Harry to the ArrayList (in main)
      name.add("Tom");
      name.add("Dick");
      name.add("Harry");

      // c. Using the enhanced for loop print out these names (in main)
      for ( String nm : name )
      {
         System.out.println(nm);
      }

      // d. Remove Dick from the list and then add George.
      //name.remove(1);
      name.remove("Dick");

      name.add("George");

      // e. Insert John into the beginning of the list
      name.add(0, "John");

      // f. Use a traditional for loop (counter controlled) to print out the updated list
      System.out.println("Updated list");
      for (int counter = 0; counter < name.size(); counter++)
      {
         System.out.println(name.get(counter));
      }


      // Erase all items in the ArrayList:
      name.clear();
   }

} // public class ArrayListTest