package ch13.sec01;

public class BoxObjectExample {
  public static void main(String[] args){
    BoxObj obj = new BoxObj();
    obj.setObj(10);
    int result = (int)obj.getObj();
    System.out.println("result: " + result);

    obj.setObj("문자열");
    String strValue = (String) obj.getObj();
    System.out.println("strValue: " + strValue);

    obj.setObj(true);

    // object타입은 모든 타입을 저장할 수 있음 단 object타입이 가장 상위 타입이므로 자동형변환을 해주지 않음
  }
}
