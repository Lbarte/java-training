package com.practice.app.src.main.java.com.practice;

public class practice14 {
  //method wrapper()
  HashMap<String, String> map = new HashMap<String, String>();
  for (int i = 0; i < 9; i++) {
    map.put("lastname"+i, "firstname"+i);
  }
  map.put("lastname", "firstname"+1);
  
  for(LinkedList<String> i : map.keySet()) {
    
    for (LinkedList<String> j : map.keySet()) {
      if(map.get(i).equals(map.get(j))) {
        removeItemFromMapByValue(map, map.get(i));
      }
    }
  }
  
  //method wrapper()
  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  int[] array = new int[20];
  for (int i =0; i < 20; i++) {
    array[i] = Integer.parseInt(reader.readLine());
  }
  Arrays.sort(array);
  for (int i = array.length()-1; i > -1; i--) {
    System.out.println(array[i]);
  }
  
  //method wrapper()
  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  String temp;
  List<> list = new LinkedList<String>();
  while(true) {
    temp = reader.readLine();
    if (temp.isEmpty()) {
      break;
    } else {
      list.add(temp);
    }
  }
  List<> listQ = new LinkedList<String>();
  for (String w : list) {
    if (w.length%2==0) {
      listQ.add(w+" "+w);
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
    
    public String toString() {
      return ("Cat's name: "+name +", age: " +age+", weight: " +weight+", tail:" +tail);
    }
  }
  
  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  String name;
  int age, weight, tail;
  List<> list = new ArrayList<Cat>();
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
        return ("Name: "+name+", sex: " +(sex?"male":"female")+ ", age: "+age+", no father, no mother");
      } else {
        return ("Name: "+name+", sex: " +(sex?"male":"female")+ ", age: "+age+", father:"+father.name+", mother: "+mother.name);
      }
    }
  }
  
  //Human gfq = new Human("Grandfather q", true, 71);
  //Human gmq = new Human("Grandmother q", false, 68);
  //Human gfw = new Human("Grandfather w", true, 67);
  //Human gmw = new Human("Grandmother w", false, 65);
  //Human f = new Human("Father", true, 41, gfq, gmq);
  //Human m = new Human("Mother", false, 38, gfw, gmw);
  //Human cq = new Human("Children q", true, 21, f, m);
  //Human cw = new Human("Children w", true, 19, f, m);
  //Human ce = new Human("Children e", true, 17, f, m);
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
  Syatem.out.println("Boom!");
  
  //method wrapper()
  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  Arraylist<String> list = new ArrayList<String>();
  String temp;
  while (true) {
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
  int [] array = new int[20];
  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  for (int i = 0; i < 20; i++) {
    array[i] = Integer.parseInt(reader.readLine());
  }
  int min = array[i], max = min;
  for (int w : array) {
    if (min > w) {
      min = w;
    }
    if (max < w) {
      max = w;
    }
  }
  System.out.println(max+" "+min);
  
  //method wrapper ()
  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  int N = Integer.parseInt(reader.readLine());
  int M = Integer.parseInt(reader.readLine());
  LinkedList<String> list = new LinkedList<String>();
  for (int i = 0; i < 10; i++) {
    list.add(reader.readLine());
  }
  for (int i = 0; i < M; i++) {
    String temp = list.get(0);
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
