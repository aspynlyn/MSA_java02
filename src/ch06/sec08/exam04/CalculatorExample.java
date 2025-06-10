package ch06.sec08.exam04;

public class CalculatorExample {
	public static void main(String[] args) {

		Calculator cal = new Calculator();
		double area = cal.areaRectangle(40);
		System.out.println("square area: " + area);

		double area2 = cal.areaRectangle(20, 30);
		System.out.println("rectangle area: " + area2);
	}
}
