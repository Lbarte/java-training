package com.practice;

public class practice2 {

    public static double getDistance(int x1, int y1, int x2, int y2) {
        double dist = double.math.sqrt((x2-x1)^2+(y2-y1)^2);
        return dist;
    }
    
    private static int catCount = 0;

    public Cat() {
        catCount++;
    }

    public static int getCatCount() {
        return catCount;

    }

    public static void setCatCount(int catCount) {
        Cat.catCount = catCount;

    }
    
    static int catCount = 0;
    
    public Cat() {
      catCount++;
    }
    
    public static void calculateBMI(double weight, double height) {
            
            double bmi = weight/(height*height);
            if(bmi>=30.0) {
              System.out.println("Obese: BMI >= 30");
            } else if (bmi>=25.0) {
              System.out.println("Overweight: 25 <= BMI < 30");
            } else if (bmi>=18.5) {
              System.out.println("Normal: 18.5 <= BMI < 25");
            } else {
              System.out.println("Underweight: BMI < 18.5");
            }
        }
    
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
