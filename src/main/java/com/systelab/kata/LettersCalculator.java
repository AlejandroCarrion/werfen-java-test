package com.systelab.kata;

public class LettersCalculator {
	private final static int LASTPOS = 122;
	private final static int FIRSTPOS = 96;
	private static char[] alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
			's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
	public static String addLetters(String... letters) {
		if (letters.length == 0) {
			letters = new String[1];
			letters[0] = "z";
		}
		int sumTotal = getSumTotal(letters);
		char letterShow = (char) getUnicode(sumTotal,letters);
		String letter = String.valueOf(letterShow);
		
		return letter;
	}
	
	private static int getUnicode(int sumTotal,String[] letters) {
		int unicode = 0;
		if (letters[0].toCharArray()[0] + sumTotal > LASTPOS) {
			int resta = LASTPOS - letters[0].toCharArray()[0];
			sumTotal = sumTotal - resta;
			unicode = FIRSTPOS + sumTotal;
		} else {
			unicode = letters[0].toCharArray()[0] + sumTotal;
		}
		return unicode;
		
	}
	
	private static int getSumTotal(String[] letters) {
		int sumTotal = 0;
		for (int i = 0; i < alphabet.length; i++) {
			if (String.valueOf(alphabet[i]).equals(letters[0])) {
				for (int j = 1; j < letters.length; j++) {
					sumTotal = sumTotal + (letters[j].toCharArray()[0] - FIRSTPOS);
				}
			}
		}
		return sumTotal;
	}

}
