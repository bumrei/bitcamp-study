package com.eomcs.lang.ex07;

// # 메서드 : 개념 및 기본 문법 II
//
public class Exam0221 {

  static void hello(String name, int age) {
    System.out.printf("%d살 %s님 반갑습니다.\n", age, name);
  }

  public static void main(String[] args) {
    // 파라미터의 타입, 개수, 순서가 일치해야 한다.!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

    //    hello("윤봉길"); // 컴파일 오류!
    //    hello(20, "윤봉길"); // 컴파일 오류! // 순서를 맞춰야 한다. String first, int second
    //    String r = hello("안중근", 30); // 컴파일 오류!// return이 없기 때문에 변수선언 불가 그리고 리턴 타입도 않맞음.

    //    void r = hello("안중근", 30); // 컴파일 오류! // return이 없기 때문에 변수선언 불가!!!
  }
}
