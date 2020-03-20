/*
 Author: Mike O
 File:   QuartsToGallons.java
 Desc:   Textbook: p115, Q4
*/
import java.util.Scanner;

public class QuartsToGallons
{
	// 1 Gallon = 4 Quarts
	public static final int QUARTS_PER_GALLON = 4;

	public static void main(String[] args)
	{
		Scanner kb = new Scanner (System.in);
		int gallons;
		int quarts;

		// Prompt user for Quarts
		System.out.println ("Enter Quarts: ");
		quarts = kb.nextInt();

		// Convert to Gallons and Quarts.
		gallons = quarts / QUARTS_PER_GALLON;
		quarts  = quarts % QUARTS_PER_GALLON;

		// Display result:
		System.out.println ("You need: " + gallons + " gallons and " +
		                                   quarts  + " quarts.");
	}
} // public class QuartsToGallons