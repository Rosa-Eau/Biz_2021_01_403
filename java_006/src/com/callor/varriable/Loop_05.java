package com.callor.varriable;

public class Loop_05 {

	public static void main(String[] args) {
		
		int intDan = 7;
		for (int num = 1; num < 10 ; num += 1) {
			
		}
		for(int num = 1; num < 10 ; num += 1) {
			
		}
		//첫번째 for문이 실행되고 끝나면 num이라는 변수는 비워지게 됨.
		//num이라는 변수가 1부터 1씩 증가하여 10 미만일 때까지 9번 반복되는 코드.
		
		for(int num = 20; num < 42 ; num += 1) {
			System.out.println("안녕");
		}
		//42-20=22 번 반복됨
		
		//   시작값  	비교값  	증가값
		for(int num =12 ; num <= 20 ; num += 1) {
			System.out.println("반가워");
		}
		for (int num=12; num<=20; num+=2) {
			System.out.println(num);
		}
		

	}

}
