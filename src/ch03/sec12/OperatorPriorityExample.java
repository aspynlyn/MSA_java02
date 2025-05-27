package ch03.sec12;

public class OperatorPriorityExample {
  public static void main(String[] args){
    /*
    연산 우선순위
    (x > 0 && y < 0)의 연산 순서는?
    1. x > 0
    2. y < 0
    3. boolean결과 && booldean결과

    (100 * 2 / 3 % 5)의 연산 순서는?
    1. 100 * 2
    2. 1의 결과값 / 3
    3. 2의 결과값 % 5

    a = b = c = 5;
    1. c = 5
    2. b = c
    3. a = b
    = 연산자는 오른쪽부터 계산
     */

    int var1 = 1, var2 = 3, var3 = 2;
    int result = var1 + var2 * var3;
    System.out.println("result: " + result); // 7

    result = (var1 + var2) * var3;
    System.out.println("result: " + result); // 8
  }
}
