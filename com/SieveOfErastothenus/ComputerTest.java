package sieve;

import java.util.*;
import java.io.*;

public class ComputerTest {
    public void setPrimitivesTest() {
      System.out.println("Earth, we are going to test primitives calculation till 10");
      Computer c = new Computer();
      c.setLimit(10);
      c.arrayInit();
      c.setPrimitives();
      String result = getOutput(c);
      if (result.equals("primitive numbers\n2 3 5 7 \n")) {
        System.out.println("passed");
      } else {
        System.out.println("failed");
      }
      System.out.println("result is: "+result);
    }
    
    private String getOutput(Computer c) {
      PrintStream consoleStream = System.out;
      ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
      PrintStream stream = new PrintStream(outputStream);
      System.setOut(stream);
      c.output();
      String result = outputStream.toString();
      System.setOut(consoleStream);
      return result;
    }
    
    public void resultTest() {
      ArrayList<Integer> ar = new ArrayList<Integer>();
      ar.add(5);
      ar.add(7);
      ar.add(10);
      Computer c = new Computer();
      c.setResult(ar);
      String result = getOutput(c);
      if (result.equals("primitive numbers\n5 7 10 \n")) {
        System.out.println("passed");
      } else {
        System.out.println("failed");
      }
      System.out.println("result is: "+result);
    }
    
    public void arInitTest() {
      System.out.println("Earth, we are going to test array initialization");
      Computer c = new Computer();
      c.setLimit(3);
      c.arrayInit();
      int[] t = c.getArray();
      if ((t.length == 4) && (t[0]==2)&&(t[2]==3)&&(t[1]==0)) {
        System.out.print("passed");
      } else {
        System.out.print("failed");
      }
      System.out.println(", here is array:");
      for (int i = 0; i < t.length; i++) {
        System.out.print(t[i]+"| ");
      }
      System.out.println();
    }
    
    public void setLimitTest() {
      System.out.println("Earth, we are going to test limit setter-getter with input: 5");
      Computer c = new Computer();
      c.setLimit(5);
      int income = c.getLimit();
      if (income == 5) {
        System.out.print("passed");
      } else {
        System.out.print("failed");
      }
      System.out.println(", limit is "+income);
    }
    
    public void arSizeTest() {
      System.out.println("Earth, we are going to test array size value calculation");
      Computer c = new Computer();
      c.setLimit(5);
      int income = c.getArSize();
      if(income==8) {
        System.out.print("passed");
      } else {
        System.out.println("failed");
      }
      System.out.println(", arSize is "+income);
    }
    
    public void arrayCreatingTest() {
      System.out.println("Earth, we are going to test array creating");
      System.out.println("Disclaimer: this is to little to test, yes. Also, this is the start beginning for the project so let it be as it is");
      Computer c = new Computer();
      c.arraysCreating();
      
    }
    
    public void printingArrayTest() {
      System.out.println("Earth, we are going to test array printing");
      Computer c = new Computer();
      c.initializeAr();
      c.printOutAr();
      if (c.getArray() == null) {
        System.out.println("Test failed");
      }
    }
    
    public void initializeArTest() {
      System.out.println("Earth, we are going to test array initializing");
      Computer c = new Computer();
      c.initializeAr();
      if (c.getArray() == null) {
        System.out.println("Test failed");
      } else {
        System.out.println("Test passed");
      }
    }
}
