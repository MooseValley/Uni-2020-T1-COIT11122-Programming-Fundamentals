/*
Author: Mike OMalley
Source: DogsTester.java

See Dog.java and Dogs.java.
*/
public class DogsTester
{
   static final int MAX_SIZE = 20;

   static Dog[] dogs  = new Dog[MAX_SIZE];
   static int currDogIndex = -1;


   public static void main (String[] args)
   {

      if (currDogIndex >= MAX_SIZE - 1)
      {
         // We cannot add the data to the array.
         System.out.println ("ERROR: array size eceeded !");
      }
      else
      {
         // Prompt user for Dog name and dog age
         //::::

         // Validations
// Q.Hey Mike, will this be uploaded like all the other lessons?
// as this is definitely helping and i would love to come back for reference



         //Dog newDog = new Dog (kb.nextLine(), Integer.parseInt (kb.nextLine() ) );
         //Dog newDog = new Dog (nameTextField.getText(), Integer.parseInt (ageTextField.getText()) );


/*
Q. doesdogs[index] = new dog (name, age);
work the same?
*/


         /*
         Dog newDog = new Dog ("Frankie", 6);
         currDogIndex++;
         dogs[currDogIndex] = newDog;
         */

         currDogIndex++;
         dogs[currDogIndex] = new Dog ("Frankie", 6);


         System.out.println ("Current / NEW dog: ");
         System.out.println (dogs[currDogIndex].toString());
         //displayHeadings();
         //myTextArea.append (dogs[currDogIndex].toString());




         newDog = new Dog ("Bella", 7);
         currDogIndex++;
         dogs[currDogIndex] = newDog;

         newDog = new Dog ("Saminal", 9);
         currDogIndex++;
         dogs[currDogIndex] = newDog;

         newDog = new Dog ("Teenie Weenie", 9);
         currDogIndex++;
         dogs[currDogIndex] = newDog;
      }




      // Display headings ...

      for (int k = 0; k <= currDogIndex; k++)
      {
         System.out.println (dogs[k].toString());
         // myTextArea.append (dogs[k].toString());
      }




      String searchName = "Saminal";
      searchName = "Banjo";
      System.out.println ("\n" + "Searching for '" + searchName + "' ...");

      int foundCount = 0;

      for (int k = 0; k <= currDogIndex; k++)
      {
         if (dogs[k].getDogName().compareToIgnoreCase (searchName) == 0)
         {
            System.out.println (dogs[k].toString());
            // myTextArea.append (dogs[k].toString());
            foundCount++;
         }
      }

      if (foundCount == 0)
      {
         System.out.println ("ERROR: '" + searchName + "' was not found.");
      }






/*
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
*/
   }

} // public class DogsTester