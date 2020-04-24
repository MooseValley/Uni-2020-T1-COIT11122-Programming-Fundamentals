/*
Question Two

a) Create a class Car which has two private instance variables: make (String) and price (double)

b) Create the following constructors:
A default constructor: make = null and price = 0.0
Parameterised constructors:
- Both make and price
- Only make initialised
- Only price initialised
(use the default values for the other variables)

c) Create get and set methods

d) Create a toString method which will return a string representing the make and price.

e) Create a main method within the Car class to instantiate objects of this class and to test all of the constructors and the get and set methods

*/
public class Car
{
   private String make;
   private double price;

   // *** Constructors

   public Car () // Default Constructor
   {
      this (null, 0.0);
   }

   public Car (String make) // Parameterised Constructor #1
   {
      this (make, 0.0);
   }

   public Car (double price) // Parameterised Constructor #2
   {
      this (null, price);
   }

   public Car (String make, double price) // Parameterised Constructor #3
   {
      this.make  = make;
      this.price = price;
   }


   // *** Accessors / Getters

   public String getMake ()
   {
      return make;
   }

   public double getPrice ()
   {
      return price;
   }


   // *** Mutators / Setters

   public void setMake (String make)
   {
      this.make  = make;
   }

   public void setPrice (double price)
   {
      this.price  = price;
   }

   public static String getHeadings()
   {
      return String.format ("%-25s %-13s", "Make", "Price") + "\n" +
             String.format ("%-25s %-13s", "-----------------------", "-------------");
   }


   public String toString ()
   {
      return String.format ("%-25s $%,12.2f", this.getMake(), this.getPrice() );
      //return String.format ("%-25s $%,12.2f", getMake(), getPrice() );
      //return String.format ("%-25s $%,12.2f", make, price );
   }



}