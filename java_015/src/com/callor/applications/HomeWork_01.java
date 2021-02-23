package com.callor.applications;

import java.util.Random;

import com.callor.applications.service.PrimeServiceV2;

public class HomeWork_01 {

	public static void main(String[] args) {

		Random rnd = new Random();
		PrimeServiceV2 psV2 = new PrimeServiceV2();

		
		System.out.println(psV2.prime(2));
		/*
		int[] num = new int[100];

		for (int i = 0; i < num.length; i++) {
			num[i] = rnd.nextInt(10) + 1;
		}
		for (int i = 0; i < num.length; i++) {
			boolean bYes = psV2.prime(num[i]) < 0;
			if(bYes) {
			} else{
				System.out.println(num[i]);
			}
		}
		*/
	}
}
