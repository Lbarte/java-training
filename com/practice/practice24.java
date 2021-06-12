package com.practice.app.src.main.java.com.practice;

public class practice24 {
  
  //task wrapper()
  List<Integer> list = getIntegerList();
  System.out.println(getMinimum(list));
  
  public static Integer getMinimum(List<Integer> list) {
    Integer min = list.get(0);
    for (int i = 0; i < list.size(); i++) {
      Integer w = list.get(i);
      if (min > w) {
        min = w;
      }
    }
    return min;
  }
  
  public static List<String> getIntegerList() {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(reader.readLine());
    ArrayList<Integer> list = new ArrayList<String>();
    for (int i = 0; i < n; i++) {
      list.add(Integer.parseInt(reader.readLine()));
    }
    return list;
  }
  
  
  //task wrapper()
  HashMap<String, String> map = new HashMap<String, String>();
  for (int i = 0; i < 8; i++) {
    map.add("lastname"+i, "firstname"+i);
  }
  map.add("lastname0", "firstname");
  map.add("lastname", "firstname1");
  for (Map.Entry<String, String> pair : map.entrySet()) {
    System.out.println(pair.getKey()+ " "+ pair.getValue());
  }
  
  //task wrapper()
  public static class Cat{}
  
  public static class Dog{}
  
  public static Set<Cat> createCats() {
    HashSet<Cat> cats = new HashSet<Cat>();
    cats.add(new Cat());
    cats.add(new Cat());
    cats.add(new Cat());
    cats.add(new Cat());
    return cats;
  }
  
  public static Set<Dog> createDogs() {
    HashSet<Dog> dogs = new HashSet<Dog>();
    dogs.add(new Dog());
    dogs.add(new Dog());
    dogs.add(new Dog());
    return dogs;
  }
  
  public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
    HashSet result = new HashSet();
    result.addAll(dogs);
    result.addAll(cats);
    return result;
  }
  
  public static Set<Object> removeCats(Set<Object> pets) {
    Set<Object> copy = new Set<Object>(pets);
    for (Object w : copy) {
      if (w.instanceOf(Cat)) {
        pets.remove(w);
      }
    }
    return pets;
  }
  
  public static void printPets(Set<Object> pets) {
    for (Object w : pets) {
      System.out.println(w);
    }
  }
  
  //task wrapper()
  public static class Cat{}
  
  public static Set<Cat> createCats() {
    HashSet<Cat> cats = new HashSet<Cat>();
    cats.add(new Cat());
    cats.add(new Cat());
    cats.add(new Cat());
    return cats;
  }
  
  Set<Cat> cats = createCats();
  cats.remove(cats.toArray()[0]);
  printCats(cats);
  
  public static void printCats(Set<Cat> cats) {
    for (Cat w : cats) {
      System.out.println(w);
    }
  }
  

}
