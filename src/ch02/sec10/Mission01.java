package ch02.sec10;

import java.util.Scanner;

public class Mission01 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.printf("숫자를 입력해 주세요> ");
    String strNum = scanner.next();
    int num = Integer.parseInt(strNum) * 2;
    System.out.printf("%d\n", num);

    int num2 = Integer.parseInt(strNum);
    System.out.printf("%d\n", num2 * 2);





  }
}
