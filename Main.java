package com.codegym.test;

import java.io.*;

public class Main {

  
  public static void main(String[] args){
        eee();
        
        //eew();
        
        //eeq();
        
        //ewe();
        
        //eww();
        
        //ewq();
        
        //eqe();
        
        //eqw();
        
        //eqq();
        
        //wee();
        
        //wew();
        
        //weq();
        
        //wwe();
        
        //www();
        
        //wwq();
        
        //wqe();
        
        //wqw();
        
        //wqq();
        
        //qww();
        
        //qwq();
        
        //qqw();
        
        //qqq();
        
        
    }
    
    public static void eee() {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      
      String n = reader.readLine();
      int y = Integer.parseInt(reader.readLine());
      int m = Integer.parseInt(reader.readLine());
      int d = Integer.parseInt(reader.readLine());
      
      System.out.println("My name is "+n+".");
      System.out.println("I was born on "+m+"/"+d+"/"+y);
    }
    
    public static void eew() {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      int s = 0, n;
      while (true) {
        n = Integer.parseInt(reader.readLine());
        s += n;
        if (n == -1) {
          break;
        }
      }
      System.out.println(s);
    }
    
    public static void eeq() {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      int q = Integer.parseInt(reader.readLine());
      int w = Integer.parseInt(reader.readLine());
      int e = Integer.parseInt(reader.readLine());
      
      
      if ((q == w)&&(w == e)&&(e == q)) {
         System.out.println(q);
        } else if (q==w) {
          System.out.println(q);
        } else if (w==e) {
          System.out.println(w);
        } else if (e==q) {
          System.out.println(e);
        } else if ((q>w)&&(q>e)) {
          if (w>e) {
            System.out.println(w);
          } else if (e>w) {
            System.out.println(e);
          }
        } else if ((w>e)&&(w>q)) {
          if (e>q) {
            System.out.println(e);
          } else if (q>e) {
            System.out.println(q);
          }
        } else if ((e>q)&&(e>w)) {
          if (q>w) {
            System.out.println(q);
          } else if (w>q) {
            System.out.println(w);
          }
        }
      
      
      
    }
    
    public static void ewe() {
      for (int o = 0; o < 100; o++){
        System.out.println("I will never work foe peanuts. Amigo");
      }
    }
    
    public static void eww() {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      String name = reader.readLine();
      
      for (int i = 0; i < 10; i++) {
        System.out.println(name + " loves me.");
      }
    }
    
    public static void ewq() {
      for (int i = 0; i < 10; i++) {
        System.out.print(8);
      }
      System.out.println();
      for (int i = 0; i < 10; i++) {
        System.out.println(8);
      }
    }
    
    public static void eqe() {
      for (int i = 1; i < 11; i++)  {
        for (int j = 0; j < i; j ++) {
          System.out.print(8);
        }
        System.out.println();
      }   
    }
    
