package com.practice.app.src.main.java.com.practice;

import java.text.SimpleDateFormat;


public class practice21 {
  //method wrapper()
  //displays the name of the class and method in which it was called, and passed message
  public static void log(String s) {
      String className = Thread.currentThread().getStackTrace()[2].getClassName();
      String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();
      System.out.println(className+ ": "+ methodName+ ": "+ s);
  }
  
  //method wrapper()
  public static int getStackTraceDepth() {
        int depth =  Thread.currentThread().getStackTrace().length;
        System.out.println(depth);
        return depth;
    }
  
  //method wrapper()
  //each method return a code line number from which it was called
  public static int method1() {
        method2();
        return  Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static int method2() {
        method3();
        return  /*write your code here*/ 0;
    }

    public static int method3() {
        method4();
        return  /*write your code here*/ 0;
    }

    public static int method4() {
        method5();
        return  /*write your code here*/ 0;
    }

    public static int method5() {
        return  /*write your code here*/ 0;
    }
  
  //method wrapper()
  //each method returns a caller method name
  public static String method1() {
        method2();
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method2() {
        method3();
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method3() {
        method4();
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method4() {
        method5();
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method5() {
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }
  
  //method wrapper()
  public static StackTraceElement[] method1() {
        method2();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return stackTraceElements;
    }

    public static StackTraceElement[] method2() {
        method3();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return stackTraceElements;
    }

    public static StackTraceElement[] method3() {
        method4();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return stackTraceElements;
    }

    public static StackTraceElement[] method4() {
        method5();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return stackTraceElements;
    }

    public static StackTraceElement[] method5() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return stackTraceElements;
    }
  
  StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
  for (StackTraceElement element : stackTraceElements) {
    System.out.println(element.getMethodName());
  }
  
  //method wrapper()
  StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
  for (StackTraceElement element : stackTraceElements)
  {
      System.out.println( element.getMethodName() );
  }
  
  //method wrapper()
  //sort (String [] array)
  //or simply use collections sort method
  for (int i = 0; i < array.length; i++) {
    int min = i;
    for (int j = i; j < array.length; j++) {
      if (isGreaterThan(array[min], array[j])) {
        min = j;
      }
    }
    String temp = array[i];
    array[i] = array[min];
    array[min] = temp;
  }
  
  //method wrapper()
  // List of addresses
        HashSet<String, String> families = new HashSet<String, String>();
        
        while (true) {
            String city = reader.readLine();
            if (city.isEmpty()) break;
            String family = reader.readLine();
            

            families.add(city, family);  
        }

        // Read the city
        String city = reader.readLine();

        for (String key : families.keySet()) {
          if (key.equals(city)) {
            System.out.println(families.get(key));
            break;
          }
        }     
  
  //method wrapper()
  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  String month = reader.readLine();
  List<String> months = new ArrayList<String>();
  months.add("January");
  months.add("February");
  months.add("March");
  months.add("April");
  months.add("May");
  months.add("June");
  months.add("July");
  months.add("August");
  months.add("September");
  months.add("October");
  months.add("November");
  months.add("December");
  for (String w : months) {
    if (w.equals(month)) {
      System.out.println(w+ " is month "+ (months.indexOf(w)+1));
      break;
    }
  }
  
  //method wrapper()
  public static boolean isDateOdd(String sdate) throws Exception{
    //SimpleDateFormat format = new SimpleDateFormat("MM dd yy");
    Date date = new Date(sdate);
    Date startDate = new Date(date.getYear(), 0, 1);
    long diff = date.getTime() - startDate.getTime();
    long divider = 24*60*60*1000;
    long days = diff / divider;
    if (days % 2 == 0) {
      return true;
    } else {
      return false;
    }
  }
  
  //method wrapper()
  //int[] sort (int[] array)
  Arrays.sort(array);
  int[] reversed = new int[array.length];
  for (int i = array.length-1, j = 0; i > -1; i--, j++) {
    reversed[j] = array[i];
  }
  for (int i = 0; i < array.length; i++) {
    array[i] = reversed[i];
  }

}
