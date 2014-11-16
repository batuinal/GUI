import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.Timer;



public class Game extends JFrame
{

  private JPanel contentPane;
  private static long startTime;
  private static JLabel label;
  /**
   * Launch the application.
   */
  public static void main(String[] args)
  {
    startTime = System.currentTimeMillis();
    Game frame = new Game(startTime);
    frame.setVisible(true);
  }

  /**
   * Create the frame.
   */
  public Game(long startTime)
  {
    
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 840, 575);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);
    setLayout(new BorderLayout());
    add(new Animation(), BorderLayout.CENTER);
  }
  
  public class LabelshiftActionListener implements ActionListener{
    public void actionPerformed(ActionEvent e){
      System.out.println("sssssssssss");
    }
  }
  
}
