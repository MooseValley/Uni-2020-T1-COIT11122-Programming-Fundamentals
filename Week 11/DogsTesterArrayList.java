/*
Author: Mike OMalley
Source: DogsTesterArrayList.java

See Dog.java and Dogs.java.
*/
public class DogsTesterArrayList
{

   public static void main (String[] args)
   {
      Dogs dogs = new Dogs ();

      dogs.add ("Frankie", 4);
      dogs.add ("Bella",   6);

      dogs.remove ("Deefer");

      dogs.displayDogs ();
      dogs.sort ();

      System.out.println ();
      System.out.println ("After sort:");
      dogs.displayDogs ();

      System.out.println ();
      System.out.println ("Searching for Frankie:");
      System.out.println (dogs.get ("Frankie") );

      System.out.println ();
      System.out.println ("Searching for BigDog:");
      System.out.println (dogs.get ("BigDog") );
   }

} // public class DogsTester