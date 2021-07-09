package com.eomcs.lang;

class Test01 {
  public static void main(String[] args) {

    int age = 70;


    /*

    System.out.println("카드를 대 주십시오");
    System.out.println("삑!!");
    if (age < 8) {
      System.out.println("학생입니다.");
    } else if (age < 20) {
      System.out.println("성인입니다.");
    } else if (age < 50) {
      System.out.println("중년입니다.");
    } else if (age < 70) {
      System.out.println("노인입니다.");
    } else 
      System.out.println("카드를 다시 대 주십시오");

     */

    System.out.println("카드를 대 주십시오.");
    System.out.println("삑!!");
    switch (age) {
      case 10:
        System.out.println("학생입니다");
        break;

      case 40:
        System.out.println("성인입니다.");
        break;

      case 60:
        System.out.println("중년입니다");
        break;

      case 70:
        System.out.println("노인입니다.");
        break;

      default:
        System.out.println("카드를 다시 대 주십시오");
        break;

    }
  }
}