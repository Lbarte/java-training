package com.practice.app.src.main.java.com.practice;

public class practice17 {
  //method wrapper()
  public static class Cat {
    public Cat() {
      
    }
    
  }
  
  public static class Dog {
    public Dog() {
      
    }
    
  }
  
  public static Set<Cat> createCats() {
        HashSet<Cat> result = new HashSet<Cat>();
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        return result;         
    }
    
    public static Set<Dog> createDogs() {
        HashSet<Dog> result = new HashSet<Dog>();
        result.add(new Dog());
        result.add(new Dog());
        result.add(new Dog());
        return result;
    }
    
    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        HashSet<Object> result = new HashSet<Object>();
        result.addAll(cats);
        result.addAll(dogs); 
        return result;
    }
    
    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        for (Cat g : cats) {
          pets.remove(g);
        }
    }
    
    public static void printPets(Set<Object> pets) {
        for(Object w : pets) {
          System.out.println(w);
        }
    }
  
  //method wrapper()
  public static class Cat {
    
    public Cat () {
      
    }
  }
  
  public static Set<Cat> createCats() {
        Set<Cat> cats = new HashSet<Cat>();
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());
        return cats;
    }
    
    Set<Cat> cats = createCats();
    Cat [] catsA = cats.toArray(new Cat[0]);
    cats.remove(catsA[0]);
    printCats(cats);
    
    for(Cat w : cats) {
      System.out.println(w);
    }

}
