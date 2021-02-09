package com.callor.start.jdk.keyinput;

import java.util.Random;
import java.util.Scanner;

public class DoNotEatMe {
	
	public static void main(String[] args) {
		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);
		
		//난수 1개 생성
		int rndNum = rnd.nextInt(100) + 1;
		while(true) {
			System.out.println("스핑크스 : 다섯번 안에 숫자를 맞추지 못하면 잡아먹겠다!!");
			for(int i = 0; i < 5 ; i++) {
				System.out.print("숫자입력 (-1:Quit) >> ");
				int keyNum = scan.nextInt();
				}
				if(i > 5) {
					break;
				}
				if(keyNum == rndNum) {
					System.out.println("꽤나 쓸만한 놈이군, 내 노예가 돼라!");
				} else if(keyNum > rndNum) {
					System.out.println("그것보단 크다!");
				} else if(keyNum < rndNum) {
					System.out.println("그것보단 작다!");
				}
				System.out.println("잘먹겠습니다 냠냠");
				if( keyNum < 0) {
					System.out.println("잘먹겠습니다 냠냠");
					break;
			}
			System.out.println("Game Over");
		}
	}
}
