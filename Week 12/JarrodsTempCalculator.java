import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.*;
import java.time.temporal.ChronoUnit;

public class JarrodsTempCalculator extends JFrame
{
   private JButton startButton = new JButton ("Start");
   private JButton tapButton   = new JButton ("Tap");
   private JButton stopButton  = new JButton ("Stop");
   private JLabel  bpmLabel    = new JLabel  ("");

   private LocalDateTime startTime;
   private LocalDateTime endTime;
   private int           tapCount;

   public JarrodsTempCalculator ()
   {
      JPanel buttonPanel = new JPanel (new FlowLayout() );

      buttonPanel.add (startButton);
      buttonPanel.add (tapButton);
      buttonPanel.add (stopButton);

      add (bpmLabel,    BorderLayout.NORTH);
      add (buttonPanel, BorderLayout.SOUTH);

      //startButton.???? (???? ??? ?????);
      startButton.addActionListener (event -> startTaps());
      tapButton.addActionListener   (event -> doATap());
      stopButton.addActionListener  (event -> stopTaps());

      setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      setSize     (500, 500);
      setLocation (200, 100);
      setVisible  (true);
   }

   private void startTaps()
   {
      // Initialise tapCount, get start time
      startTime = LocalDateTime.now();
      tapCount  = 0;
   }

   private void doATap()
   {
      // Increment tapCount
      tapCount++;
   }

   private void stopTaps()
   {
      // Get end time, work out the elapsed secs, work out BPM, update label.
      endTime = LocalDateTime.now();

      //System.out.println ("Start: " + startTime.getLong(null) + " - " + startTime);
      //System.out.println ("End: "   + endTime.getLong(null)   + " - " + endTime);

      // import java.time.temporal.ChronoUnit;
      //double elapsedTime = 1.0 * (endTime.getLong() - startTime.getLong()) / 1_000_000; // Convert to Sec
      long elapsedTime = ChronoUnit.SECONDS.between (startTime, endTime);

      System.out.println ("Elapsed Sec: "   + elapsedTime );

      double bpm         = 1.0 * tapCount / elapsedTime;

      bpmLabel.setText (bpm + " beats / min");
   }

   public static void main (String[] args)
   {
      new JarrodsTempCalculator();
   }
} // public class JarrodsTempCalculator