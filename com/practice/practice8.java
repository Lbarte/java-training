package com.practice.app.src.main.java.com.practice;

public class practice8 {
  //method wrapper()
  class Human{
    public String name;
    public boolean sex;
    public int age;
    public Human father;
    public Human mother;
    
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
      if(father == null) {
        return ("Name: "+name+", sex: "+(sex?"male":"female")+", age: "+age+", no father, no mather");
      } else {
        return ("Name: "+name+", sex: "+(sex?"male":"female")+", age: "+age+", father: "+father+", mother: "+mother);
      }
    }
  }

  //method wrapper()
  for (int i = 0; i < 30; i++) {
    System.out.println(30-i);
    Thread.sleep(100);
  }
  System.out.println("Boom!");
  
  //method wrapper()
  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  ArrayList<String> list = new ArrayList<String>();
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
  int[] array = new int[20];
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
  for(int i = 0; i < M; i++) {
    temp = list.get(0);
    list.remove(0);
    list.add(temp);
  }
  for (String w : list) {
    System.out.println(w);
  }
  
  
  //method wrapper()
  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  ArrayList<Integer> array = new ArrayList<Integer>();
  for (int i = 0; i < 10; i++) {
    array.add(Integer.parseInt(reader.readLine());
  }
  for (int i = array.size()-1; i>-1; i--) {
    System.out.println(array.get(i));
  }

  //method wrapper()
  Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
  while(iterator.hasNext()) {
    Map.Entry<String, String> pair = iterator.next();
    System.out.println(pair.getValue());
  }
  
  //method wrapper()
  Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
  while (iterator.hasNext()) {
    Map.Entry<String, String> pair = iterator.next();
    System.out.println(pair.getKey());
  }
  
  //method wrapper()
  HashMap<String, Cat> hashMapA = new HashMap<String, Cat>();
  for (String w : cats) {
    hashMapA.put(w, new Cat(w));
  }
  return hashMapA;
  
  
  //method wrapper()
  HashMap<String, String> hashMapA = new HashMap<String, String>();
  hashMapA.put("watermelon", "melon");
  hashMapA.put("banana", "fruit");
  hashMapA.put("cherry", "fruit");
  hashMapA.put("pear", "fruit");
  hashMapA.put("cantaloupe", "melon");
  hashMapA.put("blackberry", "fruit");
  hashMapA.put("ginseng", "root");
  hashMapA.put("strawberry", "fruit");
  hashMapA.put("iris", "flower");
  hashMapA.put("potato", "tuber");
  Iterator<Map.Entry<String, String>> iterator = hashMapA.entrySet().iterator();
  while(iterator.hasNext()) {
    Map.Entry<String, String> pair = iterator.next();
    String key = pair.getKey();
    String value = pair.getValue();
    System.out.println(key+"-"+value);
  }
  
  
  //method wrapper()
  HashSet<String> setA = new HashSet<String>();
  setA.add("watermelon");
  setA.add("banana");
  setA.add("cherry");
  setA.add("pear");
  setA.add("cantaloupe");
  setA.add("blackberry");
  setA.add("ginseng");
  setA.add("strawberry");
  setA.add("iris");
  setA.add("potato");
  
  Iterator<String> iterator = setA.iterator();
  while(iterator.hasNext()) {
    System.out.println(iterator.next());
  }

}
