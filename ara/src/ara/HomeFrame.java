package ara;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.image.BufferedImage;
import java.awt.*;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.OverlayLayout;

import static java.lang.System.out;

import java.io.*;
import javax.imageio.*;


class ImagePanel extends JPanel
{

  private Image img;

  public ImagePanel(String img)
  {
    this(new ImageIcon(img).getImage());
  }

  public ImagePanel(Image img)
  {
    this.img = img;
    Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
    setPreferredSize(size);
    setMinimumSize(size);
    setMaximumSize(size);
    setSize(size);
    setLayout(null);
  }

  public void paintComponent(Graphics g)
  {
    g.drawImage(img, 0, 0, null);
  }

}

public class HomeFrame extends JFrame
{
  // Variable Declaration
  private JTextField usernameField;
  private JTextField passwordField;
  private JButton clearButton;
  private JButton okButton;
  private HomeListener buttonListener;
  private JLabel label;
  private JLabel michLabel;
  private static int nextID = 0;


  public HomeFrame(String inTitle)
  {
    super(inTitle);

    // Panel Delcration
    JPanel mainpanel = new JPanel();
    LayoutManager overlay = new OverlayLayout(mainpanel);
    mainpanel.setLayout(overlay);
    //JPanel headerPanel = new JPanel(new FlowLayout());
    //JPanel namePanel_whole = new JPanel(new GridLayout(1, 2));
    //JPanel buttonPanel_whole = new JPanel(new GridLayout(1, 2));

    JLabel bgImage = new JLabel(new ImageIcon("music.jpg"));
    // Header Panel
    JLabel gameTitle = new JLabel("Beats With ARA");
    Font titleFont = new Font("Courier", Font.BOLD,100);
    gameTitle.setFont(titleFont);
    gameTitle.setForeground(Color.PINK);
    gameTitle.setLocation(bgImage.getSize().width,bgImage.getSize().width);
    gameTitle.setAlignmentX(0.5f);
    gameTitle.setAlignmentY(0f);
    mainpanel.add(gameTitle);
    
    // Add Background Image
    
    bgImage.setAlignmentX(0.5f);
    bgImage.setAlignmentY(0f);
    mainpanel.add(bgImage);

    //mainpanel.setLayout();

    
    
    /*
     * // Name Field JPanel namePanel = new JPanel(new FlowLayout());
     * usernameField = new JTextField(20); namePanel.add(new
     * JLabel("Username: ", SwingConstants.RIGHT));
     * namePanel.add(usernameField); namePanel_whole.add(new JLabel(""));
     * namePanel_whole.add(namePanel); //passwordField = new JTextField(20);
     * //namePanel = new JPanel(new FlowLayout());
     * 
     * //namePanel.add(new JLabel("Password: ", SwingConstants.RIGHT));
     * //namePanel.add(passwordField);
     * 
     * 
     * // Button Fields
     * 
     * clearButton = new JButton("Clear"); okButton = new JButton("OK"); JPanel
     * buttonPanel = new JPanel(new FlowLayout()); buttonPanel.add(clearButton);
     * buttonPanel.add(okButton); buttonPanel_whole.add(new JLabel(""));
     * buttonPanel_whole.add(namePanel);
     * 
     * // GUI Layout add(headerPanel); add(namePanel_whole);
     * add(buttonPanel_whole);
     * 
     * // Hook up button listeners
     * 
     * buttonListener = new HomeListener();
     * clearButton.addActionListener(buttonListener);
     * okButton.addActionListener(buttonListener);
     */
    
    add(mainpanel);
    pack();
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  }

  public class HomeListener implements ActionListener
  {
    public void actionPerformed(ActionEvent e)
    {
      // If OK Button was clicked
      if( e.getSource() == okButton )
      {
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
        String username = usernameField.getText();
        String password = passwordField.getText();
        gamedb.adduser(nextID, username, password);
        nextID++;
        gamedb.disconnect();

        // Open Song Select Frame, passing in username
        SongSelectFrame songFrame = new SongSelectFrame(usernameField.getText());
        songFrame.setSize(450, 500);
        songFrame.setVisible(true);

        out.printf("Hello %s, Welcome to Beats with Ara! \n",
            usernameField.getText());
      }
      if( e.getSource() == clearButton )
      {
        usernameField.setText("");
        passwordField.setText("");
      }
    }
  } // end of HomeListener
} // end of HomeFrame


