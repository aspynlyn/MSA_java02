package ch04.sec04;

public class Mission04 {
  public static void main(String[] args){
    int dan = (int)(Math.random() * 8.0) + 2;
    System.out.printf("%d단\n", dan);
    for(int i = 1; i <=9; i++){
      System.out.printf("%d X %d = %d\n", dan, i, dan*i);
    }
  }
}
