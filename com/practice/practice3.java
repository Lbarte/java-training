package com.prsctice;

import java.io.InputStreamReader;


public class practice3 {
  public static void main(String[] args) {
    
  }
  
  //method wrapper()
  int[] ar = new int[15];
  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  int oddCount = 0, evenCount = 0;
  for(int i = 0; i < 15; i++) {
    ar[i] = Integer.parseInt(reader.readLine());
    if (i%2==0) {
      evenCount += ar[i];
    } else {
      oddCount += ar[i];
    }
  }
  if (evenCount > oddCount) {
    System.out.println("Even-numbered houses have more residents.");
  } else if (oddCount > evenCount){
    System.out.println("Odd-numbered houses have more residents.");
  }
  
  //method wrapper()
  int[] ar = new int[20];
  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  int[] arq = new int[10];
  int[] arw = new int[10];
  for(int i = 0; i < 20; i++) {
    ar[i] = Integer.parseInt(reader.readLine());
    if (i < 10) {
      arq[i] = ar[i];
    } else {
      arw[i-10] = ar[i];
    }
  }
  for (int i = 0; i < 10; i++) {
    System.out.println(arw[i]);
  }
  
  
  //method wrapper()
  int[] ar = new int[10];
  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  for(int i = 0; i < 10; i++) {
    ar[i] = Integer.parseInt(reader.readLine());
  }
  for (int i = 9; i > -1; i--) {
    System.out.println(ar[i]);
  }
  
  //method wrapper()
  String[] ar = new String[10];
  int[] arI = new int[10];
  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  for(int i = 0; i < 10; i++) {
    ar[i] = reader.readLine();
    arI[i] = ar[i].length();
  }
  for(int i = 0; i < 10; i++) {
    System.out.println(arI[i]);
  }
  
  
  //method wrapper()
  String[] ar = new String[10];
  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  for(int i = 0; i < 8; i++) {
    ar[i] = reader.readLine();
  }
  for (int i = 9; i > -1; i--) {
    System.out.println(ar[i]);
  }
  
  public static int[] initializeArray() throws IOException {
        // Create and populate the array
        int[] ar = new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < ar.length; i++) {
          ar[i] = Integer.parseInt(reader.readLine());
        }
        return ar;
    }

    public static int max(int[] array) {
        // Find the maximum
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
          if (max < array[i]) {
            max = array[i];
          }
        }
        return max;
    }
}
