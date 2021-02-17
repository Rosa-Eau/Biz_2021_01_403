package com.callor.applications.service;

public class ScoreServiceV4 {
	
	public void print(int intKor, int intEng, int IntMath) {
		int intSum = intKor;
		intSum += intEng;
		intSum += IntMath;
		float fAvg = intSum / 3.0f;
		System.out.println("===========================================");
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println("-------------------------------------------");
		System.out.print(intKor + "\t");
		System.out.print(intEng+ "\t");
		System.out.print(IntMath + "\t");
		System.out.print(intSum + "\t");
		System.out.println(fAvg + "\t");
		System.out.println("===========================================");
	}
	
	public void score(int intSum, float floatAvg) {
		System.out.println("총점 : " + intSum);
		System.out.println("평균 : " + floatAvg);
	}

}
