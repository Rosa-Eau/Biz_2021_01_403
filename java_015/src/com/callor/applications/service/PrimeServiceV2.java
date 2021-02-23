package com.callor.applications.service;

public class PrimeServiceV2 {
	
	public int prime(int num) {
		System.out.println("num" + num);
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return -1;
			}
		}
		return num;
	}

}
