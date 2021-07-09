package com.eomcs.lang.ex05;

//# 증감 연산자 : 전위(pre-fix) 증감 연산자 응용 II
//
public class Exam0680 {
  public static void main(String[] args) {
    int i = 2;
    int result = ++i + ++i * ++i;
    // 위의 문장은 다음 문장들로 변경된다.
    // i = i + 1;         3
    // t1 = i;            3
    // i = i + 1;         4
    // t2 = i;            4
    // i = i + 1;         5
    // t3 = i;            5
    // r = t1 + t2 * t3;  23
    // 
    // 1) int result = 3 + 4 * 5;
    // 2) int result = 3 + 20;
    // 3) int result = 23;

    System.out.println(result); // 23
  }
}






