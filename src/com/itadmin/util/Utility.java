package com.itadmin.util;

public class Utility {
	
//	public static void main(String[] args) {
//		int n =8;
	public static String randomString(int n) {
		
		String alphaNumericSpecialCharString ="ABCDEFGHIJKLMNOPQRSTUVWXYZ"+"1234567890"+"@#$&*_-%!"+"abcdefghijklmnopqrstuvwxyz";
		
		StringBuilder stringBuilder = new StringBuilder(n);
		for(int i =0; i<n; i++) {
			
			
			int  index = (int) (alphaNumericSpecialCharString.length() * Math.random());
//			System.out.println("index"+index);
			stringBuilder.append(alphaNumericSpecialCharString.charAt(index));
			
		}
		
		
//		System.out.println(stringBuilder.toString());
		
		return stringBuilder.toString();
	}

}
