import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;


public class ProgressBar implements Runnable
{

  private static Timer progressTimer;
  private static double progress;
  private static double nextTimeStamp;
  private static double lastTimestamp;
  
  
  
  ActionListener progressLis = new ActionListener() {
    public void actionPerformed(ActionEvent evt) {
      nextTimeStamp = Animation.nextTimeStamp;
      
      progress = (nextTimeStamp/lastTimestamp) * 100;
      Game.progressBar.setValue((int)progress);
    }
  };
  
  public void run()
  {
    lastTimestamp = Game.lastTimestamp;
    int delay = 100;
    progressTimer = new Timer(delay, progressLis);
    progressTimer.start();
    
    
  }
}
