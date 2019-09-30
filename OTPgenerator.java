package com.regex;
import java.util.*;
public class RegexDemo{
	public static char[] generateOTP(int length) {
		System.out.println("your otp is :");
		String s="0123456789";
		Random obj=new Random();
		char[] otp=new char[length];
		for(int i=0;i<length;i++) {
			otp[i]=s.charAt(obj.nextInt(s.length()));
		}
		return otp;
	}
	public static void main(String...args) {
		System.out.println(generateOTP(4));
	}
}