package com.noorteck.qa.karateApi.features;

import org.openqa.selenium.support.events.internal.EventFiringTouch;

import com.github.javafaker.Faker;

public class DataGeneration {

	public static void main(String[] args) {
		
		Faker obj = new Faker();
		
		for(int i = 1; i <=10; i++) {
			
			String firstName = obj.name().firstName();
			String lastName = obj.name().lastName();
			String city = obj.address().cityName();
			
			System.out.println(firstName+ ":  " + lastName+":  "+city);
		}
	}
}
