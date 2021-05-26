package com.practice.app.src.main.java.com.practice;

public class practice12 {
  //method wrapper()
  HashMap<String, String> map = new HashMap<String, String>();
  for (int i = 0; i < 10; i++) {
    map.put("Laca"+i, "Puri"+i);      
  }          
  return map;
  
  int counter = 0;
  Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
  while (iterator.hasNext()) {
    Map.Entry<String, String> pair = iterator.next();
    if (pair.getValue().equals(name)) {
      counter++;
    }
  }
  return counter;
  
  //method wrapper()
  HashSet<Integer> set = new HashSet<Integer>();
  for (int i = 0; i < 20; i++) {
    set.add(i);
  }
  return set;
  
  //method wrapper()
  LinkedList<Integer> list = new LinkedList<Integer>(set);
  for (int i = 0; i < list.size(); i++) {
    if (list.get(i)>10) {
      list.remove(i);
      i--;
    }
  }
  set = new HashSet<Integer>(list);
  return set;
  
  
  //method wrapper()
  HashSet<String> set = new HashSet<String>();
  for (int i = 0; i < 20; i++) {
    set.add("Laogzy"+i);
  }
  return set;
  
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
        temp = list.get(i);
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
  System.out.println(max+1);
}
