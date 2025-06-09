package ch04.sec04.method;

public class Mission05Method {
	public static void main(String[] args) {
		int[] arr = { 10, 70, 90, 110};
		int sum = addAllUpArray(arr); // 배열 모든 값 더한 리턴
		System.out.println("sum : " + sum);

		int[] arr2 = { 1, 2, 10, 80, 77 };
		System.out.println("sum2 : " + addAllUpArray(arr2));
	}
	public static int addAllUpArray(int[] arr){
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		return  sum;
	}
}
