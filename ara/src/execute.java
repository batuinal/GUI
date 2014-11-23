
public class execute
{
  public static Game gamer;
  public static Thread t1, t2, t3, t4, t5, t6;
  public static void main(String[] args)
  {
    gamer = new Game("Happy.txt");
    musicplayer player = new musicplayer();
    Animation animate = new Animation();
    ProgressBar progress = new ProgressBar();
    scoreBoard scoreboard = new scoreBoard();
    
    t1 = new Thread(gamer); // frame
    t2 = new Thread(player);// music
    t3 = new Thread(animate);// animation
    t4 = new Thread(progress);//progress bar
    t5 = new Thread(scoreboard);//scoreboard
    
    t1.start();
    try
    {
      t1.join();
    }
    catch(InterruptedException intExcep)
    {
      System.out.println("Interrupted exception caught!");
    }
    System.out.println("finish thread 1");
    t2.start();
    System.out.println("start thread 2");
    t3.start();
    System.out.println("start thread 3");
    t4.start();
    t5.start();
  }
}
