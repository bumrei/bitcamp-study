package com.eomcs.lang.ex07;

import java.util.Scanner;

public class Stars02 {

  static void printSpaces (int len) {
    for (int i = 0; i < len; i++) {
      System.out.print(" ");
    }
  }

  static void printStars (int len) {
    for (int i = 0; i < len; i++) {
      System.out.print("*");
    }
  }

  static int calculateSpace (int printStarsLength, int printStarPoints) {
    return (printStarsLength - printStarPoints) / 2;
  }

  public static void main (String[] args) {
    Scanner keyScan = new Scanner (System.in);
    System.out.print("원하시는 별의 밑변 개수는? ");
    int len = keyScan.nextInt();
    keyScan.close();


    for (int starPoint = 1; starPoint <= len; starPoint += 2) {
      // 빈칸 생성 
      printSpaces (calculateSpace(len, starPoint));
      printStars (starPoint);
      System.out.println();
    }
  }
}




