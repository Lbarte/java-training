package com.practice.app.src.main.java.com.practice;

public class practice30 {
  
  //task wrapper()
  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  String line = reader.readLine();
  StringBuffer sb = new StringBuffer();
  char charArray [] = line.toCharArray();
  for (int i = 0; i < charArray.length; i++) {
    char c = (i == 0 || charArray[i-1] == ' ')? Character.toUpperCase(charArray[i]): charArray[i];
    sb.append(c);
  }
  System.out.println(sb);
  
  //task wrapper()
  public static List<Integer> getIntegerList() throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(reader.readLine());
    ArrayList<Integer> list = new ArrayList<Integer>();
    for (int i = 0; i < n; i++) {
      list.add(Integer.parseInt(reader.readLine()));
    }
    return list;
  }
  
  public static Integer getMinimum(List<Integer> list) {
    Integer min = list.get(0);
    for (int i = 1; i < list.size(); i++) {
      Integer w = list.get(i);
      if (min > w) {
        min = w;
      }
    }
    return min;
  }
  
  List<Integer> list = getIntegerList();
  System.out.println(getMinimum(list));
  
  //task wrapper()
  HashMap<String, String> map = new HashMap<String, String>();
  for(int i = 0; i < 8; i++) {
    map.put("lastname"+i, "firstname"+i);
  }
  map.put("lastname0", "firstname");
  map.put("lastname", "firstname1");
  for (Map.Entry<String, String> pair : map.entrySet()) {
    System.out.println(pair.getKey()+ " "+ pair.getValue());
  }
  
  //task wrapper()
  public static class Cat{
    public Cat() {}
  }
  
  public static class Dog{
    public Dog() {}
  }
  
  public static Set<Cat> createCats() {
    HashSet<Cat> cats = new HashSet<Cat>();
    cats.add(new Cat());
    cats.add(new Cat());
   cats.add(new Cat()); 
    cats.add(new Cat());
    return cats;
  }
  
 public static Set<Dog> createDogs() {
    HashSet<Sog> dogs = new HashSet<Dog>();
    dogs.add(new Dog());
    dogs.add(new Dog());
    dogs.add(new Dog());
    return dogs;
  } 
  
  public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
    HashSet pets = new HashSet();
    pets.addAll(cats);
    pets.addAll(dogs);
    return pets;
  }
  
  publci static Set<Object> removeCats(Set<Object> pets) {
    HashSet copy = new HashSet(pets);
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
  
  Set<Cat> cats = createCats();
  Set<Dog> dogs = createDogs();
  Set<Object> pets = join(cate, dogs);
  printPets(pets);
  pets = removeCats(pets);
  printPets(pets);
  
  //task wrapper()
  public static class Cat{
    public Cat() {}
  }
  
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
    for (Cat cat : cats) {
      System.out.println(cat);
    }
  }

}
