package com.java.string;
import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;

public class Regax {
	 private static final Logger LOG = Logger.getLogger("MyLog"); 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text="Fingress";
		String re="........";
		Pattern pt= Pattern.compile(re);
		Matcher mt=pt.matcher(text);
		
		boolean result=mt.matches();
		LOG.info(re);
		System.out.println(result);
		
		String email1="abc@gmail.com";
		String email2="defgmail.com";	
		System.out.println("email1=" + validateEmail(email1));
		System.out.println("email2=" + validateEmail(email2));	
		Scanner sc = new Scanner(System.in);
		String phonenumber=null;
		int x;
		for (x=0;x<=3;x++) {
			System.out.println("enter p-hone number");
			phonenumber=sc.next();
			String regax="^(\\+?\\d{1,4}[\\s-])?(?!0+\\s+,?$)\\d{10}\\s*,?$";
			System.out.println("\n The phbone number is:"+phonenumber);
			System.out.println("\n is the above number is valid phone number?" + phonenumber.matches(regax));
			System.out.println();
		}
		
		

	}
	public static String validateEmail(String email) {
		if (email==null || email.isEmpty()) {
			return "invalidEmail";
		}
		String emailregax="^[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]+)*@[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]+)*$";
		Pattern pt=Pattern.compile(emailregax);
		if (pt.matcher(email).matches()){
			return "valid emaill";
			
		}
		else {
			return "invalid email";
		}
		
	}

}
