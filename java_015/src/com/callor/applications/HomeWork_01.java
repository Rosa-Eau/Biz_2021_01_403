package com.callor.applications;

import java.util.Random;

import com.callor.applications.service.PrimeServiceV2;

public class HomeWork_01 {

	public static void main(String[] args) {

		Random rnd = new Random();
		PrimeServiceV2 psV2 = new PrimeServiceV2();

		int[] num = new int[100];

		for (int i = 0; i < num.length; i++) {
			num[i] = rnd.nextInt(100) + 2;
		}
		System.out.println("임의의 정수 100개 중 소수인 수");
		System.out.print("List = [ ");
		for (int i = 0; i < num.length; i++) {
			boolean bYes = psV2.prime(num[i]) < 0;
			if (bYes) {
			} else {
				System.out.print(num[i] + " ");
			}
		}
		System.out.print("]");
	}
}
