import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.Timer;

import java.util.*;

import javax.swing.JButton; 

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import javax.swing.SwingConstants;

import org.eclipse.wb.swing.FocusTraversalOnArray;

import javax.swing.JLayeredPane;

public class Game extends JFrame implements Runnable
{

  private JPanel contentPane;
  private String songName;
  
  public static Vector<Integer> timeVector;
  /**
   * JLabel for the arrows
   * 
   * 
   */
  public static JLabel rightgreensmall1;
  public static JLabel rightgreenmedium1;
  public static JLabel rightgreenlarge1;
  public static JLabel rightgreensmall2;
  public static JLabel rightgreenmedium2;
  public static JLabel rightgreenlarge2;
  public static JLabel rightgreensmall3;
  public static JLabel rightgreenmedium3;
  public static JLabel rightgreenlarge3;
  public static JLabel rightgreensmall4;
  public static JLabel rightgreenmedium4;
  public static JLabel rightgreenlarge4;
  public static JLabel rightredsmall1;
  public static JLabel rightredmedium1;
  public static JLabel rightredlarge1;
  public static JLabel rightredsmall2;
  public static JLabel rightredmedium2;
  public static JLabel rightredlarge2;
  public static JLabel rightredsmall3;
  public static JLabel rightredmedium3;
  public static JLabel rightredlarge3;
  public static JLabel rightredsmall4;
  public static JLabel rightredmedium4;
  public static JLabel rightredlarge4;
  public static JLabel rightyellowsmall1;
  public static JLabel rightyellowmedium1;
  public static JLabel rightyellowlarge1;
  public static JLabel rightyellowsmall2;
  public static JLabel rightyellowmedium2;
  public static JLabel rightyellowlarge2;
  public static JLabel rightyellowsmall3;
  public static JLabel rightyellowmedium3;
  public static JLabel rightyellowlarge3;
  public static JLabel rightyellowsmall4;
  public static JLabel rightyellowmedium4;
  public static JLabel rightyellowlarge4;
  public static JLabel leftgreensmall1;
  public static JLabel leftgreenmedium1;
  public static JLabel leftgreenlarge1;
  public static JLabel leftgreensmall2;
  public static JLabel leftgreenmedium2;
  public static JLabel leftgreenlarge2;
  public static JLabel leftgreensmall3;
  public static JLabel leftgreenmedium3;
  public static JLabel leftgreenlarge3;
  public static JLabel leftgreensmall4;
  public static JLabel leftgreenmedium4;
  public static JLabel leftgreenlarge4;
  public static JLabel leftredsmall1;
  public static JLabel leftredmedium1;
  public static JLabel leftredlarge1;
  public static JLabel leftredsmall2;
  public static JLabel leftredmedium2;
  public static JLabel leftredlarge2;
  public static JLabel leftredsmall3;
  public static JLabel leftredmedium3;
  public static JLabel leftredlarge3;
  public static JLabel leftredsmall4;
  public static JLabel leftredmedium4;
  public static JLabel leftredlarge4;
  public static JLabel leftyellowsmall1;
  public static JLabel leftyellowmedium1;
  public static JLabel leftyellowlarge1;
  public static JLabel leftyellowsmall2;
  public static JLabel leftyellowmedium2;
  public static JLabel leftyellowlarge2;
  public static JLabel leftyellowsmall3;
  public static JLabel leftyellowmedium3;
  public static JLabel leftyellowlarge3;
  public static JLabel leftyellowsmall4;
  public static JLabel leftyellowmedium4;
  public static JLabel leftyellowlarge4;
  private static JLabel Grids;
  private JLabel label;
  private JLabel label_1;
  private JLabel label_2;
  private JLabel label_3;
  private JLabel label_4;
  private JLabel label_5;
  
  
  public static void updateArrow(boolean iseven){
	  System.out.println("Calling updateArrow helper function, set arrowvisbile to " + iseven); 
	  
  }	
  
