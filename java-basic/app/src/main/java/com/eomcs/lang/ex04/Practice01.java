package com.eomcs.lang.ex04;


public class Practice01 {
  public static void main(String[] args) {
    
    
    int[] arr = new int[5];

    arr[0] = 10;
    arr[1] = 20;
    arr[2] = 30;
    arr[3] = 40;
    arr[4] = 50;

    int sum = 0;

    for (int i = 0; i < arr.length; i++) {
      sum = sum + arr[i];
      System.out.println(sum); 
      }
    
    System.out.println();
    System.out.println();

    int[] arr1; 
    arr1 = new int[5];

    arr1[0] = 100;
    arr1[1] = 90;
    arr1[2] = 80;
    arr1[3] = 70;
    arr1[4] = 60;
    

    int sum2 = 0;
  
    
    for (int j = 0; j < arr1.length; j++) {
      sum2 = sum2 + arr1[j];
      System.out.println(sum2);

      

    
    }




    

  }
}
