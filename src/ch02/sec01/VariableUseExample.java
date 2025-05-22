package ch02.sec01;

public class VariableUseExample {
  public static void main(String[] args) {
    int hour = 3;
    int min = 5;

    System.out.println(hour + "시간 " + min + "분");
    System.out.printf("총 %d분\n", hour*60+min);
  }
}
