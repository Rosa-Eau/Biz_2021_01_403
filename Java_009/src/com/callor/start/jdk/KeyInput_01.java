package com.callor.start.jdk;

import java.util.Scanner;

public class KeyInput_01 {
	//키보드로 숫자 2개를 입력받고
	//두 숫자의 덧셈을 계산	 
	public static void main(String[] args) {
		
		System.out.println(); //Console 출력문
		
		//키보드로부터 무언가를 입력받기 위함
		Scanner scan = new Scanner(System.in);
		System.out.print("첫 번째 숫자 입력 >> ");
		//scan.nextInt(); 는 숫자를 입력받기 위함
		int intNum1 = scan.nextInt(); //숫자를 입력받고 입력받은 숫자를 intNum1 에 저장
		System.out.print("두 번째 숫자 입력 >> ");
		int intNum2 = scan.nextInt(); //숫자를 입력받고 입력받은 숫자를 intNum2 에 저장
		System.out.println(intNum1 + intNum2);
		
	}

}
