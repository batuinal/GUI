package ara;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;


public class Database
{
  private Connection con;
  private Statement stmt = null;
  private String sql = "";

  public void connect() throws Exception
  {
    if( con != null )
      return;

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

    try
    {
      con = DriverManager.getConnection(connectionUrl, user, password);
    }
    catch( SQLException e )
    {
      System.out.println("Connection Failed!");
    }

    System.out.println("Connected: " + con);
  }

  public void disconnect()
  {
    if( con != null )
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

  public void createtable()
  {
    try
    {
      stmt = con.createStatement();
      sql = "CREATE TABLE USERINFO " + "(userid INTEGER, "
          + " username CHAR(20) NOT NULL, " + " password CHAR(20) NOT NULL, "
          + " PRIMARY KEY (userid))";
      // System.out.println(sql);
      stmt.executeUpdate(sql);
      sql = "CREATE TABLE SCORE "
          + "(scoreid INTEGER, "
          + " score INTEGER NOT NULL, "
          + " userid INTEGER, "
          + " PRIMARY KEY (scoreid,userid), "
          + " FOREIGN KEY (userid) REFERENCES USERINFO(userid) ON DELETE CASCADE)";
      stmt.executeUpdate(sql);
      System.out.println("Success to create table");
    }
    catch( SQLException e )
    {
      System.out.println("Fail to create table");
      e.printStackTrace();
    }
  }

  public void droptable()
  {
    try
    {
      stmt = con.createStatement();
      sql = "DROP TABLE SCORE";
      // System.out.println(sql);
      stmt.executeUpdate(sql);
      sql = "DROP TABLE USERINFO ";
      stmt.executeUpdate(sql);

      System.out.println("Success to drop table");
    }
    catch( SQLException e )
    {
      System.out.println("Fail to drop table");
      e.printStackTrace();
    }
  }

  public void adduser(int userid, String username, String password)
  {
    try
    {
      stmt = con.createStatement();
      sql = "INSERT INTO USERINFO (userid, username, password) " +
            " Values (" + userid + ", '" + username + "', '" + password + "')";
      stmt.executeUpdate(sql);
      System.out.println("Success to insert userinfo");
    }
    catch( SQLException e )
    {
      System.out.println("Fail to insert userinfo");
      e.printStackTrace();
    }
  }
}
