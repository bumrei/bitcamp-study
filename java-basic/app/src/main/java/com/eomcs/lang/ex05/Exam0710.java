package com.eomcs.lang.ex05;

//# 할당(배정,대입) 연산자  : +=  -=  *=  /=  %=  &=  |=  ^=  <<=  >>=  >>>=
//
public class Exam0710 {
  public static void main(String[] args) {
    int i = 2;

    //i = i + 20; // 개발자가 편하라고 만든것이다. 즉 컴파일하면 다시 i = i + 20 으로 바뀐다.
    i += 20; // += 연산자를 사용하면 위의 코드를 축약할 수 있다.
    System.out.println(i);

    i = 2;
    i *= 5; // 곱하기도 쌉가능.
    System.out.println(i);

  }
}
