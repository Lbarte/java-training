package sinkShipGame;

public class ConsoleClassTest {
   void consoleInputTest() {
     System.out.println("Earth, we are starting console input test. Input smth");
     ConsoleClass cs = new ConsoleClass();
     String line = cs.getLine();
     if (line == null) {
       System.out.println("Earth, test failed");
     } else {
       
       System.out.println("Console IS here! Brawo! Passed, your input was: " + line);
       
     }
     
   }
   
   void getXTest() {
     System.out.println("Earth, we are going to test get x method");
     ConsoleClass cs = new ConsoleClass();
     int x = cs.getX();
     if (x==0) {
       System.out.println("failed");
     } else {
       System.out.println("passed, x="+x);
     }
     
   }
   
   
   void getYTest() {
     System.out.println("Earth, we are going to test get y method");
     ConsoleClass cs = new ConsoleClass();
     int y = cs.getY();
     if (y==0) {
       System.out.println("failed");
     } else {
       System.out.println("passed, y="+y);
     }
     
   }
   
   void checkEndgameTest() {
     System.out.println("Earth, we are going to test endgame checking");
     ConsoleClass cs = new ConsoleClass();
     if (cs.checkEndgame()) {
       System.out.println("Endgame");
     } else {
       System.out.println("Continue game");
     }
   }
}
