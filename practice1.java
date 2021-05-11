package com.practice;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;


public class practice1 {
    //n numbers()
    
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(reader.readLine());
        if (n > 0) {
          int max = Integer.parseInt(reader.readLine());
          for(int i = 0; i < n-1; i++) {
          int nq = Integer.parseInt(reader.readLine());
          max = nq > max ? nq : max;
        }

        System.out.println(max);
        }
        
        
    //old code, new requirements
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int q = Integer.parseInt(reader.readLine());

        int minimum = min(a,b,c,d,q); 

        System.out.println("Minimum = " + minimum);
    }


    public static int min(int a, int b, int c, int d, int q) {
        int mq = a < b ? a : b;
        int mw = c < d ? c : d;
        int me = mq < mw ? mq : mw;
        return me < q ? me : q;
    }
    
    //sum() {}
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      int sum = 0;
      String ns;
      while (true) {
        ns = reader.readLine();
        if (ns.equals("sum")) {
          break;
        } else {
          sum += Integer.parseInt(ns);
        }
      }
      System.out.println(sum);

    //current date()
    //import java.util.* and java.text.*
    Date date = new Date();
    SimpleDateFormat formatter = new SimpleDateFormat("MM dd yyyy");
    System.out.println(formatter.format(date));
    
    //classes Dog, Cat and Mouse{}
    public static class Dog {
      public String name, address;
      public int age;
      
      public Dog(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
      }
    }
    
    public static class Cat {
      public String name, address;
      public int age;
      
      public Cat(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
      }
    }
    
    Dog d = new Dog("x",1,"x");
    Cat c = new Cat("x",2,"x");
    
    //classes Man and Woman {}
    public static class Man {
      public String name, address;
      public int age;
      
      public Man() {
        name = "x";
        address = "x";
        age = 1;
      }
      
      public Man(String name) {
        this.name = name;
        address = "x";
        age = 1;
      }
      
      public Man(String name, int age) {
        this.name = name;
        this.age = age;
        address = "x";
      }
      
      public Man (String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
      }
      
      public String toString() {
        return name;
      }
    }
    
    public static class Woman {
      public String name, address;
      public int age;
      
      public Woman() {
        name = "x";
        address = "x";
        age = 1;
      }
      
      public Woman(String name) {
        this.name = name;
        address = "x";
        age = 1;
      }
      
      public Woman(String name, int age) {
        this.name = name;
        this.age = age;
        address = "x";
      }
      
      public Woman (String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
      }
      
      public String toString() {
        return name;
      }
    }
    
    Man mq = new Man("x",21,"x");
    Man mw = new Man("x",22,"x");
    Woman wq = new Woman("c",21,"c");
    Woman ww = new Woman("c",21,"c");
    System.out.println(mq.name+" "+mq.age+" "+mq.address);
    System.out.println(mw.name+" "+mw.age+" "+mq.address);
    System.out.println(ww.name+" "+ww.age+" "+ww.address);
    System.out.println(wq.name+" "+wq.age+" "+wq.address);
    
    //class Duck {} super
    public static class Dog extends Duck {
      public String toString() {
        return "Dog";
      }
    }
    
    public static class Cat extends Duck {
      public String toString() {
        return "Cat";
      }
    }
    
    Dog dq = new Dog();
    Dog dw = new Dog();
    Cat cq = new Cat();
    Cat cw = new Cat();
    System.out.println(dq);
    System.out.println(dw);
    System.out.println(cq);
    System.out.println(cw);
    
    //class Circle() {}
    public int centerX, centerY, radius, width, color;
    
    public void initialize(int centerX, int centerY, int radius) {
      this.centerX = centerX;
      this.centerY = centerY;
      this.radius = radius;
    }
    
    public void initialize(int centerX, int centerY, int radius, int width) {
      this.centerX = centerX;
      this.centerY = centerY;
      this.radius = radius;
      this.width = width;
    }
    
    public void initialize(int centerX, int centerY, int radius, int width, int color) {
      this.centerX = centerX;
      this.centerY = centerY;
      this.radius = radius;
      this.width = width;
      this.color = color;
    }
    
    //class Rectangle() {}
    public int left, top, width, height;
    
    public void initialize(int left, int top) {
      this.left = left;
      this.top = top;
    }
    
    public void initialize(int left, int top, int width, int height) {
      this.left = left;
      this.top = top;
      this.width = width;
      this.height = height;
    }
    
    public void initialize(int left, int top, int height) {
      this.left = left;
      this.top = top;
      this.height = height;
    }
    
    public void initialize(Rectangle r) {
      this.left = r.left;
      this.top = r.top;
      this.width = r.width;
      this.height = r.height;
    }
    
    //class Person() {}
    public String name;
    public int age;
    
    public void initialize(String name, int age) {
      this.name = name;
      this.age = age;
    }
    
    Person person = new Person();
    person.initialize("pers", 21);
    
    //class Friend() {}
    public String name;
    public int age;
    public char sex;
    
    public Friend(String name) {
      this.name = name;
    }
    
    public Friend(String name, int age) {
      this.name = name;
      this.age = age;
    }
    
    public Friend(String name, int age, char sex) {
      this.name = name;
      this.age = age;
      this.sex = sex;
    }
    
    //class Cat() {}
    public String name, address, color;
    public int weight, age;
    
    public Cat(String name) {
      this.name = name;
      this.weight = 1;
      this.age = 1;
      this.color = ",,";
    }
    
    public Cat(String name, int weight, int age) {
      this.name = name;
      this.weight = weight;
      this.age = age;
      this.color = ",,";
    }
    
    public Cat(String name, int age) {
      this.name = name;
      this.age = age;
      this.weight = 1;
      this.color = ",,";
    }
    
    public Cat(int weight, String color) {
      this.weight = weight;
      this.color = color;
      this.age = 1;
    }
    
    public Cat(int weight, String color, String address) {
      this.weight = weight;
      this.color = color;
      this.address = address;
      this.age = 1;
    }
    
    //class Dog() {}
    public String name, color;
    public int height;
    
    public Dog(String name) {
      this.name = name;
    }
    
    public Dog(String name, int height) {
      this.name = name;
      this.height = height;
    }
    
    public Dog(String name, int height, String color) {
      this.name = name;
      this.height = height;
      this.color = color;
    }
    
    //class Circle() {}
    public int centerX, centerY, radius, width, color;
    
    public Circle(int centerX, int centerY, int radius) {
      this.centerX = centerX;
      this.centerY = centerY;
      this.radius = radius;
    }
    
    public Circle(int centerX, int centerY, int radius, int width) {
      this.centerX = centerX;
      this.centerY = centerY;
      this.radius = radius;
      this.width = width;
    }
    
    public Circle(int centerX, int centerY, int radius, int width, int color) {
      this.centerX = centerX;
      this.centerY = centerY;
      this.radius = radius;
      this.width = width;
      this.color = color;
    }
    
    //class Rectangle() {}
    public int left, top, width, height;
    
    public Rectangle(int left, int top) {
      this.left = left;
      this.top = top;
    }
    
    public Rectangle(int left, int top, int width, int height) {
      this.left = left;
      this.top = top;
      this.width = width;
      this.height = height;
    }
    
    public Rectangle(int left, int top, int height) {
      this.left = left;
      this.top = top;
      this.height = height;
    }
    
    public Rectangle(Rectangle r) {
      this.left = r.left;
      this.top = r.top;
      this.width = r.width;
      this.height = r.height;
    }
    
    //class Circle() {}
    public Circle (double x) {
      this.x = x;
      this.y = 5;
      this.radius = 10;
    }
    
    public Circle (double x, double y) {
      this.x = x;
      this.y = y;
      this.radius = 10;
    }
    
    public Circle (double x, double y, double radius) {
      this.x = x;
      this.y = y;
      this.radius = radius;
    }
    
    public Circle (Circle c) {
      this.x = c.x;
      this.y = c.y;
      this.radius = c.radius;
    }
    
    public Circle() {
      this.x = 5;
      this.y = 5;
      this.radius = 10;
    }
}
