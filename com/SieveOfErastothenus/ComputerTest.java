package com.erastothenus.sieve;

public class ComputerTest {
    public void arrayCreatingTest() {
      System.out.println("Earth, we are going to test array creating");
      System.out.println("Disclaimer: this is to little to test, yes. Also, this is the start beginning for the project so let it be as it is");
      Computer c = new Computer();
      c.arrayCreating();
      
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
