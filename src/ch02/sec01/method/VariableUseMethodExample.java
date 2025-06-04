package ch02.sec01.method;

public class VariableUseMethodExample {
  public static void main(String[] args) {
    printTime(10, 20); // 10:20
    printTime(2, 9); // 02:09
    printTime(2, 12); // 02:09
    printTime(22, 2); // 02:09

    printTime(2, 9, 2); // 02:09:02
    printTime(12, 9, 22); // 12:09:22
  }
  public static void printTime(int first, int second, int third){
    // System.out.printf("%02d : %02d : %02d\n", first, second, third);

    String hourStr = (first >= 0 && first < 10) ? "0" + first : String.valueOf(first);
    System.out.print(hourStr + ":");
    printTime(first, second);
  }
  public static void printTime(int first, int second) {
    // System.out.printf("%02d : %02d\n", hour , min);

    String hourStr = (first >= 0 && first < 10) ? "0" + first : String.valueOf(first);
    String minStr = (second >= 0 && second < 10) ? "0" + second : String.valueOf(second);

    System.out.println(hourStr + ":" + minStr);
  }
}
