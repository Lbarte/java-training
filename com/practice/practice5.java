package com.practice.app.src.main.java.com.practice;

public class practice5 {
    public static void main(String[] args) {
      
    }
    
    //method wrapper()
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int[] ar = new int[5];
    for(int i = 0; i < 5; i++) {
      ar[i] = Integer.parseInt(reader.readLine());
    }
    int max, maxInd;
    for (int i = 5; i > 0; i--) {
      max = ar[i];
      maxInd = i;
      for (int j = 0; j < i; j++) {
        if (max < ar[j]) {
          max = ar[j];
          maxInd = j;
        }
      }
      ar[maxInd] = ar[i];
      ar[i] = max;
    }
    for (int j = 0; j < 5; j++) {
      System.out.println(ar[j]);
    }
    
    //method wrapper()
    class Cat {
      public String name;
      public Cat mother;
      public Cat father;
      
      public Cat(String name, Cat mother, Cat father) {
        if !(name.equals(null)) {
          this.name = name;
        }
        if !(mother == null) {
          this.mother = mother;
        }
        if !(father == null) {
          this.father = father;
        }
      }
      
      public void printCat() {
        if (mother == null) {
          if (father == null) {
            System.out.println("The cat's name is "+name+", no mother, no father");
          } else {
            System.out.println("The cat's name is "+name+", no mother, "+father.name+" is the father");
          }
        } else if (father == null) {
          System.out.println("The cat's name is "+name+", "+mother.name+" is the mother, no father");
        } else {
          System.out.println("The cat's name is "+name+", "+mother.name+" is the mother, "+father.name+" is the father");
        }
      }
    }
    
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
    Cat grandfather = new Cat(reader.readLine(), null, null);
    Cat grandmother = new Cat(reader.readLine(), null, null);
    Cat father = new Cat(reader.readLine(), null, grandfather);
    Cat mother = new Cat(reader.readLine(), grandmother, null);
    Cat son = new Cat(reader.readLine(), mother, father);
    Cat daughter = new Cat(reader.readLine(), mother, father);
    
    grandfather.printCat();
    grandMother.printCat();
    father.printCat();
    mother.printCat();
    son.printCat();
    daughter.printCat();
    
    
    //method wrapper()
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int first = Integer.parseInt(reader.readLine());
    int second = Integer.parseInt(reader.readLine());
    if(first > second) {
      System.out.println("The max is "+first);
    } else if (second > first) {
      System.out.println("The max is "+second);
    }
    
    //method wrapper()
    class KissMyShinyMetalRearActuator {
      
    }
    
    KissMyShinyMetalRearActuator kmsmra = new KissMyShinyMetalRearActuator();
    System.out.println(kmsmra);
    
    //method wrapper()
    class Cat {
      public static ArrayList<Cat> cats = new ArrayList<Cat>();
      
    }
    
    Cat cqq = new Cat();
    Cat cqw = new Cat();
    Cat cqe = new Cat();
    Cat cqr = new Cat();
    Cat cqt = new Cat();
    Cat cqy = new Cat();
    Cat cqa = new Cat();
    Cat cqs = new Cat();
    Cat cqd = new Cat();
    Cat cqf = new Cat();
    cats.add(cqq);
    cats.add(cqw);
    cats.add(cqe);
    cats.add(cqr);
    cats.add(cqt);
    cats.add(cqy);
    cats.add(cqa);
    cats.add(cqs);
    cats.add(cqd);
    cats.add(cfq);
    
    public void printCats() {
      ListIterator iterator = cats.listIterator();
      while(iterator.hasNext()) {
        System.out.println(iterator.next());
      }
    }
    
    //method wrapper()
    printIdea(new Idea());
    
    public static class Idea() {
      public String getDescription() {
        return "non-empty string :D"
      }
      
      public static void printIdea(Idea idea) {
        System.out.println(idea.getDescription());
      }
    }
    
    //method wrapper()
    public static int catCount;
    
    public Cat() {
      catCount++;
    }
    
    Cat cqq = new Cat();
    Cat cqw = new Cat();
    Cat cqe = new Cat();
    Cat cqr = new Cat();
    Cat cqt = new Cat();
    Cat cqy = new Cat();
    Cat cqa = new Cat();
    Cat cqs = new Cat();
    Cat cqd = new Cat();
    Cat cqf = new Cat();
    
    System.out.println(Cat.catCount);
    
    //method wrapper()
    ArrayList<String> ar = new ArrayList<String>();
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    for (int i = 0; i < 5; i++) {
      ar.add(reader.readLine());
    }
    String bufferS;
    for (int i = 0; i < 13; i++) {
      bufferS = ar.get(4);
      ar.remove(4);
      ar.add(0, bufferS);
    }
    for (int i = 0; i < 5; i++) {
      System.out.println(ar.get(i));
    }
}
