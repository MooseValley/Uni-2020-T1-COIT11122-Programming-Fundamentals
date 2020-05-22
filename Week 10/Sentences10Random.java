/*
Author: Mike OMalley
Source: Sentences10Random.java

Question Four
Modify the application in Exercise 2(b) so that it generates and displays 10
random sentences. The application should use random number generator.
Extras:
* Capitalise each sentence.

Math.random()  // Horrible random numbers
SecureRandom   // Use this for all serious applications.
*/
import java.util.Random;
import java.security.SecureRandom;

public class Sentences10Random
{
   public static final int MAX_SENTENCES = 10;

    public static void main( String args[] )
    {
       SecureRandom random = new SecureRandom ();

       String article[]     = { "the ", "a ", "some ", "any " };
       String noun[]        = { "boy", "girl", "town", "car" };
       String verb[]        = { " drove", " jumped", " ran", " walked"};
       String preposition[] = {" to ", " from ", " over ", " under "};

       // create sentence
       for ( int j = 0; j < MAX_SENTENCES; j++ )
       {
          int article1     = random.nextInt (article.length); // 0-3
          int noun1        = random.nextInt (noun.length);
          int verb1        = random.nextInt (verb.length);
          int preposition1 = random.nextInt (preposition.length);
          int article2     = random.nextInt (article.length);
          int noun2        = random.nextInt (noun.length);

          StringBuilder buffer = new StringBuilder();
//
          // concatenate words and add period
          buffer.append( article[ article1 ] + noun[ noun1 ] +
                         verb[ verb1 ] + preposition[ preposition1 ] +
                         article[ article2 ] + noun[ noun2 ] + ".\n" );

          // capitalize first letter and display
          buffer.setCharAt(
             0, Character.toUpperCase( buffer.charAt( 0 ) ) );

          System.out.println( buffer.toString() );
       } // end for
    } // end main
 } // end class Sentences
