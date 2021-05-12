package com.erastothenus.sieve;

public class Computer {
    private int[] array;

    public void arrayCreating() {
      initializeAr();
      int[] array = {1, 3, 5, 7, 9};
      int[] array1 = new int[5];
      int[] array2 = new int[]{4,8,9,4,7};
      printOutAr(array);
      printOutAr(array1);
      printOutAr(array2);
      printOutAr(this.array);
    }
    
    public void initializeAr() {
      array = new int[] {1,2,3,5,10};
    }
    
    public void printOutAr(int[] array) {
      System.out.println("An array:");
      for (int i = 0; i < array.length; i++) {
        System.out.print(array[i]+"| ");
      }
      System.out.println();
    }
    
    public void printOutAr() {
      System.out.println("An array:");
      for (int i = 0; i < array.length; i++) {
        System.out.print(array[i]+"| ");
      }
      System.out.println();
    }
    
    public int[] getArray() {
      return array;
    }
}
