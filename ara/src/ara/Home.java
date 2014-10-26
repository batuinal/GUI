package ara;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class Home
{
  public static void main(String[] args)
  {
    // Open up HomeFrame (user sign in frame)
    HomeFrame win;
    win = new HomeFrame("Welcome to Beats with Ara!");
    win.setSize(300, 350);
    win.setVisible(true);
    win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
