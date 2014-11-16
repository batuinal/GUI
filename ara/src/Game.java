import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.Timer;

import java.util.*; 

public class Game extends JFrame
{

  private JPanel contentPane;
  private static long startTime;
  private static JLabel label;
  
  public static void updateArrow(){
	  // update game arrow here 
	  System.out.println("Calling updateArrow helper function"); 
	  
  }	
  
  /**
   * Launch the application.
   */
  public static void main(String[] args)
  {
    startTime = System.currentTimeMillis();
    Game frame = new Game(startTime);
    frame.setVisible(true);
    
    // Read in the file 
    	// put the input times into a vector. 
    
    // While the vector is not empty ***need to update *** 
    	// get the next value off the vector. 
    	// create a new timer for this action
    	// if the current time is equal to the nextActionTime then make the arrow appear. 
    		// ** add logic for recgonizing input? *** 
    
    // Read in the file 
    Vector<Integer> timeVector = new Vector<Integer>(); // vector of integers
    try {
    	// Read in the file 
    	BufferedReader reader = new BufferedReader(new FileReader("happy.txt"));
    
    	// Add all timestamps to a vector
    	String line = null; 
    	while ((line = reader.readLine()) != null) {
    		Integer currTime = Integer.parseInt(line); // convert string to integer "1234" - 1234
    		timeVector.add(currTime);    		
    	}
    } catch(IOException ex) {
       ex.printStackTrace();
    }
    
    // While the timeStamp vector isnt empty
    while (!timeVector.isEmpty()){
    	int nextTimeStamp = timeVector.get(0); // get first element 
    	timeVector.removeElementAt(0); // remove element off vector 

    	// create a timer to execute an action at the next time 
    	int delay = nextTimeStamp; //milliseconds
		  ActionListener taskPerformer = new ActionListener() {
		      public void actionPerformed(ActionEvent evt) {
		    	  updateArrow();  // call update arrow 
		      }
		  };
		  javax.swing.Timer mainTimer = new javax.swing.Timer(nextTimeStamp, taskPerformer); // excecutes updateArrow function for "nextTimeStmp"
    }
   
    // game finished --> need to close Game Frame and isntantiate a new frame after
    
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
