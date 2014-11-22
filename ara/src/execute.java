
public class execute
{
  public static Game gamer;
  
  public static void main(String[] args)
  {
    gamer = new Game("Happy.txt");
    musicplayer player = new musicplayer();
    Animation animate = new Animation();
    
    Thread t1, t2, t3;
    t1 = new Thread(gamer);
    t2 = new Thread(player);
    t3 = new Thread(animate);
    
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
  }
}
