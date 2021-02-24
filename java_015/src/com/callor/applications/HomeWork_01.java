package com.callor.applications;

import java.util.Random;

import com.callor.applications.service.PrimeServiceV2;

public class HomeWork_01 {

	public static void main(String[] args) {

		Random rnd = new Random();
		PrimeServiceV2 psV2 = new PrimeServiceV2();

		int[] num = new int[100];
		int intPrimeCount = 0;
		int intPrimeSum = 0;

		for (int i = 0; i < num.length; i++) {
			num[i] = rnd.nextInt(100) + 2;
		}
		System.out.println("임의의 정수 100개 중 소수인 수들");
		System.out.print("List = [ ");
		for (int i = 0; i < num.length; i++) {
			int result = psV2.prime(num[i]);
			if (result > 0) {
				intPrimeSum += num[i];
				System.out.print(num[i] + " ");
			}

		}
		System.out.println("]");
		System.out.println("Sum = " + intPrimeSum);
	}
}
