package com.ccmsd.nielson;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


// To Validate
public class EmailValidation {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println(validateEmail("a@dom-ain.com"));
    }

    private static boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile("^[(a-zA-Z0-9\\_\\.)]+@[(a-z-A-Z)]+\\.(com|org|net)$");
        Matcher match = pattern.matcher(email);
        return match.matches();
    }
}
