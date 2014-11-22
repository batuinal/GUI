import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Vector;

import javax.swing.Timer;




public class Animation implements Runnable
{
  private static Timer timer;
  public static int nextTimeStamp;
  private static long startTime;
  private static int arrowcnt;
  
  private static int gridNum;
  private static int lastgridNum;
  private static String lastColor;
  private static String lastDir;
  
  private Random rand = new Random();
  private static Arrow arrow;
  
  public void run()
  {
    // While the timeStamp vector isnt empty
    arrow = new Arrow("",0);
    ActionListener a = new ActionListener() {
      //arrow.randomGenerator();
      //arrowColor = arrow.getColor();
      //arrowSize = arrow.getSize();
      public void actionPerformed(ActionEvent evt) {
        gridNum = arrow.getgrid();
        //System.out.println(gridNum);
        if(lastDir == "right"){
          if(lastColor == "green"){
            if(lastgridNum == 0){
              Game.rightgreenlarge1.setVisible(false);
            }else if(lastgridNum == 1){
              Game.rightgreenlarge2.setVisible(false);
            }else if(lastgridNum == 2){
              Game.rightgreenlarge3.setVisible(false);
            }else{
              Game.rightgreenlarge4.setVisible(false);
            }
          }else if(lastColor == "red"){
            if(lastgridNum == 0){
              Game.rightredlarge1.setVisible(false);
            }else if(lastgridNum == 1){
              Game.rightredlarge2.setVisible(false);
            }else if(lastgridNum == 2){
              Game.rightredlarge3.setVisible(false);
            }else{
              Game.rightredlarge4.setVisible(false);
            }
          }else{
            if(lastgridNum == 0){
              Game.rightyellowlarge1.setVisible(false);
            }else if(lastgridNum == 1){
              Game.rightyellowlarge2.setVisible(false);
            }else if(lastgridNum == 2){
              Game.rightyellowlarge3.setVisible(false);
            }else{
              Game.rightyellowlarge4.setVisible(false);
            }
          }
        }else{
          if(lastColor == "green"){
            if(lastgridNum == 0){
              Game.leftgreenlarge1.setVisible(false);
            }else if(lastgridNum == 1){
              Game.leftgreenlarge2.setVisible(false);
            }else if(lastgridNum == 2){
              Game.leftgreenlarge3.setVisible(false);
            }else{
              Game.leftgreenlarge4.setVisible(false);
            }
          }else if(lastColor == "red"){
            if(lastgridNum == 0){
              Game.leftredlarge1.setVisible(false);
            }else if(lastgridNum == 1){
              Game.leftredlarge2.setVisible(false);
            }else if(lastgridNum == 2){
              Game.leftredlarge3.setVisible(false);
            }else{
              Game.leftredlarge4.setVisible(false);
            }
          }else{
            if(lastgridNum == 0){
              Game.leftyellowlarge1.setVisible(false);
            }else if(lastgridNum == 1){
              Game.leftyellowlarge2.setVisible(false);
            }else if(lastgridNum == 2){
              Game.leftyellowlarge3.setVisible(false);
            }else{
              Game.leftyellowlarge4.setVisible(false);
            }
          }
        }
          
        if(arrow.getDir() == "right"){
          if(arrow.getColor() == "green"){
            if(gridNum == 0){                           //first grid
              if(arrowcnt == 0){
                Game.rightgreensmall1.setVisible(true);
              }else if(arrowcnt == 1){
                Game.rightgreensmall1.setVisible(false);
                Game.rightgreenmedium1.setVisible(true);
              }else{
                Game.rightgreenmedium1.setVisible(false);
                Game.rightgreenlarge1.setVisible(true);
              }
            }else if(gridNum == 1){                    //second grid
              if(arrowcnt == 0){
                Game.rightgreensmall2.setVisible(true);
              }else if(arrowcnt == 1){
                Game.rightgreensmall2.setVisible(false);
                Game.rightgreenmedium2.setVisible(true);
              }else{
                Game.rightgreenmedium2.setVisible(false);
                Game.rightgreenlarge2.setVisible(true);
              }
            }else if(gridNum == 2){                    //third grid
              if(arrowcnt == 0){
                Game.rightgreensmall3.setVisible(true);
              }else if(arrowcnt == 1){
                Game.rightgreensmall3.setVisible(false);
                Game.rightgreenmedium3.setVisible(true);
              }else{
                Game.rightgreenmedium3.setVisible(false);
                Game.rightgreenlarge3.setVisible(true);
              }
            }else{
              if(arrowcnt == 0){
                Game.rightgreensmall4.setVisible(true);
              }else if(arrowcnt == 1){
                Game.rightgreensmall4.setVisible(false);
                Game.rightgreenmedium4.setVisible(true);
              }else{
                Game.rightgreenmedium4.setVisible(false);
                Game.rightgreenlarge4.setVisible(true);
              }
            }
          }else if(arrow.getColor() == "red"){
            if(gridNum == 0){                           //first grid
              if(arrowcnt == 0){
                Game.rightredsmall1.setVisible(true);
              }else if(arrowcnt == 1){
                Game.rightredsmall1.setVisible(false);
                Game.rightredmedium1.setVisible(true);
              }else{
                Game.rightredmedium1.setVisible(false);
                Game.rightredlarge1.setVisible(true);
              }
            }else if(gridNum == 1){                    //second grid
              if(arrowcnt == 0){
                Game.rightredsmall2.setVisible(true);
              }else if(arrowcnt == 1){
                Game.rightredsmall2.setVisible(false);
                Game.rightredmedium2.setVisible(true);
              }else{
                Game.rightredmedium2.setVisible(false);
                Game.rightredlarge2.setVisible(true);
              }
            }else if(gridNum == 2){                    //third grid
              if(arrowcnt == 0){
                Game.rightredsmall3.setVisible(true);
              }else if(arrowcnt == 1){
                Game.rightredsmall3.setVisible(false);
                Game.rightredmedium3.setVisible(true);
              }else{
                Game.rightredmedium3.setVisible(false);
                Game.rightredlarge3.setVisible(true);
              }
            }else{
              if(arrowcnt == 0){
                Game.rightredsmall4.setVisible(true);
              }else if(arrowcnt == 1){
                Game.rightredsmall4.setVisible(false);
                Game.rightredmedium4.setVisible(true);
              }else{
                Game.rightredmedium4.setVisible(false);
                Game.rightredlarge4.setVisible(true);
              }
            }
          }else{
            if(gridNum == 0){                           //first grid
              if(arrowcnt == 0){
                Game.rightyellowsmall1.setVisible(true);
              }else if(arrowcnt == 1){
                Game.rightyellowsmall1.setVisible(false);
                Game.rightyellowmedium1.setVisible(true);
              }else{
                Game.rightyellowmedium1.setVisible(false);
                Game.rightyellowlarge1.setVisible(true);
              }
            }else if(gridNum == 1){                    //second grid
              if(arrowcnt == 0){
                Game.rightyellowsmall2.setVisible(true);
              }else if(arrowcnt == 1){
                Game.rightyellowsmall2.setVisible(false);
                Game.rightyellowmedium2.setVisible(true);
              }else{
                Game.rightyellowmedium2.setVisible(false);
                Game.rightyellowlarge2.setVisible(true);
              }
            }else if(gridNum == 2){                    //third grid
              if(arrowcnt == 0){
                Game.rightyellowsmall3.setVisible(true);
              }else if(arrowcnt == 1){
                Game.rightyellowsmall3.setVisible(false);
                Game.rightyellowmedium3.setVisible(true);
              }else{
                Game.rightyellowmedium3.setVisible(false);
                Game.rightyellowlarge3.setVisible(true);
              }
            }else{
              if(arrowcnt == 0){
                Game.rightyellowsmall4.setVisible(true);
              }else if(arrowcnt == 1){
                Game.rightyellowsmall4.setVisible(false);
                Game.rightyellowmedium4.setVisible(true);
              }else{
                Game.rightyellowmedium4.setVisible(false);
                Game.rightyellowlarge4.setVisible(true);
              }
            }
          }
        }else{                                          //Left Dir
          if(arrow.getColor() == "green"){
            if(gridNum == 0){                           //first grid
              if(arrowcnt == 0){
                Game.leftgreensmall1.setVisible(true);
              }else if(arrowcnt == 1){
                Game.leftgreensmall1.setVisible(false);
                Game.leftgreenmedium1.setVisible(true);
              }else{
                Game.leftgreenmedium1.setVisible(false);
                Game.leftgreenlarge1.setVisible(true);
              }
            }else if(gridNum == 1){                    //second grid
              if(arrowcnt == 0){
                Game.leftgreensmall2.setVisible(true);
              }else if(arrowcnt == 1){
                Game.leftgreensmall2.setVisible(false);
                Game.leftgreenmedium2.setVisible(true);
              }else{
                Game.leftgreenmedium2.setVisible(false);
                Game.leftgreenlarge2.setVisible(true);
              }
            }else if(gridNum == 2){                    //third grid
              if(arrowcnt == 0){
                Game.leftgreensmall3.setVisible(true);
              }else if(arrowcnt == 1){
                Game.leftgreensmall3.setVisible(false);
                Game.leftgreenmedium3.setVisible(true);
              }else{
                Game.leftgreenmedium3.setVisible(false);
                Game.leftgreenlarge3.setVisible(true);
              }
            }else{
              if(arrowcnt == 0){
                Game.leftgreensmall4.setVisible(true);
              }else if(arrowcnt == 1){
                Game.leftgreensmall4.setVisible(false);
                Game.leftgreenmedium4.setVisible(true);
              }else{
                Game.leftgreenmedium4.setVisible(false);
                Game.leftgreenlarge4.setVisible(true);
              }
            }
          }else if(arrow.getColor() == "red"){
            if(gridNum == 0){                           //first grid
              if(arrowcnt == 0){
                Game.leftredsmall1.setVisible(true);
              }else if(arrowcnt == 1){
                Game.leftredsmall1.setVisible(false);
                Game.leftredmedium1.setVisible(true);
              }else{
                Game.leftredmedium1.setVisible(false);
                Game.leftredlarge1.setVisible(true);
              }
            }else if(gridNum == 1){                    //second grid
              if(arrowcnt == 0){
                Game.leftredsmall2.setVisible(true);
              }else if(arrowcnt == 1){
                Game.leftredsmall2.setVisible(false);
                Game.leftredmedium2.setVisible(true);
              }else{
                Game.leftredmedium2.setVisible(false);
                Game.leftredlarge2.setVisible(true);
              }
            }else if(gridNum == 2){                    //third grid
              if(arrowcnt == 0){
                Game.leftredsmall3.setVisible(true);
              }else if(arrowcnt == 1){
                Game.leftredsmall3.setVisible(false);
                Game.leftredmedium3.setVisible(true);
              }else{
                Game.leftredmedium3.setVisible(false);
                Game.leftredlarge3.setVisible(true);
              }
            }else{
              if(arrowcnt == 0){
                Game.leftredsmall4.setVisible(true);
              }else if(arrowcnt == 1){
                Game.leftredsmall4.setVisible(false);
                Game.leftredmedium4.setVisible(true);
              }else{
                Game.leftredmedium4.setVisible(false);
                Game.leftredlarge4.setVisible(true);
              }
            }
          }else{
            if(gridNum == 0){                           //first grid
              if(arrowcnt == 0){
                Game.leftyellowsmall1.setVisible(true);
              }else if(arrowcnt == 1){
                Game.leftyellowsmall1.setVisible(false);
                Game.leftyellowmedium1.setVisible(true);
              }else{
                Game.leftyellowmedium1.setVisible(false);
                Game.leftyellowlarge1.setVisible(true);
              }
            }else if(gridNum == 1){                    //second grid
              if(arrowcnt == 0){
                Game.leftyellowsmall2.setVisible(true);
              }else if(arrowcnt == 1){
                Game.leftyellowsmall2.setVisible(false);
                Game.leftyellowmedium2.setVisible(true);
              }else{
                Game.leftyellowmedium2.setVisible(false);
                Game.leftyellowlarge2.setVisible(true);
              }
            }else if(gridNum == 2){                    //third grid
              if(arrowcnt == 0){
                Game.leftyellowsmall3.setVisible(true);
              }else if(arrowcnt == 1){
                Game.leftyellowsmall3.setVisible(false);
                Game.leftyellowmedium3.setVisible(true);
              }else{
                Game.leftyellowmedium3.setVisible(false);
                Game.leftyellowlarge3.setVisible(true);
              }
            }else{
              if(arrowcnt == 0){
                Game.leftyellowsmall4.setVisible(true);
              }else if(arrowcnt == 1){
                Game.leftyellowsmall4.setVisible(false);
                Game.leftyellowmedium4.setVisible(true);
              }else{
                Game.leftyellowmedium4.setVisible(false);
                Game.leftyellowlarge4.setVisible(true);
              }
            }
          }
        }

        timer.stop();
      }
    };
    
    
    
    
    
    startTime = System.currentTimeMillis();
    arrowcnt = 0;
    System.out.println("Animation Start!");
    while (!Game.timeVector.isEmpty()){
      if(arrowcnt == 0){
        lastColor = arrow.getColor();
        lastgridNum = arrow.getgrid();
        lastDir = arrow.getDir();
        arrow.randomGenerator();
      }
      
      //System.out.println(arrow.getColor());
      
      nextTimeStamp = Game.timeVector.get(0); // get first element 
      Game.timeVector.removeElementAt(0); // remove element off vector 
      
      
      // create a timer to execute an action at the next time 
      int delay = (int) (long)(nextTimeStamp - (System.currentTimeMillis() - startTime)); //milliseconds
      timer = new Timer(delay, a);
      
      timer.start();
      
      while(timer.isRunning()){
          
      }
      arrowcnt ++;
      if(arrowcnt == 3){
        arrowcnt = 0;
      }
    }
  }
}
