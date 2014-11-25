import java.awt.*; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Score extends JFrame {
	
	// UI Buttons and Labels
	JLabel scoreLabel = new JLabel ("Your score is 	"); 
	JLabel keyLabel = new JLabel("Game Stats"); 
	JButton playAgainBtn = new JButton ("Play Again"); 
	JButton quitBtn = new JButton ("Quit"); 
	private final JLabel label = new JLabel("");
	
	// Game Score
	int score; 

	// Score Frame 
	Score(int sco) {
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
		String scoreMessage = "Your final score is:\n "; 
		scoreMessage = scoreMessage + score;
		
		getContentPane().setLayout(null);
		keyLabel.setForeground(Color.WHITE);
		keyLabel.setFont(new Font("Helvetica", Font.BOLD, 32));
		keyLabel.setBounds(293, 6, 614, 90);
		getContentPane().add (keyLabel); 
		quitBtn.setBounds(113, 637, 186, 69);
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
		scoreLabel.setBounds(168, 128, 531, 163);
		
		scoreLabel.setText(scoreMessage);
		getContentPane().add (scoreLabel); 
		playAgainBtn.setBounds(527, 637, 172, 69);
		playAgainBtn.setBackground(Color.RED);
		playAgainBtn.setForeground(Color.BLACK);
		getContentPane().add (playAgainBtn); 
		
		// Listener for Play Again 
		playAgainBtn.addActionListener(new ActionListener() {
			 
            public void actionPerformed(ActionEvent e)
            {
                //Execute when button is pressed
                System.out.println("Play The song again!");
                setVisible(false); 
                dispose(); 
                // Goes back to the home screen 
                // Starter.beat.run();
                
            }
    });
		
		label.setBounds(694, 19, 0, 0);
		
		getContentPane().add(label);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("background.jpg"));
		lblNewLabel.setBounds(0, 0, 816, 856);
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
