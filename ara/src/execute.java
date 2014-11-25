
public class execute
{
  public static Game gamer;
  public static musicplayer player;
  public static Animation animate;
  public static ProgressBar progress;
  public static scoreBoard scoreboard;
  public static Thread t1, t2, t3, t4, t5, t6;
  public static Serial serial;
  private static String songName;
  
  
  public execute(String str){
    songName = str;
  }
  
  
  public void run()
  //public static void main(String[] agrc)
  {
    //songName = "We Are Family";
    gamer = new Game(songName);
    player = new musicplayer(songName);
    animate = new Animation();
    progress = new ProgressBar();
    scoreboard = new scoreBoard();
    serial = new Serial();
    
    t1 = new Thread(gamer); // frame
    t2 = new Thread(player);// music
    t3 = new Thread(animate);// animation
    t4 = new Thread(progress);//progress bar
    t5 = new Thread(scoreboard);//scoreboard
    //t6 = new Thread(serial);
    
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
   
    //t6.start();
  }
}
