package com.eomcs.lang.ex04;

//# 배열 - 배열을 선언하는 방법 
// 배열?
// - 같은 종류의 메모리를 쉽게 만드는 방법
//
// - 문법
//        메모리종류[] 메모리이름 = new 메모리종류[개수]
//        데이터타입[] 변수명 = new 데이터타입[개수];
//        ex) int[] arr = new int[5];
//
// - C언어 스타일 
//        데이터타입 변수명[] = new 데이터타입[개수];
//        ex) int arr[] = new int[5];
//
// 배열의 개수는 int 타입의 최대 값과 같다.
// 즉 2147483647 개 이다. 
//
public class Exam0510 {
  public static void main(String[] args) {
    // 배열 사용 전
    int i1, i2, i3, i4, i5;

    // 배열 선언
    int[] arr1 = new int[5]; // OK!
    int arr2[] = new int[5]; // OK! C-style.

    // 배열은 최대 int값만 가능하다. 그래서 Long은 불가능. 즉 21억이 최대이다.
    // 배열의 크기는 int 타입의 최대 값에서 2를 뺀 값 이다.
    // 배열의 최대 크기 = Integer.MAX_VALUE-2
    // int[] arr3 = new int[2147483647]; // 실행 오류
   //int[] arr3 = new int[2147483647]; //컴파일은 OK but 실행 오류!!!!! 문법상에는 오류가 없는데 JVM의 제한을 초과해 실행 오류가 난다.
  // int[] arr3 = new int[Integer.MAX_VALUE - 2]; // 그래서 정수 최대값에서 -2를 해줘야 한다. 이것이 배열을 만들 수 있는 최대 크기.
                                                // 그래서 배열은 21억때까지만 만들수 있다.
   int[] arr3 = new int[2147483645]; // compile and .exe OK

   //실행 오류 발생!
// 단 자바 힙 메모리가 부족하다는 오류가 발행할 수 있다.
   //Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
   //JVM이 OS로부터 사용 허가를 받은 메모리 크기를 벗어났기 때문에 발생한 것이다.


   //해결책?
   //=> JVM을 실행할 때 힙(heap) 메모리의 초기 크기를 늘려라.
   //=> JVM 실행 옵션에 다음을 추가하라
          // -Xms메모리크기
          //예 $ java -Xmx10g //10기가바이트 할당. 참고로 Xms는 미니멈 Xmx는 멕시멈.
  }
}


