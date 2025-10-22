package ch05.sec05;

import java.util.Scanner;

public class Mission03 {
  public static void main(String[] args) {
    //BMI 계산 할 수 있는 프로그램
    // 체중(kg), 키(cm)로 입력받아서 BMI를 계산하여 출력해 주세요,
    Scanner sc = new Scanner(System.in);
    System.out.print("키(cm)를 입력해주세요 > ");
    String Height = sc.next();
    System.out.print("체중(kg)을 입력해주세요 > ");
    String weight = sc.next();

    double height = Double.parseDouble(Height);
    double kg = Double.parseDouble(weight);
    double mHeight = height * 0.01;

    double BMI = kg / Math.pow(mHeight, 2);
    System.out.printf("당신의 BMI는 %s 입니다", BMI);
  }
}
