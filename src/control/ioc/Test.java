package control.ioc;

import control.Tv;

public class Test {
	public static void main(String[] args){
		TvFactory tvFactory = TvFactory.getInstance();

//		TvFactory tvFactory1 = new TvFactory();
		Tv tv = tvFactory.factory("marten","jbl");
		tv.sound();
	}
}
