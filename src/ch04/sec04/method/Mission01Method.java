package ch04.sec04.method;

public class Mission01Method {
  public static void main(String[] args){
    int sum = sumFromTo(10,20);
    int sum2 = sumFromTo(15,49);

    System.out.println(sum);
    System.out.println(sum2);
  }

  public static int sumFromTo(int n1, int n2){
    int sum = 0;
    for(int i = n1; i <= n2; i++) {
      sum += i;
    }
    return sum;
  }
}
