package ch08.sec11.exam02;

public class DriverExample {
	public static void main(String[] args) {
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		Driver driver = new Driver();
		driver.drive(bus);
		driver.drive(taxi);

		// 익명객체. Vehicle 인터페이스를 implements한 객체의 주소값이 vehicle변수에 들어감
		// 인터페이스를 implements한 객체를 다이렉트로 만들어냄(일회용)
		Vehicle vehicle = new Vehicle() {
			@Override
			public void run() {

			}

			@Override
			public void stop() {

			}
		};
	}
}
