import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
2 Options:
1. Dogs class with ArrayList     <-- THIS
2. array
*/

public class DogsGUI extends JFrame
{
   // GUI Components:
   private JLabel     dogNameLabel           = new JLabel     ("Dog name: ");
   private JTextField dogNameTextField       = new JTextField (20);
   private JLabel     dogAgeLabel            = new JLabel     ("Dog age: ");
   private JTextField dogAgeTextField        = new JTextField (5);
   private JTextArea  outputTextArea         = new JTextArea  ();

   private JButton    addButton              = new JButton    ("Add");
   private JButton    displayAllButton       = new JButton    ("Display All");
   private JButton    searchButton           = new JButton    ("Search");
   private JButton    exitButton             = new JButton    ("Exit");


   // Class Data:
   private Dogs dogs       = new Dogs ();


   public DogsGUI()
   {
      JPanel dogNamePanel = new JPanel (new FlowLayout (FlowLayout.CENTER) );
      JPanel dogAgePanel  = new JPanel (new FlowLayout (FlowLayout.CENTER) );
      JPanel topPanel     = new JPanel (new GridLayout (2, 1) ); // R,C
      JPanel buttonPanel  = new JPanel (new FlowLayout (FlowLayout.CENTER) );

      outputTextArea.setEditable (false); // Read-only
      outputTextArea.setFont (new Font ("Courier New", Font.PLAIN, 16) );

      dogNamePanel.add (dogNameLabel);
      dogNamePanel.add (dogNameTextField);

      dogAgePanel.add  (dogAgeLabel);
      dogAgePanel.add  (dogAgeTextField);

      topPanel.add (dogNamePanel);
      topPanel.add (dogAgePanel);

      buttonPanel.add (addButton);
      buttonPanel.add (displayAllButton);
      buttonPanel.add (searchButton);
      buttonPanel.add (exitButton);

      add (topPanel,       BorderLayout.NORTH);
      add (outputTextArea, BorderLayout.CENTER);
      add (buttonPanel,    BorderLayout.SOUTH);

      addButton.addActionListener        (event -> addDog () );
      displayAllButton.addActionListener (event -> displayAllDogs () );
      searchButton.addActionListener     (event -> searchDog () );
      exitButton.addActionListener       (event -> exitApplication () );

      setVisible  (true);
      setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      setSize     (500, 500);
      setLocation (200, 100);
      setTitle    ("Doggie GUI v0.007");
   }

   private void addDog ()
   {
      /*
      // Validate name
      if (dogNameTextField.getText().trim().length() == 0)
      {
         // Display error
      }

      else if (dogAgeTextField.getText().trim().length() == 0)
      {
         // Display error
      }

      else if ..... other validations
      {

      }


      else
      */

      // Thanks Andrew !
      dogs.add (dogNameTextField.getText(), Integer.parseInt (dogAgeTextField.getText()) );

      //outputTextArea.setText (dogs.toString() ); // Thanks Wayne
      outputTextArea.setText (dogs.toStringLatestDog() );

   }
/*
Mike's Wireless Usage Graph
|
|
|
|
|
|/\/\----/\
|------------------------------------
*/
   private void displayAllDogs ()
   {
      outputTextArea.setText (dogs.toString() ); // Thanks Wayne
   }

   private void searchDog ()
   {
      String searchStr = JOptionPane.showInputDialog (DogsGUI.this, "Search Dog Name:");

      // If search is blank, display an error ....

      String dogResultsStr = dogs.get (searchStr);

      StringBuilder outputSB = new StringBuilder ();

      outputSB.append (Dog.toStringHeadings() + "\n");

      outputSB.append (dogResultsStr + "\n");

      outputTextArea.setText (outputSB.toString() );

   }

   private void exitApplication ()
   {

      System.exit (0); // All OK
   }

   public static void main(String[] args)
   {
      new DogsGUI();
   }
}