package com.practice;

public class practice2 {

    public static void main (String[] args) {
      //positive ints only
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(reader.readLine()), lastD = 0;
      even = 0;
      odd = 0;
      for (; n >= 0; ) {
        //searching for digit, return new n()
        if (n > 9) {
          lastD = n%10;
          n = (n-lastD)/10;
        } else {
          lastD = n;
          n = -1;
        }
        //is digit even or odd()
        if (lastD % 2 == 0) {
          even++;
        } else {
          odd++;
        } 
      }
      System.out.println("Even: "+even+" Odd: "+odd);
    }
    
    public Cat() {
      catCount++;
    }
    
    protected void finalize() throws Throwable {
      catCount--;
    }
    
    for (int i = 0; i < 50000; i++) {
      Cat c = new Cat();
      Dog d = new Dog();
      
    }
    
    protected void finalize() throws Throwable {
      //System.out.println("A Cat was destroyed");
      //System.out.println("A Dog was destroyed");
    }
}
