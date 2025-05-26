package ch02.sec08;

public class Mission01 {
  public static void main(String[] args) {
    int num1 = 10;
    int num2 = 3;

    double result = (double)num1/num2;
    // int가 double로 계산할 때 형변환 됨

    System.out.println("result : " + result);
  }
}
