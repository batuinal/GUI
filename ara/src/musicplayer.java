import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;


public class musicplayer implements Runnable
{
  private static Player player;
  private static String songName;
  
  public musicplayer(String str){
    songName = str;
  }
  
  public void run()
  {
    try
    {
      File file = new File(songName + ".mp3");
      FileInputStream fis = new FileInputStream(file);
      BufferedInputStream bis = new BufferedInputStream(fis);
      try
      {
        player = new Player(bis);
        player.play();
        
      } catch(JavaLayerException ex1)
      {
        ex1.printStackTrace();
      }
    } catch(IOException ex)
    {
       ex.printStackTrace();
    }
  }
  
  public void stop()
  {
    player.close();
  }
}
