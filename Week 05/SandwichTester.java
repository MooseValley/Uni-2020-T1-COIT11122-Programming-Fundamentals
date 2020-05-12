/*
Author: Mike OMalley
Source: SandwichTester.java

Java - Basic Console App - Week 05
*/
public class SandwichTester
{
   public static void main (String[] args)
   {
      Sandwich mikeLunch  = new Sandwich ();
      Sandwich waynesLunch = new Sandwich ();

      mikeLunch.setMainIngredient ("Avocado Chicken");
      mikeLunch.setPrice (4.50);
      //System.out.println ("Mike's Lunch: " + mikeLunch.getMainIngredient () +
      //                    " and costs: $" + mikeLunch.getPrice() );
      //System.out.println ("Mike's Lunch: " + mikeLunch.toString() );
      System.out.println ("Mike's Lunch: " + mikeLunch );
      System.out.println (mikeLunch );

      waynesLunch.setMainIngredient ("Tuna");
      waynesLunch.setPrice (3.95);
      //System.out.println ("Wayne's Lunch: " + waynesLunch.getMainIngredient () +
      //                    " and costs: $" + waynesLunch.getPrice() );
      //System.out.println ("Wayne's Lunch: " + waynesLunch.toString() );
      System.out.println ("Wayne's Lunch: " + waynesLunch );

   }
}