package com.practice;

public class Practice0 {
   //public class Cat {
     public String name;
     private int weight;
     private int age;
     private int strength;
     private char sex;
     
     //class Cat
     private String color;
     private String address;
     
     //class Dog
     private int height;
     
     public void setHeight(int height) {
       if (height <= 0) {
         this.height = 1;
       } else {
         this.height = height;
       }
     }
     
     public void initialize(String name) {
       this.setName(name);
     }
     
     public void initialize(String name, int height) {
       this.setName(name);
       this.setHeight(height);
     }
     
     public void initialize(String name, int height, String color) {
       this.setName(name);
       this.setHeight(height);
       this.setColor(color);
     }
     
     //class Cat
     
     public void setName(String name) {
       if (name.equals(null)) {
         this.name = "Cat";
       } else {
         this.name = name;
       }
     }
     
     public void setWeight(int weight) {
       if (weight <= 0) {
         this.weight = 3;
       } else {
         this.weight = weight;
       }
     }
     
     public void setAge(int age) {
       if ((age <= 0)) {
         this.age = 2;
       } else {
         this.age = age;
       }
     }
     
     public void setColor(String color) {
       if (color.equals(null)) {
         this.color = "unknown";
       } else {
         this.color = color;
       }
     }
     
     public void setAddress(String address) {
       if (address.equals(null)) {
         this.address = "unknown";
       } else {
         this.address = address;
       }
     }
     
     public void initialize(String name) {
       this.setName(name);
       this.setColor(null);
       this.setAge(0);
       this.setWeight(0);
     }
     
     public void initialize(String name, int weight, int age) {
       this.setName(name);
       this.setWeight(weight);
       this.setAge(age);
       this.setColor("smth");
       
     }
     
     public void initialize(String name, int age) {
       this.setName(name);
       this.setAge(age);
       //standard weight
       this.setWeight(0);
       this.setColor("smth");
     }
     
     public void initialize(int weight, String color) {
       this.setWeight(weight);
       this.setColor(color);
       this.setAge(0);
     }
     
     public void initialize(int weight, String color, String address) {
       this.setWeight(weight);
       this.setColor(color);
       this.setAddress(address);
       this.setAge(0);
       
     }
     
     //class Friend
     public void initialize(String name) {
       this.name = name;
     }
     
     public void initialize(String name, int age) {
       this.name = name;
       this.age = age;
     }
     
     public void initialize(String name, int age, char sex) {
       this.name = name;
       this.age = age;
       this.sex = sex;
     }
     
     public boolean fight(Cat anotherCat) {
       if (this.weight*this.strength/this.age> anotherCat.weight*anotherCat.strength/anotherCat.age) {
         return true;
       }
       return false;
     }  
     
     
    //public class Dog() {}
    
    private int age;
    private String name;
    
    public void setAge(int newAge) {
      this.age = newAge;
    }
    
    public int getAge() {
      return this.age;
    }
    
    public void setName(String newName) {
      this.name = newName;
    }
    
    public String getName () {
      return this.name;
    }
    
    public void 0() {
      Cat cq = new Cat("q",2,2,3);
      Cat cw = new Cat("w",1,2,3);
      Cat ce = new Cat("e",4,2,3);
      
      System.out.println(cq.fight(cw));
      System.out.println(cw.fight(ce));
      System.out.println(ce.fight(cq));
      //System.out.println(cq.fight(ce));
      //System.out.println(ce.fight(cw));
      //System.out.println(cw.fight(cq));
      
    }
    
    
      //public class Person() {}
      
    private int age;
    private String name;
    private String address;
    private char sex;
    
    public void 0() {
      
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      double s = 0.0, double = 0.0;
      double n = 0.0;
      
      while (true) {
        n = Integer.parseInt(reader.readLine());
        if(n == -1.0) {
          counter = counter==0.0?1:counter;
          break;
        } else {
          counter++;
          s += n;
        }
      }
      
      System.out.println(s/counter);
      
      
    }
    
    //person class
    
    char getSex() {
      return this.sex;
    }
    
    void setSex(char sex) {
      this.sex = sex;
    }
}
