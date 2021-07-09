package com.eomcs.lang.ex07;

//# 메서드 : call by reference - MyObject
//
public class Test02 {
  static class MyObject {
    int a;
    int b;
  }

  static void swap (MyObject ref) {
    int temp;
    temp = ref.a;
    ref.a = ref.b;
    ref.b = temp;
    System.out.printf("a = %d, b = %d \n", ref.a, ref.b);

  }


  public static void main(String[] args) {
    MyObject ref = new MyObject();
    ref.a = 100;
    ref.b = 200;
    System.out.printf("a = %d, b = %d \n", ref.a, ref.b);

    swap(ref);
    System.out.printf("a = %d, b = %d \n", ref.a, ref.b);

  }
}
