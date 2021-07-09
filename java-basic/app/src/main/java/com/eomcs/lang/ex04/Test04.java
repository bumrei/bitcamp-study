package com.eomcs.lang.ex04;


public class Test04 {
  public static void main(String[] args) {
    // 배열 메모리의 시작 주소를 저장할 레퍼런스 선언
    // 배열에서 변수를 초기화 시킨다 -> initialize
    int [] a;

  
    // 레퍼런스 변수에 배열 메모리의 주소를 준다.

    a = new int [3];

    a[0] = 100;
    a[1] = 200;
    a[2] = 300;
   // a[3] = 400; // out of bounds "범위를 벗어났다." 즉 인덱스가 존재하지 않기 때문에 출력 오류

    System.out.println(a[0]);
    System.out.println(a[1]);
    System.out.println(a[2]);
  //  System.out.println(a[3]); // out of bounds "범위를 벗어났다." 즉 인덱스가 존재하지 않기 때문에 출력 오류

    int [] b;

  //  b = 200; // 여기서 200은 인트값이다. 하지만 b는 배열 주소이다. 그래서 이것을 컴파일 하면 오류 난다.
    b = a;
    System.out.println(b[1]);
    


    // System.out.println();

  }
}
