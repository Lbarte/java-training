package sieve;

import java.util.*;
import java.io.*;

public class Computer {
    private int[] array;
    private int limit;
    private int arSize;
    private ArrayList<Integer> result;
    
    public void getPrimitives() throws Exception {
      System.out.println("Searching for primitives\nInput upper limit:");
      InputHandl ih = new InputHandl();
      setLimit(ih.getLimit());
      arrayInit();
      setPrimitives();
      output();
    }
    
    //TestOnly
    public ArrayList<Integer> getResult() {
      return result;
    }
    
    //TestOnly
    public void setResult(ArrayList<Integer> result) {
      this.result = result;
    }
    
    public void setPrimitives() {
      for (int q = 0; q < arSize; q+=2) {
        if(array[q+1]==0) {
          for (int w = q; w < arSize; w+=2) {
            if (array[w]%array[q]==0) {
              array[w+1] = 1;
            }
          }
          result.add(array[q]);
        } 
      }
      array = null;
    }
    
    public void output() {
      System.out.println("primitive numbers");
      Iterator<Integer> iterator = result.iterator();
      int counter = 0;
      while(iterator.hasNext()) {
        System.out.print(iterator.next()+" ");
        counter++;
        if(counter == 7) {
          System.out.println();
          counter = 0;
        }
      }
      if (counter!=0) {
        System.out.println();
      }
    }
    
    public void setLimit(int limit) {
      this.limit = limit;
      arSize = limit*2-2;
    }
    
    //TestOnly
    public int getLimit() {
      return limit;
    }
    
    //TestOnly
    public int getArSize() {
      return arSize;
    }

    public void arrayInit() {
      array = new int[arSize];
      //odd - boolean value isPrimitive yes/not 0/1
      //even - number from 2 to limit
      for (int i = 0; i < arSize; i+=2) {
        array[i] = i/2+2;
      }
      result = new ArrayList<Integer>();
      //trash
      for (int i = 1; i < arSize; i+=2) {
        array[i] = 0;
      }
    }
    
    //trash
    public void arraysCreating() {
      initializeAr();
      int[] array = {1, 3, 5, 7, 9};
      int[] array1 = new int[5];
      int[] array2 = new int[]{4,8,9,4,7};
      printOutAr(array);
      printOutAr(array1);
      printOutAr(array2);
      printOutAr(this.array);
    }
    
    //trash
    public void initializeAr() {
      array = new int[] {1,2,3,5,10};
    }
    
    //near trash;
    //TestOnly
    public void printOutAr(int[] array) {
      System.out.println("An array:");
      for (int i = 0; i < array.length; i++) {
        System.out.print(array[i]+"| ");
      }
      System.out.println();
    }
    
    //near trash
    //TestOnly
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


