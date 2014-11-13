import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.io.*;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.*;

public class Songselect extends JFrame
{

  private JPanel contentPane;
  private static Player player;
  /**
   * Launch the application.
   */
  /*
   * public static void main(String[] args) { EventQueue.invokeLater(new
   * Runnable() { public void run() { try { Songselect frame = new Songselect();
   * frame.setVisible(true); } catch( Exception e ) { e.printStackTrace(); } }
   * }); }
   */

  /**
   * Create the frame.
   */
  public Songselect(String userinfo)
  {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 1004, 723);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);

    JLabel label_1 = new JLabel("Beats With Ara");
    label_1.setBounds(220, 90, 555, 107);
    label_1.setVerticalAlignment(SwingConstants.TOP);
    label_1.setHorizontalAlignment(SwingConstants.CENTER);
    label_1.setForeground(Color.PINK);
    label_1.setFont(new Font("Bradley Hand ITC", Font.PLAIN, 85));
    contentPane.add(label_1);

    
    
    JButton btnNewButton = new JButton("Easy");
    btnNewButton.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        try
        {
          File file = new File("music1.mp3");
          FileInputStream fis = new FileInputStream(file);
          BufferedInputStream bis = new BufferedInputStream(fis);
          try
          {
            player = new Player(bis);
            player.play();
            
          } catch(JavaLayerException ex1)
          {
            ex1.printStackTrace();
          }
        } catch(IOException ex)
        {
           ex.printStackTrace();
        }
      }
    });
    btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 30));
    btnNewButton.setBounds(373, 230, 170, 69);
    contentPane.add(btnNewButton);

    JButton btnNormal = new JButton("Normal");
    btnNormal.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        try
        {
          File file = new File("music2.mp3");
          FileInputStream fis = new FileInputStream(file);
          BufferedInputStream bis = new BufferedInputStream(fis);
          try
          {
            player = new Player(bis);
            player.play();
            
          } catch(JavaLayerException ex1)
          {
            ex1.printStackTrace();
          }
        } catch(IOException ex)
        {
           ex.printStackTrace();
        }
      }
    });
    btnNormal.setFont(new Font("Times New Roman", Font.PLAIN, 30));
    btnNormal.setBounds(373, 328, 170, 69);
    contentPane.add(btnNormal);

    JButton btnHard = new JButton("Hard");
    btnHard.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        try
        {
          File file = new File("music3.mp3");
          FileInputStream fis = new FileInputStream(file);
          BufferedInputStream bis = new BufferedInputStream(fis);
          try
          {
            player = new Player(bis);
            player.play();
            
          } catch(JavaLayerException ex1)
          {
            ex1.printStackTrace();
          }
        } catch(IOException ex)
        {
           ex.printStackTrace();
        }
      }
    });
    btnHard.setFont(new Font("Times New Roman", Font.PLAIN, 30));
    btnHard.setBounds(373, 432, 170, 69);
    contentPane.add(btnHard);
    
    JButton btnNewButton_1 = new JButton("Stop");
    btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
    btnNewButton_1.setBounds(683, 599, 93, 23);
    contentPane.add(btnNewButton_1);
    btnNewButton_1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        player.close();
      }
    });
  }
}
