package ch04.sec02;

import java.util.Scanner;

public class Mission02 {
  public static void main(String[] args) {
    /*
    (점수를 입력받는다)
    점수를 입력해주세요 > 99 (점수 입력 후 엔터)

    (100초과 혹은 0미만ㅇ면) "잘못된 점수입니다."
    (90점이상) "A"
    (80점이상) "B"
    (70점이상) "C"
    (나머지) "D"
     */

    Scanner scanner = new Scanner(System.in);
    System.out.println("점수를 입력해 주세요>");
    int temp = scanner.nextInt();

    if(temp > 100 || temp < 0){
      System.out.println("잘못된 점수입니다");
    } else if (temp > 89) {
      System.out.println("A");
    }else if (temp > 79) {
      System.out.println("B");
    }else if (temp > 69) {
      System.out.println("C");
    }else{
      System.out.println("D");
    }

    if(temp > 100 || temp < 0){
      System.out.println("잘못된 점수입니다");
    } else {
      switch (temp / 10) {
        case 10:
        case 9:
          System.out.println("A");
          break;

        case 8:
          System.out.println("B");
          break;

        case 7:
          System.out.println("C");
          break;

        default:
          System.out.println("D");

      }
    }
  }
}
