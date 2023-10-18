package com.training.adi;

import java.util.regex.Pattern;

public class Validate {
	public static boolean validateMobileNumber(String number) {
        String regex = "^(\\+\\d{1,3}[- ]?)?\\d{10}$";
        return Pattern.matches(regex, number);
    }
	
	
	public static boolean validateEmail(String email) {
        String regex = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        return Pattern.matches(regex, email);
    }   
	
}
