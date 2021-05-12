package sinkShipGame;

import sinkShipGame.ConsoleClass;
import sinkShipGame.Output;


public class GameProcessing {
    void gridSizeInput () {
      ConsoleClass cc = new ConsoleClass();
      int x = cc.getX(), y = cc.getY();
      Output o = new Output();
      o.setX1(x);
      o.setY1(y);
      System.out.println("Input confirmation: x=" + o.getX() + " y=" + o.getY());
    }
    
    void gridInputOutput() {
      ConsoleClass cc = new ConsoleClass();
      int x = cc.getX(), y = cc.getY();
      Output o = new Output();
      o.setX1(x);
      o.setY1(y);
      o.arrayInit();
      o.printGrid();
    }
    
    void cellInput() {
      ConsoleClass cc = new ConsoleClass();
      int x = cc.getX(), y = cc.getY();
      Output o = new Output();
      o.setX1(x);
      o.setY1(y);
      o.arrayInit();
      o.printGrid();
      int cx = cc.getX(), cy = cc.getY();
      o.setPointed(cx-1, cy-1);
      o.printGrid();
    }
    
    void pointCreation() {
      ConsoleClass cc = new ConsoleClass();
      int x = cc.getX(), y = cc.getY();
      Output o = new Output();
      o.setX1(x);
      o.setY1(y);
      o.arrayInit();
      
      o.randomTargetCreation();
      //o.randomPointCreation();
      o.printGrid();
    }
    
    void search() {
      ConsoleClass cc = new ConsoleClass();
      System.out.println("Provide grid size");
      int x = cc.getX(), y = cc.getY();
      Output o = new Output();
      o.setX1(x);
      o.setY1(y);
      o.arrayInit();
      
      o.randomTargetCreation();
      //o.randomPointCreation();
      
      o.printGrid();
      
      do {
        System.out.println("input point");
        x = cc.getX() -1;
        y = cc.getY() -1;
        o.setPointed(x,y);
        o.printGrid();
      } while(cc.checkEndgame() == false);
      
      //loop to find target
      //checkEndgame
    }
    
    
    void targetAnalytics() {
      
      //grid size from 1x1 to 10x10 to 20x20 and ask to continue
      int gridLimit = 11;
      //some value that indicates grid size
      int gridSize = 1;
      //1 loop
      // do loop while grid size is from 1 to 10
      //if grid size is equal to 10
      //then ask for continuing
      //what do we do at loop
//loop 2
      //searching for target coordinates 10 times
//loop 3
      //for every possible target coordinates for (grid size from 1 to max)
      //how do we do analytics?
      //by printing coordinates out
      ConsoleClass cc = new ConsoleClass();
      Output o = new Output();
      do {
        if (gridSize == 10) {
          if (cc.checkEndgame() == false) {
           gridLimit += 10; 
          }
        }
        o.setX(gridSize);
        o.setY(gridSise);
        o.arrayInit();
        o.randomTargetCreation();
        for(int i = 0; i < 10; i++) {
          for( int j = 1; j < gridSize+1; j++) {
            
          }
        }
        gridSize++;
        
        
      } while(gridSize > iLimit);
    }
    
}
