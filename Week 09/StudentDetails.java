
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.FlowLayout;

public class StudentDetails extends JFrame
{
   private JLabel nameLabel = new JLabel("Enter your name: ");
   private JTextField nameField = new JTextField(30);
   private JLabel addressLabel = new JLabel("Enter your address: ");
   private JTextField addressField = new JTextField(30);
   private JLabel phoneLabel = new JLabel("Enter your phone number: ");
   private JTextField phoneField = new JTextField(30);
   private JLabel levelLabel = new JLabel("Select your education level: ");
   private ButtonGroup levelGroup = new ButtonGroup();
   private JRadioButton tafeRadioButton = new JRadioButton("TAFE ");
   private JRadioButton ugRadioButton = new JRadioButton("Under-graduate ");
   private JRadioButton pgRadioButton = new JRadioButton("Post-graduate ");
   private JButton addButton = new JButton("Add your details");

   StudentDetails()
   {
      super("Student Details");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(550, 200);
      setVisible(true);
      this.setLayout(new FlowLayout());

      add(nameLabel);
      add(nameField);
      add(addressLabel);
      add(addressField);
      add(phoneLabel);
      add(phoneField);
      add(levelLabel);

      levelGroup.add(tafeRadioButton);
      levelGroup.add(ugRadioButton);
      levelGroup.add(pgRadioButton);

      add(tafeRadioButton);
      add(ugRadioButton);
      add(pgRadioButton);
      add(addButton);
   }

   public static void main(String [] args)
   {
      StudentDetails app = new StudentDetails();
   }
}