    public static void eqw() {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      int m = Integer.parseInt(reader.readLine());
      int n = Integer.parseInt(reader.readLine());
      
      for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
          System.out.print(8);
        }
        System.out.println();
      }
    }
    
    
    //even numbers from 1 to 100
    public static void eqq() {
      for (int i = 1; i < 101; i++) {
        if (i%2==0) {
          System.out.println(i);
        } 
      }
    }
    
    public static void wee() {
      int i = 1, j = 1;
      while (i < 11) {
        while (j < 11) {
          System.out.print(i*j+" ");
          j++;
        }
        System.out.println();
        i++;
        j = 1;
      }
    }
    
    public static void wew() {
      int i = 0, j = 0;
      while (i < 10) {
        while (j < 10) {
          System.out.print("$");
          j++;
        }
        System.out.println();
        i++;
        j = 0;
      }
    }
    
    public static void weq() {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      
      String s = reader.readLine();
      int n = Integer.parseInt(reader.readLine());
      
      while (n>0) {
        System.out.println(s);
        n--;
      }
    }
    
    public static void www() {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      
      int q = Integer.parseInt(reader.readLine());
      int w = Integer.parseInt(reader.readLine());
      int e = Integer.parseInt(reader.readLine());
      
      
      int countP = 0, countN = 0;
      
      if (isPos(q)) {
        countP++;
      } else if (q<0) {
        countN++;
      }
      if(isPos(w)) {
        countP++;
      } else if (w<0) {
        countN++;
      }
      if(isPos(e)) {
        countP++;
      } else if (e<0) {
        countN++;
      }
      
      System.out.println("Number of negative numbers: "+countN);
      System.out.println("Number of positive numbers"+countP);
    }
    
    public static boolean isPos(int n) {
      if (n > 0) {
        return true;
      }
      return false;
    }
    
    public static void www() {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      
      int q = Integer.parseInt(reader.readLine());
      int w = Integer.parseInt(reader.readLine());
      int e = Integer.parseInt(reader.readLine());
      
      
      int counter = 0;
      
      if (isPos(q)) {
        counter++;
      }
      if(isPos(w)) {
        counter++;
      }
      if(isPos(e)) {
        counter++;
      }
      
      System.out.println(counter);
    }
    
    public static boolean isPos(int n) {
      if (n > 0) {
        return true;
      }
      return false;
    }
    
    public static void wwq() {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      
      int n = Integer.parseInt(reader.readLine());
      
      
      
      if ((n>0)&&(n<1000)) {
        if (n%2==0) {
          System.out.print("even ");
        } else {
          System.out.print("odd ");
        }
        if(n<10) {
          System.out.println("single-digit number");
        } else if (n<100) {
          System.out.println("two-digit number");
        } else if (n<1000) {
          System.out.println("three-digit number");
        }
      }
    }
    
    public static void wqe() {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      
      int n = Integer.parseInt(reader.readLine());
      
      
      //boolean isEven=false, isPos=false, isZero = false;
      if(n == 0) {
        System.out.println("Zero");
      } else {
        if (n>0) {
          //isPos = true;
          System.out.print("Positive ");
        } else {
          System.out.print("Negative ");
        }
        if (n%2==0) {
          //isEven = true;
          >System.out.println("even number");
        } else {
          System.out.println("odd number");
        }
        
        
      }
    }
    
    public static void wqw() {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      
      int q = Integer.parseInt(reader.readLine());
      int w = Integer.parseInt(reader.readLine());
      
      
      if ((q > 0)&&(w > 0))  {
        System.out.pritnln(1);
      } else if ((q < 0)&&(w>0)) {
        System.out.println();
      }  else if ((q<0)&&(w<0)) {
        System.out.println();
      } else if ((q>0)&&(w<0)) {
        System.out.println();
      }
    }
    
    public static void wqq() {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      
      int q = Integer.parseInt(reader.readLine());
      int w = Integer.parseInt(reader.readLine());
      int e = Integer.parseInt(reader.readLine());
      
      if ((q == w) && (e != q)) {
        System.out.println(e);
      } else if ((q == e) && (w != q)) {
        System.out.println(w);
      } else if ((w == e) && (q != w)){
        System.out.println(q);
      } else {
        System.out.println(q);
      }
    }
    
    public static void qww() {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      
      String name = reader.readLine();
      int age = Integer.parseInt(reader.readLine());
      
      if (age > 20) {
        System.out.println("18 is old enough");
      }
    }
    
    public static void qwq() {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      
      String name = reader.readLine();
      int age = Integer.parseInt(reader.readLine());
      
      if (age < 18) {
        System.out.println("Grow up a little more");
      }
    }
    
    public static void qqw() {
      //write your code here
        /*BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int nq = Integer.parseInt(reader.readLine());
        int nw = Integer.parseInt(reader.readLine());
        int ne = Integer.parseInt(reader.readLine());
        int nr = Integer.parseInt(reader.readLine());
        if (max(nq,nw) > max(ne,nr)) {
          System.out.println(max(nq,nw));
        } else {
          System.out.println(max(ne,nr));
        }*/
        
        
        
        
        
        /*int nq = Integer.parseInt(reader.readLine());
        int nw = Integer.parseInt(reader.readLine());
        if (nq < nw) {
          System.out.println(nq);
        } else {
          System.out.println(nw);
        }*/
        
        
        
        
        
        
        
        
        
        
        
        
        /*int nq = Integer.parseInt(reader.readLine());
        int nw = Integer.parseInt(reader.readLine());
        int ne = Integer.parseInt(reader.readLine());
        if (ne==nq) {
          System.out.print(ne +" "+nq);
          if (ne==nw) {
            System.out.print(" "+nw);
          }
          System.out.println();
        } else if (nw==nq) {
          System.out.print(nw +" "+nq);
          if (nw==ne) {
            System.out.print(" "+ne);
          }
          System.out.println();
        } else if (ne==nw) {
          System.out.print(ne +" "+nw);
          if (ne==nq) {
            System.out.print(" "+nq);
          }
          System.out.println();
        }*/
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*double t = Double.parseDouble(reader.readLine());
        do {
            if (t>=5.0) {
                t-=5.0;
            } else {
                if (t<3.0) { System.out.println("green");
                } else if (t<4.0) { System.out.println("yellow");
                } else { System.out.println("red"); }
                t-=5.0;
            }
        } while (t >= 0.0);*/
    }
    
    public static int max(int a, int b) {
      if (a > b) {
        return a;
      } else {
        return b;
      }
    }
    
    public static void qqq() {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
    String q = reader.readLine();
    String w = reader.readLine();
    
    if(q.equals(w)) {
      System.out.println("The names are identical");
    } else if (q.length() == w.length()) {
      System.out.println("The names are the same length");
    }
    }
}
