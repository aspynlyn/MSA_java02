package ch04.sec04;

public class Mission03 {
  public static void main(String[] args){
    int star = (int)(Math.random() * 6.0) + 3;

    System.out.println("star: " + star);

    for(int i = 1; i <= star; i++){
      for(int k = 1; k <= star; k++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
