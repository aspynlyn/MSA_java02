package ch06.sec08.exam03;

public class Car {
	private int gas;// private 멤버 필드
	private int oil;

	public Car() {
	}

	public Car(int gas, int oil) {
		this.gas = gas;
		this.oil = oil;
	}

	public int getGas() {
		return gas;
	}

	public void setGas(int gas) {
		this.gas = gas;
	}

	public int getOil() {
		return oil;
	}

	public void setOil(int oil) {
		this.oil = oil;
	}

}


