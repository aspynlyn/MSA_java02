package ch04.sec09;

import java.util.Arrays;

public class ArrayShuffleExample {
  public static void main(String[] args) {
    int[] arr = new int[10];

    for(int i=0; i< arr.length; i++){
      arr[i] = i + 1;
    }
    System.out.println(Arrays.toString(arr));


//    0~9 랜덤값 구함
//    7이 나오면 0번방과 7번방 스와핑
//    2가 나오면 1번방과 2번방 스와핑
//    .
//    .
//    .
//    순서대로 9번방까지 반복

    for(int i = 0; i < arr.length; i++){
      int num = (int)(Math.random() * 10.0);
      int temp = arr[i];
      arr[i] = arr[num];
      arr[num] = temp;


    }
    System.out.println(Arrays.toString(arr));
  }
}
