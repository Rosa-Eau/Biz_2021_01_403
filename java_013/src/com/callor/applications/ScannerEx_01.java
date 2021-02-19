package com.callor.applications;

import java.util.Scanner;

public class ScannerEx_01 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("두 개의 정수를 입력하세요");
		System.out.print("숫자 1 >> ");
		String num1 = scan.nextLine();
		System.out.print("숫자 2 >> ");
		String num2 = scan.nextLine();
		System.out.println(num1 + num2);
	}

}
