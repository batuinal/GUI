import java.awt.*; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ScoreFrame extends JFrame {
  
  // UI Buttons and Labels
  JLabel scoreLabel = new JLabel ("Your score is  "); 
  JLabel keyLabel = new JLabel("Game Stats"); 
  JButton playAgainBtn = new JButton ("Play Again"); 
  JButton quitBtn = new JButton ("Quit"); 
  
  // Game Score
  int score; 

  // Score Frame 
  ScoreFrame(int sco) {
    // Game Background
    setIconImage(Toolkit.getDefaultToolkit().getImage("/Users/olivertang/Desktop/UMICH/EECS_481/project/background.jpg"));
    getContentPane().setBackground(new Color(230, 230, 250)); 
    
    // JFrame Settings
    setSize(800,900);
    //setExtendedState(JFrame.MAXIMIZED_BOTH);
  
    setVisible(true); 
    setLocationRelativeTo(null); 
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    
    // Score
    //int score = Game.score; // Get game score from Game.score buton 
    score = sco;
    String scoreMessage = BeatswithAra.username + "'s final score is:\n "; 
    scoreMessage = scoreMessage + score;
    
    getContentPane().setLayout(null);
    keyLabel.setForeground(Color.WHITE);
    keyLabel.setFont(new Font("Helvetica", Font.BOLD, 32));
    keyLabel.setBounds(293, 6, 614, 90);
    getContentPane().add (keyLabel); 
    quitBtn.setBounds(143, 442, 186, 69);
    quitBtn.setBackground(Color.GREEN);
    getContentPane().add (quitBtn); 
    
    // Listener for Quit Button 
    quitBtn.addActionListener(new ActionListener() {   
            public void actionPerformed(ActionEvent e)
            {
                //Execute when button is pressed
                System.out.println("Quit the game");
                setVisible(false); 
                System.exit(0);
            }
    }); 
    
    scoreLabel.setForeground(Color.WHITE);
    scoreLabel.setFont(new Font("Helvetica", Font.BOLD, 35));
    scoreLabel.setBounds(143, 128, 548, 163);
    
    scoreLabel.setText(scoreMessage);
    getContentPane().add (scoreLabel); 
    playAgainBtn.setBounds(456, 442, 172, 69);
    playAgainBtn.setBackground(Color.RED);
    playAgainBtn.setForeground(Color.BLACK);
    getContentPane().add (playAgainBtn); 
    
    // Listener for Play Again 
    playAgainBtn.addActionListener(new ActionListener() {
       
            public void actionPerformed(ActionEvent e)
            {
                //Execute when button is pressed
                System.out.println("Play The song again!");
                Refresh refresh = new Refresh();
                refresh.run();
                Starter.beat.run();
                setVisible(false); 
                dispose(); 
                // Goes back to the home screen 
                // Starter.beat.run();
                
            }
    });
    playAgainBtn.setVisible(false);
    
    JLabel lblNewLabel = new JLabel("");
    lblNewLabel.setIcon(new ImageIcon("D:\\481 Project\\GUI\\ara\\background.jpg"));
    lblNewLabel.setBounds(0, 0, 784, 856);
    getContentPane().add(lblNewLabel);
    
  } 
  /*
  public static void main(String[] args){
    
    // need to get score data 
    
    Score score = new Score(1000); 
  
    //keyText.setText("Hello world"); 
  }
  */
  
}
