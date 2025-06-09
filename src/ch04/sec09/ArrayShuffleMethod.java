package ch04.sec09;

import java.util.Arrays;

public class ArrayShuffleMethod {
	public static void main(String[] args) {
		int[] arr = makeArrayFromTo(5, 8); // [ 5, 6, 7 ]
		int[] arr2 = makeArrayFromTo(15, 20); // [ 15, 16, 17, 18, 19 ]

		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("arr2 : " + Arrays.toString(arr2));

		shuffleArray(arr);
		shuffleArray(arr2);

		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
	}
	public static int[] makeArrayFromTo(int from, int to) {
		int[] temp = new int[to - from];
		for (int i = 0; i < to - from; i++) {
			temp[i] = from + i;
		}
		return temp;
	}
	public static void shuffleArray(int[] arr){
		for(int i = 0; i<arr.length; i++){
			int num = (int)(Math.random() * arr.length);
			int temp = arr[i];
			arr[i] = arr[num];
			arr[num] = temp;
		}
	}
}
