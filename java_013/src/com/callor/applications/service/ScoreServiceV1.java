package com.callor.applications.service;

import java.util.Scanner;

public class ScoreServiceV1 {
	
	//클래스 영역에 선언된 변수들
	//클래스 영역 : 멤버 영역
	//인스턴스 변수
	//ScoreServiceV1 클래스를 객체로 선언하고
	//초기화( =new SSV1())하면 자동으로 사용할 준비가 되는 변수들
	private Scanner scan = new Scanner(System.in);
	private int intKor = 0;
	private int intEng = 0;
	private int intMath = 0;
	private int intSum = 0;
	private float floatAvg = 0;
	// input() method가 호출되면 키보드를 통해서 국어, 영어, 수학 점수를 입력받고
	//intKor, intEng, intMath에 저장
	public void input() {
		// TODO Auto-generated method stub
		System.out.print("국어 성적을 입력하시오 >> ");
		intKor = scan.nextInt();
		System.out.print("영어 성적을 입력하시오 >> ");
		intEng = scan.nextInt();
		System.out.print("수학 성적을 입력하시오 >> ");
		intMath = scan.nextInt();

	}
	public void sum() {
		// TODO Auto-generated method stub
		intSum = intKor + intEng + intMath;

	}
	public void avg() {
		// TODO Auto-generated method stub
		floatAvg = intSum / 3f;

	}
	public void print() {
		// TODO Auto-generated method stub
		System.out.printf("%s : %d\t", "국어", intKor);
		System.out.printf("%s : %d\t", "영어", intEng);
		System.out.printf("%s : %d\t", "수학", intMath);
		System.out.printf("%s : %d\t", "총점", intSum);
		//%3.2f : 실수값을 출력하는데 정수부분 3자리, 소수점 이하 2자리 출력
		//소수점 3번째에서 반올림
		System.out.printf("%s : %3.2f", "평균", floatAvg);

	}

}
