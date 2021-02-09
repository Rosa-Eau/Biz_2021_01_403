package com.callor.start.jdk;

import java.util.Random;
import java.util.Scanner;

public class KeyInput_03 {
		public static void main(String[] args) {
			Random rnd = new Random();
			int num1 = rnd.nextInt(100) + 1;
			Scanner scan = new Scanner(System.in);
			System.out.print("숫자입력 >> ");
			int keyNum = scan.nextInt();
			
			//1. keyNum > num1 이냐?
			//	맞으면 "큰값" 표시하고 종료
			if(keyNum > num1) {
				System.out.println(keyNum + "은(는) " + num1 + "보다 크다");
			}
			//2. 그렇지 않으면 keyNum < num1 이냐?
			//		맞으면 "작은값" 표시하고 종료
			else if(keyNum < num1) {
				System.out.println(keyNum + "은(는) " + num1 + "보다 작다");
			} 
			//3. 그렇지 않으면 keyNum == num1 이냐?
			//		맞으면 "같다" 표시하고 종료
			else if(keyNum == num1) {
				System.out.println(keyNum + "은(는) " + num1 + "과 같다");
			}
		}

}
