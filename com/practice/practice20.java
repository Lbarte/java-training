package com.practice.app.src.main.java.com.practice;

public class practice20 {
  //method wrapper()
  public static class Human {
    String name;
    boolean sex;
    int age;
    List<Human> children = new ArrayList<Human>(); 
    
    public Human(String name, boolean sex, int age) {
      this.name = name;
      this.sex = sex;
      this.age = age;
    }
    
    public Human(String name, boolean sex, int age, List<Human> children) {
      this.name = name;
      this.sex = sex;
      this.age = age;
      this.children = children;
    }
    
    public String toString() {
      String text = "";
      text += "Name: " + this.name;
      text += ", sex: " + (this.sex ? "male" : "female");
      text += ", age: " + this.age;
         
      int childCount = this.children.size();
      if (childCount > 0) {
        text += ", children: " + this.children.get(0).name;

        for (int i = 1; i < childCount; i++) {
          Human child = this.children.get(i);
          text += ", " + child.name;
        }
      }
      return text;
    }
  }
  
  
  
  //Human cq = new Human("Cq", true, 17);
  //Human cw = new Human("Cw", true, 19);
  //Human ce = new Human("Ce", true, 21);                          
  //Human f = new Human("F", true, 41, Arrays.asList(cq, cw, ce));
  //Human m = new Human("M", false, 38, Arrays.asList(cq, cw, ce));
  //Human gfq = new Human("Gfq", true, 71, Arrays.asList(f));
  //Human gmq = new Human("Gmq", false, 68, Arrays.asList(f));
  //Human gfw = new Human("Gfw", true, 65, Arrays.asList(m));
  //Human gmw = new Human("Gmw", false, 63, Arrays.asList(m));
  System.out.println(cq);                     
  System.out.println(cw);
  System.out.println(ce);
  System.out.println(f);
  System.out.println(m);
  System.out.println(gfq);
  System.out.println(gmq);
  System.out.println(gfw);
  System.out.println(gmw); 
  
  
  
  //method wrapper()
  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  String s = reader.readLine();
  StringBuffer sb = new StringBuffer();
  char[] chars = s.toCharArray();
  for (int i = 0; i < chars.length; i++) {
    char c = (i == 0 || chars[i-1] == ' ') ? Character.toUpperCase(chars[i]) : chars[i];
    sb.append(c);
  }
  System.out.println(sb);
  
  
  //method wrapper()
  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  int N = Integer.parseInt(reader.readLine());
  
  List<Integer> list = new ArrayList<>(N);
  for (int i = 0; i < N; i++) {
    list.add(Integer.parseInt(reader.readLine()));
  }
  
  int min = Collections.min(list);
  
  //method wrapper()
  Map<String, String> map = new HashMap<>();
  for (int i = 0; i < 9; i++) {
    map.put("lastname"+i, "firstname"+i);
  }
  map.put("lastname0", "firstname0");
  
  for(Map.Entry<String, String> pair : map.entrySet()) {
    System.out.println(pair.getKey()+" "+pair.getValue());
  }
  
  //method wrapper()
  public static class Dog {
    
  }
  
  public static class Cat {
    
  }
  
  public HashSet<Dog> createDogs() {
    Set <Dog> dogs = new HashSet<>();
    dogs.add(new Dog());
    dogs.add(new Dog());
    dogs.add(new Dog());
    return dogs;
  }
  
  public HashSet<Cat> createCats() {
    Set <Cat> cats = new HashSet<>();
    cats.add(new Cat());
    cats.add(new Cat());
    cats.add(new Cat());
    cats.add(new Cat());
    return cats;
  } 
  
  public HashSet<Object> join(HashSet<Cat> cats, HashSet<Dog> dogs) {
    HashSet<Object> set = new HashSet<>();
    set.addAll(cats);
    set.addAll(dogs);
    return set;
  }
  
