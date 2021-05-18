package com.practice.app.src.main.java.com.practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class practice6 {
  
  public static void main(String[] args) {
    qqq();
  }
  
  //method wrapper()
  boolean leaveIt = false;
  for (int i = 0; i < list.size(); i++) {
    if ((list.get(i).contains("r")) && (list.get(i).contains("l"))) {
      leaveIt = true;
    }
    if ((list.get(i).contains("r")) && (!leaveIt)) {
      list.remove(i);
      i--;
    }else if ((list.get(i).contains("l")) && (!leaveIt)) {
      list.add(i, list.get(i));
      i++;
    }
    leaveIt = false;
  }
  
  
  //method wrapper()
  ArrayList<String> w = new ArrayList<String> ();
  Collections.addAll(w, "Sam", "I", "Am");
  for (int i = w.size(); i > 0; i--) {
    w.add(i, "Ham");
  }
  for (String i : w) {
    System.out.println(i);
  }
  
  //method wrapper()
  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  ArrayList<String> w = new ArrayList<String> ();
  for (int i = 0; i < 5; i++) {
    w.add(reader.readLine());
  }
  w.remove(2);
  for (int i = w.size()-1; i > -1; i--) {
    System.out.println(w.get(i));
  }
  
  //method wrapper()
  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  ArrayList<Integer> w = new ArrayList<Integer>();
  ArrayList<Integer> a = new ArrayList<Integer>();
  ArrayList<Integer> b = new ArrayList<Integer>();
  ArrayList<Integer> c = new ArrayList<Integer>();
  
  for (int i = 0; i < 20; i++) {
    w.add(Integer.parseInt(reader.readLine()));
  }
  for (Integer n : w) {
    
     if(n%3==0) {
        a.add(n);
      }
      if(n%2==0) {
        b.add(n);
      }
    
    if (!(n%3==0) && !(n%2==0)) {
      c.add(n);
    }
  }
  
  printList(a);
  printList(b);
  printList(c);
  
  //public void printList(List<Integer> list)
  for (Integer x : list) {
    System.out.println(x);
  }
  
  //method wrapper()
  public static void qqq() {
    ArrayList<String> ar = new ArrayList<String>();
  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  for (int i = 0; i < 10; i++) {
    ar.add(reader.readLine());
  }
  int shInd = 0, loInd = 0;
  for (int i = 0; i < 10; i++) {
    if (ar.get(shInd).length() > ar.get(i).length()) {
      shInd = i;
    }
    if (ar.get(loInd).length() < ar.get(i).length()) {
      loInd = i;
    }
  }
  int resInd = shInd < loInd ? shInd : loInd;
  System.out.println(ar.get(resInd));
  }
  
}






















