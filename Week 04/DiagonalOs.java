/*
Author: Mike OMalley
Source: DiagonalOs.java

Java - Basic Console App - Week 04
7. Write an application that uses a loop to create the pattern of Os
in which each O is displayed one additional space to the right. Save the file as
DiagonalOs.java.
O
 O
  O
   O
    O
     O


Also do this with String.format
*/
public class DiagonalOs
{
   public static void main(String[] args)
   {
      String outStr = "O";

      for (int k = 0; k < 10; k++)
      {
         System.out.println (outStr);
         outStr = " " + outStr;
      }

      outStr = "O";
      for (int k = 0; k < 10; k++)
      {
         for (int s = 0; s < k; s++)
            System.out.print (" ");

         System.out.println (outStr);
      }

      outStr = "O";
      for (int k = 1; k <= 10; k++)
      {
         System.out.printf ("%" + k + "s\n", outStr);
      }

   }
}
