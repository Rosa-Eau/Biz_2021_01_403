package com.callor.start.logic;

/*
 * 논리(Logic) 연산
 * 참(yes, true), 거짓(no, false)를 판단하여
 * 어떤 행위를 수행하는 연산
 */
public class Logic_01 {
	
	public static void main(String[] args) {
		
		//3이 3미만인가
		System.out.println(3 < 3); //false 
		//3이 3초과인가
		System.out.println(3 > 3);
		//3이 3인가
		System.out.println(3 == 3); //true
		//3이 3이하인가
		System.out.println(3 <= 3); // true
		//3이 3이상인가
		System.out.println(3 >= 3); // true
		//논리연산은 위의 다섯가지 식에서부터 시작
	}

}
