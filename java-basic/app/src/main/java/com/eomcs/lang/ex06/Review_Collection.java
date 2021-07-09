package com.eomcs.lang.ex06;

import java.util.Scanner;
import com.eomcs.lang.ex06.ENUM01.Level;

public class Review_Collection {
  public static void main(String[] args) {

    Scanner keyScan = new Scanner (System.in);
    System.out.println("                     [작업 목록]                         ");
    System.out.println("_________________________________________________________");
    System.out.println("|  1. 1~100까지의 합.                                   |");
    System.out.println("|  2. 1~100까지의 짝수의 합                             |");
    System.out.println("|  3. 1~100까지의 짝수의 합 countinue 사용              |");
    System.out.println("|  4. count = 1-100 / sum = 1-50, countinue 사용        |");
    System.out.println("|  5. count = 1-100 / sum = 1-50, break 사용            |");
    System.out.println("|  6. count = 1-100 / sum = 1-50, countinue 사용 홀수만 |");
    System.out.println("|  7. count = 1-100 / sum = 1-50, break 사용 홀수만     |");
    System.out.println("|  8. 구구단 2 ~ 9단까지                                |");
    System.out.println("|  9. 구구단 2 ~ 9단 중 6단은 6까지만                   |");
    System.out.println("|  10. 구구단 5단에 5까지만                             |");
    System.out.println("|  11. switch문 안에 switch문                           |");
    System.out.println("|  12. final을 사용한 switch문                          |");
    System.out.println("|  13. enum클래스를 사용한 switch문                     |");
    System.out.println("---------------------------------------------------------");
    System.out.print("시작할 작업을 선택하십시오.  ");
    int answer = keyScan.nextInt();

    System.out.println();
    System.out.println();


    switch (answer) {
      case 1: // 1부터 100까지의 합
        System.out.println("준비중");
        break;

      case 2: // 1부터 100까지의 짝수의 합
        System.out.println("준비중");
        break;

      case 3: // 1부터 100까지의 짝수의 합 continues
        System.out.println("준비중");
        break;

      case 4: // count = 1-100 / sum = 1-50, continues 사용
        System.out.println("준비중");
        break;

      case 5: // count = 1-100 / sum = 1-50, break 사용
        System.out.println("준비중");
        break;

      case 6: // count = 1-100 / sum = 1-50, continue 사용 홀수만
        System.out.println("준비중");
        break;

      case 7: // count = 1-100 / sum = 1-50, break 사용 홀수만
        System.out.println("준비중");
        break;

      case 8: // 구구단 2 ~ 9단까지.
        int a = 2;
        int b = 1;
        while (a < 10) {
          System.out.printf("********%d단********\n\n", a );
          while (b < 10) {
            System.out.printf("%d X %d = %d\n", a, b, a*b);
            b++;
          }
          System.out.println();
          a++;
          b = 1;
        }
        System.out.println("******종료******");
        break;

      case 9: // 구구단 2 ~ 9단 중 6단은 6까지만
        System.out.println("준비중");
        break;

      case 10: // 구구단 5단에 5까지만
        System.out.println("준비중");
        break;

      case 11:
        System.out.println("[음식]");
        System.out.println("1. 한정식");
        System.out.println("2. 양식");
        System.out.println("3. 중식");
        System.out.println("4. 일식");
        System.out.print("음식을 선택해 주십시오. ");
        int meal = keyScan.nextInt();


        System.out.println();
        System.out.println();

        switch (meal) {
          case 1:
            System.out.println("한정식을 선택 하셨습니다.");
            System.out.println("미역국");
            System.out.println("밥");
            System.out.println("김치");
            break;

          case 2:
            System.out.println("양식을 선택 하셨습니다.");
            System.out.println("스테이크");
            System.out.println("파스타");
            break;

          case 3:
            System.out.println("중식을 선택 하셨습니다");
            System.out.print("1. 짜장면 or 2. 짬뽕 중 선택하십시오.");
            int food = keyScan.nextInt();
            switch (food) {
              case 1:
                System.out.println("짜장면");
                break;
              case 2:
                System.out.println("짬뽕");
                break;
            }
            break;

          case 4:
            System.out.println("일식을 선택하셨습니다.");
            System.out.println("초밥");
            System.out.println("소바");
            break;

        }
        break;

      case 12:
        int level = 1;

        final int WARRIER = 1, ARCHER = 2, MAGISION = 3;

        switch (level) {
          case WARRIER:
            System.out.println("Attack with the sword!!!");
            break;
          case ARCHER:
            System.out.println("The Power always be with my arrow.");
            break;
          case MAGISION:
            System.out.println("Red Moon is arrising...");
            break;
        }
        break;

      case 13:
        Level job = Level.BACKPACKER; // 이 변수는 이 파일이 아닌 다른 파일에서 따온 클래스이다.
        // com.eomcs.lang.ex06.EMUN01.java에 있다.
        // 자동으로 저 소스파일을 import 했다.
        switch (job) {
          case WARRIER:
            System.out.println("Pick up your sword son..");
            break;
          case SWORD_MASTER:
            System.out.println("Always believe your power inside of you..");
            break;
          case BACKPACKER:
            System.out.println("The God leads me to the mountain.");
            break;
        }
        break;

    }

    keyScan.close();


  }
}
