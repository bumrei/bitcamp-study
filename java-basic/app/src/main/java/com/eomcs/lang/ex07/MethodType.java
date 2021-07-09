package com.eomcs.lang.ex07;

public class MethodType {

  // 메서드 1 
  //   파라미터 X 리턴값 X
  static void m1 () {
    System.out.println("메서드 1 : 파라미터도 없고 리턴값도 없습니다.");
    // 리턴 값이 없기 때문에 void 이다.
  }

  // 메서드 2
  //   파라미터 O 리턴값 X
  static void m2 (String len) {
    String a = "나이는 ";
    int b = 25;
    String c = "살 입니다";
    System.out.println("메서드 2 : "+len + a + b + c);
    // 리턴 값이 없기 때문에 void 이다. 
  }

  // 메서드 3
  //   파라미터 X 리턴값 O
  static String m3 () {
    return "메서드 3 : 안녕";
  }

  static int m3_1 () {
    return 17;
  }

  // 메서드 4
  //   파라미터 O 리턴값 O

  static String m4 (String a, String b, int c) {
    String abc = String.format("%s %s 어렸다. 하지만 곧 %d대 이다.", a, b, c);
    return abc;
  }

  static int m4_1 (int a, int b) {
    return a + b;
  }

  static void supportMethod4_1 (int len ) {
    String[] arr = {"메서드 4_1 : ", "ff", "gg", "hh"};
    for (int i = 0; i < len; i++) {
      System.out.print(arr[i]);
      System.out.print(" ");
    }
  }

  static int supMethod4_1 (int len) {
    return len + 1;
  }

  ////////////////////////////////////////////////////////////////////////////////////////////////////

  public static void main(String[] args) { 

    // 메서드 1
    m1();
    // 리턴 값이 없기 때문에 변수 선언이 필요 없다.

    // 메서드 2
    m2("그녀의 ");
    // 리턴 값이 없기 때문에 변수 선언이 필요 없다.

    // 메서드 3
    String r;
    r = m3();
    System.out.println(r);

    int r1 = m3_1();
    System.out.println("메서드 3 : 하지만 그의 나이는 " + r1 +"살 입니다.");
    //리턴 값이 있기 때문에 값을 받을라면 변수 선언을 해줘야 한다. 변수 선언을 안하면 오류는 아니고
    //그냥 아무 값 없지 출력 된다.

    // 메서드 4
    String a = "그들은";
    String b = "너무나도";
    int c = 20;
    String cda = m4(a, b, c);
    System.out.println("메서드 4 : " + cda);

    int a1 = 1;
    int b1 = 3;
    supportMethod4_1(m4_1(a1, b1));
    // 리턴 값이 있는 메서드가 리턴 값이 없는 메서드 안에 선언됐다면
    // 그 리턴 값이 있는 메서드는 변수 선언을 할 필요가 없다.
    System.out.println();

    int r2 = m4_1(a1, b1);
    supportMethod4_1(r2);
    // 뭐 원한다면 메서드를 변수 선언을 하여 리턴 값이 없는 다른 메서드 안에
    // 그 변수를 넣어도 된다. 하지만 깔끔 X
    System.out.println();

    int r3 = supMethod4_1(m4_1(a1, b1)); // 5
    System.out.println("메서드 4_1 : " + r3);
    // 반대로 리턴 값이 있는 메서드를 리턴 값이 있는 메서드에 선언했을 경우 가장 마지막에 실행 되는
    // 밖갓 메서드가 리턴 값이 있기 때문에 밖 메서드의 변수를 선언해줘야 한다. 하지만 안쪽에 있는
    // 메서드는 리턴 값이 있더라도 변수를 선언해 줄 필요는 없다.


  }
}
