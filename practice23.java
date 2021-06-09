package com.practice.app.src.main.java.com.practice;

public class practice23 {
  
  //task wrapper()
  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  String[] list = new String[20];
  for (int i = 0; i < 20; i++) {
    list [i] = reader.readLine();
  }
  Arrays.sort(list);
  for (String w : list) {
    System.out.println(w);
  }
  
  //using boolean isGreaterThan(String l1, String l2)
  //lexicography checker()
  BufferedReader //... list values obtained()
  //sorting()
  String [] newList = new String[20];
  for (int i = 0; i < list.size(); i++) {
    for (int j = i; j < list.sise(); j++) {
      if (isGreaterThan(list[i], list[j])) {
        String temp = list[i];
        list[i] = list[j];
        list[j] = temp;
      }
    }
  }
  for (String w : list) {
    System.out.println(w);
  }
  
  //task wrapper()
  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  HashMap <String, String> map = new HashMap<>();
  while (true) {
    String city = reader.readLine();
    if (line.isEmpty()) break;
    map.put(city, reader.readLine());
  }
  String city = reader.readLine();
  if (map.containsKey(city)) {
    System.out.println(map.get(city));
  }
  
  //task wrapper()
  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  int month = Integer.parseInt(reader.readLine());
  String result;
  switch (month) {
  case 1: 
    result = "January";
    break;
  case 2: 
    result = "February";
    break;
  case 3: 
    result = "March";
    break;
  case 4: 
    result = "April";
    break;
  case 5: 
    result = "May";
    break;
  case 6: 
    result = "June";
    break;
  case 7: 
    result = "July";
    break;
  case 8: 
    result = "August";
    break;
  case 9: 
    result = "September";
    break;
  case 10: 
    result = "October";
    break;
  case 11: 
    result = "November";
    break;
  case 12: 
    result = "December";
    break;
  }
  System.out.println(result+ " is month "+ month);
  
  //task wrapper(String date)
  Date d1 = new Date(date);
  Date d2 = new Date(date);
  d2.setMonth(0);
  d2.setDate(1);
  long diff = d1.getTime() - d2.getTime();
  long divider = 24*60*60*100;
  long days = diff/divider;
  if (days % 2 == 0) {
    return true;
  } else {
    return false;
  }
  
  //task wrapper()
  int [] array = new int [20];
  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  for (int i = 0; i < 20; i++) {
    array[i] = Integer.parseInt(reader.readLine());
  }
  Arrays.sort(array);
  for (int i = array.length-1; i > array
length-6; i--) {
    System.out.println(array[i]);
  }
  
  //task wrapper()
  public static class Human {
    String name;
    boolean sex;
    int age;
    List<Human> children;
    
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
    
    public void toString() {
      String result = "Name: "+ name+ ", sex: "+ (sex?"male":"female")+ ", age: "+ age;
      if (children = null) {
        return result;
      } else {
        result += ", children: ";
        for (int i = 0; i < children.size(); i++) {
          result += (i+1 < children.size()) ? (children.name+ ", ") : (children.name);
        }
      }
      return result;
    }
  }
  
  //Human cq = new Human("CQ", true, 11);
  //Human cw = new Human("CW", true, 13);
  //Human ce = new Human("CE", true, 15);
  //Human f = new Human("F", true, 41, cq, cw, ce);
  //Human m = new Human("M", false, 38, cq, cw, ce);
  //Human gfq = new Human("GFQ", true, 71, f);
  //Human gmq = new Human("GMQ", false, 68, f);
  //Human gfw = new Human("GFW", true, 65, m);
  //Human gmw = new Human("GMW", false, 63, m);
  System.out.println(gfq);
  System.out.println(gmq);
  System.out.println(gfw);
  System.out.println(gmw);
  System.out.println(f);
  System.out.println(m);
  System.out.println(cq);
  System.out.println(cw);
  System.out.println(ce);
  
  //task wrapper()
  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  String line = reader.readLine();
  char[] chars = line.toCharArray();
  StringBuffer sb = new StringBuffer();
  for (int i = 0; i < chars.length; i++) {
    sb.append( ( i == 0 || chars[i-1] == ' ') ? Character.toUpperCase(chars[i]) : chars[i]);
  }
  System.out.println(sb);
  
  //task wrapper()
  
  List<Integer> list = getIntegerList();
  System.out.println(getMinimum(list));
  
  
  public static List<Integer> getIntegerList() throws IOException{
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  int N = Integer.parseInt(reader.readLine());
  ArrayList<Integer> list = new ArrayList<Integer>();
    for (int i = 0; i < N; i++) {
      list.add(Integer.parseInt(reader.readLine()));
    }
    return list;
  }
  
  public static Integer getMinimum(List<Integer> list) {
    ArrayList<Integer> alist = new ArrayList<Integer>(list);
    Integer min = alist.get(0);
    for (int i = 1; i < alist.size(); i++) {
      Integer w = alist.get(i);
      if (min > w) {
        min = w;
      }
    }
    return min;
  }
  
  //task wrapper()
  //lastname, firstname map
  HashMap<String, String> map = new HashMap<String, String>();
  for(int i = 0; i < 9; i++) {
    map.add("lastname"+i, "firstname"+i);
  }
  map.add("lastname"+0, "firstname");
  for (Map.Entry<String, String> pair : map.entrySet()) {
    System.out.println(pair.getKey()+" - "+pair.getValue());
  }
  
  //task wrapper()
  public static class Cat {}
  
  public static class Dog {}
  
  public static Set<Cat> createCats() {
    HashSet<Cat> set = new HashSet<Cat>();
    set.add(new Cat());
    set.add(new Cat());
    set.add(new Cat());
    set.add(new Cat());
    return set;
  }
  
  public static Set<Dog> createDogs() {
    HashSet<Dog> set = new HashSet<Dog>();
    set.add(new Dog());
    set.add(new Dog());
    set.add(new Dog());
    return set;
  }
  
  public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
    Set<Object> set = new Set<Object>();
    set.addAll(cats);
    set.addAll(dogs);
    return set;
  }
  
  public static Set<Object> removeCats(Set<Object> pets, Set<Cat> cats) {
    pets.removeAll(cats);
    return pets;
  }
  
  public static void printPets(Set<Object> pets) {
    for (Object w : pets) {
      System.out.println(w);
    }
  }
  
  Set<Cat> cats = createCats();
  Set<Dog> dogs = createDogs();
  Set<Object> pets = join(cats, dogs);
  printPets(pets);
  pets = removeCats(pets, cats);
  printPets(pets);
  
  //task wrapper()
  public static Cat {
    
  }
  
  public static Set<Cat> createCats() {
    HashSet<Cat> set = new HashSet<Cat>();
    set.add(new Cat());
    set.add(new Cat());
    set.add(new Cat());
    return set;
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
