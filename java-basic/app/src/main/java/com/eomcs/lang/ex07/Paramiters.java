package com.eomcs.lang.ex07;

public class Paramiters {
  // 가변 파라미터
  static void m1 (String... names) {
    for (int i = 0; i < names.length; i++) {
      System.out.printf("그으래 %s \n", names[i]);
    }
  }

  static void m2 (int... names) { // reference/ 그래서 인덱스를 사용해줘야 한다.
    int i = 0;
    while (i < names.length) {
      System.out.println(names[i]);
      i++;
    }
  }

  static void m3 (int a, String b, String... university) {
    int i = 0;
    while (i < university.length) {
      System.out.printf("저는 %d%s 그리고 %s대학교에 가고싶습니다.\n", a, b, university[i]);
      i++;
    }
  }

  static void m4 (int[] ages, String... names) {
    for (int i = 0; i < names.length; i++) {
      System.out.printf("안녕하세요. 저는 %d살이고 %s라고 합니다. \n", ages[i], names[i]);
    }
  }
  
  //배열 파라미터
  static void m5 (String[] names) {
    for (int i = 0; i < names.length; i++) {
      System.out.printf("이름 : %s\n", names[i]);
    }
  }

  static void m6 (String[] names, int a) {
    for (int i = 0; i < names.length; i++) {
      System.out.printf("이름 : %s\n나이 : %d \n", names[i], a);
    }
  }

  public static void main(String[] args) { /////////////////////////////////////////////////////////
    // 가변 파라미터
    m1("Hello","haha", "hoho", "야식을 끊자");

    m2(1,2,3,4,5);

    int a = 3;
    String b = "학년 입니다.";
    m3(a, b, "서울", "고려", "연세", "로얄 할로웨이");

    int[] age = {1,2,3,4,5};
    String[] name = {"홍길동", "송길동", "수길동", "강길동", "김길동"};
    m4(age, name);
    // 참고로 new int[], new String[] 은 안붙여도 괜찮은 것 같다.

    
    // 배열 파라미터
    String[] n = {"홍길동", "송길동", "수길동", "강길동", "김길동"};
    m5(n);
    System.out.println();

    int age1 = 125;
    String[] n1 = {"홍길동", "송길동", "수길동", "강길동", "김길동"};
    m6(n1, age1);

  }

}
