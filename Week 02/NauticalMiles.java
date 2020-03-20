/*
 Author: Mike O
 File:   NauticalMiles.java
 Desc:   Textbook: p115, Q5
*/
import java.util.Scanner;

public class NauticalMiles
{
	// Constants:
	public static final double KM_PER_NAUTICAL_MILE    = 1.852;
	public static final double MILES_PER_NAUTICAL_MILE = 1.150779;

	public static void main(String[] args)
	{
		Scanner kb = new Scanner (System.in);
		double nauticalMiles, km, miles;

		// Prompt user for Nautical Miles
		System.out.println ("Enter Nautical Miles: ");
		nauticalMiles = kb.nextDouble();

		// Conversions: to Km and Miles
		km    = nauticalMiles * KM_PER_NAUTICAL_MILE;
		miles = nauticalMiles * MILES_PER_NAUTICAL_MILE;

		// Display result: 3 decimal places, comma 1,000's separator:
		System.out.println (String.format ("%,.3f", nauticalMiles) + " Nautical Miles = " +
		                    String.format ("%,.3f", km   )         + " KM = " +
		                    String.format ("%,.3f", miles)         + " miles.");
	}
} // public class NauticalMiles