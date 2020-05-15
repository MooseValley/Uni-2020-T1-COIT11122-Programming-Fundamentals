/*
Byron's code:

--------------------------------------------------
|  BMI Calculator                          _ O X |
--------------------------------------------------
|                                                |
| Enter your height in centimeters: [_172_____]  |
| Enter your weight in kilograms: [___68____]    |
|                                                |
|      Your body mass index is 23                |
|                                                |
|            [ Calculate BMI ]                   |
|                                                |
--------------------------------------------------

Q.is there a way to scale font as well?
why not make a child widget and add a scroll listener to each new child widget?


*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BMICalculator extends JFrame
{
   // Constants:
   // Byron's code:
   public static final String    APP_NAME_AND_VERSION = "BMI Calculator";
   public static final int    MAX_WIDTH    = 353;
   public static final int    MAX_HEIGHT   = 169;
   public static final int    CM_PER_METER = 100;

   // GUI Components:
   // Wayne's code:
   private JLabel heightLabel = new JLabel("Enter your height in centimetres: ");
   private JTextField heightField = new JTextField(7);
   private JLabel weightLabel = new JLabel("Enter your weight in kilograms:  ");
   private JTextField weightField = new JTextField(7);
   private JLabel BMILabel = new JLabel("**************************************************");
   private JButton BMIButton = new JButton("Calculate your BMI");

   // Class Instance Data:

   // Constructor / Methods:
   public BMICalculator()
   {
      // Build GUI
      // Wayne's code:
      setLayout(new GridLayout(4, 1) ); // R,C

      JPanel heightPanel = new JPanel (new FlowLayout() );
      JPanel weightPanel = new JPanel (new FlowLayout() );
      JPanel labelPanel  = new JPanel (new FlowLayout() );
      JPanel buttonPanel = new JPanel (new FlowLayout() );

      heightPanel.add(heightLabel);
      heightPanel.add(heightField);

      weightPanel.add(weightLabel);
      weightPanel.add(weightField);

      labelPanel.add (BMILabel);
      buttonPanel.add (BMIButton);

      add (heightPanel);
      add (weightPanel);
      add (labelPanel);
      add (buttonPanel);

      // Activate button(s):  Lambda
      BMIButton.addActionListener (event -> calculateBmi() );


      // Byron's code:
      setTitle (APP_NAME_AND_VERSION);
      setSize (MAX_WIDTH, MAX_HEIGHT);
      setLocation (250, 100);
      setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      setVisible (true);
   }

   private void calculateBmi()
   {
      //System.out.println (getWidth() + "w x " + getHeight() + "h");
      // BMI = weightkg / heightm^2
      // Wayne:
      double weightKg = Double.parseDouble(weightField.getText());
      double heightM  = Double.parseDouble(heightField.getText()) / CM_PER_METER;

      double bmi    = weightKg / (heightM * heightM);

      BMILabel.setText ("Your body mass index is " + String.format ("%.1f", bmi) );
   }


   public static void main (String[] args)
   {
      // Byron's code:
      // Create application
      //BMICalculator app = new BMICalculator();
      new BMICalculator();

   }
}
