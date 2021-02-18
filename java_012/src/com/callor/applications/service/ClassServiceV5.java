package com.callor.applications.service;

public class ClassServiceV5 {
	
	private float result = 0;
	
	public float sum(float num1, float num2) {
		result = num1 + num2;
		return result;
	}
	
	public void print() {
		System.out.println(result);
		
	}

}
