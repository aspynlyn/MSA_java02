package ch06.sec08.exam02;

public class Computer {
	public int sum(int... values){
		int sum = 0;
		for(int i : values){
			sum += i;
		}
		return sum;
	}
}
