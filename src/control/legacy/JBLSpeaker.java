package control.legacy;

import control.MartenWoofer;
import control.Speaker;
import control.Woofer;

public class JBLSpeaker implements Speaker {
	private Woofer woofer;

	public JBLSpeaker(){
		this.woofer = new MartenWoofer();
	}

	@Override
	public void speakerSound(){
		System.out.println("JBLSpeaker: 깔끔");
		this.woofer.baseSound();
	}
}
