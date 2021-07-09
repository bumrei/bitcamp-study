package com.eomcs;

public class ArrayList /* this */ {

  // 배열의 최대 크기를 지정하는 변수는 모든 인스턴스각 같다.
  // ==> 따라서 각 인스턴스 마다 이 변수를 가질 필요는 없다.
  // ==> 그러니 이 변수는 그냥 클래스 변수로 둔다.
  // ==> 보통 상수 변수(final 변수)는 클래스 변수(스태틱 변수)로 선언한다.
  static final int MAX_LENGTH = 100;

  // 각 인스턴스 마다 개별적으로 관리해야 하는 변수는 인스턴스 변수로 선언한다.
  Object[] list = new Object[MAX_LENGTH]; //ArrayList2 의 해결 방법 this.
  int size = 0; //ArrayList2 의 해결 방법 this.

  // 인스턴스 변수 (list, size)를 사용하는 메서드는 인스턴스 메서드를 전환한다.
  // 인스턴스 메서드는 인스턴스 주소를 받는 this이름의 레퍼런스가 내장하고 있다.
  void append(Object obj) {
    this.list[this.size++] = obj;
  }

  Object[] toArray() {
    Object[] arr = new Object[this.size];
    for (int i = 0; i < this.size; i++) {
      arr[i] = this.list[i];
    }
    return arr;
  }

  Object retrieve(int index) {
    return this.list[index];
  }

  void remove(int index) {
    for (int i = index; i < this.size - 1; i++) {
      this.list[i] = this.list[i + 1];
    }
    this.size--;
  }

}






