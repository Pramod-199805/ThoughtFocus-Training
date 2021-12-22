package com.thoughtfocus.arrays.languagearray;

public class ListOfLanguages {
	public static void main(String[] args) {
		LanguageArray languages = new LanguageArray();
		languages.addLanguage("C language");
		languages.addLanguage("C++ language");
		languages.addLanguage("C#language");
		languages.addLanguage("Java language");
		languages.addLanguage("Python language");
		languages.addLanguage(".Net language");
		languages.addLanguage("Java Script language");
		languages.addLanguage("Perl language");
		languages.addLanguage("Ruby language");
		languages.addLanguage("SQL language");
		languages.addLanguage("MATLAB language");
		languages.addLanguage("PHP language");
		languages.addLanguage("AngularJS language");
		languages.addLanguage("React JS language");
		languages.addLanguage("MEAN and MERN Stack language");
		languages.printLanguages();
		languages.deleteLanguage("C language");
		System.out.println();
		System.out.println("DELETED LANGUAGES");
		languages.printLanguages();
	}

}
