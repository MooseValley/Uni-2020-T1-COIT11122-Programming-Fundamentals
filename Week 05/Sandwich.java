/*
Author: Mike OMalley
Source: Sandwich.java

Java - Basic Console App - Week 05 - Textbook - Q11
11. a. Create a class named Sandwich. Data fields include a String for the main
ingredient (such as “tuna”), a String for bread type (such as “wheat”), and a
double for price (such as 4.99). Include methods to get and set values for each of
these fields. Save the class as Sandwich.java.

b. Create an application named TestSandwich that instantiates one Sandwich object
and demonstrates the use of the set and get methods. Save this application as
TestSandwich.java.

Student TODO:
* add bread type
* add person's name whose lunch it is
* add number of calories (int)
* add a default constructor
*/
public class Sandwich
{
   private String mainIngredient;
   private double price;

   public Sandwich()
   {
      // initialise class data.
      mainIngredient = "";
      mainIngredient = "not set";
      mainIngredient = "TBA";

   }

   public void setMainIngredient (String newMainIngredient)
   {
      mainIngredient = newMainIngredient;
   }

   public void setPrice (double newPrice)
   {
      price = newPrice;
   }

   public String getMainIngredient ()
   {
      return mainIngredient;
   }

   public double getPrice()
   {
      return price;
   }

   public String toString()
   {
      return "Main ingredient: " + getMainIngredient () +
             " and costs: $"     + getPrice();
   }
}
