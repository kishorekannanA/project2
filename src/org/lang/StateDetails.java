package org.lang;

import org.lang.LanguageInfo;

public class StateDetails{
	
	public void southIndia() {
		System.out.println("southindia");
	}
	public void northIndia() {
		System.out.println("northindia");
	}
	public static void main(String[] args) {
		StateDetails s = new StateDetails();
		LanguageInfo lang = new LanguageInfo();
		lang.englishLanguage();
		lang.tamilLanguage();
		lang.hindiLanguage();
		s.northIndia();
		s.southIndia();
		
	}
					
}
