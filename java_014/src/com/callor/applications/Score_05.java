package com.callor.applications;

import java.util.Random;

public class Score_05 {
	public static void main(String[] args) {
		String[] strName = new String[] { "홍길동", "이몽룡", "성춘향" };
		int[] intKor = new int[3];
		int[] intEng = new int[3];
		int[] intMath = new int[3];
		int intSum = 0;
		float fAvg = 0;
		Random rnd = new Random();

		for (int index = 0; index < strName.length; index++) {
			intKor[index] = rnd.nextInt(100) + 1;
			intEng[index] = rnd.nextInt(100) + 1;
			intMath[index] = rnd.nextInt(100) + 1;
		}

		System.out.println("=================================================");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-------------------------------------------------");
		for (int i = 0; i < strName.length; i++) {
			intSum = intKor[i] + intEng[i] + intMath[i];
			fAvg = intSum / 3f;
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n", strName[i], intKor[i], intEng[i], intMath[i], intSum, fAvg);
		}
		System.out.println("=================================================");

	}

}
