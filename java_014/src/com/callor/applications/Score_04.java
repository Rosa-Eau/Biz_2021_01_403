package com.callor.applications;

import java.util.Scanner;

public class Score_04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[] strName = new String[] { "홍길동", "이몽룡", "성춘향" };
		int[] intKor = new int[3];
		int[] intEng = new int[3];
		int[] intMath = new int[3];
		System.out.println("성적을 입력하시오");
		System.out.println("===========================================");
		for (int index = 0; index < intKor.length; index++) {
			System.out.println(strName[index] + " 학생 성적 입력");
			System.out.print("국어 >> ");
			intKor[index] = scan.nextInt();
			System.out.print("영어 >> ");
			intEng[index] = scan.nextInt();
			System.out.print("수학 >> ");
			intMath[index] = scan.nextInt();
			System.out.println("==========================================");
		}

		System.out.println("이름\t국어\t영어\t수학");
		System.out.println("-----------------------------------------");
		for (int i = 0; i < strName.length; i++) {
			System.out.printf("%s\t%d\t%d\t%d\n", strName[i], intKor[i], intEng[i], intMath[i]);
		}
		System.out.println("=========================================");

	}

}
