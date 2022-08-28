package org.lang;

public class LanguageInfo {

	public void tamilLanguage() {
		System.out.println("தமிழ்");
	}
	public void englishLanguage() {
		System.out.println("Engilsh");	
	}
		public void hindiLanguage() {
		System.out.println("hindi");
	}
	public static void main(String[] args) {
		LanguageInfo lang = new LanguageInfo();
		lang.tamilLanguage();
		lang.englishLanguage();
		lang.hindiLanguage();
	}

}
