package ch05.sec05;

public class EqualsExample {
  public static void main(String[] args) {
    String strVar1 = "홍길동";
    String strVar2 = "홍길동";

    // 동일성(ientity) 주소값이 같다면 동일함 ==비교 true
    // 동등성(equality) 값이 같다면 동등함 equals메소드

    String strVar3 = new String("홍길동");
    String strVar4 = new String("홍길동");
    // 동일하지는 않지만 동등은 함
  }
}
