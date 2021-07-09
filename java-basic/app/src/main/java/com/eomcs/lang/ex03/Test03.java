package com.eomcs.lang.ex03;

class Test03 {
    public static void main (String[] args) {
       
        System.out.println(2.127f);
        System.out.println(1.1f+1.027f);
        System.out.println(2.0f+0.127f);
        System.out.println(1.123f+1.004f); /* 손실이 발생한다. 부동 소수점을 2진수로 바꾼다면 정확하게 딱 맞아떨어지게 바뀌지 않는다.
                                            0.00001 같은 차이가 발생할 것이다.*/
                                            /* 그래서 반올림이 필요. 2.17 != 2.126999999 -> 그래서 반올림 필요 */
        System.out.println((2.0f+0.127f) == 2.127f); // true
        System.out.println((1.123f+1.004f) == 2.127f); // false -> 이런경우를 조심해야한다!!!!! 어설프게 부동 소수점 논리 연산 잘못했다가 큰일 난다.

        


    }
}