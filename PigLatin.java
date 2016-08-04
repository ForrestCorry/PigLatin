package com.ssa.day4.assignment;

import java.util.Scanner;

public class PigLatin {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		
		System.out.println("Please type in a word and I will translate it to Pig Latin");
		
		String userInput = sc.nextLine();
		
		
		char firstLetter = userInput.charAt(0);
		if (firstLetter == 'a' || firstLetter == 'e' || firstLetter == 'i' || firstLetter == 'o' || firstLetter == 'u' || firstLetter == 'y'
				|| firstLetter == 'A' || firstLetter == 'E' || firstLetter == 'I' || firstLetter == 'O' || firstLetter == 'U' || firstLetter == 'Y') {
			userInput = userInput.concat("-yay");
			System.out.println("The word you passed is  : " + userInput + " in Pig Latin");
		}
		else{
			StringBuilder modInput = new StringBuilder(userInput);
			modInput.deleteCharAt(0);
			modInput.append("-" + firstLetter + "ay");
			System.out.println("The word you passed is :" + modInput + " in Pig Latin");
		}
		
	}
}
