/*
 Author: Mike O
 File:   SimpleMethodExamplesFromLecture.java
 Desc:   Week 06: Explore methods.
*/
public class SimpleMethodExamplesFromLecture
{
   public static void simpleMethod (double d)
   {
      System.out.println ("method takes a double: " + d);
   }

   public static void simpleMethod (String s)
   {
      System.out.println ("method takes a String: " + s);
   }

   public static void simpleMethod (boolean b)
   {
      System.out.println ("method takes a boolean: " + b);
   }

   public static void main (String[] args)
   {
      // Overloading / Polymorphism in action:
      simpleMethod ("Mike");
      simpleMethod (45.45);
      simpleMethod (true);
      simpleMethod (45);
      simpleMethod ('A'); // Which method ?

      //int, long, short, byte, char = 65 'A'

      char charA1 = 'A';
      System.out.println (charA1);  // A

      char charA2 = 65;
      System.out.println (charA2);  // A

      simpleMethod ("" + 'A');   // Which method ? "A"
      simpleMethod ("" + 45.45); // Which method ? "45.45"
      simpleMethod ("" + true);  // Which method ? "true"

   }

}