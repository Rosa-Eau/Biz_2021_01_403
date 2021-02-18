package com.callor.applications.service;

public class ClassServiceV7 {

	public void gugu(int dan) {
		
		System.out.println("========================================");
		System.out.printf("%d단 구구단\n", dan);
		System.out.println("----------------------------------------");
		
		if (dan < 2) {
			System.out.println("2 이상의 값을 입력해주십시오");
		} else if (dan > 9) {
			System.out.println("9 이하의 값을 입력해주십시오");
		} else {
			for (int i = 0; i < 9; i++) {
				int num = i + 1;
				System.out.printf("%d X %d = %d\n", dan, num, dan * num);
			}

		}
		System.out.println("========================================");


	}

}
