package com.systelab.kata;

public class LettersCalculator {
	public static String addLetters(String... letters) {
		if (letters.length == 0) {
			letters = new String[1];
			letters[0] = "z";
		}
		char[] alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
				's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		int sumTotal = 0;
		final int LASTPOS = 122;
		final int FIRSTPOS = 96;
		for (int i = 0; i < alphabet.length; i++) {
			if (String.valueOf(alphabet[i]).equals(letters[0])) {
				for (int j = 1; j < letters.length; j++) {
					sumTotal = sumTotal + (letters[j].toCharArray()[0] - FIRSTPOS);
				}
			}
		}
		
		int unicode = 0;
		if (letters[0].toCharArray()[0] + sumTotal > 122) {
			int resta = LASTPOS - letters[0].toCharArray()[0];
			sumTotal = sumTotal - resta;
			unicode = FIRSTPOS + sumTotal;
		} else {
			unicode = letters[0].toCharArray()[0] + sumTotal;
		}
		
		char letterShow = (char) unicode;
		String letter = String.valueOf(letterShow);
		
		return letter;
	}
}
