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

import javax.swing.ImageIcon;

import ara.Database;
import ara.SongSelectFrame;


public class BeatswithAra
{

  private JFrame frame;
  private JTextField textField;
  private static int nextID = 0;
  
  
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
    frame.setBounds(100, 100, 1006, 745);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().setLayout(null);
    
    JLabel lblBeatsWithAra = new JLabel("Beats With Ara");
    lblBeatsWithAra.setBounds(198, 95, 555, 107);
    lblBeatsWithAra.setFont(new Font("Bradley Hand ITC", Font.PLAIN, 85));
    lblBeatsWithAra.setForeground(Color.PINK);
    lblBeatsWithAra.setVerticalAlignment(SwingConstants.TOP);
    lblBeatsWithAra.setHorizontalAlignment(SwingConstants.CENTER);
    frame.getContentPane().add(lblBeatsWithAra);
    
    JLabel lblUsername = new JLabel("Username:");
    lblUsername.setBounds(502, 373, 122, 36);
    lblUsername.setAlignmentY(Component.BOTTOM_ALIGNMENT);
    lblUsername.setFont(new Font("Arial Narrow", Font.PLAIN, 30));
    frame.getContentPane().add(lblUsername);
    
    textField = new JTextField();
    textField.setFont(new Font("Times New Roman", Font.PLAIN, 20));
    textField.setBounds(647, 373, 243, 36);
    frame.getContentPane().add(textField);
    textField.setColumns(10);
    
    JButton btnClear = new JButton("Clear");
    btnClear.setFont(new Font("Times New Roman", Font.PLAIN, 25));
    btnClear.setBounds(502, 439, 122, 30);
    frame.getContentPane().add(btnClear);
    btnClear.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        textField.setText("");
      }
    });
    
    
    JButton okbutton = new JButton("Ok");
    okbutton.setFont(new Font("Times New Roman", Font.PLAIN, 25));
    okbutton.setBounds(647, 439, 122, 30);
    frame.getContentPane().add(okbutton);
    
    okbutton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
          // Insert userinfo Database
          Database gamedb = new Database();
          try
          {
            gamedb.connect();
          }
          catch( Exception ex )
          {
            ex.printStackTrace();
          }
          String username = textField.getText();
          if(gamedb.userexist(username))
          {
            JOptionPane.showMessageDialog(textField, "Username Exists", "Username Error", JOptionPane.ERROR_MESSAGE);
          }
          else
          {
            nextID++;
            gamedb.adduser(nextID, username);

            SongSelectFrame songFrame = new SongSelectFrame(textField.getText());
            songFrame.setSize(450, 500);
            songFrame.setVisible(true);

            out.printf("Hello %s, Welcome to Beats with Ara! \n",
                textField.getText());
          }
          gamedb.disconnect();

          // Open Song Select Frame, passing in username
          
      }
    });
    
    JLabel lblNewLabel = new JLabel("New label");
    lblNewLabel.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\music.jpg"));
    lblNewLabel.setBounds(0, 0, 990, 706);
    frame.getContentPane().add(lblNewLabel);
  }
}
