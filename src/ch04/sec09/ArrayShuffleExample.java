package ch04.sec09;

import java.util.Arrays;

public class ArrayShuffleExample {
  public static void main(String[] args) {
    int[] arr = new int[10];

    for(int i=0; i< arr.length; i++){
      arr[i] = i + 1;
    }



    for(int i = 0; i < arr.length; i++){
      int num = (int)(Math.random() * 10.0);
      int temp = arr[i];
      arr[i] = arr[num];
      arr[num] = temp;


    }
    System.out.println(Arrays.toString(arr));
  }
}
