import java.util.Random;

public class Arrow
{
  private String color;
  private int grid;
  private String dir;
  private Random rand = new Random();

  public Arrow(String arrowcolor, int arrowgrid)
  {
    color = arrowcolor;
    grid = arrowgrid;
  }

  public String to_String()
  {
    String result = "Arrow color: " + color + " , Arrow grid: " + grid + " .";
    return result;
  }

  public void randomGenerator(){
    int i = rand.nextInt(31) % 4;
    int j = rand.nextInt(31) % 3;
    int k = rand.nextInt(31) % 2;
    if(j == 0)
    {
      color = "green";
    }
    else if(j == 1)
    {
      color = "red";
      //newArrow = new Arrow("yellow", "small");
      
    }else{
      color = "yellow";
      //newArrow = new Arrow("red", "small");
    }
    if(k == 0){
      dir = "left";
    }else{
      dir = "right";
    }
    grid = i;
  }

  
  public String getColor(){
    return color;
  }
  
  public int getgrid(){
    return grid;
  }
  
  public String getDir(){
    return dir;
  }
}
