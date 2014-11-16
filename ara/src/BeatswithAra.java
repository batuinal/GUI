import static java.lang.System.out;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;

import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JTextArea;

import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JTextField;
import javax.swing.BoxLayout;

import java.awt.Component;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.swing.ImageIcon;

import ara.Database;

import javax.swing.AbstractAction;
import javax.swing.Action;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;


public class BeatswithAra
{

  private JFrame frame;
  private JTextField textField;
  private static int nextID = 0;
  private final Action action = new SwingAction();
  private static Player player;
  
  
  /*
   * Buttons on the welcome page
   * 
   */
  private JButton btnLevel;
  private JButton btnEasy;
  private JButton btnMedium;
  private JButton btnHard;
  /**
   * Launch the application.
   */
  public static void main(String[] args)
  {
    EventQueue.invokeLater(new Runnable()
    {
      public void run()
      {
        try
        {
          BeatswithAra window = new BeatswithAra();
          window.frame.setVisible(true);
        }
        catch( Exception e )
        {
          e.printStackTrace();
        }
      }
    });
    
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

  /**
   * Create the application.
   */
  public BeatswithAra()
  {
    initialize();
  }

  /**
   * Initialize the contents of the frame.
   */
  private void initialize()
  {
    Database gamedb = new Database();
    try
    {
      gamedb.connect();
    }
    catch( Exception ex )
    {
      ex.printStackTrace();
    }
    nextID = gamedb.currentid();
    gamedb.disconnect();
    
    
    
    frame = new JFrame();
    frame.setBounds(100, 100, 1920, 1080);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().setLayout(null);
    
    JLabel lblBeatsWithAra = new JLabel("Beats With Ara");
    lblBeatsWithAra.setBounds(359, 93, 978, 146);
    lblBeatsWithAra.setFont(new Font("Bradley Hand ITC", Font.PLAIN, 99));
    lblBeatsWithAra.setForeground(Color.PINK);
    lblBeatsWithAra.setVerticalAlignment(SwingConstants.TOP);
    lblBeatsWithAra.setHorizontalAlignment(SwingConstants.CENTER);
    frame.getContentPane().add(lblBeatsWithAra);
    
    JLabel lblUsername = new JLabel("Username:");
    lblUsername.setBounds(624, 304, 122, 36);
    lblUsername.setAlignmentY(Component.BOTTOM_ALIGNMENT);
    lblUsername.setFont(new Font("Arial Narrow", Font.PLAIN, 30));
    frame.getContentPane().add(lblUsername);
    
    textField = new JTextField();
    textField.setFont(new Font("Times New Roman", Font.PLAIN, 20));
    textField.setBounds(760, 308, 243, 36);
    frame.getContentPane().add(textField);
    textField.setColumns(10);
    
    btnEasy = new JButton("Easy");
    btnEasy.setFont(new Font("Calibri", Font.BOLD, 30));
    btnEasy.setBounds(808, 485, 143, 64);
    frame.getContentPane().add(btnEasy);
    
    btnLevel = new JButton("Level");
    btnLevel.addActionListener(new welcomeButtonListener());
    
    btnLevel.setFont(new Font("Calibri", Font.BOLD, 30));
    btnLevel.setBounds(637, 485, 143, 64);
    frame.getContentPane().add(btnLevel);
    
    btnMedium = new JButton("Medium");
    btnMedium.setFont(new Font("Calibri", Font.BOLD, 30));
    btnMedium.setBounds(808, 564, 143, 64);
    frame.getContentPane().add(btnMedium);
    
    btnHard = new JButton("Hard");
    btnHard.setFont(new Font("Calibri", Font.BOLD, 30));
    btnHard.setBounds(808, 645, 143, 64);
    frame.getContentPane().add(btnHard);
    
    JButton button_2 = new JButton("Easy");
    button_2.setFont(new Font("Calibri", Font.BOLD, 30));
    button_2.setBounds(974, 485, 143, 64);
    frame.getContentPane().add(button_2);
    
    JButton button_3 = new JButton("Easy");
    button_3.setFont(new Font("Calibri", Font.BOLD, 30));
    button_3.setBounds(974, 564, 143, 64);
    frame.getContentPane().add(button_3);
    
    JButton button_4 = new JButton("Easy");
    button_4.setFont(new Font("Calibri", Font.BOLD, 30));
    button_4.setBounds(974, 645, 143, 64);
    frame.getContentPane().add(button_4);
    
    
    /*
     * default status
     */
    btnEasy.setVisible(false);
    btnMedium.setVisible(false);
    btnHard.setVisible(false);
    
    
    
  }
  public class welcomeButtonListener implements ActionListener
  {
    public void actionPerformed(ActionEvent event)
    {
      if(event.getSource() == btnLevel)
      {
        btnLevel.setVisible(false);
        btnEasy.setVisible(true);
        btnMedium.setVisible(true);
        btnHard.setVisible(true);
      }
    }
  }
  private class SwingAction extends AbstractAction {
    public SwingAction() {
      putValue(NAME, "SwingAction");
      putValue(SHORT_DESCRIPTION, "Some short description");
    }
    public void actionPerformed(ActionEvent e) {
    }
  }
}
