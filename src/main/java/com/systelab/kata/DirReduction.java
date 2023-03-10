package com.systelab.kata;

import java.util.Arrays;

public class DirReduction {
	private final static String NORTH = "NORTH";
	private final static String SOUTH = "SOUTH";
	private final static String EAST = "EAST";
	private final static String WEST = "WEST";

	public static String[] dirReduc(String[] arr) {
		boolean timeWaste = false;
		for (int i = 0; i < arr.length; i++) {
			if (i > 0) {
				timeWaste = isTimeWaste(arr, i);
			}
			if (timeWaste) {
				arr = deleteDirections(arr, i);
				int arrayFinalLength = arr.length - 2;
				arr = Arrays.copyOf(arr, arrayFinalLength);
				i = 0;
			}
			timeWaste = false;
		}
		return arr;
	}

	private static boolean isTimeWaste(String[] arr, int i) {
		boolean timeWaste = false;
		if (arr[i].equals(NORTH) && arr[i - 1].equals(SOUTH) || arr[i].equals(SOUTH) && arr[i - 1].equals(NORTH)
				|| arr[i].equals(EAST) && arr[i - 1].equals(WEST) || arr[i].equals(WEST) && arr[i - 1].equals(EAST)) {
			timeWaste = true;
		}
		return timeWaste;
	}

	private static String[] deleteDirections(String[] arr, int i) {
		int arrReduced = arr.length - 2;
		if (arr.length - 2 == 1 && i + 1 < 2) {
			arr[0] = arr[i + 1];
		} else {
			for (int j = i - 1; j < arrReduced; j++) {
				arr[j] = arr[i + 1];
				i++;
			}
		}
		return arr;
	}

}