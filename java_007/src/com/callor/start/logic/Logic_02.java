package com.callor.start.logic;

public class Logic_02 {
	public static void main(String[] args) {
		//등호의 오른쪽 값을 왼쪽의 변수에 담아라
		//bool연산, 논리연산 bool계수
		//불값, 논리연산결과를 담는 변수
		//boolean, Boolean
		boolean bYes = 3 ==3;
		bYes = 3 > 3;
		//bYes는 true에서 false가 됨
		System.out.println(bYes);
		
		bYes = 3 >= 3;
		
		int num1 = 55;
		int num2 = 65;
		
		bYes = num1 >= num2;
		bYes = num1 * 2 >= num2;
		//곱셈연산은 논리연산보다 우선함
		bYes = (num1 * 2) >= num2;
		//보통은 먼저 계산하고 싶은 연산에 괄호를 치는 것이 좋다
		
	}

}
