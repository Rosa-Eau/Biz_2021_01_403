package com.callor.oop;

import java.util.Scanner;

import com.callor.oop.model.ScoreVO;

public class Score_01 {
	public static void main(String[] args) {

		ScoreVO scVO = new ScoreVO();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("=============================================");
		System.out.println("성적입력 시스템 v1");
		System.out.println("=============================================");

		System.out.println("학생 이름을 입력하시오");
		System.out.print(">> ");
		scVO.strName = scan.nextLine();
		System.out.println("---------------------------------------------");
		System.out.println("성적을 입력하시오(50 이상 100 이하)");
		System.out.println("=============================================");

		while (true) {
			try {
				System.out.print("국어 >> ");
				String strKor = scan.nextLine();
				scVO.intKor = Integer.valueOf(strKor);
				boolean bYes_1 = scVO.intKor < 50;
				boolean bYes_2 = scVO.intKor > 100;
				if (bYes_1 || bYes_2) {
					System.out.println("!! 50이상 100이하의 숫자만 입력하시오 !!");
					continue;
				} else {
					break;
				}
			} catch (NumberFormatException e) {
				// TODO: handle exception
				System.out.println("!! 반드시 숫자로 입력해주세요 !!");
				continue;
			}
		}
		System.out.println("---------------------------------------------");

		while (true) {
			try {
				System.out.print("영어 >> ");
				String strEng = scan.nextLine();
				scVO.intEng = Integer.valueOf(strEng);
				boolean bYes_3 = scVO.intEng < 50;
				boolean bYes_4 = scVO.intEng > 100;
				if (bYes_3 || bYes_4) {
					System.out.println("!! 50이상 100이하의 숫자만 입력하시오 !!");
					continue;
				} else {
					break;
				}
			} catch (NumberFormatException e) {
				// TODO: handle exception
				System.out.println("!! 반드시 숫자로 입력해주세요 !!");
				continue;
			}

		}
		System.out.println("---------------------------------------------");

		while (true) {
			try {
				System.out.print("수학 >>");
				String strMath = scan.nextLine();
				scVO.intMath = Integer.valueOf(strMath);
				boolean bYes_5 = scVO.intMath < 50;
				boolean bYes_6 = scVO.intMath > 100;
				if (bYes_5 || bYes_6) {
					System.out.println("!! 50이상 100이하의 숫자만 입력하시오 !!");
					continue;
				} else {
					break;
				}
			} catch (NumberFormatException e) {
				// TODO: handle exception
				System.out.println("!! 반드시 숫자로 입력해주세요 !!");
				continue;
			}
		}
		System.out.println("=============================================");
		System.out.println("이름\t국어\t영어\t수학");
		System.out.println("---------------------------------------------"); 
		System.out.printf("%s\t%d\t%d\t%d\n", scVO.strName, scVO.intKor, scVO.intEng, scVO.intMath);
		System.out.println("=============================================");

	}

}
