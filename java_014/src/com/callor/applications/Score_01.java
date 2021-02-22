package com.callor.applications;
/*
 * 학생 3명의 국어, 영어, 수학 점수를
 * (학생명의 과목점수를 저장할 배열을 선언)
 * 키보드로 입력받아서
 * console에 리스트를 출력하기
 * 
 * 1. 학생 3 명의 3 과목의 점수를 저장할 배열
 * 2. 배열이 나오면 일단 for 반복문이 한번쯤은 나타난다
 * 3. 학생 3 명의 3 과목의 점수를 어떻게 입력 받을 것인가?
 * 
 */
import java.util.Scanner;

public class Score_01 {
	public static void main(String[] args) {
		/*
		 * 변수는 1개의 변수에 1개의 값만 저장할 수 있다
		 * => 3명 학생의 과목점수를 저장해야 하기 때문에
		 * 		각 과목을 배열로 선언
		 * => 몇 개의 배열이 필요한지 명시(알려주기)
		 * 			=new int[개수];
		 */
		
		int[] intKor = new int[3];
		int[] intEng = new int[3];
		int[] intMath = new int[3];
		
		//[개수] : 필요한 개수만큼 배열을 만들어라
		int[] intSum = new int[5];
		int[] intAvg = new int[100];
		
		Scanner scan = new Scanner(System.in);
		
		//3명 학생의 과목 성적 입력받기
		//1. 국어과목의 3 학생 점수를 입력받기
		//2. 학생별로 국어, 영어, 수학 점수를 각각 입력받기
		
		//1. 과목별로 학생 점수 입력받기
		
		//학생 인원수가 몇 안될 때에는 아래처럼 단순히
		//복사 붙이기로 코드를 작성해도 된다
		System.out.println("국어 과목의 점수입력");
		System.out.print("1번 학생 >>");
		intKor[0] = scan.nextInt();
		System.out.print("2번 학생 >>"); 
		intKor[1] = scan.nextInt();
		System.out.print("3번 학생 >>"); 
		intKor[2] = scan.nextInt();
		
		//for() 반복문을 이용하여 반복되는(복사&붙이기)
		//코드를 단순하게 만든다
		System.out.println("영어 점수 입력");
		for(int index = 0 ; index < intEng.length ; index++) {
			int num = index + 1;
			System.out.print(num + "번 학생 >> ");
			intEng[index] = scan.nextInt();
		}
		System.out.println("수학 점수 입력");
		for(int index = 0 ; index < intMath.length ; index++) {
			int num = index + 1;
			System.out.print(num + "번 학생 >> ");
			intMath[index] = scan.nextInt();
		}

		System.out.println("=================================");
		System.out.println("국어\t영어\t수학");
		System.out.println("---------------------------------");
		for(int i = 0 ; i < 3 ; i++) {
			System.out.printf("%d\t%d\t%d\n",intKor[i],intEng[i],intMath[i]);
		}
		
	}

}
