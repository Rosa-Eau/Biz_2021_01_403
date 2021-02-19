package com.callor.applications.service;

import java.util.Scanner;

public class ScoreServiceV2 {
	
	//클래스로 객체 선언 및 초기화(생성)
	private Scanner scan = new Scanner(System.in);
	
	//정수 및 실수형 변수 선언'만'
	private int intKor;
	private int intEng;
	private int intMath;
	private int intSum;
	private float floatAvg;
	private String strName;
	
	public void input() {
		System.out.println("학생 이름을 입력하세요");
		System.out.print("이름 >> ");
		/*
		 * public String nextLint(){
		 * 			return 키보드에서 입력받은 문자열;
		 * }
		 * 
		 * 키보드를 통해서 문자열을 입력받기 위해서는
		 * Scanner.nextLine() 메서드를 실행하고
		 * return ㄱ밧을 문자열변수에 저장한다.
		 */
		strName = scan.nextLine();
		System.out.println("각 과목의 점수를 입력하세요 ");
		System.out.print("국어 >> ");
		//public int nextInt(){
		// 			return 키보드로 입력한 정수;
		// }
		intKor = scan.nextInt();
		System.out.print("영어 >> ");
		intEng = scan.nextInt();
		System.out.print("수학 >> ");
		intMath = scan.nextInt();
	}
	public void sum() {
		
	}
	public void avg() {
		
	}
	public void print() {
		System.out.printf("이름 : %s", strName);
		System.out.printf("국어 : %3d\n", intKor);
		System.out.printf("영어 : %3d\n", intEng);
		System.out.printf("수학 : %3d\n", intMath);
		System.out.printf("총점 : %3d\n", intSum);
		System.out.printf("평균 : %3.2f\n", floatAvg);
		
	}
	

}
