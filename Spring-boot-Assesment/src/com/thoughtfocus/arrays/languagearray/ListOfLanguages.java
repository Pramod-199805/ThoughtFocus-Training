package com.thoughtfocus.arrays.languagearray;

public class ListOfLanguages {
	public static void main(String[] args) {
		LanguageArray languages = new LanguageArray();
		languages.addLanguage("C language");
		languages.addLanguage("C++ language");
		languages.addLanguage("C#language");
		languages.addLanguage("Java language");
		languages.addLanguage("Python language");
		languages.addLanguage("dotNet language");
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
		languages.deleteLanguage("Python language");
		System.out.println();
		System.out.println("DELETED LANGUAGES");
		System.out.println(languages.deleteLanguage("C Language"));
		System.out.println(languages.deleteLanguage("PHP Language"));
		
		System.out.println();
		System.out.println("UPDATE LANGUAGES");
		System.out.println(languages.update("dotNet Language", ".Net Language"));
	}

}
