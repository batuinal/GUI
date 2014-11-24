import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.Timer;
import javax.swing.*;

import java.awt.event.*;
import java.util.*;

import javax.swing.JButton;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import javax.swing.SwingConstants;

import org.eclipse.wb.swing.FocusTraversalOnArray;

import javax.swing.JLayeredPane;
import javax.swing.JProgressBar;

public class Game extends JFrame implements Runnable, KeyListener
{

  private JPanel contentPane;
  private String songName;
  private int gridNum;

  public static Vector<Integer> timeVector;
  public static JProgressBar progressBar;
  public static int lastTimestamp;
  public static int score;

  /**
   * JLabel for the arrows
   * 
   * 
   */
  public static JLabel rightgreen1;
  public static JLabel rightgreen2;
  public static JLabel rightgreen3;
  public static JLabel rightgreen4;
  public static JLabel rightred1;
  public static JLabel rightred2;
  public static JLabel rightred3;
  public static JLabel rightred4;
  public static JLabel rightyellow1;
  public static JLabel rightyellow2;
  public static JLabel rightyellow3;
  public static JLabel rightyellow4;
  public static JLabel leftgreen1;
  public static JLabel leftgreen2;
  public static JLabel leftgreen3;
  public static JLabel leftgreen4;
  public static JLabel leftred1;
  public static JLabel leftred2;
  public static JLabel leftred3;
  public static JLabel leftred4;
  public static JLabel leftyellow1;
  public static JLabel leftyellow2;
  public static JLabel leftyellow3;
  public static JLabel leftyellow4;


  private static JLabel Grids;
  public static JLabel scoreLabel;
  private JLabel titleLabel;
  private JLabel backgroundLabel;
  private JButton btnNewButton;


  public static void updateArrow(boolean iseven)
  {
    System.out
        .println("Calling updateArrow helper function, set arrowvisbile to "
            + iseven);

  }

  /**
   * Launch the application.
   */
  public void run()
  {
    titleLabel.setText(songName);
    titleLabel.setPreferredSize(fitText(songName));
    titleLabel.setBounds(new Rectangle(titleLabel.getLocation(), titleLabel.getPreferredSize()));
    System.out.println("Initialize");
    // Game frame = new Game("Happy.txt");
    execute.gamer.setExtendedState(JFrame.MAXIMIZED_BOTH);
    execute.gamer.setVisible(true);
    System.out.println("Frame Create");

    score = 0;
    int readcounter = 0;
    timeVector = new Vector<Integer>(); // vector of integers
    try
    {
      // Read in the file
      BufferedReader reader = new BufferedReader(new FileReader(songName + ".txt"));
      // Add all timestamps to a vector
      String line = null;
      while( (line = reader.readLine()) != null )
      {
        if(readcounter % 3 == 0){
          Integer currTime = Integer.parseInt(line); // convert string to integer
                                                   // // "1234" - 1234
          timeVector.add(currTime);
        }
        readcounter ++;
      }
      lastTimestamp = timeVector.lastElement();
      System.out.println("NumofTime = " + timeVector.size());
    }
    catch( IOException ex )
    {
      ex.printStackTrace();
    }
    System.out.println("Readin FIle");
  }


