package practice.interfaces;

// 암호관련 B제품
public class BravoCrypt {
  // 암호화
  public void mcc(String str){
    System.out.printf("BravoCrypt에서 %s를 암호화 하였습니다\n", str);
  }

  // 복호화
  public void mdd(String hashedStr){
    System.out.printf("BravoCrypt에서 %s를 복호화 하였습니다\n", hashedStr);
  }
}
