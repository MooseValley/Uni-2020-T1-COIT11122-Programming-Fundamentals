/*
 Author: Mike O
 File:   TicketNumber.java.
 Desc:   Textbook: p116, Q12
*/
import javax.swing.*;

public class TicketNumber
{
	// Constants:

	public static void main(String[] args)
	{
		// Get ticket number user input via Swing Dialog:
		String ticketStr = JOptionPane.showInputDialog (null, "Enter ticket number: ");
		ticketStr = ticketStr.trim(); // Remove Leading and trailing white space.

		// For testing:
		//String ticketStr = "123454";

		// Convert to a number:
		int ticketNum = Integer.parseInt (ticketStr);

		// Calculate Checksum:
		// Get the first 5 digits and remainder 7.
		int first5Digits = ticketNum    / 10;
		int checksum     = first5Digits %  7;
		int digit6       = Integer.parseInt ("" + ticketStr.charAt (5) );


		System.out.println ("checksum: " + checksum + " VS digit6: " + digit6);

		// Check ticket number is 6 digits and check checksum is correct:
		boolean validTicket = true;
		/*
		if ( (ticketStr.trim().length() != 6     )   ||
		     (checksum                  != digit6) )
		{
			validTicket = false;
		}
		*/
		if (ticketStr.trim().length() != 6     )
			validTicket = false;
		if (checksum                  != digit6)
			validTicket = false;

		// Display the result in a Swing Dialog:
		if (validTicket == true)
		{
			JOptionPane.showMessageDialog (null, "Ticket is valid !!!");
		}
		else
		{
			JOptionPane.showMessageDialog (null, "Ticket is NOT valid !!!");
		}
	}
} // public class TicketNumber