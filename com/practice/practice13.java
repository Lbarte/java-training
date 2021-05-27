package com.practice.app.src.main.java.com.practice;

public class practice13 {
  //method wrapper()
  DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
  HashMap<String, Date> map = new HashMap<String, Date>();
  map.put("Stallone", df.parse("JUNE 1 1980"));
  map.put("Q", df.parse("JANUARY 1 1979"));
  map.put("J", df.parse("AUGUST 1 1987"));
  map.put("M", df.parse("JUNE 31 1990"));
  map.put("K", df.parse("MAY 1 1986"));
  map.put("R", df.parse("APRIL 21 1987"));
  map.put("T", df.parse("FEBRUARY 5 1988"));
  map.put("F", df.parse("SEPTEMBER 1 1989"));
  map.put("S", df.parse("JULY 1 1990"));
  map.put("X", df.parse("DECEMBER 1 1995"));
  
  
  map.entrySet().removeIf(entry -> ((entry.getValue().month() >= 5 ) && (entry.getValue().month() < 8)));
  
  map.entrySet().(entry -> System.out.println(entry));
  
  
  Iterator<String> iterator = map.keySet();
  while(iterator.hasNext()) {
    String temp = iterator.next();
    int month = map.getValue(temp).month();
    if ((month >= 6 ) && (month < 9)) {
      iterator.remove(temp);
    }
  }
  
  
  //method wrapper()
  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  int[] array = new int[20];
  for (int i = 0; i < 20; i++) {
    array[i] = Integer.parseInt(reader.readLine());
  }
  Arrays.sort(array);
  for (int i = array.size()-1; i > -1; i--) {
    System.out.println(array[i]);
  }
  
  //method wrapper()
  ArrayList<String> list = new ArrayList<String>();
  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  String temp;
  while(true) {
    temp = reader.readLine();
    if (temp.isEmpty()) {
      break;
    } else {
      list.add(temp);
    }
  }
  ArrayList<String> listQ = new ArrayList<String>();
  for (String w : list) {
    if (w.length%2==0) {
      listQ.add(w+" "+w);<
    } else {
      listQ.add(w+" "+w+" "+w);
    }
  }
  for (String w : listQ) {
    System.out.println(w);
  }
  
  //method wrapper()
  class Cat {
    String name;
    int age;
    int weight;
    int tail;
    
    public Cat(String name, int age, int weight, int tail) {
      this.name = name;
      this.age = age;
      this.weight = weight;
      this.tail = tail;
    }
  }
  
  BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
  String name;
  int age, weight, tail;
  ArrayList<Cat> cats = new ArrayList<Cat>();
  while(true) {
    name = reader.readLine();
    if (name.isEmpty()) {
      break;
    } else {
    age = Integer.parseInt(reader.readLine());
    weight = Integer.parseInt(reader.readLine());
    tail = Integer.parseInt(reader.readLine());
      cats.add(new Cat(name, age, weight, tail);
    }
  }
  for (Cat w : cats) {
    System.out.println(w);
  }
  
  //method wrapper()
  class Human {
    String name;
    boolean sex;
    int age;
    Human father;
    Human mother;
    
    public Human(String name, boolean sex, int age) {
      this.name = name;
      this.sex = sex;
      this.age = age;
    }
    
    public Human(String name, boolean sex, int age, Human father, Human mother) {
      this.name = name;
      this.sex = sex;
      this.age = age;
      this.father = father;
      this.mother = mother;
    }
    
    public String toString() {
      if (father == null) {
        return ("Name: "+ name +", sex: "+ (sex?"male":"female")+", age: "+age+ ", no father, no mother");
      } else {
        return ("Name: "+ name +", sex: "+ (sex?"male":"female")+", age: "+age+ ", father:"+ father.name+", mother: "+mother.name);
      }
    }
  }
  
  //Human gfQ = new Human ("GFQ", true, 71);
  //Human gmQ = new Human ("GMQ", false, 68);
  //Human gfW = new Human ("GMW", true, 65);
  //Human gmW = new Human ("GMW", false, 62);
  //Human f = new Human ("F", true, 41, gfQ, gmQ);
  //Human m = new Human ("M", false, 38, gfW, gmW);
  //Human cQ = new Human ("CQ", false, 18, f, m);
  //Human cW = new Human ("CW", true, 16, f, m);
  //Human cE = new Human ("CE", false, 14, f, m);
  System.out.println(gfQ);
  System.out.println(gmQ);
  System.out.println(gfW);
  System.out.println(gmW);
  System.out.println(f);
  System.out.println(m);
  System.out.println(cQ);
  System.out.println(cW);
  System.out.println(cE);
  
  //method wrapper()
  for (int i = 30; i > -1; i++) {
    System.out.println(i);
    Thread.sleep(100);
  }
  System.out.println("Boom!");
  
  //method wrapper()
  ArrayList<String> list = new ArrayList<Srring>();
  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  String temp;
  while(true) {
    temp = reader.readLine();
    if (temp.equals("end")) {
      break;
    } else {
      list.add(temp);
    }
  }
  for (String w : list) {
    System.out.println(w);
  }
  
  //method wrapper()
  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  int [] array = new int[20];
  for (int i = 0; i < 20; i++) {
    array[i] = Integer.parseInt(reader.readLine());
  }
  int min = array[0], max = min;
  for (int w : array) {
    if (min > w) {
      min = w;
    }
    if (max < w) {
      max = w;
    }
  }
  System.out.println(max+" "+min);
  
  
  //method wrapper()
  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  int N = Integer.parseInt(reader.readLine());
  int M = Integer.parseInt(reader.readLine());
  ArrayList<String> list = new ArrayList<Srring>();
  for (int i = 0; i < N; i++) {
    list.add(reader.readLine());
  }
  String temp;
  for (int i = 0; i < M; i++) {
    temp = list.get(0);
    list.remove(0);
    list.add(temp);
  }
  for (String w : list) {
    System.out.println(w);
  }
  
  //method wrapper()
  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  ArrayList<Integer> list = new ArrayList<Integer>();
  for (int i = 0; i < 10; i++) {
    list.add(Integer.parseInt(reader.readLine()));
  }
  for (int i = list.size()-1; i > -1; i--){
    System.out.println(list.get(i));
  }
}
