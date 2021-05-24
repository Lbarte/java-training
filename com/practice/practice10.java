package com.practice.app.src.main.java.com.practice;

public class practice10 {
  //method wrapper()
  Iterator<Set.Entry<String, Object>> iterator = map.entrySet().iterator();
  String key;
  Object value;
  while(iterator.hasNext()) {
    Map.Entry<String, Object> pair = iterator.next();
    key = pair.getKey();
    value = pair.getValue();
    System.out.println(key+" - "+value);
  }
  
  //method wrapper()
  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  int[] array = new int[20];
  for (int i = 0; i < 20; i++) {
    array[i] = Integer.parseInt(reader.readLine());
  }
  Arrays.sort(array);
  for(int i = array.length()-1; i > -1; i--) {
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
    if (w.length % 2==0) {
      listQ.add(w+" "+w);
    } else {
      listQ.add(w+" "+w+" "+w);
    }
  }
  for(String w : listQ) {
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
      this weight = weight;
      this.tail = tail;
    }
    
    public String toString() {
      return ("Cat's name: "+name+", age: "+age+", weight: "+weight+", tail: "+tail);
    }
  }
  
  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  String temp;
  ArrayList<Cat> cats = new ArrayList<Cat>();
  int age, weight, tail;
  while (true) {
    temp = reader.readLine();
    if (temp.isEmpty()) {
      break;
    } else {
    age = Integer.parseInt(reader.readLine());
    weight = Integer.parseInt(reader.readLine());
    tail = Integer.parseInt(reader.readLine());
      cats.add(new Cat(temp, age, weight, tail));
    }
  }
  for (Cat w : cats) {
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
        return ("Name: "+name+", sex: "+(sex?"male":"female")+", age: "+age+", no father, no mother");
      } else {
        return ("Name: "+name+", sex: "+(sex?"male":"female")+", age: "+age+", father: "+father.name+", mother: "+mother.name);
      }
    }
  }
  
  ggggg()
  Human gfQ = new Human(”grandfather Q”, true, 75);
  //Human gfW = new Human(”grandfather W”, true, 70);
  //Human gmQ = new Human(”grandmother Q”, false, 73);
  //Human gmW = new Human(”grandmother W”, false, 68);
  //Human fQ = new Human(”father Q”, true, 41, gfQ, gmQ);
  //Human mW = new Human(”mother W”, false, 38, gfW, gmW);
  //Human chQ = new Human(”children Q”, true, 18, fQ, mW);
  //Human chW = new Human(”children W”, false, 15, fQ, mW);
  //Human chE = new Human(”children E”, true, 12, fQ, mW);
  System.out.println(gfQ);
  System.out.println(gmQ);
  System.out.println(gfW);
  System.out.println(gmW);
  System.out.println(fQ);
  System.out.println(mW);
  System.out.println(chQ);
  System.out.println(chW);
  System.out.println(chE);
  
  
  //method wrapper()
  for (int i = 0; i < 30; i++) {
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
    if (temp.equals(”end”)) {
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

}
