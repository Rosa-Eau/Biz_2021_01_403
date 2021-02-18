package com.callor.start.jdk.keyinput;

import java.util.Random;
import java.util.Scanner;

/*
 * 배경설명 : 사막에서 길을 잃어버린 당신! 스핑크스와 마주치고 마는데....! 
 * 				다섯번 안에 숫자를 맞추지 못하면, 스핑크스에게 잡아먹힌다!!
 */

public class DoNotEatMe {

	public static void main(String[] args) {
		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);
		
		int startNum = scan.nextInt();
		boolean start = startNum > 0;

		while (start) {
			int rndNum = rnd.nextInt(100) + 1;
			System.out.println("스핑크스 : 다섯번 안에 숫자를 맞추지 못하면 잡아먹겠다!!");
			System.out.println("=========================================================");

			for (int i = 0; i < 5; i++) {
				System.out.print("숫자입력 (-1:Quit) >> ");
				int keyNum = scan.nextInt();
				boolean bYes = keyNum > 0;
				boolean bigger = keyNum > rndNum;
				boolean smaller = keyNum < rndNum;
				boolean correct = keyNum == rndNum;
				if (correct) {
					System.out.println("꽤나 쓸만한 놈이군, 먹음직스러운걸?");
					break;
				} else if (bigger && bYes) {
					System.out.println("그것보단 작다!");
				} else if (smaller && bYes) {
					System.out.println("그것보단 크다!");
				} else if (keyNum < 0) {
					System.out.println("포기하겠다고? 그렇다면 삶도 포기해라!");
					break;
				}	

			}
			System.out.println("잘먹겠습니다 냠냠");
			System.out.println();
			System.out.println("Game Over");
			System.out.println();
		}
	}
}
