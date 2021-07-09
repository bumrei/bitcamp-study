package com.eomcs;

class Calculator3 {
  int result;

  // non-static method = 인스턴스 메서드
  // => 인스턴스 주소를 받는 'this'라는 변수가 내장되어 있다.
  // => 따라서 개발자가 인스턴스 주소를 받는 파라미터로 선언할 필요가 없다.
  void plus(/*Calculator3 this,*/ int value) {
    this.result += value;
  }
}

public class Test3 {

  public static void main(String[] args) {
    Calculator3 obj1 = new Calculator3();
    Calculator3 obj2 = new Calculator3();

    // 메서드를 호출할 때 앞에 준 인스턴스 주소는
    // 메서드에 내장된 this 라는 변수에 전달된다.
    obj1.plus(100);
    obj1.plus(200);
    obj1.plus(300);


    obj2.plus(111);
    obj2.plus(222);
    obj2.plus(333);



    System.out.println(obj1.result);
    System.out.println(obj2.result);

  }

}
