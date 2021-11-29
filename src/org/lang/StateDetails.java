package org.lang;

public class StateDetails {
	private void northIndia() {
		System.out.println("state is:north india ");
	}
private void southIndia() {
	System.out.println("state is :south india");
}
public static void main(String[] args) {
	StateDetails a=new StateDetails();
	a.northIndia();
	a.southIndia();
	LanguageInfo b=new LanguageInfo();
	b.englishLanguage();b.hindiLanguage();
	b.tamilLanguage();
	}
}