  /**
   * Create the frame.
   */
  public Game(String str)
  {

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 1920, 1080);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);
    contentPane.setLayout(null);

    addKeyListener(this);


    JLabel lblNewLabel_1 = new JLabel("");
    lblNewLabel_1.setIcon(new ImageIcon(
        "C:\\Users\\zhangrf\\Desktop\\ezgif-gif-maker.gif"));
    lblNewLabel_1.setBounds(1530, 362, 228, 241);
    contentPane.add(lblNewLabel_1);


    /************************************************************* Green Arrow ****************************************************************/
    /************************************************************* Right **********************************************************************/

    rightgreen1 = new JLabel("");
    rightgreen1.setBounds(497, 191, 333, 248);
    rightgreen1.setIcon(new ImageIcon(
        "D:\\481 Project\\GUI\\ara\\rightgreen.gif"));
    rightgreen1.setVisible(false);
    contentPane.add(rightgreen1);

    rightgreen2 = new JLabel("");
    rightgreen2.setBounds(1069, 191, 333, 248);
    rightgreen2.setIcon(new ImageIcon(
        "D:\\481 Project\\GUI\\ara\\rightgreen.gif"));
    rightgreen2.setVisible(false);
    contentPane.add(rightgreen2);

    rightgreen3 = new JLabel("");
    rightgreen3.setBounds(506, 578, 324, 248);
    rightgreen3.setIcon(new ImageIcon(
        "D:\\481 Project\\GUI\\ara\\rightgreen.gif"));
    rightgreen3.setVisible(false);
    contentPane.add(rightgreen3);

    rightgreen4 = new JLabel("");
    rightgreen4.setBounds(1062, 578, 324, 248);
    rightgreen4.setIcon(new ImageIcon(
        "D:\\481 Project\\GUI\\ara\\rightgreen.gif"));
    rightgreen4.setVisible(false);
    contentPane.add(rightgreen4);

    /*************************************************************** Left *************************************************************/


    leftgreen1 = new JLabel("");
    leftgreen1.setBounds(497, 191, 333, 248);
    leftgreen1
        .setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\leftgreen.gif"));
    leftgreen1.setVisible(false);
    contentPane.add(leftgreen1);

    leftgreen2 = new JLabel("");
    leftgreen2.setBounds(1069, 191, 333, 248);
    leftgreen2
        .setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\leftgreen.gif"));
    leftgreen2.setVisible(false);
    contentPane.add(leftgreen2);

    leftgreen3 = new JLabel("");
    leftgreen3.setBounds(506, 578, 324, 248);
    leftgreen3
        .setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\leftgreen.gif"));
    leftgreen3.setVisible(false);
    contentPane.add(leftgreen3);

    leftgreen4 = new JLabel("");
    leftgreen4.setBounds(1062, 578, 324, 248);
    leftgreen4
        .setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\leftgreen.gif"));
    leftgreen4.setVisible(false);
    contentPane.add(leftgreen4);
    /************************************************************************************************************************/

    /*************************************************** Red Arrow ***********************************************************/
    /*************************************************** Right ****************************************************************/

    rightred1 = new JLabel("");
    rightred1.setBounds(497, 191, 333, 248);
    rightred1.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\rightred.gif"));
    rightred1.setVisible(false);
    contentPane.add(rightred1);

    rightred2 = new JLabel("");
    rightred2.setBounds(1069, 191, 333, 248);
    rightred2.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\rightred.gif"));
    rightred2.setVisible(false);
    contentPane.add(rightred2);

    rightred3 = new JLabel("");
    rightred3.setBounds(506, 578, 324, 248);
    rightred3.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\rightred.gif"));
    rightred3.setVisible(false);
    contentPane.add(rightred3);

    rightred4 = new JLabel("");
    rightred4.setBounds(1062, 578, 324, 248);
    rightred4.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\rightred.gif"));
    rightred4.setVisible(false);
    contentPane.add(rightred4);

    /*************************************************************** Left *********************************************************************/

    leftred1 = new JLabel("");
    leftred1.setBounds(497, 191, 333, 248);
    leftred1.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\leftred.gif"));
    leftred1.setVisible(false);
    contentPane.add(leftred1);

    leftred2 = new JLabel("");
    leftred2.setBounds(1069, 191, 333, 248);
    leftred2.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\leftred.gif"));
    leftred2.setVisible(false);
    contentPane.add(leftred2);

    leftred3 = new JLabel("");
    leftred3.setBounds(506, 578, 324, 248);
    leftred3.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\leftred.gif"));
    leftred3.setVisible(false);
    contentPane.add(leftred3);

    leftred4 = new JLabel("");
    leftred4.setBounds(1062, 578, 324, 248);
    leftred4.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\leftred.gif"));
    leftred4.setVisible(false);
    contentPane.add(leftred4);
    /****************************************************************************************************************************************/

    /************************************************************** Yellow Arrow **************************************************************/
    /************************************************************** Right *********************************************************************/

    rightyellow1 = new JLabel("");
    rightyellow1.setBounds(497, 191, 333, 248);
    rightyellow1.setIcon(new ImageIcon(
        "D:\\481 Project\\GUI\\ara\\rightyellow.gif"));
    rightyellow1.setVisible(false);
    contentPane.add(rightyellow1);

    rightyellow2 = new JLabel("");
    rightyellow2.setBounds(1069, 191, 333, 248);
    rightyellow2.setIcon(new ImageIcon(
        "D:\\481 Project\\GUI\\ara\\rightyellow.gif"));
    rightyellow2.setVisible(false);
    contentPane.add(rightyellow2);

    rightyellow3 = new JLabel("");
    rightyellow3.setBounds(506, 578, 324, 248);
    rightyellow3.setIcon(new ImageIcon(
        "D:\\481 Project\\GUI\\ara\\rightyellow.gif"));
    rightyellow3.setVisible(false);
    contentPane.add(rightyellow3);

    rightyellow4 = new JLabel("");
    rightyellow4.setBounds(1062, 578, 324, 248);
    rightyellow4.setIcon(new ImageIcon(
        "D:\\481 Project\\GUI\\ara\\rightyellow.gif"));
    rightyellow4.setVisible(false);
    contentPane.add(rightyellow4);
    /**************************************************************** Left ********************************************************************/

    leftyellow1 = new JLabel("");
    leftyellow1.setBounds(497, 191, 333, 248);
    leftyellow1.setIcon(new ImageIcon(
        "D:\\481 Project\\GUI\\ara\\leftyellow.gif"));
    leftyellow1.setVisible(false);
    contentPane.add(leftyellow1);

    leftyellow2 = new JLabel("");
    leftyellow2.setBounds(1069, 191, 333, 248);
    leftyellow2.setIcon(new ImageIcon(
        "D:\\481 Project\\GUI\\ara\\leftyellow.gif"));
    leftyellow2.setVisible(false);
    contentPane.add(leftyellow2);

    leftyellow3 = new JLabel("");
    leftyellow3.setBounds(506, 578, 324, 248);
    leftyellow3.setIcon(new ImageIcon(
        "D:\\481 Project\\GUI\\ara\\leftyellow.gif"));
    leftyellow3.setVisible(false);
    contentPane.add(leftyellow3);

    leftyellow4 = new JLabel("");
    leftyellow4.setBounds(1062, 578, 324, 248);
    leftyellow4.setIcon(new ImageIcon(
        "D:\\481 Project\\GUI\\ara\\leftyellow.gif"));
    leftyellow4.setVisible(false);
    contentPane.add(leftyellow4);
    /****************************************************************************************************************************************/

    Grids = new JLabel("");
    Grids.setBounds(355, 88, 1194, 864);
    contentPane.add(Grids);
    Grids.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\Grids.png"));

    progressBar = new JProgressBar();
    progressBar.setForeground(Color.PINK);
    progressBar.setFont(new Font("Kristen ITC", Font.BOLD, 20));
    progressBar.setStringPainted(true);
    Border border = BorderFactory.createTitledBorder("Game Progress...");
    progressBar.setBorder(border);
    progressBar.setBounds(437, 940, 1033, 51);
    contentPane.add(progressBar);

    scoreLabel = new JLabel("");
    scoreLabel.setForeground(Color.WHITE);
    scoreLabel.setFont(new Font("Showcard Gothic", Font.BOLD, 99));
    scoreLabel.setBounds(1614, 36, 218, 183);
    contentPane.add(scoreLabel);
    
    titleLabel = new JLabel("");
    titleLabel.setFont(new Font("Algerian", Font.PLAIN, 60));
    titleLabel.setBounds(759, 26, 517, 113);
    contentPane.add(titleLabel);
    
    btnNewButton = new JButton("New button");
    btnNewButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        execute.animate.stop();
        execute.player.stop();
        execute.progress.stop();
        execute.scoreboard.stop();
        execute.gamer.dispose();
        Starter.beat.run();
        
      }
    });
    btnNewButton.setBounds(45, 785, 150, 150);
    contentPane.add(btnNewButton);
    
    backgroundLabel = new JLabel("");
    backgroundLabel.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\background.png"));
    backgroundLabel.setBounds(0, 0, 1920, 1080);
    contentPane.add(backgroundLabel);
    
    


    score = 0;


    songName = str;
  }

  @Override
  public void keyTyped(KeyEvent e)
  {
    // do nothing
  }

  @Override
  public void keyPressed(KeyEvent e)
  {
    // hook up 8 keys
    System.out.println("keyPressed" + gridNum);
    int keyCode = e.getKeyCode();

    // Q, W, A, S block
    if( keyCode == KeyEvent.VK_Q )
    {
      gridNum = 0;
    }
    else if( keyCode == KeyEvent.VK_W )
    {
      gridNum = 1;
    }
    else if( keyCode == KeyEvent.VK_A )
    {
      gridNum = 2;
    }
    else if( keyCode == KeyEvent.VK_S )
    {
      gridNum = 3;
    }

    // I, O, K, L block
    else if( keyCode == KeyEvent.VK_I )
    {
      gridNum = 4;
    }
    else if( keyCode == KeyEvent.VK_O )
    {
      gridNum = 5;
    }
    else if( keyCode == KeyEvent.VK_K )
    {
      gridNum = 6;
    }
    else if( keyCode == KeyEvent.VK_L )
    {
      gridNum = 7;
    }
    else
    {
      gridNum = -1;
    }

    if( gridNum == Animation.girdNum_HoldOn )
    {
      Game.score += 5;
    }

    System.out.println(gridNum + "<<<<<<<<<<<<" +Animation.girdNum_HoldOn);

  }

  @Override
  public void keyReleased(KeyEvent e)
  {
    // not doing anything

  }
  
  public Dimension fitText(String textfield) { 
    Font defaultFont = new Font("Algerian", Font.PLAIN, 60);
    Canvas canvas = new Canvas();
    FontMetrics fm = canvas.getFontMetrics(defaultFont);
    int width = fm.stringWidth(textfield);
    int height = fm.getHeight();
    System.out.println(width + " " + height); 
    Dimension resizeDim = new Dimension(width+40,height+10);
    return resizeDim;
    
  }
}
