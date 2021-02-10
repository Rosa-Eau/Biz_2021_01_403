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

		int rndNum = rnd.nextInt(100) + 1;
		System.out.println("스핑크스 : 다섯번 안에 숫자를 맞추지 못하면 잡아먹겠다!!");
		System.out.println("=========================================================");
		for (int i = 0; i < 5; i++) {
			System.out.print("숫자입력 (-1:Quit) >> ");
			int keyNum = scan.nextInt();
			
			boolean bigger = keyNum > rndNum;
			boolean smaller = keyNum < rndNum;
			boolean correct = keyNum == rndNum;
			if (correct) {
				System.out.println("꽤나 쓸만한 놈이군, 내 노예가 돼라!");
				break;
			} else if (bigger) {
				System.out.println("그것보단 작다!");
			} else if (smaller) {
				System.out.println("그것보단 크다!");
			}
			System.out.println();
		}
		System.out.println("주어진 기회가 모두 끝났군!");
		System.out.println("잘먹겠습니다 냠냠");
		System.out.println("Game Over");
	}
}
