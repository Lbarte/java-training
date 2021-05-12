package sinkShipGame;

//todo
//rename class to Grid
//reverse places x and y coordinates

public class Output {

    private int x;
    private int y;
    private boolean[][][] gridArray;
    
    int getX() {
      return x;
    }
    
    boolean setX(int newX) {
      /*if ((newX > 3) && (newX < 9)) {
        x = newX;
        return true;
      } else {
        System.out.println("Earth, new x is out of range (3;9)");
      }
      return false;*/
      x = newX;
      return true;
    }
    
    void setX1(int newX) {
      x = newX;
    }
    
    void setY1(int newY) {
      y = newY;
    }
    
    int getY() {
      return y;
    }
    
    boolean setY(int newY) {
      /*if ((newY > 3) && (newY < 9)) {
        y = newY;
        return true;
      } else {
        System.out.println("Earth, new y is out of range");
      }*/
      y = newY;
      return true;
      //return false;
    }

    void printGrid() {
      //TODO
      /* examples
      System.out.println("___"); 
      beginning

      System.out.println("|_|"); 
      empty cell

      System.out.println("|x|");
      there is smth

      System.out.println("|0|");
      there is nth
      */
      
      //beginning
      System.out.println("Earth, we are going to print grid");
      for (int ely=0; ely<y; ely++) {
          System.out.println();
          System.out.print("|");
          for (int elx=0; elx<x; elx++) {
            //isPointed
            if (isPointed(elx,ely)==true) {
              if (isSmthThere(elx,ely)==true) {
                System.out.print("x");
              } else {
                System.out.print("0");
              }
            } else {
              System.out.print("_");
            }
            System.out.print("|");
          }
        }
      
      System.out.println();
      System.out.println();
    }
    
    
    boolean isPointed(int elx, int ely) {
      if (gridArray[0][elx][ely]==true) {
        
        return true;
      }
      return false;
    }
    
    boolean isSmthThere(int elx, int ely) {
      if (gridArray[1][elx][ely] == true) {
        return true;
      }
      return false;
    }
    
    void arrayInit() {
      gridArray = new boolean[2][x][y];
    }
    
    boolean getEFrmGrid(int elb, int elx, int ely) {
      return gridArray[elb][elx][ely];
    }
    
    
    
    void gridArrayLoop() {
      System.out.println("Earth, we are going to print each element of gridArray");
      
      for (int inc=0, elb=0; elb<2;elb++) {
        for (int ely=0; ely<y; ely++) {
          for (int elx=0; elx<x; elx++, inc++) {
            System.out.print("el."+inc+"/ x."+elx+" y."+ely+":::");
             System.out.println(gridArray[elb][elx][ely]);
          }
        }
      }
      
    }
    
    void setPointed(int elx, int ely) {
      gridArray[0][elx][ely] = true;
    }
    
    void setSmthThere(int elx, int ely) {
      if (elx==x) {
        elx--;
      }
      if (ely==y) {
        ely--;
      }
      gridArray[1][elx][ely] = true;
    }
    //next test pointed and smththere
    
    //renamed from:
    //randomPointCreation
    //
    //setPointed... is out for target hiding
    void randomTargetCreation() {
      
      int elx = (int) (Math.random()*x);
      int ely = (int) (Math.random()*y);
      System.out.println("Earth, we created random point at ("+(elx+1)+", "+(ely+1)+")");
      
      setSmthThere(elx, ely);
      //setPointed(elx, ely);
      
    }
    
    
    void checkUserPoint(int elx, int ely) {
      setPointed(elx, ely);
      if (isSmthThere(elx,ely)==true) {
         System.out.print("you find it");
      } 
    }
    
}

