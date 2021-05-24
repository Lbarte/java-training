package com.practice.app.src.main.java.com.practice;

public class practice11 {
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
  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  ArrayList<String> list = new ArrayList<String>();
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
      listQ.add(w+" "+w);
    } else {
      listQ.add(w+" "+w+" "+w);
    }
  }
  for (String w : list) {
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
  
  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  LinkedList<Cat> list = new LinkedList<Cat>();
  String name;
  int age, weight, tail;
  while(true) {
    name = reader.readLine();
    if (name.isEmpty()) {
      break;
    } else {
      age = Integer.parseInt(reader.readLine());
      weight = Integer.parseInt(reader.readLine());
      tail = Integer.parseInt(reader.readLine());
      list.add(new Cat(name, age, weight, tail));
    }
  }
  for (Cat w : list) {
    System.out.println(w);
  }
  
  //method wrapper()
  class Human {
    String name;
    boolean sex;
    int age;
    Human father;
    Human mother;
    
    public Human (String name, boolean sex, int age) {
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
        return ("Name: "+name+", sex: "+(sex?"male":"female")+", age: "+age+", no father, no mother");
      } else {
        return ("Name: "+name+", sex: "+(sex?"male":"female")+", age: "+age+", father: "+ father.name+", mother:"+ mother.name);
      }
    }
    
    //Human gfQ = new Human("Grandfather Q", true, 72);
    //Human gfW = new Human("Grandfather W", true, 68);
    //Human gmQ = new Human("Grandmother Q", false, 69);
    //Human gmW = new Human("Grandmother W", false, 65);
    //Human f = new Human("Father", true, 45, gfQ, gmQ);
    //Human m = new Human("Mother", false, 41, gfW, gmW);
    //Human cQ = new Human("Children Q", true, 25, f, m);
    //Human cW = new Human("Children W", true, 21, f, m);
    //Human cE = new Human("Children E", false, 18, f, m);
    System.out.println(gfQ);
    System.out.println(gmQ);
    System.out.println(gfW);
    System.out.println(gmW);
    System.out.println(f);
    System.out.println(m);
    System.out.println(cQ);
    System.out.println(cW);
    System.out.println(cE);
  }
  
  
  
  //method wrapper()
  for (int i = 0; i < 31; i++) {
    System.out.println(30-i);
    Thread.sleep(100);
  }
  System.out.println("Boom!");
  
  
  //method wrapper()
  ArrayList<String> list = new ArrayList<String>();
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
  int[] array = new int[20];
  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
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
  ArrayList<Integer> list = new ArrayList<Integer>();
  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  for (int i = 0; i < 10; i++) {
    list.add(Integer.parseInt(reader.readLine()));
  }
  for (int i = list.size()-1; i > -1; i--) {
    System.out.println(list.get(i));
  }
  
  //method wrapper()
  ArrayList<Integer> list = new ArrayList<Integer>();
  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  for (int i = 0; i < 10; i++) {
    list.add(Integer.parseInt(reader.readLine()));
  }
  LinkedList<Integer> listQ = new LinkedList<Integer>();
  int counter=0, temp=list.get(0);
  for (int i = 1; i < list.size(); i++) {
    if (temp == list.get(i)) {
      counter++;
    } else {
      listQ.add(counter);
      counter = 0;
    }
  }
  listQ.add(counter);
  int max = 0;
  for (Integer w : listQ) {
    if (max < w) {
      max = w;
    }
  }
  System.out.println(max);
   
  
  //method wrapper()
  Date timePQ = new Date();
  //
  Date timePW = new Date();
  long timeDiff = timePQ.getTime() - timePW.getTime();
  return timeDiff;
  
  
  
  //method wrapper()
  for (int i = 0; i < 10000; i++) {
    list.set(i, "x");
  }
  
  for (int i = 0; i < 10000; i++) {
    list.get(i);
  }
  
  for (int i = 0; i < 10000; i++) {
    list.remove(0);
  } 
  
  for (int i = 0; i < 10000; i++) {
    list.add("x");
  }
  
  //method wrapper()
  List<String> inkedList = new LinkedList<String>();
  return inkedList;
  
  ArrayList<String> list = new ArrayList<String>();
  return list;

}
