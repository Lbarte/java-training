package com.practice;

import java.io.*;

public class Main {
  
    public static void main(String[] args) throws Exception {
      lll();
    }
    
    //throws Exception
    public static void lll() throws Exception {
      BufferedReader reader = new BufferedReader(new InputStreamReader (System.in));
      //System.out.println("point 0");
      int[] ar = new int[5];
      
      for (int i = 0; i < 5; i++) {
        ar[i] = Integer.parseInt(reader.readLine());
      }
      int count = 0, n = 4;
      boolean isChanged = false;
      //System.out.println("initializing done");
      while (true) {
        //System.out.println("new sorting cycle, n = "+n);
        count = n;
        for (int i = 0; i < n; i++) {
          if (ar[count] < ar[i] ) {
              //System.out.println("found new max");
              count = i;
              isChanged = true;
            
          }
        }
        //System.out.println("max is on index "+ count);
        //System.out.println("max found is " + ar[count]);
      //System.out.println("will it be changed? "+isChanged);
        if (isChanged) {
          int b = ar[count];
          ar[count] = ar[n];
          ar[n] = b;
          //System.out.println("new ar[n] is " + ar[n]);
          //System.out.println("new ar[count] is "+ar[count]);
        }
        n--;
        isChanged = false;
        //System.out.println("new n is "+n);
        if (n<0) {
          //System.out.println("breaking out of cyckle, n = "+n);
          break;
        }
      }
      //System.out.println("output");
      for (int i = 0; i < 5; i++) {
        System.out.println(ar[i]);
      }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandfatherName = reader.readLine();
        Cat catGrandfather = new Cat(grandfatherName);
        
        String grandmotherName = reader.readLine();
        Cat catGrandmother = new Cat(grandmotherName);
        
        String fatherName = reader.readLine();
        Cat catFather = new Cat(catGrandfather, fatherName);
        
        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catGrandmother);
        
        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catFather, catMother);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catFather, catMother);

        System.out.println(catGrandfather);
        System.out.println(catGrandmother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat father;
        private Cat mother;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat father, Cat mother) {
            this.name = name;
            this.father = father;
            this.mother = mother;
        }
        
        Cat(Cat father, String name) {
          this.name = name;
          this.father = father;
        }
        
        Cat(String name, Cat mother) {
          this.name = name;
          this.mother = mother;
        }

        @Override
        public String toString() {
            if (mother == null) {
              if (father == null) {
                return "The cat's name is " + name + ", no mother, no father ";
              } else {
                return "The cat's name is " + name + ", no mother, " + father.name + " is the father";
              }
            } else if (father == null){
              return "The cat's name is " + name + ", " + mother.name + " is the mother, no father";
            } else {
              return "The cat's name is " + name + ", " + mother.name + "is the mother, " + father.name + " is the father";
            }
        }
    }
    
    public static String name;
    
    public static class KissMyShinyMetalRearActuator{
      
    }
    
    KissMyShinyMetalRearActuator k = new KissMyShinyMetalRearActuator();
    System.out.println(k);
    
    public static class Idea{
      public String getDescription() {
        return "descr";
      }
    }
    
    static public void printIdea(Idea i) {
      System.out.println( i.getDescription());
    }
    
    public class Cat{
      public static ArrayList<Cat> cats = new ArrayList<Cat>();
      
      public Cat() {
        //cats.add(this);
      }
      
      public static void printCats() {
        Iterator<Cat> iterator = cats.iterator();
        while (iterator.hasNext()) {
          System.out.println(iterator.next());
        }
      }
      
      cats.add(cq);
      cats.add(cw);
      cats.add(ce);
      cats.add(cr);
      cats.add(ct);
      cats.add(cy);
      cats.add(ca);
      cats.add(cs);
      cats.add(cd);
      cats.add(cf);
    }
    
    public class Cat{
      public static int catCount;
      
      public Cat() {
        catCount++;
      }
    }
    
    Cat cq = new Cat();
    Cat cw = new Cat();
    Cat ce = new Cat();
    Cat cr = new Cat();
    Cat ct = new Cat();
    Cat cy = new Cat();
    Cat ca = new Cat();
    Cat cs = new Cat();
    Cat cd = new Cat();
    Cat cf = new Cat();
    
    System.out.println(Cat.catCount);
    
    public static int plus(int a, int b) {
      return a+b;
    }
    
    public static int minus(int a, int b) {
      return a-b;
    }
    
    public static int multiply(int a, int b) {
      return a*b;
    }
    
    public static double divide(int a, int b) {
      return (double)a/b;
    }
    
    public static double percent(int a, int b) {
      return (double)a*b*0.01;
    }
    
    public static String multiply(String s, int n) {
      String r = "";
      for (int i = 0; i < n; i++) {
        r += s;
      }
      return r;
    }
    
    public static String multiply(String s) {
      String r = "";
      for (int n = 0; n < 5; n++) {
        r += s;
      }
      return r;
    }
}
