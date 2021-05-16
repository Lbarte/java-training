package com.practice.app.src.main.java.com.prsctice;

public class practice4 {
  public static void main(String[] args) {
    
  }
  
  //method wrapper()
  ArrayList<String> ar = new ArrayList<String>();
  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  for (int i = 0; i < 10; i++) {
    ar.add(0, reader.readLine());
  }
  for (int i = 0; i < 10; i++) {
    System out.println(ar.get(i));
  }
  
  //method wrapper()
  ArrayList<String> ar = new ArrayList<String>();
  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  String first = reader.readLine(); 
  ar.add(first); 
int minSize = first.length();  
  for (int i = 1; i < 5; i++) {
    ar.add(reader.readLine());  
    if (minSize > ar.get(i).length()) {
      minSize = ar.get(i).length();
    }
  }
  for (int i = 0; i < 5; i++) {
    if (ar.get(i).length() == minSize) {
      System.out.println(ar.get(i));
    }
  }
  
  //method wrapper()
  strings = new ArrayList<String>();
  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  int maxSize = 0;
  for (int i =0; i < 5; i++) {
    strings.add(reader.readLine());
    if (maxSize < strings.get(i).length()) {
      maxSize = strings.get(i).length();
    }
  }
  for (int i = 0; i < 5; i++) {
    if (strings.get(i).length() == maxSize) {
      System.out.println(strings.get(i));
    }
  }
  
  //method wrapper ()
  ArrayList<String> ar = new ArrayList<String>();
  ar.add("atq");
  ar.add("aq");
  ar.add("ate");
  ar.add("ttq");
  ar.add("qtq");
  System.out.println(ar.size());
  for (int i = 0; i < ar.size(); i++) {
    System.out.println(ar.get(i));
  }
  

}
