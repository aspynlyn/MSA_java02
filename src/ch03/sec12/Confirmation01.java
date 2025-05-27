package ch03.sec12;

public class Confirmation01 {
  public static void main(String[] args) {
    int pencils = 534;
    int students = 30;

    // 학생 한 명이 가지는 연필 수
    int pencilsPerStudent = pencils / students;
    System.out.println(pencilsPerStudent);

    int pencilsLeft = pencils % students;
    System.out.println(pencilsLeft);


    int value = 356;
    System.out.println(value / 100 * 100);

    System.out.println(value - value % 100);

    int x = 10;
    int y = 5;
    System.out.println((x > 7) && (y <= 5)); // true
    System.out.println((x % 3 == 2) || (y % 2 != 1)); // false
  }
}
