package com.callor.applications;

import java.util.Scanner;

import com.callor.applications.service.ClassServiceV7;

public class Class_09 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ClassServiceV7 csV7 = new ClassServiceV7();
		while (true) {
			System.out.print("2 ~ 9 까지의 정수 중 하나만 입력하시오 >> ");
			int dan = scan.nextInt();
			csV7.gugu(dan);

		}
	}

}
