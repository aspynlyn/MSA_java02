package ch02.sec10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Mission02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.printf("숫자를 입력해 주세요 > ");
    String strNum = sc.next();

    char[] charArray = strNum.toCharArray();
    int num = 0;
    int num2 = 0;
    for (char c : charArray) {
      if (c % 2 == 1) {
        num++;
      } else {
        num2++;
      }
    }
    System.out.printf("홀수 : %d, 짝수 : %d\n", num, num2);

    int[] intArray = new int[2];
    int value = Integer.parseInt(strNum);
    do {
      int digit = value % 10;
      intArray[digit % 2]++;
    } while ((value /= 10) > 0);

    System.out.printf("홀수 : %d, 짝수 : %d\n", intArray[1], intArray[0]);
  }
}
