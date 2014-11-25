import java.awt.*; 
import javax.swing.*; 
import java.awt.event.*; 


public class Keyboard extends JFrame implements KeyListener{
	
	//JTextField keyText = new JTextField(80); 
	//JLabel keyLabel = new JLabel("Press fire button"); 
		
  private int gridNum;
  
	Keyboard() {
		Game.scoreLabel.addKeyListener(this); 
	}	
	
	@Override
	public void keyTyped(KeyEvent e) {
		// do nothing 		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// hook up 8 keys 
		int keyCode = e.getKeyCode(); 
		
		// Q, W, A, S block
		if (keyCode == KeyEvent.VK_Q){
		  gridNum = 0;
		}
		else if (keyCode == KeyEvent.VK_W){
		  gridNum = 1;
		}
		else if (keyCode == KeyEvent.VK_A){
		  gridNum = 2;
		}
		else if (keyCode == KeyEvent.VK_S){
		  gridNum = 3;
		}
		
		// I, O, K, L block
		if (keyCode == KeyEvent.VK_I){
		  gridNum = 4;
		}
		else if (keyCode == KeyEvent.VK_O){
		  gridNum = 5;
		}
		else if (keyCode == KeyEvent.VK_K){
		  gridNum = 6;
		}
		else if (keyCode == KeyEvent.VK_L){
		  gridNum = 7;
		}
		/*
		if(gridNum == Animation.arrow.getgridNum())
		{
		  Game.score += 30;
		}
		*/
		//System.out.println(gridNum);
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// not doing anything 
		
	}
	
	public static void main(){
		Keyboard keyboard = new Keyboard(); 
	}

}
