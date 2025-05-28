package ch04.sec04;

public class Mission02 {
  public static void main(String[] args) {

    System.out.print(1);
    for(int i=2; i<11; i++){
      System.out.printf(", %d", i);
    }

    System.out.println(" ");

    for(int i=1; i<=10; i++){
      System.out.print(i + (i < 10 ? ", " : ""));
    }

    System.out.println(" ");

    for(int i=1; i<=10; i++){
      System.out.print(i);
      if(i < 10) {
        System.out.print(", ");
    }

    }
  }
}
