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
		for (int i = 0; i < language.length; i++) {
			System.out.println(language[i]);
		}
	}

	public String deleteLanguage(String lang) {
		for (int i = 0; i < language.length; i++) {
			if (language[i] != null) {
				if (language[i].equals(lang)) {
					language[i] = null;
					return "deleted";
				}
			}

		}
		return "not deleted";
	}

	public String update(String oldLang, String newLang) {
		for (int i = 0; i < language.length; i++) {
			if (language[i] != null) {
				if (language[i].equals(oldLang)) {
					language[i] = newLang;
					return "Langugae Updated";
				}
			}
		}
		return "Language not updated";
	}
}
