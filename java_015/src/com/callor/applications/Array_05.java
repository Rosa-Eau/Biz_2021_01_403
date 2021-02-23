package com.callor.applications;

import java.util.Random;

public class Array_05 {

	public static void main(String[] args) {

		int[] intNums = new int[100];
		Random rnd = new Random();
		int intSum = 0;
		System.out.print("List = [ ");
		for (int i = 0; i < intNums.length; i++) {

			intNums[i] = rnd.nextInt(100) + 1;

			boolean bYes_1 = intNums[i] % 3 == 0;
			boolean bYes_2 = intNums[i] % 5 == 0;
			if (bYes_1 && bYes_2) {
				System.out.print(+intNums[i] + " ");
				intSum += intNums[i];
			}

		}
		System.out.println("]");
		System.out.println("List의 합 = " + intSum);

	}

}
