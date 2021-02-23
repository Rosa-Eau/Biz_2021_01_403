package com.callor.applications.service;

public class PrimeServiceV1 {

	public void prime(int num) {
		int pos = 0; 
		for (pos = 2; pos < num; pos++) {
			if (num % pos == 0) {
				break;
			}
		}
		
		if (pos < num) {
			System.out.println(num + "(은)는 소수가 아닙니다.");
		} else {
			System.out.println(num + "(은)는 소수입니다.");
		}

	}

}
