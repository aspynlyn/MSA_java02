package practice.interfaces;

// 암호관련 A제품
public class AlphaCrypt {
  // 암호화
  public void maa(String str){
    System.out.printf("AlphaCrypt에서 %s를 암호화 하였습니다\n", str);
  }

  // 복호화
  public void mbb(String hashedStr){
    System.out.printf("AlphaCrypt에서 %s를 복호화 하였습니다\n", hashedStr);
  }
}
