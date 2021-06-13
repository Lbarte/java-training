package com.practice.app.src.main.java.com.practice;

public class practice25 {
  
  //task wrapper()
  ArrayList<String> months = new ArrayList<>();
  months.add("January");
  months.add("February");
  months.add("March");
  months.add("April");
  months.add("May");
  months.add("June");
  months.add("July");
  months.add("August");
  months.add("September");
  months.add("October");
  months.add("November");
  months.add("December");
  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  month = reader.readLine();
  for (int i = 0; i < months.size(); i++) {
    String w = months.get(i);
    if (w.equals(month)) {
      System.out.println(month+ " is month "+ (i+1));
    }
  }
  
  //task wrapper()
  public static boolean isDateOdd(String date) {
    Date d1 = new Date(date);
    Date d2 = new Date(date);
    d2.setMonth(0);
    d2.setDate(1);
    long diff = d1.getTime() - d2.getTime();
    long days = diff / (24*60*60*1000);
    return (days%2==0)
  }
  
  
  //task wrapper()
  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  int [] array = new int[20];
  for (int i = 0; i < array.length; i++) {
    array[i] = Integer.parseInt(reader.readLine());
  }
  for (int i = 0; i < array.length; i++) {
    for (int j = i; j < array.length; j++) {
      if (array[i] < array[j]) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
      }
    }
  }
  for (int i = 0; i < 5; i++) {
    System.out.println(array[i]);
  }
  
  //task wrapper()
  public static class Human{
    String name;
    boolean sex;
    int age;
    ArrayList<Human> children;
    
    public Human(String name, boolean sex, int age) {
      this.name = name;
      this.sex = sex;
      this.age = age;
    }
    
    public Human(String name, boolean sex, int age, Human... children) {
      this.name = name;
      this.sex = sex;
      this.age = age;
      Collections.addAll(this.children, children);
    }
    
    public String toString() {
      String result = new String();
      result = "Name: "+ name+ ", sex: "+ (sex?"male":"female")+ ", age: "+ age;
      int childrenCount = this.children.size();
      if (childrenCount > 0) {
        result += "children: "+ this.children.get(0);
        for (int i = 1; i < this.children.size(); i++) {
          result += ", " this.children.get(i).name;
        }
      }
      return result;
    }
  }
  
  //Human cq = new Human("cq", true, 15);
  //Human cw = new Human("cw", true, 17);
  //Human ce = new Human("ce", true, 21);
  //Human f = new Human("f", true, 41, cq, cw, ce);
  //Human m = new Human("m", false, 38, cq, cw, ce);
  //Human gfq = new Human("gfq", true, 71, f);
  //Human gmq = new Human("gmq", false, 68, f);
  //Human gfw = new Human("gfq", true, 65, m);
  //Human gmw = new Human("gmw", false, 63, m);
  System.out.println(cq);
  System.out.println(cw);
  System.out.println(ce);
  System.out.println(f);
  System.out.println(m);
  System.out.println(gfq);
  System.out.println(gmq);
  System.out.println(gfw);
  System.out.println(gmw);
  
  //task wrapper()
  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  String line = reader.readLine();
  StringBuffer sb = new StringBuffer();
  char[] chars ,= line.toCharArray();
  for (int i = 0; i < chars.length; i++) {
    char c = (i == 0 || chars[i-1] == ' ') ? (Character.toUpperCase(chars[i])) : chars[i];
    sb.append(c);
  }
  System.out.println(sb);
  
  //task wrapper()
  ArrayList<Integer> list = getIntegerList();
  System.out.println(getMinimum(list));
  
  public static List<Integer> getIntegetList() throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(reader.readLine());
    List<Integer> list = new ArrayList<Integer>(n);
    for (int i = 0; i < n; i++) {
      list.add(Integer.parseInt(reader.readLine()));
    }
    return list;
  }
  
  public static Integer getMinimum(List<Integer> list) {
    Integer w = list.get(0), min = w;
    for (int i = 1; i < list.size(); i++) {
      if (min > w) {
        min = w;
      }
    }
    return min;
  }
  
  //task wrapper()
  HashMap<String, String> map = new HashMap<String, String>();
  for (int i = 0; i < 8; i++) {
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
    HashSet<Dog> dogs = new HashSet<Dog>();
    dogs.add(new Dog());
    dogs.add(new Dog());
    dogs.add(new Dog());
    return dogs;
  }
  
  public static Set join(Set<Cat> cats, Set<Dog> dogs) {
    HashSet<Object> pets = new HashSet<Object>();
    pets.addAll(cats);
    pets.addAll(dogs);
    return pets;
  }
  
  public static Set removeCats(Set pets) {
    Set copy = new Set(pets);
    for (Object w : copy) {
      if (w.instanceOf(Cat)) {
        pets.remove(w);
      }
    }
    return pets;
  }
  
  Set<Cat> cats = createCats();
  Set<Dog> dogs = createDogs();
  Set pets = join(cats, dogs);
  pets = removeCats(pets);
  printPets(pets);
  
  public static void printPets(Set pets) {
    for (Object w : pets) {
      System.out.println(pets);
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
