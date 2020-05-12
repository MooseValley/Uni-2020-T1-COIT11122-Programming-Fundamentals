/*
  Author: Mike O
  Source: Welcome1.java
  Descr:  Display text in the console screen.

*/
//Welcome1.java
//Text-printing program
public class Welcome1
{
   //main method begins execution of Java application
   public static void main( String[] args)
   {
      System.out.println("Welcome to Java Programming!");

      String name = "Mike";
      System.out.println ("Your name is: " + name);

      int year = 2020;
      System.out.println ("The year is: " + year);

      System.out.println ("Your name is: " + name + " and " +
                          "the year is: "  + year + ".");

      System.out.println ("Your name is: \n" + name + " and " +
                          "the year is: \n"  + year + ".");

      System.out.println ("Your name is: \n\"" + name + "\" and " +
                          "the year is: \n'"    + year + "'.");

   }//end method main
}//end class Welcome1