package ch05.sec05;

public class IndexOfContainsExample {
  public static void main(String[] args) {
    String subject = "자바 프로그래밍 나이스";
    int idx = subject.indexOf("프로그래밍");
    System.out.println(idx);

    System.out.println(subject.indexOf("그"));

    // 해당 문자열에 내가 찾는 문자열이 있는가?

    boolean result = subject.contains("나이스");
    System.out.println(result);
  }
}
