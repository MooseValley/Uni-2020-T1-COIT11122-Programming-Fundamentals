/*
Author: Mike OMalley
Source: LectureGuiExample.java
Desc:   Develop a basic GUI user interface using the components as
        we cover them in the lecture class.

Students TODO:
* Add validation of inputs - display error and return if error found.
* Move set default values code a method and call in Constructor as well.
* Neaten up the GUI (after this week's tutorial).



*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LectureGuiExample extends JFrame
{
   // Constants:
   public static final String APP_NAME_AND_VERSION = "My First GUI v0.00001";
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

   JTextArea  outputTextArea    = new JTextArea  (20, 50);
   JButton    addButton         = new JButton    ("Add");
   JButton    clearButton       = new JButton    ("Clear");

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
      setLayout (new FlowLayout(FlowLayout.CENTER) );
      add (headingLabel);
      add (nameLabel);
      add (nameTextField);
      add (ageLabel);
      add (ageTextField);
      add (mealRequiredCheckBox);
      add (extraLegRoomRequiredCheckBox);

      creditCardButtonGroup.add (visaCardRadioButton);
      creditCardButtonGroup.add (masterCardRadioButton);
      creditCardButtonGroup.add (amexCardRadioButton);

      add (visaCardRadioButton);
      add (masterCardRadioButton);
      add (amexCardRadioButton);

      add (planeTypeComboBox);

      add (outputTextArea);

      add (addButton);
      add (clearButton);


      // Set default values and setings:
      mealRequiredCheckBox.setSelected (true);
      visaCardRadioButton.setSelected  (true);
      //if (mealRequiredCheckBox.isSelected() == true)

      outputTextArea.setEditable (false);
      outputTextArea.setText ("Enter inputs please" + "\n");

      // Tooltips:
      addButton.setToolTipText   ("Add person's details to the output area");
      clearButton.setToolTipText ("Clear the output area");

      // Activate buttons:
      addButton.addActionListener   (event -> addDetails() );
      clearButton.addActionListener (event -> clearDetails() );
      clearButton.setEnabled (false);

      /*
      // WARNING: NO SPACES before the <html> !!!!!!!!!
      headingLabel.setText ("<html><h1>Hello World</h1>" +
                            "<table border=1><tr><td>Row 1, Col 1</td><td>Row2, Col 2</td></tr></table>" +
                            "</html>");
      */

      //Font headingFont = new Font ("Courier New", Font.BOLD, 72);
      //headingLabel.setFont (headingFont);

      // Size of show the UI:
      setTitle (APP_NAME_AND_VERSION);
      setSize  (MAX_WIDTH, MAX_HEIGHT);
      setLocation (250, 100);
      setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      //setDecoratedLookAndFeelDecorated (true);
      setVisible (true);
   }

   private void addDetails()
   {
      //System.out.println ("Add button clicked");
      //outputTextArea.append ("Add button clicked" + "\n");

      String outStr = nameTextField.getText()  + "   " +
                      ageTextField.getText()   + "   " +
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

      outputTextArea.append (outStr + "\n");


      // Restore Default values:
      nameTextField.setText("");
      ageTextField.setText("");
      planeTypeComboBox.setSelectedIndex (0);
      mealRequiredCheckBox.setSelected   (true);
      extraLegRoomRequiredCheckBox.setSelected   (false);
      visaCardRadioButton.setSelected   (true);

      clearButton.setEnabled (true);
   }

   private void clearDetails()
   {
      outputTextArea.setText ("");
      clearButton.setEnabled (false);
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