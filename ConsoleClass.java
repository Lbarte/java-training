package sinkShipGame;

//import java.io.*;
import java.util.*;

public class ConsoleClass {
   String getLine() {
     
     
     Scanner scanner = new Scanner(System.in);
     //System.out.println("input smth:");
     String line = scanner.nextLine();
     scanner.close();
     return line;
   }
   
   int getX() {
     Scanner scanner = new Scanner(System.in);
     System.out.println("input x:");
     int x = scanner.nextInt();
     scanner.close();
     return x;
   }
   
   int getY() {
     Scanner scanner = new Scanner(System.in);
     System.out.println("input y:");
     int y = scanner.nextInt();
     scanner.close();
     return y;
   }
   
   boolean checkEndgame() {
     
     System.out.println("End game? y/n");
     String line = getLine();
     //System.out.println("we get from input: "+line);
     //String yes = "y";
     if (line.equals("y")) {
       return true;
     }
     return false;
   }
}
