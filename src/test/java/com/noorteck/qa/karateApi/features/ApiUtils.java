package com.noorteck.qa.karateApi.features;

public class ApiUtils {

	// non-static method --> non-void return type
	public String convertToCaps(String str) {
		String result = "";
		result = str.toUpperCase();
		return result;
	}

	// static method --> non-void return type
	public static String convertToLower(String str) {
		String result = "";
		result = str.toLowerCase();
		return result;
	}

	// non-static method --> void return type
	public void combineStr(String city, String state) {
		String result = city + " : " + state;
		System.out.println(" Coming from java class: " + result);
	}

	// static method --> void return type
	public static void getFirstCharacter(String str) {
		char result = str.charAt(0);
		System.out.println(" Coming from java class: " + result);
	}

}
