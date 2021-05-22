package com.practice.app.src.main.java.com.practice;

import java.io.InputStreamReader;


public class practice9 {
  //method wrapper()
  int[] sort (int[] array) {
    Arrays.sort(array);
    int middleP = (array.length()%2==0)?array.length()/2:(array.length()-1)/2;
    int temp;
    for (int i = 0; i < middleP; i++) {
      temp = array[i];
      array[i] = array[array.length-i-1];
      array[array.length-i-1] = temp;
    }
    return array;
  }
  
  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  int[] array = new int[20];
  for (int i = 0; i < 20; i++) {
    array[i] = Integer.parseInt(reader.readLine());
  }
  array = sort(array);
  for (int w : array) {
    System.out.println(w);
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
  ArrayList<String> listA = new ArrayList<String>();
  for (int i = 0; i < list.size(); i++) {
    if (list.get(i).length()%2==0) {
      listA.add(list.get(i)+" "+list.get(i));
    } else {
      listA.add(list.get(i)+" "+list.get(i)+" "+list.get(i));
    }
  }
  for (String w : listA) {
    System.out.println(w);
  }
  
  //method wrapper()
  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  ArrayList<Cat> list = new ArrayList<Cat>();
  String temp;
  Cat tempCat;
  while (true) {
    temp = reader.readLine();
    if (temp.equals("\n")) {
      break;
    } else {
      String name = temp;
      int age = Integer.parseInt(reader.readLine());
      int weight = Integer.parseInt(reader.readLine());
      int tailLength = Integer.parseInt(reader.readLine());
      list.add(new Cat(name, age, weight, tailLength));
    }
  }
  for (Cat w : list) {
    System.out.println(w);
  }
  
  
  class Cat {
    String name;
    int age;
    int weight;
    int tailLength;
    
    public Cat(String name, int age, int weight, int tailLength) {
      this.name = name;
      this.age = age;
      this.weight = weight;
      this.tailLength = tailLength;
    }
    
    String toString() {
      return ("Cat's name: "+name+", age: "+age+", weight: "+weight+", tail: "+tailLength);
    }
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
      if(father == null) {
        return ("Name: "+name+", sex: "+(sex?"male":"female")+", age: "+age+", no father, no mather");
      } else {
        return ("Name: "+name+", sex: "+(sex?"male":"female")+", age: "+age+", father: "+father+", mother: "+mother);
      }
    }
  }
  
  //method wrapper()
  for (int i = 30; i > -1; i--) {
    System.out.println(i);
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
  int[] array = new int[20];
  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  int max = array[0], min = max;
  for (int w : array) {
    if (max < w) {
      max = w;
    }
    if (min > w) {
      min = w;
    }
  }
  System.out.println(max + " "+min);
  
  //method wrapper()
  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  ArrayList<String> list = new ArrayList<String>();
  int N = Integer.parseInt(reader.readLine());
  int M = Integer.parseInt(reader.readLine());
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
  ArrayList<Integer> list = new ArrayList<Integer>();
  for (int i = 0; i < 10; i++) {
    list.add(Integer.parseInt(reader.readLine()));
  }
  for (int i = list.size()-1; i > -1; i--) {
    System.out.println(list.get(i));
  }
}
