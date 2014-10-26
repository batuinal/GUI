package ara;

public class testJDBC
{
  public static void main(String[] argc)
  {
    System.out.println("Test JavaDatabse");


    Database gamedb = new Database();
    try
    {
      gamedb.connect();
    }
    catch( Exception ex )
    {
      ex.printStackTrace();
    }
    String username = "zhangrf";
    String password = "zhangrf";
    gamedb.adduser(10,username,password);
    gamedb.disconnect();
  }
  

  
}
