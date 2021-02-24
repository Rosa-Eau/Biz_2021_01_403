package com.callor.score.service;

public class ScoreServiceV1 {
	/*
	 * 3과목의 점수를 전달받아서
	 * 합산을 하고 결과를 return 하는 method
	 */
	public int scoreSum(int kor, int eng, int math) {
		int sum = kor;
		sum += eng;
		sum += math;
		return sum;
	}
	/*
	 * 총점을 전달받아
	 * 과목 수만큼 나누어 return
	 */
	public float scoreAvg(int sum) {
		return (float)sum / 3f;
	}
	
	/*
	 * 
	 */
	public void print(String a, int b, int c, int d, int e, float f) {
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%3.2f\n", a, b, c, d, e, f);
		System.out.println("--------------------------------------------------------");
	}
	
	/*
	 * 배열을 매개변수로 받는 print() method
	 */
	public void print(String[] strName,
			int[] intKor,
			int[] intEng,
			int[] intMath,
			int[] intSum,
			float[] fAvg) {
		System.out.println("========================================================");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("--------------------------------------------------------");
		for(int i = 0 ; i < strName.length ; i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%3.2f\n", strName[i], intKor[i], intEng[i], intMath[i], intSum[i], fAvg[i]);
			System.out.println("--------------------------------------------------------");
		}
	}
}
