package com.ssa.day4.assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class PigLatin {
	
	public static void main(String[] args) {
		char firstLetter;
		char secondLetter;
		
		Scanner keyboard = new Scanner(System.in);
		String enter;
		
		int length;
		
		int wordsNumber;
		System.out.println("Enter in the number of words you would like to add.");
		wordsNumber = Integer.parseInt(keyboard.nextLine());
		
		String inputs[] = new String[wordsNumber];
		String inputs2[] = new String[wordsNumber];
		
		for (int i = 0; i < wordsNumber; i++) {
			
			System.out.println("Enter in your word");
			inputs[i] = keyboard.nextLine();
			enter = inputs[i];
			StringBuilder pigLatinChange = new StringBuilder(enter);
			
			firstLetter = pigLatinChange.charAt(0);
			secondLetter = pigLatinChange.charAt(1);
			
			if (((consanantsAndVowels(firstLetter) == false)) && (consanantsAndVowels(secondLetter) == false)) {
				
				pigLatinChange = pigLatinChange.deleteCharAt(0);
				length = pigLatinChange.length();
				
				pigLatinChange = pigLatinChange.deleteCharAt(0);
				
				pigLatinChange = pigLatinChange.insert(pigLatinChange.length(), firstLetter + "" + secondLetter + "ay" );
				inputs2[i] = pigLatinChange.toString();
			}
			else if (consanantsAndVowels(firstLetter) == false) {
				pigLatinChange = pigLatinChange.deleteCharAt(0);
				length = pigLatinChange.length();
				pigLatinChange = pigLatinChange.insert(pigLatinChange.length(), firstLetter + "ay");
				inputs2[i] = pigLatinChange.toString();
			}
			else {
				pigLatinChange = pigLatinChange.insert(pigLatinChange.length(), "" + "ay");
				inputs2[i] = pigLatinChange.toString();
			}
		}
		System.out.println("Here is your Pig Latin translation!");
		
		for (int j = 0; j < wordsNumber; j++) {
			System.out.println(inputs2[j] + " ");//had to change the array the words were going to.
		}
	}
	
	public static boolean consanantsAndVowels(char numberOneLetter){
		boolean vowels = false;
		if (numberOneLetter == 'a') {
			vowels = true;
			return vowels;
		}
		else if (numberOneLetter == 'A') {
			vowels = true;
			return vowels;
		}
		else if (numberOneLetter == 'e') {
			vowels = true;
			return vowels;
		}
		else if (numberOneLetter == 'E') {
			vowels = true;
			return vowels;
		}
		else if (numberOneLetter == 'i') {
			vowels = true;
			return vowels;
		}
		else if (numberOneLetter == 'I') {
			vowels = true;
			return vowels;
		}
		else if (numberOneLetter == 'o') {
			vowels = true;
			return vowels;
		}
		else if (numberOneLetter == 'O') {
			vowels = true;
			return vowels;
		}
		else if (numberOneLetter == 'u') {
			vowels = true;
			return vowels;
		}
		else if (numberOneLetter == 'U') {
			vowels = true;
			return vowels;
		}
		else if (numberOneLetter == 'y') {
			vowels = true;
			return vowels;
		}
		else if (numberOneLetter == 'Y') {
			vowels = true;
			return vowels;
		}
		return vowels;
	}
}
