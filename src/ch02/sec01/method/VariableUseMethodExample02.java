package ch02.sec01.method;

public class VariableUseMethodExample02 {
  public static void main(String[] args) {
    printTime(10, 20); // 10:20
    printTime(2, 9); // 02:09
    printTime(2, 12); // 02:09
    printTime(22, 2); // 02:09

    printTime(2, 9, 2); // 02:09:02
    printTime(12, 9, 22); // 12:09:22
  }

  public static String parseTime(int val) {
    return val < 10 ? "0" + val : String.valueOf(val);
  }

  public static void printTime(int first, int second, int third) {
    // System.out.printf("%02d : %02d : %02d\n", first, second, third);

    System.out.print(parseTime(first) + ":");
    printTime(second, third);
  }

  public static void printTime(int first, int second) {
    // System.out.printf("%02d : %02d\n", hour , min);

    System.out.println(parseTime(first) + ":" + parseTime(second));
  }
}