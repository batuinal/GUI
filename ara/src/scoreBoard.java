import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;


public class scoreBoard implements Runnable
{

  private static Timer scoreTimer;
  
  ActionListener scoreLis = new ActionListener() {
    public void actionPerformed(ActionEvent evt) {
      Game.scoreLabel.setText(Integer.toString(Game.score));
    }
  };
  
  public void run()
  {
    int delay = 100;
    scoreTimer = new Timer(delay, scoreLis);
    scoreTimer.start();
  }
}

