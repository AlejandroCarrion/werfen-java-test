package com.systelab.kata;

import java.util.Arrays;

public class DirReduction {
	public static String[] dirReduc(String[] arr) {
		boolean timeWaste = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("NORTH")) {
				if (i > 0 && arr[i - 1].equals("SOUTH")) {
					timeWaste = true;
				}
			} else if (arr[i].equals("SOUTH")) {
				if (i > 0 && arr[i - 1].equals("NORTH")) {
					timeWaste = true;
				}
			} else if (arr[i].equals("EAST")) {
				if (i > 0 && arr[i - 1].equals("WEST")) {
					timeWaste = true;
				}
			} else if (arr[i].equals("WEST")) {
				if (i > 0 && arr[i - 1].equals("EAST")) {
					timeWaste = true;
				}
			}
			if (timeWaste) {
				int arrReduced = arr.length - 2;
				if (arr.length - 2 == 1) {
					arr[0] = arr[i + 1];
				} else {
					for (int j = i - 1; j < arrReduced; j++) {
						arr[j] = arr[i + 1];
						i++;
					}
				}
				int arrayFinalLength = arr.length - 2;
				arr = Arrays.copyOf(arr, arrayFinalLength);
				i = 0;
			}
			timeWaste = false;
		}

		return arr;
	}
}