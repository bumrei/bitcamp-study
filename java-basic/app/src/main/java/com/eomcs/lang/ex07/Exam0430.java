package com.eomcs.lang.ex07;

//# 메서드 : 인스턴스와 Heap 메모리 영역
//
public class Exam0430 {

  //변수 설계도 heap에 어떤 변수를 만들어야 하는지 적어 놓은 설계도.
  static class MyObject {
    int a;
    int b;
  }

  static MyObject getMyObject() {
    // Exam03_3.java 에 정의된 MyObject 클래스 사용
    // new를 사용해 heap 메모리에 MyObject class의 설계도에 맞게 변수 선언
    MyObject ref = new MyObject(); 
    // 그리고 변수 ref에는 heap 메모리 안에 new MyObject 인스턴스들의 주소를 할당한다.
    // 선언 후 heap 메모리에 있는 ref 주소의 MyObject 인스턴스들의 값을 초기화 해줌.
    ref.a = 100; // ref 주소로 찾아가서 a 변수에 100을 집어 넣어라
    ref.b = 200; // ref 주소로 찾아가서 b 변수에 200을 집어 넣어라

    // 그다음 ref 주소를 통채로 호출된 main으로 리턴함
    return ref;
  }

  public static void main(String[] args) {
    MyObject ref;
    ref = getMyObject();

    System.out.println(ref.a); //주소 ref에 변수 a 값을 출력하라
    System.out.println(ref.b); //주소 ref에 변수 b 값을 출력하라
    System.out.printf("a : %d // b : %d\n", ref.a, ref.b);

    ref.a = 300;
    System.out.printf("a : %d // b : %d", ref.a, ref.b);
  }
}

// 1) main() 호출
//    => JVM Stack: args, ref 변수 생성
// 2) getMyObject() 호출
//    => JVM Stack: ref 변수 생성
//    => Method Area: MyObject 클래스를 로딩
//    => Heap: MyObject 설계도에 따라 인스턴스 생성
// 3) getMyObject() 호출 끝
//    => JVM Stack: getMyObject() 관련 메모리(ref 변수) 제거
//    => MyObject의 인스턴스의 주소 리턴
// 4) main() 호출 끝
//    => JVM Stack: main() 관련 메모리 제거 
// 5) JVM 종료
//    => JVM이 사용한 모든 메모리(Method Area, JVM Stack, Heap 등)를 OS 반납.