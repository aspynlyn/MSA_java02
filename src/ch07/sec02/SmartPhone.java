package ch07.sec02;

public class SmartPhone extends Phone{
	public boolean wifi;

	public SmartPhone(String model, String color){
		super(model, color);
		System.out.println("SmartPhone 생성자 호출");
	}

	public void setWifi(boolean wifi){
		this.wifi = wifi;
	}
	public void internet() {
		System.out.println("인터넷 연결함");
	}

	public void bell(){
		System.out.println("스마트폰이 울린다");
	}
}
