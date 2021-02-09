package com.callor.start.jdk;

import java.util.Scanner;

public class KeyInput_02 {
	public static void main(String[] args) {
		//Scanner 클래스를 객체로 생성하면서
		//운영체제의 키보드 시스템과 연결한다.
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("숫자 입력 >> ");
			int intNum1 = scan.nextInt();
			boolean bYes = intNum1 % 2 == 0;
			if(bYes) {
				System.out.println(intNum1 + "은 짝수입니다.");
			} else {
				System.out.println(intNum1 + "은 홀수입니다.");
			}
		}
	}
}
