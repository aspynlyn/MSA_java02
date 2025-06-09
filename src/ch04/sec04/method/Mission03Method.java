package ch04.sec04.method;

import ch02.sec11.ScoreMethodExample;

public class Mission03Method {
  public static void main(String[] args) {
    int star = ScoreMethodExample.getRandomValue(3, 7);
    System.out.println("star: " + star);


    // 5였다면 *****(개행)
    // 3이었다면 ***(개행)
//    printSingleLine(star);
//    System.out.println("==========");
//    printMultiLine(star);
    System.out.println("==========");
    printTriangleLine(star);
  }

  public static void printSingleLine(int star){
    for(int i = 0; i < star; i++){
      System.out.print("*");
    }
    System.out.println();
  }

  public static void printMultiLine(int star){
    for(int i = 1; i < star; i++){
      printSingleLine(star);
    }
  }

  public static void printTriangleLine(int star){
    for(int i = 1; i <= star; i++){
      printSingleLine(i);
    }
  }

}