  /**
   * Launch the application.
   */
  public void run()
  {
    System.out.println("Initialize");    
    //Game frame = new Game("Happy.txt");
    execute.gamer.setVisible(true);
    System.out.println("Frame Create");
    
    timeVector = new Vector<Integer>(); // vector of integers
    try {
      // Read in the file 
      BufferedReader reader = new BufferedReader(new FileReader(songName));
      // Add all timestamps to a vector
      String line = null;
     // int readcnt = 0;
      while ((line = reader.readLine()) != null) {
       // if(readcnt % 3 == 0){
          Integer currTime = Integer.parseInt(line); // convert string to integer "1234" - 1234
          timeVector.add(currTime);
          //readcnt = 0;
        //}
       // readcnt++;
        
      }
      System.out.println("NumofTime = " + timeVector.size());
    } catch(IOException ex) {
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
    
    
    
    
    
    
    JLabel lblNewLabel = new JLabel("");
    URL url;
    try{
      lblNewLabel.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\arrowkk2.gif"));
    }catch (Exception e){
      System.out.println("Cannot Read gif file!");
    }
    
    lblNewLabel.setBounds(43, 174, 228, 370);
    lblNewLabel.setVisible(true);
    contentPane.add(lblNewLabel);
    
    
    
    
    
    /*************************************************************Green Arrow****************************************************************/
    /*************************************************************Right**********************************************************************/
    rightgreensmall1 = new JLabel("");
    rightgreensmall1.setBounds(577, 257, 142, 107);
    rightgreensmall1.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\rightgreensmall.png"));
    rightgreensmall1.setVisible(false);
    contentPane.add(rightgreensmall1);
    
    rightgreenmedium1 = new JLabel("");
    rightgreenmedium1.setBounds(544, 237, 206, 151);
    rightgreenmedium1.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\rightgreenmedium.png"));
    rightgreenmedium1.setVisible(false);
    contentPane.add(rightgreenmedium1);
    
    rightgreenlarge1 = new JLabel("");
    rightgreenlarge1.setBounds(497, 191, 333, 248);
    rightgreenlarge1.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\rightgreenlarge.png"));
    rightgreenlarge1.setVisible(false);
    contentPane.add(rightgreenlarge1);
    
    rightgreensmall2 = new JLabel("");
    rightgreensmall2.setBounds(1164, 257, 142, 123);
    rightgreensmall2.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\rightgreensmall.png"));
    rightgreensmall2.setVisible(false);
    contentPane.add(rightgreensmall2);
    
    rightgreenmedium2 = new JLabel("");
    rightgreenmedium2.setBounds(1129, 237, 206, 151);
    rightgreenmedium2.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\rightgreenmedium.png"));
    rightgreenmedium2.setVisible(false);
    contentPane.add(rightgreenmedium2);
    
    rightgreenlarge2 = new JLabel("");
    rightgreenlarge2.setBounds(1069, 191, 333, 248);
    rightgreenlarge2.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\rightgreenlarge.png"));
    rightgreenlarge2.setVisible(false);
    contentPane.add(rightgreenlarge2);
    
    rightgreensmall3 = new JLabel("");
    rightgreensmall3.setBounds(577, 635, 142, 123);
    rightgreensmall3.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\rightgreensmall.png"));
    rightgreensmall3.setVisible(false);
    contentPane.add(rightgreensmall3);
    
    rightgreenmedium3 = new JLabel("");
    rightgreenmedium3.setBounds(544, 617, 206, 151);
    rightgreenmedium3.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\rightgreenmedium.png"));
    rightgreenmedium3.setVisible(false);
    contentPane.add(rightgreenmedium3);
    
    rightgreenlarge3 = new JLabel("");
    rightgreenlarge3.setBounds(506, 578, 324, 248);
    rightgreenlarge3.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\rightgreenlarge.png"));
    rightgreenlarge3.setVisible(false);
    contentPane.add(rightgreenlarge3);
    
    rightgreensmall4 = new JLabel("");
    rightgreensmall4.setBounds(1138, 635, 142, 123);
    rightgreensmall4.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\rightgreensmall.png"));
    rightgreensmall4.setVisible(false);
    contentPane.add(rightgreensmall4);
    
    rightgreenmedium4 = new JLabel("");
    rightgreenmedium4.setBounds(1100, 617, 206, 151);
    rightgreenmedium4.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\rightgreenmedium.png"));
    rightgreenmedium4.setVisible(false);
    contentPane.add(rightgreenmedium4);
    
    rightgreenlarge4 = new JLabel("");
    rightgreenlarge4.setBounds(1062, 578, 324, 248);
    rightgreenlarge4.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\rightgreenlarge.png"));
    rightgreenlarge4.setVisible(false);
    contentPane.add(rightgreenlarge4);
    
    /***************************************************************Left*************************************************************/
    
    leftgreensmall1 = new JLabel("");
    leftgreensmall1.setBounds(577, 257, 142, 107);
    leftgreensmall1.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\leftgreensmall.png"));
    leftgreensmall1.setVisible(false);
    contentPane.add(leftgreensmall1);
    
    leftgreenmedium1 = new JLabel("");
    leftgreenmedium1.setBounds(544, 237, 206, 151);
    leftgreenmedium1.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\leftgreenmedium.png"));
    leftgreenmedium1.setVisible(false);
    contentPane.add(leftgreenmedium1);
    
    leftgreenlarge1 = new JLabel("");
    leftgreenlarge1.setBounds(497, 191, 333, 248);
    leftgreenlarge1.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\leftgreenlarge.png"));
    leftgreenlarge1.setVisible(false);
    contentPane.add(leftgreenlarge1);
    
    leftgreensmall2 = new JLabel("");
    leftgreensmall2.setBounds(1164, 257, 142, 123);
    leftgreensmall2.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\leftgreensmall.png"));
    leftgreensmall2.setVisible(false);
    contentPane.add(leftgreensmall2);
    
    leftgreenmedium2 = new JLabel("");
    leftgreenmedium2.setBounds(1129, 237, 206, 151);
    leftgreenmedium2.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\leftgreenmedium.png"));
    leftgreenmedium2.setVisible(false);
    contentPane.add(leftgreenmedium2);
    
    leftgreenlarge2 = new JLabel("");
    leftgreenlarge2.setBounds(1069, 191, 333, 248);
    leftgreenlarge2.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\leftgreenlarge.png"));
    leftgreenlarge2.setVisible(false);
    contentPane.add(leftgreenlarge2);
    
    leftgreensmall3 = new JLabel("");
    leftgreensmall3.setBounds(577, 635, 142, 123);
    leftgreensmall3.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\leftgreensmall.png"));
    leftgreensmall3.setVisible(false);
    contentPane.add(leftgreensmall3);
    
    leftgreenmedium3 = new JLabel("");
    leftgreenmedium3.setBounds(544, 617, 206, 151);
    leftgreenmedium3.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\leftgreenmedium.png"));
    leftgreenmedium3.setVisible(false);
    contentPane.add(leftgreenmedium3);
    
    leftgreenlarge3 = new JLabel("");
    leftgreenlarge3.setBounds(506, 578, 324, 248);
    leftgreenlarge3.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\leftgreenlarge.png"));
    leftgreenlarge3.setVisible(false);
    contentPane.add(leftgreenlarge3);
    
    leftgreensmall4 = new JLabel("");
    leftgreensmall4.setBounds(1138, 635, 142, 123);
    leftgreensmall4.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\leftgreensmall.png"));
    leftgreensmall4.setVisible(false);
    contentPane.add(leftgreensmall4);
    
    leftgreenmedium4 = new JLabel("");
    leftgreenmedium4.setBounds(1100, 617, 206, 151);
    leftgreenmedium4.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\leftgreenmedium.png"));
    leftgreenmedium4.setVisible(false);
    contentPane.add(leftgreenmedium4);
    
    leftgreenlarge4 = new JLabel("");
    leftgreenlarge4.setBounds(1062, 578, 324, 248);
    leftgreenlarge4.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\leftgreenlarge.png"));
    leftgreenlarge4.setVisible(false);
    contentPane.add(leftgreenlarge4);
    /************************************************************************************************************************/
    
    /***************************************************Red Arrow***********************************************************/
    /***************************************************Right****************************************************************/
    rightredsmall1 = new JLabel("");
    rightredsmall1.setBounds(577, 257, 142, 107);
    rightredsmall1.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\rightredsmall.png"));
    rightredsmall1.setVisible(false);
    contentPane.add(rightredsmall1);
    
    rightredmedium1 = new JLabel("");
    rightredmedium1.setBounds(544, 237, 206, 151);
    rightredmedium1.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\rightredmedium.png"));
    rightredmedium1.setVisible(false);
    contentPane.add(rightredmedium1);
    
    rightredlarge1 = new JLabel("");
    rightredlarge1.setBounds(497, 191, 333, 248);
    rightredlarge1.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\rightredlarge.png"));
    rightredlarge1.setVisible(false);
    contentPane.add(rightredlarge1);
    
    rightredsmall2 = new JLabel("");
    rightredsmall2.setBounds(1164, 257, 142, 123);
    rightredsmall2.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\rightredsmall.png"));
    rightredsmall2.setVisible(false);
    contentPane.add(rightredsmall2);
    
    rightredmedium2 = new JLabel("");
    rightredmedium2.setBounds(1129, 237, 206, 151);
    rightredmedium2.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\rightredmedium.png"));
    rightredmedium2.setVisible(false);
    contentPane.add(rightredmedium2);
    
    rightredlarge2 = new JLabel("");
    rightredlarge2.setBounds(1069, 191, 333, 248);
    rightredlarge2.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\rightredlarge.png"));
    rightredlarge2.setVisible(false);
    contentPane.add(rightredlarge2);
    
    rightredsmall3 = new JLabel("");
    rightredsmall3.setBounds(577, 635, 142, 123);
    rightredsmall3.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\rightredsmall.png"));
    rightredsmall3.setVisible(false);
    contentPane.add(rightredsmall3);
    
    rightredmedium3 = new JLabel("");
    rightredmedium3.setBounds(544, 617, 206, 151);
    rightredmedium3.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\rightredmedium.png"));
    rightredmedium3.setVisible(false);
    contentPane.add(rightredmedium3);
    
    rightredlarge3 = new JLabel("");
    rightredlarge3.setBounds(506, 578, 324, 248);
    rightredlarge3.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\rightredlarge.png"));
    rightredlarge3.setVisible(false);
    contentPane.add(rightredlarge3);
    
    rightredsmall4 = new JLabel("");
    rightredsmall4.setBounds(1138, 635, 142, 123);
    rightredsmall4.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\rightredsmall.png"));
    rightredsmall4.setVisible(false);
    contentPane.add(rightredsmall4);
    
    rightredmedium4 = new JLabel("");
    rightredmedium4.setBounds(1100, 617, 206, 151);
    rightredmedium4.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\rightredmedium.png"));
    rightredmedium4.setVisible(false);
    contentPane.add(rightredmedium4);
    
    rightredlarge4 = new JLabel("");
    rightredlarge4.setBounds(1062, 578, 324, 248);
    rightredlarge4.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\rightredlarge.png"));
    rightredlarge4.setVisible(false);
    contentPane.add(rightredlarge4);
    
    /***************************************************************Left*********************************************************************/
    leftredsmall1 = new JLabel("");
    leftredsmall1.setBounds(577, 257, 142, 107);
    leftredsmall1.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\leftredsmall.png"));
    leftredsmall1.setVisible(false);
    contentPane.add(leftredsmall1);
    
    leftredmedium1 = new JLabel("");
    leftredmedium1.setBounds(544, 237, 206, 151);
    leftredmedium1.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\leftredmedium.png"));
    leftredmedium1.setVisible(false);
    contentPane.add(leftredmedium1);
    
    leftredlarge1 = new JLabel("");
    leftredlarge1.setBounds(497, 191, 333, 248);
    leftredlarge1.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\leftredlarge.png"));
    leftredlarge1.setVisible(false);
    contentPane.add(leftredlarge1);
    
    leftredsmall2 = new JLabel("");
    leftredsmall2.setBounds(1164, 257, 142, 123);
    leftredsmall2.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\leftredsmall.png"));
    leftredsmall2.setVisible(false);
    contentPane.add(leftredsmall2);
    
    leftredmedium2 = new JLabel("");
    leftredmedium2.setBounds(1129, 237, 206, 151);
    leftredmedium2.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\leftredmedium.png"));
    leftredmedium2.setVisible(false);
    contentPane.add(leftredmedium2);
    
    leftredlarge2 = new JLabel("");
    leftredlarge2.setBounds(1069, 191, 333, 248);
    leftredlarge2.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\leftredlarge.png"));
    leftredlarge2.setVisible(false);
    contentPane.add(leftredlarge2);
    
    leftredsmall3 = new JLabel("");
    leftredsmall3.setBounds(577, 635, 142, 123);
    leftredsmall3.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\leftredsmall.png"));
    leftredsmall3.setVisible(false);
    contentPane.add(leftredsmall3);
    
    leftredmedium3 = new JLabel("");
    leftredmedium3.setBounds(544, 617, 206, 151);
    leftredmedium3.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\leftredmedium.png"));
    leftredmedium3.setVisible(false);
    contentPane.add(leftredmedium3);
    
    leftredlarge3 = new JLabel("");
    leftredlarge3.setBounds(506, 578, 324, 248);
    leftredlarge3.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\leftredlarge.png"));
    leftredlarge3.setVisible(false);
    contentPane.add(leftredlarge3);
    
    leftredsmall4 = new JLabel("");
    leftredsmall4.setBounds(1138, 635, 142, 123);
    leftredsmall4.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\leftredsmall.png"));
    leftredsmall4.setVisible(false);
    contentPane.add(leftredsmall4);
    
    leftredmedium4 = new JLabel("");
    leftredmedium4.setBounds(1100, 617, 206, 151);
    leftredmedium4.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\leftredmedium.png"));
    leftredmedium4.setVisible(false);
    contentPane.add(leftredmedium4);
    
    leftredlarge4 = new JLabel("");
    leftredlarge4.setBounds(1062, 578, 324, 248);
    leftredlarge4.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\leftredlarge.png"));
    leftredlarge4.setVisible(false);
    contentPane.add(leftredlarge4);
    /****************************************************************************************************************************************/
    
    /**************************************************************Yellow Arrow**************************************************************/
    /**************************************************************Right*********************************************************************/
    rightyellowsmall1 = new JLabel("");
    rightyellowsmall1.setBounds(577, 257, 142, 107);
    rightyellowsmall1.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\rightyellowsmall.png"));
    rightyellowsmall1.setVisible(false);
    contentPane.add(rightyellowsmall1);
    
    rightyellowmedium1 = new JLabel("");
    rightyellowmedium1.setBounds(544, 237, 206, 151);
    rightyellowmedium1.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\rightyellowmedium.png"));
    rightyellowmedium1.setVisible(false);
    contentPane.add(rightyellowmedium1);
    
    rightyellowlarge1 = new JLabel("");
    rightyellowlarge1.setBounds(497, 191, 333, 248);
    rightyellowlarge1.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\rightyellowlarge.png"));
    rightyellowlarge1.setVisible(false);
    contentPane.add(rightyellowlarge1);
    
    rightyellowsmall2 = new JLabel("");
    rightyellowsmall2.setBounds(1164, 257, 142, 123);
    rightyellowsmall2.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\rightyellowsmall.png"));
    rightyellowsmall2.setVisible(false);
    contentPane.add(rightyellowsmall2);
    
    rightyellowmedium2 = new JLabel("");
    rightyellowmedium2.setBounds(1129, 237, 206, 151);
    rightyellowmedium2.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\rightyellowmedium.png"));
    rightyellowmedium2.setVisible(false);
    contentPane.add(rightyellowmedium2);
    
    rightyellowlarge2 = new JLabel("");
    rightyellowlarge2.setBounds(1069, 191, 333, 248);
    rightyellowlarge2.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\rightyellowlarge.png"));
    rightyellowlarge2.setVisible(false);
    contentPane.add(rightyellowlarge2);
    
    rightyellowsmall3 = new JLabel("");
    rightyellowsmall3.setBounds(577, 635, 142, 123);
    rightyellowsmall3.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\rightyellowsmall.png"));
    rightyellowsmall3.setVisible(false);
    contentPane.add(rightyellowsmall3);
    
    rightyellowmedium3 = new JLabel("");
    rightyellowmedium3.setBounds(544, 617, 206, 151);
    rightyellowmedium3.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\rightyellowmedium.png"));
    rightyellowmedium3.setVisible(false);
    contentPane.add(rightyellowmedium3);
    
    rightyellowlarge3 = new JLabel("");
    rightyellowlarge3.setBounds(506, 578, 324, 248);
    rightyellowlarge3.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\rightyellowlarge.png"));
    rightyellowlarge3.setVisible(false);
    contentPane.add(rightyellowlarge3);
    
    rightyellowsmall4 = new JLabel("");
    rightyellowsmall4.setBounds(1138, 635, 142, 123);
    rightyellowsmall4.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\rightyellowsmall.png"));
    rightyellowsmall4.setVisible(false);
    contentPane.add(rightyellowsmall4);
    
    rightyellowmedium4 = new JLabel("");
    rightyellowmedium4.setBounds(1100, 617, 206, 151);
    rightyellowmedium4.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\rightyellowmedium.png"));
    rightyellowmedium4.setVisible(false);
    contentPane.add(rightyellowmedium4);
    
    rightyellowlarge4 = new JLabel("");
    rightyellowlarge4.setBounds(1062, 578, 324, 248);
    rightyellowlarge4.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\rightyellowlarge.png"));
    rightyellowlarge4.setVisible(false);
    contentPane.add(rightyellowlarge4);
    /****************************************************************Left********************************************************************/
    leftyellowsmall1 = new JLabel("");
    leftyellowsmall1.setBounds(577, 257, 142, 107);
    leftyellowsmall1.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\leftyellowsmall.png"));
    leftyellowsmall1.setVisible(false);
    contentPane.add(leftyellowsmall1);
    
    leftyellowmedium1 = new JLabel("");
    leftyellowmedium1.setBounds(544, 237, 206, 151);
    leftyellowmedium1.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\leftyellowmedium.png"));
    leftyellowmedium1.setVisible(false);
    contentPane.add(leftyellowmedium1);
    
    leftyellowlarge1 = new JLabel("");
    leftyellowlarge1.setBounds(497, 191, 333, 248);
    leftyellowlarge1.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\leftyellowlarge.png"));
    leftyellowlarge1.setVisible(false);
    contentPane.add(leftyellowlarge1);
    
    leftyellowsmall2 = new JLabel("");
    leftyellowsmall2.setBounds(1164, 257, 142, 123);
    leftyellowsmall2.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\leftyellowsmall.png"));
    leftyellowsmall2.setVisible(false);
    contentPane.add(leftyellowsmall2);
    
    leftyellowmedium2 = new JLabel("");
    leftyellowmedium2.setBounds(1129, 237, 206, 151);
    leftyellowmedium2.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\leftyellowmedium.png"));
    leftyellowmedium2.setVisible(false);
    contentPane.add(leftyellowmedium2);
    
    leftyellowlarge2 = new JLabel("");
    leftyellowlarge2.setBounds(1069, 191, 333, 248);
    leftyellowlarge2.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\leftyellowlarge.png"));
    leftyellowlarge2.setVisible(false);
    contentPane.add(leftyellowlarge2);
    
    leftyellowsmall3 = new JLabel("");
    leftyellowsmall3.setBounds(577, 635, 142, 123);
    leftyellowsmall3.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\leftyellowsmall.png"));
    leftyellowsmall3.setVisible(false);
    contentPane.add(leftyellowsmall3);
    
    leftyellowmedium3 = new JLabel("");
    leftyellowmedium3.setBounds(544, 617, 206, 151);
    leftyellowmedium3.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\leftyellowmedium.png"));
    leftyellowmedium3.setVisible(false);
    contentPane.add(leftyellowmedium3);
    
    leftyellowlarge3 = new JLabel("");
    leftyellowlarge3.setBounds(506, 578, 324, 248);
    leftyellowlarge3.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\leftyellowlarge.png"));
    leftyellowlarge3.setVisible(false);
    contentPane.add(leftyellowlarge3);
    
    leftyellowsmall4 = new JLabel("");
    leftyellowsmall4.setBounds(1138, 635, 142, 123);
    leftyellowsmall4.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\leftyellowsmall.png"));
    leftyellowsmall4.setVisible(false);
    contentPane.add(leftyellowsmall4);
    
    leftyellowmedium4 = new JLabel("");
    leftyellowmedium4.setBounds(1100, 617, 206, 151);
    leftyellowmedium4.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\leftyellowmedium.png"));
    leftyellowmedium4.setVisible(false);
    contentPane.add(leftyellowmedium4);
    
    leftyellowlarge4 = new JLabel("");
    leftyellowlarge4.setBounds(1062, 578, 324, 248);
    leftyellowlarge4.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\leftyellowlarge.png"));
    leftyellowlarge4.setVisible(false);
    contentPane.add(leftyellowlarge4);
    /****************************************************************************************************************************************/
    
    Grids = new JLabel("");
    Grids.setBounds(355, 88, 1194, 864);
    contentPane.add(Grids);
    Grids.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\Grids.png"));
    
    
    
    
      
    songName = str;
  }
}
