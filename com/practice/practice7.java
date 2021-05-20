package com.practice.app.src.main.java.com.practice;

public class practice7 {
  //method wrapper()
  Arrays.sort(array);
  int temp;
  int middleInd = array.length%2==0?array.length/2:(array.length-1)/2;
  for (int i = 0; i < middleInd; i++) {
    temp = array[i];
    array[i] = array[array.length-i-1];
    array[arrayLength-i-1]=temp;
  }
  
  
  
  //method wrapper()
  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        ArrayList<String> listCond = new ArrayList<String>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length()%2 == 0) {
        listCond.add(list.get(i)+" "+list.get(i));    
            } else {
              listCond.add(list.get(i)+" "+list.get(i)+" "+list.get(i));    
            }
        }

        for (int i = 0; i < listCond.size(); i++) {
            System.out.println(listCond.get(i));
        }
  
  //method wrapper()
  int age = Integer.parseInt(reader.readLine());
  int weight = Integer.parseInt(reader.readLine()); 
  int tailLength = Integer.parseInt(reader.readLine());
  
  Cat cat = new Cat(name, age, weight, tailLength);
  
  
  //method wrapper()
  class Human {
    public String name;
    public boolean sex;
    public int age;
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
  }
  
  Human grandfather1 = new Human("Grandfather GFather", true, 70);
  Human grandfather2 = new Human("Grandfather GrandF", true, 70);
  Human grandmother1 = new Human("Grandmother GMother", false, 70);
  Human grandmother2 = new Human("Grandmother GrandM", false, 70);
  Human father = new Human("Father F", true, 40, grandfather1, grandmother1);
  Human mother = new Human("Mother M", false, 38, grandfather2, grandmother2);
  Human children1 = new Human("Children BigC", true, 21, father, mother);
  Human children2 = new Human("Children BigH", false, 17, father, mother);
  Human children3 = new Human("Children BigB", false, 15, father, mother);
  System.out.println(grandfather1);
  System.out.println(grandfather2);
  System.out.println(grandmother1);
  System.out.println(grandmother2);
  System.out.println(father);
  System.out.println(mother);
  System.out.println(children1);
  System.out.println(children2);
  System.out.println(children3);
  
  //method wrapper()
  for (int i = 30; i >= 0; i--) {
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
  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  int[] list = new int[20];
  for (int i = 0; i < 20; i++) {
    list[i] = Integer.parseInt(reader.readLine());
  }
  int max = list[0], min = max;
  for (int w : list) {
    if (w > max) {
      max = w;
    }
    if (w < min) {
      min = w;
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
  for (int i = 0; i < N; i++) {
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
  for (int i = 9; i > -1; i--) {
    System.out.println(list.get(i));
  }
  
  //method wrapper()
  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  ArrayList<String> list = new ArrayList<String>();
  for (int i = 0; i < 10; i++) {
    list.add(reader.readLine());
  }
  int length = list.get(0).length();
  for (int i = 0; i < list.size(); i++){
    if (length > list.get(i).length()) {
      System.out.println(i);
      break;
    } else {
      length = list.get(i).length();
    }
  }

  //method wrapper()
  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  ArrayList<String> list = new ArrayList<String>();
  for (int i = 0; i < 10; i++) {
    list.add(reader.readLine());
  }
  
  
  for (int i = 0; i < list.sise(); i+=2) {
    list.add(i, list.get(i));
  }
  return list;
  
  for (String w : list) {
    System.out.println(w);
  }
}
