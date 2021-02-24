package com.callor.score;

import java.util.Random;

public class Score_01 {
	
	public static void main(String[] args) {
		
		String[] strName = new String[]{"홍길동","이몽룡","성춘향","장녹수","임꺽정"};
		String[] strOrt = new String[]{"서울시", "익산시", "남원시", "한양시", "함흥시"};
		int arrLen = strName.length;
		int[] intKor = new int[arrLen];
		int[] intEng = new int[arrLen];
		int[] intMath = new int[arrLen];
		int[] intSum = new int[arrLen];
		float[] fAvg = new float[arrLen];
		Random rnd = new Random();
		
		//정수생성
		for(int i = 0 ; i < arrLen ; i++) {
			intKor[i] = rnd.nextInt(100) + 1;
			intEng[i] = rnd.nextInt(100) + 1;
			intMath[i] = rnd.nextInt(100) + 1;
		}
		
		//총점
		for(int i = 0 ; i < arrLen ; i++) {
			intSum[i] = intKor[i];
			intSum[i] += intEng[i];
			intSum[i] += intMath[i];
		}
		
		//평균
		for(int i = 0 ; i < arrLen ; i++) {
			fAvg[i] = intSum[i] / 3f;
		}
		
		System.out.println("========================================================");
		System.out.println("이름\t주소\t국어\t영어\t수학\t총점\t평균");
		System.out.println("--------------------------------------------------------");
		//출력
		for(int i = 0 ; i < arrLen ; i++) {
			System.out.printf("%s\t%s\t %d\t%d\t%d\t%d\t%3.2f\n",strName[i],strOrt[i],intKor[i],intEng[i],intMath[i],intSum[i],fAvg[i]);
		}
		
		
	}

}
