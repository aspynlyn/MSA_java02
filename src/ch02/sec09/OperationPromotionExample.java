package ch02.sec09;

public class OperationPromotionExample {
  public static void main(String[] args){
    byte result1 = 10 + 20;
    System.out.println("result1: " + result1);

    byte v1 = 10, v2 = 20;
    int result2 = v1 + v2;
    // byte 타입이 int타입으로 자동 형변환 됨
    System.out.println("result2: " + result2);

    byte v3 = 10;
    int v4 = 100;
    long v5 = 1000L;
    long result3 = v3 + v4 + v5; // >> 최종 결과 타입은? long

    // v3(byte) + v4(int)
    // v3(int) + v4(int) >> 110(int) int로 형변환

    // 110(int) + v5(long)
    // 110(long) + v5(long) >> 1110(long) long으로 형변환

    char v6 ='A';
    char v7 = 1;
    int result4 = v6 + v7;
    System.out.println("result4:" + (char)result4);

    int v8 = 10;
    int result5 = v8 / 4;
    System.out.println("result5: " + result5);

    int v9 = 10;
    double result6 = v9 / 4.0;
    System.out.println("result6: " + result6);

    int v10 = 1;
    int v11 = 2;
    double result7 = (double) v10 / v11;
    System.out.println("result7: " + result7);
  }
}
