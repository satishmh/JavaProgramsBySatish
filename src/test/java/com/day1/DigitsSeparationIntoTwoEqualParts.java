package com.day1;

public class DigitsSeparationIntoTwoEqualParts {

	public static void main(String[] args) {

		int input = 1234;
		
		int firstHalf = input / 100;
		
		System.out.println("First half "+firstHalf);
		
		int secondHalf = input % 100;
		
		System.out.println("Second half "+secondHalf);

	}
}
