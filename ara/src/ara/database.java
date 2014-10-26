package ara;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class Database
{
  private Connection con;
  public void connect() throws Exception
  {
    if(con != null) return;
    
    try
    {
      Class.forName("com.mysql.jdbc.Driver");
    }
    catch( ClassNotFoundException e )
    {
      throw new Exception("Driver Not Found");
    }

    String connectionUrl = "jdbc:mysql://localhost:3306/gamedb";
    String user = "root";
    String password = "group4";

    try{
      con = DriverManager.getConnection(connectionUrl, user, password);
    }catch(SQLException e ){
      System.out.println("Connection Failed!");
      return;
    }
    
    System.out.println("Connected: " + con);
  }

  public void disconnect()
  {
    if(con != null)
    {
      try
      {
        con.close();
      }
      catch( SQLException e )
      {
        System.out.println("Can't close connection");
      }
    }
  }

}
