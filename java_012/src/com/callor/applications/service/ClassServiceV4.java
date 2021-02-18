package com.callor.applications.service;

public class ClassServiceV4 {
	/*
	 * method 선언문에 변수 선언 키워드(int, float ... )이 있으면
	 * 이 키워드를 return type이라고 부른다.
	 */
	public int result() { //선언문
		//아래는 method 코드
		int num1 = 30;
		int num2 = 40;
		int sum = num1 + num2;
		/*
		 * 1. 현재 실행되고 있는 method를 무조건 끝내라
		 * 
		 */
		return sum;
	}
	
	//매개변수로 받은 2개의 값을 덧셈하여 return하라
	public int result(int num1, int num2) {
		return num1 + num2;
	}
	//매개변수로 받은 2개의 실수 값을 덧셈하여 return하라
	//이 때 return하는 연산 겨로가값이 float 이기 때문에 return type도 float이 되어야 한다.	
	public float result(float num1, float num2) {
		// return (int)(num1 + num2); --> 연산 결과값이 정확하지 않음, 사용 불가
		return num1 + num2;
	}
	
	public void print() {
		System.out.println("우리나라만세");
	}
	
}

