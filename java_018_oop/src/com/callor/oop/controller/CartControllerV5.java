package com.callor.oop.controller;

import com.callor.oop.service.CartServiceV1;

/*
 * Controller 클래스
 * web application 프로젝트를 수행할 때 
 * 처음 시작하는 시작점 클래스
 * 
 * Servoce 등 모듈 클래스를 객체로 선언하고, 
 * 모듈 클래스의 method들을 호출하는 일만 수행
 */
public class CartControllerV5 {
	
	public static void main(String[] args) {
		
		CartServiceV1 csV1 = new CartServiceV1();
		
		csV1.inputCart();
	
		
	}

}
