package ch05.sec04;

public class NullPointerExceptionExample {
  public static void main(String[] args) {
    int[] arr = null;
    arr[0] = 10;
    //System.out.println(arr.length());  처리못함
    // null한테는 아무것도 시킬 수 없음

    String str = null;
    //System.out.println(str.length()); 처리못함
  }
}
