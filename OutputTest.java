package sinkShipGame;

public class OutputTest {
    void testPointed() {
      System.out.println("Earth, we are going to test set pointed method");
      Output o = new Output();
      o.setX1(5);
      o.setY1(3);
      o.arrayInit();
      System.out.println();
      System.out.println("Before pointing");
      o.printGrid();
      System.out.println("Earth, we are pointing to cell (2,2)");
      o.setPointed(1,1);
      System.out.println("After pointing");
      o.printGrid();
      
    }

    void testPrintGrid() {
      System.out.println("Earth, we are going to test printGrid method. x=5, y=3");
      Output o = new Output();
      o.setX1(5);
      o.setY1(3);
      o.arrayInit();
      //o.gridArrayLoop();
      o.printGrid();
    }

    void launchGridTest1() {
      Output o = new Output();
      o.setX1(5);
      o.setY1(2);
      o.arrayInit();
      o.gridArrayLoop();
    }
    
    void launchOutputTest() {
      setXTest();
      getXTest();
      getYTest();
      setYTest();
    }
    
    /*void launchGridTest() {
      Output o = new Output();
      o.printGrid();
    }*/

    void setXTest() {
      Output o = new Output();
      System.out.println("Earth, we are starting setXtest");
      if ((o.getX() == 0) && (o.setX(2) == false) && (o.setX(10) == false) && (o.setX(5) == true) && (o.getX() == 5)){
        //proceed
        System.out.println("passed");
      } else {
        System.out.println("failed");
      }
    }
    
    void getXTest() {
      System.out.println("Earth, we sre going to test getX method");
      Output o = new Output();
      if ((o.setX(5)) && (o.getX() == 5)) {
        System.out.println("passed");
      } else {
        System.out.println("failed");
      }
    }
    
    void getYTest() {
      System.out.println("Earth, we are going to test getY method");
      Output o = new Output();
      if ((o.setY(5)) && (o.getY() == 5)) {
        System.out.println("passed");
      } else {
        System.out.println("failed");
      }
    }
    
    void setYTest() {
      Output o = new Output();
      System.out.println("Earth, we are starting setYtest");
      if ((o.getY() == 0) && (o.setY(2) == false) && (o.setY(10) == false) && (o.setY(5) == true) && (o.getY() == 5)){
        //proceed
        System.out.println("passed");
      } else {
        System.out.println("failed");
      }
    }
    
    void createPointTest() {
      int x = 5, y= 7;
      System.out.println("Earth, we are going to test point creation with grid ("+x+","+y+")");
      Output o = new Output ();
      //System.out.println("breakpoint 0");
      o.setX1(x);
      //System.out.println("breakpoint 1");
      o.setY1(y);
      //System.out.println("breakpoint 2");
      o.arrayInit();
      //System.out.println("breakpoint 3");
      
      
      o.randomTargetCreation();
      //o.randomPointCreation();
      //System.out.println("breakpoint 4");
      o.printGrid();
    }
    
    void checkUserPointTest() {
      System.out.println("Earth, we are going to test checking user point with grid 2x2 and user point (1,1), than (1,2), than (2,1) and lastly (2,2)");
      System.out.println("P.S. target is at (2,1)");
      Output o = new Output();
      
      o.setX1(2);
      o.setY1(2);
      o.arrayInit();
      o.setSmthThere(1,0);
      System.out.println("Grid is ready");
      o.printGrid();
      System.out.println("searching at (1,1)");
      o.checkUserPoint(0,0);
      o.printGrid();
      System.out.println("searching at (1,2)");
      o.checkUserPoint(0,1);
      o.printGrid();
      System.out.println("searching at (2,1)");
      o.checkUserPoint(1,0);
      o.printGrid();
      System.out.println("searching at (2,2)");
      o.checkUserPoint(1,1);
      o.printGrid();
      
    }
    
    
}
