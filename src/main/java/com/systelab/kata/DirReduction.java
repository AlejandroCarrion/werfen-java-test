package com.systelab.kata;

import java.util.Arrays;

public class DirReduction {
	final static String north = "NORTH";
	final static String south = "SOUTH";
	final static String east = "EAST";
	final static String west = "WEST";
	public static String[] dirReduc(String[] arr) {
		boolean timeWaste = false;
		for (int i = 0; i < arr.length; i++) {
			timeWaste = isTimeWaste(arr,i);
			if (timeWaste) {
				arr = deleteDirections(arr,i);
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
		if (arr[i].equals(north)) {
			if (i > 0 && arr[i - 1].equals(south)) {
				timeWaste = true;
			}
		} else if (arr[i].equals(south)) {
			if (i > 0 && arr[i - 1].equals(north)) {
				timeWaste = true;
			}
		} else if (arr[i].equals(east)) {
			if (i > 0 && arr[i - 1].equals(west)) {
				timeWaste = true;
			}
		} else if (arr[i].equals(west)) {
			if (i > 0 && arr[i - 1].equals(east)) {
				timeWaste = true;
			}
		}else {
			timeWaste = false;
		}
		return timeWaste;
	}
	
	private static String[] deleteDirections(String[] arr, int i) {
		int arrReduced = arr.length - 2;
		if (arr.length - 2 == 1) {
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