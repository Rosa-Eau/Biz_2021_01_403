package com.callor.applications.service;

public class ClassServiceV1 {
	/*
	 * java 코딩을 할 때
	 * {} 내에서 같은 이름의 변수는 2번 이상 선언 불가
	 * class {} 내에서 같은 이름의 메서드는 2번 이상 선언 불가
	 * 하지만, java에서는 method의 매개변수 개수, 타입이 다르면
	 * 같은 이름의 method를 중복하여 선언할 수 있다.
	 */
	public void add(int num1, int num2){
		System.out.println(num1 + num2);
	}
	public void add(int num1, float num2) {
		System.out.println(num1 + num2);
	}
	public void add(double num1, float num2) {
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
		System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
		System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
	}
	
	//메소드의 모양만 만들어둔 것(실행X) = 프로토타입
	//한 개의 클래스 내에서는 같은 이름의 메소드를 선언할 수 없음
	//그러나 자바에서는 매개변수의 타입이 다른 경우 같은 이름의 메소드를 선언할 수 있음 --> 중복선언, 다형성
}
