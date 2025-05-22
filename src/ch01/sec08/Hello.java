package ch01.sec08;

// 클래스 Full Name : ch01.sec08.Hello

/*
클래스 선언
Hello: 클래스명
public 클래스명은 파일명과 동일해야함
 */

/**
 * 도큐먼트 주석
 */

public class Hello {
  /*
  main 메소드 선언
  main: 메소드 명
  main 메소드는 프로그램으로 시작점
   */
  public static void main(String[] args){
    // " " 쌍따움표 사이는 문자열. 문자열 안에서는 주석처리 안됨
    System.out.println("Hello, Java");
    System.out.println("Hello, /* 주석 처리 안됨 */ Java");

  }
}
