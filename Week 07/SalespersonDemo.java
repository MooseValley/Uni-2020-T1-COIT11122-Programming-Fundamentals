/*
Author: Mike OMalley
Source: SalespersonDemo.java

Java - Basic Console App - Week 07
Q6b. Write an application named DemoSalesperson that declares an array of
10 Salesperson objects. Set each ID number to 9999 and each sales value to zero.
Display the 10 Salesperson objects.
*/
public class SalespersonDemo
{
   final static int MAX_SIZE = 10;

   public static void main (String[] args)
   {
      Salesperson[] salesPeople = new Salesperson [MAX_SIZE];

      /*
      Salesperson p1 = new Salesperson (::::);
      Salesperson p2;
      Salesperson p3;
      Salesperson p4;
      ::::
      Salesperson p9;
      */


      for (int k = 0; k < salesPeople.length; k++)
      {
         salesPeople[k] = new Salesperson (9999, 0.0);
      }

      /*
      for (int k = 0; k < salesPeople.length; k++)
      {
         salesPeople[k] = new Salesperson ( (int) (Math.random() * 1000),
                                            Math.random() * 55000.0       );
      }
      */

      for (int k = 0; k < salesPeople.length; k++)
      {
         salesPeople[k].setIdNumber    ((int) (Math.random() * 1000) );
         salesPeople[k].setAnnualSales (Math.random() * 55000.0 );
      }

      // Increase all Annual Sales by $100.
      for (int k = 0; k < salesPeople.length; k++)
      {
         //double annualSales = salesPeople[k].getAnnualSales ();
         //annualSales += 100.0;
         //salesPeople[k].setAnnualSales (annualSales);
         salesPeople[k].setAnnualSales (salesPeople[k].getAnnualSales () + 100.0);
      }


      // Get the Total Sales for all sales people
      double totalSales = 0.0;
      for (int k = 0; k < salesPeople.length; k++)
      {
         totalSales += salesPeople[k].getAnnualSales ();
      }


      // Get the Average Sales for all sales people
      double averageSales = 0.0;
      if (salesPeople.length > 0)
         averageSales = totalSales / salesPeople.length;


      // Displaying the final results:
      for (Salesperson sp : salesPeople)
      {
         System.out.println (sp);
      }

      System.out.println ();
      System.out.println ("Total Sales:   $" + String.format ("%,12.2f", totalSales) );
      System.out.println ("Average Sales: $" + String.format ("%,12.2f", averageSales) );
      System.out.println ();


      // List all under-performing Sales people: sales < Average * 0.5
      System.out.println ("Under Performers:");
      for (Salesperson sp : salesPeople)
      {
         if (sp.getAnnualSales () < averageSales * 0.5)
            System.out.println (sp);
      }

      // List all TOP performing Sales people: sales > Average * 1.5
      System.out.println ();
      System.out.println ("TOP Performers:");
      for (Salesperson sp : salesPeople)
      {
         if (sp.getAnnualSales () > averageSales * 1.5)
            System.out.println (sp);
      }

   }
}