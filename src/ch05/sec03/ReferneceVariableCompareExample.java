package ch05.sec03;

public class ReferneceVariableCompareExample {
  public static void main(String[] args){
    int [] arr1, arr2, arr3;

    // new가 선언되는 순간 새로운 주소값이 발행됨
    arr1 = new int[] {1, 2, 3};
    arr2 = new int[] {1, 2, 3};
    arr3 = arr2;

  }
}
