package com.callor.oop.exp;

import java.util.Scanner;

public class Exception_01 {

	public static void main(String[] args) {
		
		Integer.valueOf("3");
		
		// try catch : 예외처리 
		// Exception 오류를 그냥 건너뛰게 만들어줌
		try {
			Integer.valueOf("");
			} catch(NumberFormatException e) {
				System.out.println("null 값은 숫자로 변환할 수 없음");
			}
			
		
		Scanner scan = new Scanner(System.in);
		System.out.println("0 이상의 정수를 입력하세요");
		System.out.print(">> ");
		String strNum = scan.nextLine();
		
		
		try {
			int intNum = Integer.valueOf(strNum);
			if(intNum < 0) {
			System.out.println("정수 0 이상 입력하세요!"); //예외상황을 처리
		} else {
			System.out.println("입력한 정수 : " + intNum);
		}
		} catch ( Exception e) {//Exception e : 지금부터 자바를 실행하면서 시작되는 모든 Exception을 다 잡아냄
			// TODO: handle exception
			System.out.println("반드시 숫자로 입력해주세요");
		}
		
		
		
		
		
	}

}
