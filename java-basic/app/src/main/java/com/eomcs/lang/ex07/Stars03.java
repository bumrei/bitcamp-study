package com.eomcs.lang.ex07;

import java.util.Scanner;

public class Stars03 {

  static void printSpaces (int len) {
    for (int i = 0; i < len; i++)
      System.out.print(" ");
  }

  static void printStars (int len) {
    for (int i = 0; i < len; i++) 
      System.out.print("*");
  }

  static int calculateSpaces (int a, int b) {
    return (a - b) / 2;
  }


  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    System.out.print("밑변의 길이? ");
    int len = keyScan.nextInt();
    keyScan.close();

    for (int starLen = 1; starLen <= len; starLen += 2) { 
      printSpaces (calculateSpaces (len, starLen));
      printStars (starLen);
      System.out.println();
    }
  }



}
