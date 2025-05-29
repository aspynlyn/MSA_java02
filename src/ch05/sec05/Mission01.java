package ch05.sec05;

import java.util.Scanner;

public class Mission01 {
//  주민번호를 입력하시오.(xxxxxx-xxxxxxx)>
//  주민등록번호 길이가 다르면 "잘못입력하셨습니다"
//  길이가 맞다면 8번쨰자리의 값으로 "여성", "남성" 출력
//  8번째 자리가 1~4가 아니라면 "잘못 입력하셨습니다"
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("주민번호를 입력하시오. (xxxxxx-xxxxxxx)>");
    String num = scanner.nextLine();
    char gender = num.charAt(7);
    char hypen = num.charAt(6);

    if(num.length() != 14 || hypen != '-'){
      System.out.println("올바른 형식이 아닙니다.");
    }else{
      switch(gender){
        case '1':
        case '3':
          System.out.println("남");
          break;
        case '2':
        case '4':
          System.out.println("여");
          break;
        default:
          System.out.println("인간이 아닙니다.");
      }
    }
  }
}
