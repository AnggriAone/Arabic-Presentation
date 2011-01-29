package com.alidbc.test;
import com.alidbc.arabicPresentation.ArabicReshaper;
public class TestArabicPresentation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Convert Arabic raw chars to Arabic presentation form
		//أ م ا ن ة
		String raw = "\u0623\u0645\u0627\u0646\u0629";
		//Present Arabic
		//أمانة
		String processed = ArabicReshaper.reshape(raw);
		System.out.println(processed);
	}

}
