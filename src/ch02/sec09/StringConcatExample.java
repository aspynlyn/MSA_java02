package ch02.sec09;

public class StringConcatExample {
  public static void main(String[] args){
    // 숫자 연산
    int result1 = 10 + 2 + 8;
    System.out.println("result1: " + result1);

    // 결합 연산
    String result2 = 10 + 2 + "8";
    System.out.println("result2: " + result2); //128
    // 10 + 2 사칙연산 후 string과 만나 파싱됨. 12랑 8 결합

    String result3 = 10 + "2" + 8;
    System.out.println("result3: " + result3); //1028
    // string파싱 + string파싱

    String result4 = "10" + 2 + 8;
    System.out.println("result4: " + result4); //1028  
    
    String result5 = "10" + (2 + 8);
    System.out.println("result5: " + result5); //1010
    // 소괄호는 우선순위가 먼저이므로 사칙연산 후 string파싱
  }
}
