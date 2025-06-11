package ch06.sec11;

public class FinalStudy {
	public static void main(String[] args) {
		final int NUM = 10;
//		NUM = 20;
		final int NUM_2;
		NUM_2 = 20;
//		NUM_2 = 10;

		FinalObject fo1 = new FinalObject(10);
		FinalObject fo2 = new FinalObject(20);

		fo1.myAge();
		fo2.myAge(); // immutable
	}
}
