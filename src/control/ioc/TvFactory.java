package control.ioc;

import control.*;

public class TvFactory {

	private static TvFactory tvFactory = null;

	public static TvFactory getInstance(){
		if(tvFactory == null){
			tvFactory = new TvFactory();
		}
		return tvFactory;
	}
	private TvFactory(){

	}

	public Tv factory(String wooferName, String speakerName){
		// 삼성 tv 객체화 하려면 뭐가 필요함? 스피커의 주소값
		// 스피커가 객체화 하려면 뭐가 필요함? 우퍼의 주소값
		Woofer woofer = switch (wooferName){
			case "marten" -> new MartenWoofer();
			case "genelec" -> new GenelecWoofer();
			default -> null;
		};

		System.out.println("woofer" + woofer);
		Speaker speaker = switch (speakerName){
			case "jbl" -> new JBLSpeaker(woofer);
			case "herman" -> new HarmanSpeaker(woofer);
			default -> null;
		};
		System.out.println("speaker" + speaker);
		return new SamsungTv(speaker);
	}
}
