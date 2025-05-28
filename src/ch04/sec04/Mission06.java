package ch04.sec04;

public class Mission06 {
  public static void main(String[] args) {


  int num = 0;
  int sum = 0;

  while (true) {
    if (sum + (num + 1) > 100) {
      break;
    }
  num++;
  sum += num;
  }
  System.out.println(num);
  }
}
