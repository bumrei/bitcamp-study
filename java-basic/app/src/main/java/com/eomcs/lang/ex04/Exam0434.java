// 문자 변수 - UCS-2 코드 확인하기
package com.eomcs.lang.ex04;

public class Exam0434 {
  public static void main(String[] args) {

    // 자바는 문자를 저장할 때 UCS-2에 정의된 정수 값을 저장한다.
    // 확인해 보자!
    
    // 영어 대문자의 문자 코드 저장
    int v = 0x41; //10진수로 65

    // 코드 값을 1씩 증가하면서 문자를 출력해 보자!
    for (int i = 0; i < 26; i++) {
      // 정수를 그냥 출력하면 10진수를 출력한다.
      // 정수가 문자 코드임을 알려줘야만 println()은 해당 코드의 문자를 출력한다.
      // 문법
      //   (char) 정수
      System.out.print((char)(v + i)); /* 문자 코드와 정수가 만나면 정수가 된다. 
      그래서 괄호 없이 v + i 를 하게 되면 v라는 문자 + i 가 됨으로 결국 정수가 된다. 그래서 문자 ABCDEF... 이 아닌 정수 65 66 67 68 69 .... 
      이런식으로 값이 출력된다. */


    }
  }
}

