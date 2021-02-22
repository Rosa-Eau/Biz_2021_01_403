package com.callor.applications;

import java.util.Scanner;

public class Score_03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[] strName = new String[3];
		int[] intKor = new int[3];
		int[] intEng = new int[3];
		int[] intMath = new int[3];

		System.out.println("성적을 입력하시오");
		System.out.println("===========================================");
		for (int index = 0; index < strName.length; index++) {
			System.out.print("학생 이름 >> ");
			strName[index] = scan.nextLine();
			System.out.print(strName[index] + " 학생 국어 성적 >> ");
			String strKor = scan.nextLine();
			intKor[index] = Integer.valueOf(strKor);
			System.out.print(strName[index] + " 학생 영어 성적 >> ");
			String strEng = scan.nextLine();
			intEng[index] = Integer.valueOf(strEng);
			System.out.print(strName[index] + " 학생 수학 성적 >> ");
			String strMath = scan.nextLine();
			intMath[index] = Integer.valueOf(strMath);
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
