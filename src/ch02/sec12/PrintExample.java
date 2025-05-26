package ch02.sec12;

public class PrintExample {
  public static void main(String[] args){
    int value = 12300;
    System.out.printf("상품의 가격:%,d원\n", value);
    // 콘솔에 데이터 찍는 목적(출력)

    String result = String.format("상품의 가격:%,d원\n", value);
    // 데이터를 문자열로 만드는 목적(n차 가공 가능)
    System.out. println(result);

    System.out.printf("상품의 가격:%10d원\n", value);
    // %와 d 사이에 숫자를 넣으면 자릿수 지정

    System.out.printf("상품의 가격:%-10d원\n", value);
    // -는 오른쪽 정렬

    System.out.printf("상품의 가격:%010d원\n", value);
    // 0은 앞에 공백 자릿수 다 0으로 채움

    int year = 2025;
    int mon = 9;
    int day = 4;
    // 2025-09-04
    System.out.printf("%d-%02d-%02d\n", year, mon, day);

    int radius = 10;
    double area = 3.14159 * 10 * 10; // 반지름 10인 원의 넓이
    System.out.printf("반지름이 %d인 원의 넓이:%f\n", radius, area);
    System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n", radius, area);
    System.out.printf("반지름이 %d인 원의 넓이:%010.2f\n", radius, area);
    System.out.printf("반지름이 %d인 원의 넓이:%-10.2f\n", radius, area);

    String name = "홍길동";
    String job = "도착";
    System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
  }
}
