package com.eomcs;

import java.util.Date;
import java.util.Scanner;

//01. main(): 프로그램 entry point
//02. 사용자로부터 명령어 입력 받기
//03. 사용자로부터 계속 명령어 입력 받기
//04. quit 명령어를 입력 받았을 때 반복 종료하기
//05. 명령어 별로 실행을 분기하기
//06. 게시글 입력 받기
//07. 배열을 이용하여 여러 개의 게시글 보관하기
//08. 상수(final 변수)를 이용하여 배열의 크기를 다루기
//09. 게시글 목록 출력하기
//10. 게시글 상세 조회
//11. 게시글 조회수 추가하기
//12. 게시글 등록일 추가하기
//13. 게시글 변경하기
//14. 게시글 삭제하기
//15. 메서드 문법을 이용하여 기능 별로 명령어를 묶어 관리하기
//16. 클래스를 이용하여 새 데이터타입을 정의하기
//17. 클래스를 이용하여 메서드를 분류하기 
//18. 데이터 목록을 다루는 코드를 재사용하기 쉽게 별도의 클래스로 분리한다.
//19. 메뉴 선택 기능을 추가
public class App {

  // 한 개의 게시글을 담을 복합 데이터의 변수를 설계
  static class Board {
    String title;
    String content;
    String password;
    int viewCount;
    Date createdDate;
  }

  static Scanner keyScan = new Scanner(System.in);

  public static void main(String[] args) {

    // App 클래스에서 만든 Scanner 인스턴스를 BoardHandler 와 같이 쓴다.
    BoardHandler.keyScan = keyScan;

    menuLoop: while (true) {
      System.out.println("[메뉴]");
      System.out.println("  1: 게시글 관리");
      System.out.println("  2: 회원 관리");
      System.out.print("메뉴를 선택하시오. (종료: quit) [1..2] ");
      String menuNo = keyScan.nextLine();

      switch (menuNo) {
        case "1":
          loop: while (true) {
            System.out.print("게시글 관리> ");
            String command = keyScan.nextLine();

            switch (command) {
              case "list": BoardHandler.list(); break;
              case "add": BoardHandler.add(); break;
              case "update": BoardHandler.update(); break;
              case "delete": BoardHandler.delete(); break;
              case "view": BoardHandler.view(); break;
              case "back":
                break loop;
              default:
                System.out.println("지원하지 않는 명령입니다.");
            }
            System.out.println();
          }
          break;
        case "2":
          break;
        case "quit":
          break menuLoop;
        default:
          System.out.println("메뉴 번호가 옳지 않습니다.");
      }

      System.out.println();
    }



    keyScan.close();

    System.out.println("안녕히 가세요!");
  }





}
