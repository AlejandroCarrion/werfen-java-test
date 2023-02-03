package com.systelab.kata;

import java.util.Arrays;

public class EvenNumbers {
	public static int[] divisibleBy(int[] numbers, int divider) {
		int lengthArrayDivisible = numbers.length - 1;
		int cont = 1;
		while (cont <= numbers.length) {
			if (numbers[lengthArrayDivisible] % divider == 0) {
				int tmp = numbers[lengthArrayDivisible];
				for (int j = lengthArrayDivisible; j >= 0; j--) {
					if (j == 0) {
						numbers[j] = tmp;
					} else {
						numbers[j] = numbers[j - 1];

					}
				}
			} else {
				lengthArrayDivisible--;
			}
			cont++;
		}
		numbers = Arrays.copyOf(numbers, lengthArrayDivisible + 1);
		return numbers;
	}
}
