package com.practice.app.src.main.java.com.practice;

public class practice16 {
  //method wrapper()
  int [] array = new int[20];
  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  for (int i = 0; i < 20; i++) {
    array[i] = Integer.parseInt(reader.readLine());
  }
  Arrays.sort(array);
  for (int i = array.length()-1; i > -1; i--) {
    System.out.println(array[i]);
  }
  
  //method wrapper()
  LinkedList<String> list = new LinkedList<String>();
  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  String temp;
  while(true) {
    temp = reader.readLine();
    if (temp.isEmpty()) {
      break;
    }
    list.add(temp);
  }
  LinkedList<String> listq = new LinkedList<String>();
  for (String w : list) {
    if (w.length%2==0) {
      listq.add(w+" "+w);
    } else {
      listq.add(w+" "+w+" "+w);
    }
  }
  for (String w : listq) {
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
    
    public String toString() {
      return ("Name: "+ name+ ", age: "+ age+ ", weight: "+ weight+ ", tail: "+ tail);
    }
  }
  
   LinkedList<Cat> list = new LinkedList<Cat>();
  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  String name;
  int age, weight, tail;
  while(true) {
    name = reader.readLine();
    if (name.isEmpty()) {
      break;
    }
    age = Integer.parseInt(reader.readLine());
    weight = Integer.parseInt(reader.readLine());
    tail = Integer.parseInt(reader.readLine());
    list.add(new Cat(name, age, weight, tail));
  }
  for (Cat w : list) {
    System.out.println(w);
  }
  
  //method wrapper()
  class Human {
    String name;
    int age;
    boolean sex;
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
        return ("Name: "+ name+ ", sex: "+ (sex?"male":"female")+ ", age: "+ age+ ", no father, no mother");
      } else {
        return ("Name: "+ name+ ", sex: "+ (sex?"male":"female")+ ", age: "+ age+ ", father: "+ father.name+ ", mother: "+ mother.name);
      }
    }
  }
  
  //Human gfq = new Human("Grandfather q", true, 71);
  //Human gmq = new Human("Grandmother q", false, 68);
  //Human gfw = new Human("Grandfather w", true, 65);
  //Human gmw = new Human("Grandmother w", false, 63);
  //Human f = new Human("Father", true, 41, gfq, gmq);
  //Human m = new Human("Mother", false, 38, gfw, gmw);
  //Human cq = new Human("Child q", true, 21, f, m);
  //Human cw = new Human("Child w", true, 18, f, m);
  //Human ce = new Human("Child e", true, 15, f, m);
  System.out.println(gfq);
  System.out.println(gmq);
  System.out.println(gfw);
  System.out.println(gmw);
  System.out.println(f);
  System.out.println(m);
  System.out.println(cq);
  System.out.println(cw);
  System.out.println(ce);
  
  
  //method wrapper()
  for (int i = 30; i > -1; i--) {
    System.out.println(i);
    Thread.sleep(100);
  }
  System.out.println("Boom!");
  
  //method wrapper()
  LinkedList<String> list = new LinkedList<String>();
  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  String temp;
  while(true) {
    temp = reader.readLine();
    if (temp.equals("end")) {
      break;
    }
    list.add(temp);
  }
  for (String w : list) {
    System.out.println(w);
  }
  
  //method wrapper()
  int[] array = new int[20];
  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  for (int i = 0; i < 20; i++) {
    array[i] = Integer.parseInt(reader.readLine());
  }
  int min = array[0], max = min;
  for (int w : array) {
    if (min > w) min = w;
    if (max < w) max = w;
  }
  System.out.println(max + " " + min);
  
  //method wrapper()
  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  int N = Integer.parseInt(reader.readLine());
  int M = Integer.parseInt(reader.readLine());
  ArrayList<String> list = new ArrayList<String>();
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
  for (int i = list.size()-1; i > -1; i--) {
    System.out.println(list.get(i));
  }
  
  //method wrapper()
  Map<String, Integer> map = new HashMap<String, Integer>();
  for(int i = 0; i < 10; i++) {
    map.put("lastname "+i, i*200+100);
  }
  ArrayList<> keys = new ArrayList<>(map.keySet());
  ArrayList<> values = new ArrayList<>(map.values());
  for (int i = 0; i < values.size(); i++) {
    if (values.get(i) < 500) {
      map.remove(keys.get(i));
    }
  }
  

}
