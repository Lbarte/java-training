package com.practice.app.src.main.java.com.practice;

public class practice22 {

  //method wrapper()
  try {
    obj.method1();
    obj.method2();
    obj.method3();
  } catch (Exception e) {
    
   printStack(e);
  }
  
  
  
  //method wrapper()
  try {
    handleExceptions();
  } catch (FileSystemException e) {
    BEAN.log(e);
  }
  
  public static void handleExceptions() throws FileSystemException {
  try {
    BEAN.throwExceptions();
  } catch (FileSystemException e) {
    BEAN.log(e);
    throw e;
  } catch (CharConversionException e) {
    BEAN.log(e);
  } catch (IOException e) {
    BEAN.log(e);
  }
  }
  
  //method wrapper()
  try {
    method1();
  } catch (Exception3 e) {}
  catch (Exception2 e) {}
  catch (Exception1 e) {}
  
  //method wrapper()
  try {
    method1();
  } catch (NullPointerException e) {
    
  } catch (FileNotFoundException e) {
    
  }
  
  //method wrapper()
  try {
    HashMap<String, String> map = new HashMap<String, String>(null);
    map.put(null, null);
    map.remove(null);
  } catch (NullPointerException e) {
    System.out.println(e.getClass().getSimpleName());
  }
  
  //method wrapper()
  try {
    ArrayList<String> list = new ArrayList<String>();
    String s = list.get(18);
  } catch (IndexOutOfBoundsException e) {
    System.out.println(e.getClass().getSimpleName());
  }
  
  //method wrapper()
  try {
    int[] m = new int[2];
    m[8] = 2;
  } catch (ArrayIndexOutOfBoundsException e) {
    System.out.println(e.getClass().getName());
  }
  
  //method wrapper()
  try {
    String s = null;
    String m = s.toLowerCase();
  } catch (Exception e) {
    System.out.println(e.getClass().getSimpleName());
  }
  
  //method wrapper()
  try {
    int a = 42/0;
  } catch (ArithmeticException e) {
    System.out.println(e.getClass());
  }

}