  public HashSet<Object> removeCats(HashSet<Object> set, HashSet<Cat> cats) {
    for(Cat w : cats) {
      set.remove(w);
    }
    return set;
  }
  
  public void printPets(HashSet<Object> set) {
    for (Object w : set) {
      System.out.println(w);
    }
  }
  
  //method wrapper()
  /*public static class Cat {
    
  }*/
  
  /*public HashSet<Cat> createCats() {
    Set <Cat> cats = new HashSet<>();
    cats.add(new Cat());
    cats.add(new Cat());
    cats.add(new Cat());
    return cats;
  }*/
  
  cats.remove(cats.toArray()[0]);
  
  public void printCats(HashSet<Cat> cats) {
    for (Cat w : cats) {
      System.out.println(w);
    }
  }
  
  
  //method wrapper()
  //last name, salary map
  HashMap<String, Integer> map = new HashMap<>();
  for (int i = 0; i < 10; i++) {
    map.add("first"+i, i*100+100);
  }
  
  //remove all with salary below 500
  HashMap<String, Integer> copy = new HashMap<>(map);
  for (Map.Entry<String, Integer> pair : copy.entrySet()) {
    if (pair.getValue() < 500) {
      map.remove(pair.getKey());
    }
  }
  
  
  //method wrapper()
  //last name, first name map
  HashMap<String, String> map = new HashMap<>();
  for (int i = 0; i < 10; i++) {
    map.add("first"+i, "last"+i);
  }
  
  //remove the same first names()
  HashMap<String, String> copy = new HashMap<>(map);
  for (String name : copy.values()) {
    int counter = 0;
    for (String _name : map.values()) {
      if (_name.equals(name)) { counter++; }
      if (counter > 1) {
        removeTheSameFirstName(map, name);
      }
    }
  }
  
  //method wrapper()
  //last name, birth date entries
  HashMap<String, Date> map = new HashMap<>();
  for (int i = 0; i < 10; i++) {
    map.add("last"+i, new Date());
  }
  
  //remove all with summer entries()
  /*
  FOR EVERY ENTRY () {
    IF DATE IS IN SUMMER() {
      REMOVE IT'S ENTRY FROM MAP
    }
  }
  */
  HashMap<String, Date> copy = new HashMap<>(map);
  for (Map.Entry<String, Date> pair : copy.entrySet()) {
    int month = pair.getValue().getMonth();
    
    //month starts counting from 0
    if ((month > 4) && (month < 8)) {
      map.remove(pair.getKey());
    }
  }
  
  //method wrapper()
  //first name, last name map
  HashMap<String, String> map = new HashMap<String, String>();
  for (int i = 0; i < 10; i++) {
    map.add("first"+i, "last"+i);
  }
  
  //number of pairs with the same last name(map, lastname)
  int counter = 0;
  for (String lastNameTemp : map.values()) {
    if (lastNameTemp.equals(lastname)) {
      counter++;
    }
  }
  return counter;
  
  
  //number of pairs with the same first first name(map, firstname)
  //removeTheSameFirstName(HashMap<String, String> map, firstname)
  /*
  INITIALIZE COUNTER
  FOR EVERY MAP ENTRY(){
    IF ENTRY IS THE SAME AS NAME () {
      ADD ONE TO COUNTER
    }
  }
  RETURN COUNTER ()
  */
  int counter = 0;
  for (String firstNameTemp : map.keySet()) {
    if (firstNameTemp.equals(firstname)) {
      counter++;
    }
  }
  return counter;
  
  
  //method wrapper()
  HashSet<Integer> set = new HashSet<>();
  for (int j = 0; j < 20; j++) {
    set.add(j);
  }
  HashSet<Integer> cset = new HashSet<>(set);
  for (Integer w : cset) {
    if (w > 10) {
      set.remove(w);
    }
  }
  
  //method wrapper()
  HashSet<String> set = new HashSet<>();
  for (int j = 0; j < 20; j++) {
    set.add("L"+j);
  }

}
