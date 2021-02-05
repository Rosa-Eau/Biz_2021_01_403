package com.callor.start;

public class Loop_03 {
	public static void main(String[] args) {
		// main() method(local) scope 변수
		int intSum = 0;
		for(int i = 0 ; i < 10 ; i++) {
			intSum += 10;
			System.out.println(i+","+intSum);	
			//main() method scope 변수인
			//intSum은 for() 반복문 내에서
			//자유롭게 읽기, 저장이 가능
			//for문 밖에서 생성된 변수는 for문 안에서 읽을 수 있다.
		}
		//for(){}반복문이 종료된 후 읽을 수 있는 변수는 intSum
		//변수 i는 여기서 이미 소멸된 상태
		System.out.println("============================");
		System.out.println("intSum = " + intSum);
		
		//이미 선언되어 사용중인 변수를 clear
		intSum = 0;
		for (int i = 0 ; i < 10 ; i++) {
			int num1 = i + 1;
			intSum += num1;
		}
		//1~10까지의 덧셈을 계산하는 식
		System.out.println("1~10까지 덧셈 : " + intSum);	
	
		
	}

}
