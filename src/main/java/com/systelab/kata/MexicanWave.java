package com.systelab.kata;

public class MexicanWave {
	public static String[] wave(String str) {
		char[] charArray = str.toCharArray();
		String[] wordsLetterUpperCase = new String[str.replace(" ", "").toCharArray().length];
		wordsLetterUpperCase = getWordsLetterUpperCase(charArray, wordsLetterUpperCase, str);
		return wordsLetterUpperCase;
	}

	private static String[] getWordsLetterUpperCase(char[] charArray, String[] wordsLetterUpperCase, String str) {
		int cont = 0;
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] != ' ') {
				char[] charArrayTmp = str.toCharArray();
				charArrayTmp[i] = Character.toUpperCase(charArray[i]);
				String wordLetterUpperCase = String.valueOf(charArrayTmp);
				wordsLetterUpperCase[cont] = wordLetterUpperCase;
				cont++;
			}
		}
		return wordsLetterUpperCase;
	}
}