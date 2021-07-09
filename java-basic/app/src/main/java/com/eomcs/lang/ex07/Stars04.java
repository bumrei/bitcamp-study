package com.eomcs.lang.ex07;

import java.util.Scanner;

public class Stars04 {

  static void printSpaces(int spaces) {
    for (int j = 0; j < spaces; j++) 
      System.out.print(" ");
  }

  static void printStars (int stars) {
    for (int i = 0; i < stars; i++) 
      System.out.print("*");
  }

  static int calculation(int len, int stars) {
    return (len - stars) / 2;
  }

  static void printBotSpaces (int botSpaces) {
    for (int i = 0; i < botSpaces; i++) 
      System.out.print(" ");
  }

  static void printBotStars (int stars) {
    for (int i = 0; i < stars; i++)
      System.out.print("*");
  }

  static int calculationBot (int len, int stars) {
    return (len - stars) / 2;
  }

  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    System.out.print("별 밑변의 개수: ");
    int len = keyScan.nextInt();
    keyScan.close();

    for (int stars = 1; stars <= len; stars += 2) {

      printSpaces(calculation(len, stars));
      printStars(stars);
      System.out.println();
    }

    for (int stars = len-2; stars > 0; stars -= 2) {

      printBotSpaces(calculationBot(len, stars));
      printBotStars(stars);
      System.out.println();
    }
  }
}
