package com.eomcs.lang.ex04;


public class Test01 {
  public static void main(String[] args) {

    char c; // Unicode 문자코드를 저장하는 변수 (0 ~ 65,532)

    c = 0x0041; // A 문자에 해당하는 Unicode를 16진수로 표현하여 저장한다.
    System.out.println(c); // c변수에 저장된 문자 코드를 println() 에 전달 하면
                           //println() 명령은 해장 문자 코드에 해당하는 폰트를 찾아 화면에 출력한다.  

    c = 0x41; // 숫자 앞에 00은 생략해도 된다. 단!!! 0x는 생략 노노
    System.out.println(c);

    c =65; //A 문자의 유니코드를 십진수로 표현해도 된다.
    System.out.println(c);

    c = '헐'; //한글 '헐'의 유니코드 값을 c 변수에 저장한 후 출력한다. 연산자는 Operatior 도구를 지칭하는 말
    System.out.println(c);
    // 위의 single quetation ''이건은 유니코드 값을 찾아 내게 하는 것이다 (?)
    // 여기서 '헐'이라는 문자를 메모리에 저장하는게 아니다. 이것은 문자에 해당하는 Unicode 2진수 값을 저장하는 것이다.!!!!!!!!!!!!
    // 모든 유니코드를 암기하기가 어렵기때문에 single quetation '' 이 도구가 있는 것 이다.




  
  }
}
