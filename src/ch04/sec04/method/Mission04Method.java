package ch04.sec04.method;

public class Mission04Method {
	public static void main(String[] args) {
		gugudan(4);

		gugudan(4, 9);
	}

	public static void gugudan(int num){
		for(int i = 1; i<=9; i++){
			System.out.printf("%d X %d = %d\n", num, i, num*i);
		}
	}

	public static void gugudan(int num1, int num2){
		for(int i = num1; i<= num2; i++){
			gugudan(i);
		}
	}
}
