/*
Author: Mike OMalley
Source: LectureGuiExample.java
Desc:   Develop a basic GUI user interface using the components as
        we cover them in the lecture class.

Students TODO:
* Format Data: String.format

DONE:
* Add basic validation of inputs - display error and return if error found.
* Neaten up the GUI (after this week's tutorial).
* Move set default values code a method and call in Constructor as well.
* Added scrollbars to the text area.
* Add a confirm dialog to the clear
* Added icons to buttons
* Center all dialogs inside the application's frame.
* Wayne: displayError method

*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LectureGuiExample extends JFrame
{
   // Constants:
   public static final String APP_NAME_AND_VERSION = "My First GUI v0.00003";
   public static final int    MAX_WIDTH            = 600;
   public static final int    MAX_HEIGHT           = 500;

   public static final String[] PLANE_TYPES        = {"747", "737", "Cessna"};


   // GUI Components:
   JLabel     headingLabel      = new JLabel     ("Welcome to my app, please click something");
   JLabel     nameLabel         = new JLabel     ("Enter name:");
   JTextField nameTextField     = new JTextField (30);
   JLabel     ageLabel          = new JLabel     ("Enter age:");
   JTextField ageTextField      = new JTextField (5);
   JCheckBox  mealRequiredCheckBox = new JCheckBox ("Meals required");
   JCheckBox  extraLegRoomRequiredCheckBox = new JCheckBox ("Extra Leg Room required");

   ButtonGroup  creditCardButtonGroup  = new ButtonGroup();
   JRadioButton visaCardRadioButton    = new JRadioButton ("Visa");
   JRadioButton masterCardRadioButton  = new JRadioButton ("Master");
   JRadioButton amexCardRadioButton    = new JRadioButton ("Amex");

   JComboBox<String> planeTypeComboBox  = new JComboBox<String> (PLANE_TYPES);

   JTextArea  outputTextArea    = new JTextArea  (); //20, 50);
   JScrollPane outputScrollPane = new JScrollPane (outputTextArea,
                                          ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
                                          ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

   JButton    addButton         = new JButton    ("Add",   new ImageIcon("add.gif")   );
   JButton    clearButton       = new JButton    ("Clear", new ImageIcon("reset.gif") );
   JButton    exitButton        = new JButton    ("Exit" );


   // Class instance data:

   // Constructor / Methods:
   public LectureGuiExample()
   {
      // Call JFrame constructor, **MUST** be the first line of code in your Constructor.
      //super (APP_NAME_AND_VERSION);

      // Build the GUI
      //add (headingLabel, BorderLayout.CENTER);

      // Add componets to UI:

      //setLayout (new FlowLayout(FlowLayout.LEFT) );
      //setLayout (new FlowLayout(FlowLayout.CENTER) );
      setLayout (new BorderLayout() );

      JPanel headingPanel   = new JPanel (new FlowLayout () );
      JPanel namePanel      = new JPanel (new FlowLayout () );
      JPanel agePanel       = new JPanel (new FlowLayout () );
      JPanel extrasPanel    = new JPanel (new FlowLayout () );
      JPanel paymentPanel   = new JPanel (new FlowLayout () );
      JPanel planeTypePanel = new JPanel (new FlowLayout () );
      JPanel topGridPanel   = new JPanel (new GridLayout (6, 1) );
      JPanel buttonPanel    = new JPanel (new FlowLayout () );


      headingPanel.add (headingLabel);
      namePanel.add (nameLabel);
      namePanel.add (nameTextField);
      agePanel.add (ageLabel);
      agePanel.add (ageTextField);

      extrasPanel.add (new JLabel ("Extras: ") );
      extrasPanel.add (mealRequiredCheckBox);
      extrasPanel.add (extraLegRoomRequiredCheckBox);

      creditCardButtonGroup.add (visaCardRadioButton);
      creditCardButtonGroup.add (masterCardRadioButton);
      creditCardButtonGroup.add (amexCardRadioButton);

      paymentPanel.add (new JLabel ("Payment Type: ") );
      paymentPanel.add (visaCardRadioButton);
      paymentPanel.add (masterCardRadioButton);
      paymentPanel.add (amexCardRadioButton);

      planeTypePanel.add (new JLabel ("Plane Type: ") );
      planeTypePanel.add (planeTypeComboBox);

      topGridPanel.add (headingPanel);
      topGridPanel.add (namePanel);
      topGridPanel.add (agePanel);
      topGridPanel.add (extrasPanel);
      topGridPanel.add (paymentPanel);
      topGridPanel.add (planeTypePanel);

      buttonPanel.add (addButton);
      buttonPanel.add (clearButton);
      buttonPanel.add (exitButton);

      // Add items to the JFrame:
      add (topGridPanel,      BorderLayout.NORTH);
      add (outputScrollPane,  BorderLayout.CENTER);
      add (buttonPanel,       BorderLayout.SOUTH);

      outputTextArea.setEditable (false);
      outputTextArea.setText ("Enter inputs please" + "\n");

      // Tooltips:
      addButton.setToolTipText   ("Add person's details to the output area");
      clearButton.setToolTipText ("Clear the output area");

      // Activate buttons:
      addButton.addActionListener   (event -> addDetails() );
      clearButton.addActionListener (event -> clearDetails() );
      clearButton.setEnabled (false);
      exitButton.addActionListener (event -> exit() );

      /*
      // WARNING: NO SPACES before the <html> !!!!!!!!!
      headingLabel.setText ("<html><h1>Hello World</h1>" +
                            "<table border=1><tr><td>Row 1, Col 1</td><td>Row2, Col 2</td></tr></table>" +
                            "</html>");
      */

      //Font headingFont = new Font ("Courier New", Font.BOLD, 72);
      //headingLabel.setFont (headingFont);


      // when the user pushes the system close (X top right corner)
      addWindowListener( // override window closing method
         new WindowAdapter()
         {
            public void windowClosing(WindowEvent e)
            {
               exit();           // Attempt to exit application
            }
         }
      );


      // Size of show the UI:
      setTitle (APP_NAME_AND_VERSION);
      setSize  (MAX_WIDTH, MAX_HEIGHT);
      setLocation (250, 100);
      //setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      setDefaultCloseOperation (JFrame.DO_NOTHING_ON_CLOSE);
      //setDecoratedLookAndFeelDecorated (true);
      setVisible (true);

      setDefaultValues();
   }

   // Wayne: You could have made a displayError() method
   private void displayError (String errormessageStr)
   {
      JOptionPane.showMessageDialog (LectureGuiExample.this,
           errormessageStr, "Error:", JOptionPane.ERROR_MESSAGE);
   }


   private void addDetails()
   {
      //System.out.println ("Add button clicked");
      //outputTextArea.append ("Add button clicked" + "\n");

      /*
      Validation:
       * Proper was is to use a Booking data class which validates our data
         and throws Exceptions when there is any errors, and our GUI class
         should handle the Exceptions and display Swing Dialogs with error messages.
         BUT we don't do Exception Handling in this course.
       * So I'll show you the only way we can do it with the Java we have done so far.
      */

      boolean inputsValid = true;
      String nameStr = "";
      int    age = 0;

      nameTextField.setBackground (Color.white);
      ageTextField.setBackground  (Color.white);


      nameStr = nameTextField.getText().trim();
      if (nameStr.length() < 3) // TODO: make the 3 a constant.
      {
         nameTextField.requestFocus();
         nameTextField.setBackground (Color.red);

         displayError ("Error: name must be at least 3 chars long.");

         inputsValid = false;
      }

      if (inputsValid == true)
      {
         age = Integer.parseInt (ageTextField.getText().trim() );

         if (age < 18) // TODO: make 18 contants
         {
            ageTextField.requestFocus();
            ageTextField.setBackground (Color.red);

            displayError ("Error: your must be 18 or over to fly with CQUni airlines.");

            inputsValid = false;
         }

      }

      if (inputsValid == true)
      {
         // All inputs are valid:

         String outStr = nameStr  + "   " +
                         age      + "   " +
                         planeTypeComboBox.getSelectedItem()  + "   ";

         if (mealRequiredCheckBox.isSelected() == true)
            outStr += "Meal required" + "   ";

         if (extraLegRoomRequiredCheckBox.isSelected() == true)
            outStr += "Extra leg room required" + "   ";

         if (visaCardRadioButton.isSelected() == true)
            outStr += "visa card" + "   ";
         else if (masterCardRadioButton.isSelected() == true)
            outStr += "master card" + "   ";
         else if (amexCardRadioButton.isSelected() == true)
            outStr += "amex card" + "   ";
         else
            outStr += "non-credit card" + "   ";

         /*
         Booking newBooking = new Booking (name, age, ........);

         bookingArrayList.add (newBooking);

         displayHeadings ();
         displayBooking  (bookingArrayList.size() - 1);
         */


         outputTextArea.append (outStr + "\n");

         setDefaultValues();

         clearButton.setEnabled (true);
      }
   }

   private void setDefaultValues()
   {
      // Restore Default values:
      nameTextField.setText ("");
      ageTextField.setText  ("0");
      planeTypeComboBox.setSelectedIndex        (0);
      mealRequiredCheckBox.setSelected          (true);
      extraLegRoomRequiredCheckBox.setSelected  (false);
      visaCardRadioButton.setSelected           (true);
   }

   private void clearDetails()
   {
      int result = JOptionPane.showConfirmDialog(LectureGuiExample.this,
                                    "Clear Everything - are you MAD ?????",
                                    "Confirm Clear ??",
                                    JOptionPane.YES_NO_OPTION);

      if (result == JOptionPane.YES_OPTION)
      {
         outputTextArea.setText ("");
         clearButton.setEnabled (false);
      }
   }

   private void exit()
   {
      int result = JOptionPane.showConfirmDialog(LectureGuiExample.this,
                                    "Exit Application - are you MAD ?????",
                                    "Confirm Exit ??",
                                    JOptionPane.YES_NO_OPTION);

      if (result == JOptionPane.YES_OPTION)
      {
         System.exit(0); // All OK
      }
   }


   public static void main (String[] args)
   {
      LectureGuiExample app = new LectureGuiExample();
      /*
      app.setTitle ("My First GUI v0.00001");
      app.setSize  (600, 600);
      app.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      app.setVisible (true);
      */
   }

} // public class LectureGuiExample