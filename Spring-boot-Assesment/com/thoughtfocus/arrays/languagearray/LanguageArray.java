package com.thoughtfocus.arrays.languagearray;

public class LanguageArray {
	String[] language = new String[15];
	int index = 0;

	public void addLanguage(String lang) {
		if (index < 15)
			language[index] = lang;
		index++;
	}
	
	public void printLanguages() {
		for(int i=0;i<language.length;i++) {
			System.out.println(language[i]);
		}
	}
	
	public String deleteLanguage(String lang) {
		for(int i=0;i<language.length;i++) {
		if(language[i]==lang)
			language[i]=null;
		return "deleted";
	}
		return "Not Deleted";
	}
}
