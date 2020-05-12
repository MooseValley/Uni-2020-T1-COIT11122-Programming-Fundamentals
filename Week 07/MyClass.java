/*
Author: Mike OMalley
Source: MyClass.java

Java - Basic Console App - Week 07
*/
public class MyClass
{
   public static void main (String[] args)
   {
      for (int k = 0; k < args.length; k++)
      {
         // substring
         // indexof
         // toUpperCase
         // toLowerCase
         args[k] = args[k].replace ("{", "");
         args[k] = args[k].replace ("}", "");
         args[k] = args[k].replace (",", "");

         System.out.println ("args[" + k + "]: " + args[k]);

         double d1 = Double.parseDouble (args[k]);
         System.out.println ("  -> " + d1);
      }
   }
}
