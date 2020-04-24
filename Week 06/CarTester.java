/*
 Author: Mike O
 File:   CarTester.java
 Desc:   Week 06: Tutorial Question 2.  See Car.java.
*/
public class CarTester
{
   public static void main (String[] args)
   {
      Car byronsCar  = new Car ();
      Car jarrodsCar = new Car ("Porche", 9999.99);
      Car liamsCar   = new Car ("Tesla Roadster");
      Car mikesCar   = new Car (999);


      byronsCar.setMake ("Something Reliable");
      byronsCar.setPrice (8999.15);

      liamsCar.setPrice (12000.00);

      mikesCar.setMake ("Old Rattler");

      // error: non-static method getHeadings() cannot be referenced from a static context
      System.out.println (Car.getHeadings() );

      // Byron's Car:
      // Car@A12E4F   <--- Object class, toString()
      //System.out.println ("Byron's Car: "  + "\n" + byronsCar );
      // Car@A12E4F   <--- Object class, toString()
      //System.out.println ("Byron's Car: "  + "\n" + byronsCar.toString () );
      //System.out.println ("Byron's Car: "  + "\n" + byronsCar.getString () );

      System.out.println ("Byron's Car: "  + "\n" + byronsCar.toString () );
      System.out.println ("Jarrod's Car: " + "\n" + jarrodsCar.toString () );
      System.out.println ("Liam's Car: "   + "\n" + liamsCar.toString () );
      System.out.println ("Mike's Car: "   + "\n" + mikesCar.toString () );



      //System.out.println ("Byron's Car: "  + "\n" + byronsCar  );
      //System.out.println ("Jarrod's Car: " + "\n" + jarrodsCar );
      //System.out.println ("Liam's Car: "   + "\n" + liamsCar   );
      /*
      System.out.println (String.format ("%-20s %-25s $%,12.2f", "Byron's Car: ",
                                         byronsCar.getMake(), byronsCar.getPrice() ) );

      System.out.println (String.format ("%-20s %-25s $%,12.2f", "Jarrod's Car: ",
                                         jarrodsCar.getMake(), jarrodsCar.getPrice() ) );

      System.out.println (String.format ("%-20s %-25s $%,12.2f", "Liam's Car: ",
                                         liamsCar.getMake(), liamsCar.getPrice() ) );
      */
      //System.out.println ("Jarrod's Car: " + jarrodsCar.getMake() + ", price: $" + jarrodsCar.getPrice() );
      //System.out.println ("Liam's Car: "   + liamsCar.getMake()   + ", price: $" + liamsCar.getPrice()   );

   } // public static void main (String[] args)

} // public class CarTester