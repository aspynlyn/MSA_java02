package ch06.sec08;

public class CalculatorExample {
  public static void main(String[] args){

    Calculator cal = new Calculator();
//    new(객체생성연산자) 다음에 오는 건 생성자함수 여기선 Calculator객체 안에 있는 생성자함수만 적을 수 있음
    int result = cal.plus(1, 2);
    System.out.println(result);
    System.out.println(cal.plus(2, 3));
    System.out.println("끝");

    cal.powerOn();
    cal.powerOff();
  }
}
