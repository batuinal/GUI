package ara;

public class testJDBC
{
  public static void main(String[] argc)
  {
    System.out.println("Test JavaDatabse");
    
    
    Database db = new Database(); 
    try{
      db.connect();
    } catch (Exception e) {
      e.printStackTrace();
    }
    db.disconnect();
  }
  

  
}
