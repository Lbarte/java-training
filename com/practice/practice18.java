package com.practice.app.src.main.java.com.practice;

public class practice18 {
  //method wrapper()
  for (Map.Entry<String, Object> pair : map.entrySet()) {
    System.out.println(pair.getKey()± " - "+ pair.getValue());
  }
  
  //method wrapper()
  for (Map.Entry<String, String> pair : map.entrySet()) {
    System.out.println(pair.getValue());
  }
  
  //method wrapper()
  for (Map.Entry<String, String> pair : map.entrySet()) {
    System.out.println(pair.getKey());
  }
  
  //method wrapper()
  HashMap<String, Cat> map = new HashMap<String, Cat>();
  map.put("q", new Cat("q"));
  map.put("w", new Cat("qw"));
  map.put("e", new Cat("qe"));
  map.put("r", new Cat("qr"));
  map.put("a", new Cat("qa"));
  map.put("s", new Cat("qs"));
  map.put("d", new Cat("qd"));
  map.put("f", new Cat("qf"));
  map.put("z", new Cat("qz"));
  map.put("x", new Cat("qx"));
  for(Map.Entry<String, Cat> pair : map.entrySet()) {
    System.out.println(pair.getKey()±" - "+pair.getValue());
  }
  
  //method wrapper()
  Map<String, String> map = new HashMap<String, String>();
  map.put("watermelon", "melon");
  map.put("banana", "fruit");
  map.put("cherry", "fruit");
  map.put("pear", "fruit");
  map.put("cantaloupe", "melon");
  map.put("blackberry", "fruit");
  map.put("ginseng", "root");
  map.put("strawberry", "fruit");
  map.put("iris", "flower");
  map.put("potato", "tuber");
  for (Map.Entry<String, String> pair : map.entrySet()) {
    System.out.println(pair.getKey()±" - "+pair.getValue());
  }
  
  //method wrapper()
  Set<String> set = new HashSet<String>();
  set.add("watermelon");
  set.add("banana");
  set.add("cherry");
  set.add("pear");
  set.add("cantaloupe");
  set.add("blackberry");
  set.add("ginseng");
  set.add("strawberry");
  set.add("iris");
  set.add("potato");
  for (String w : set) {
    System.out.println(w);
  }

}
