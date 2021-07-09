package com.eomcs.lang.ex07;

import java.util.Scanner;

public class Stars01 {
  public static void main (String[] args) {
    Scanner keyScan = new Scanner (System.in);
    System.out.print("원하시는 별의 밑변 개수는? ");
    int len = keyScan.nextInt();
    keyScan.close();

    int starPoint = 1;
    int moveline = 0;
    int Space = (len - 1) / 2;
    while (starPoint <= len) {
      // 빈칸 생성

      int creatSpace = 0;
      while (creatSpace < Space) {
        System.out.print(" ");
        creatSpace++;

      }
      // 별 찍기
      while (moveline < starPoint) {
        System.out.print("*");
        moveline++;
      }
      // 줄 바꾸기
      System.out.println();
      starPoint += 2;
      moveline = 0;
      Space--;

    }
  }
}




