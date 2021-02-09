package com.callor.start;

public class Multiple_01 {
	public static void main(String[] args) {
		int intSum = 0;
		for(int i =0; i < 100; i++) {
			int num = i+1;
			boolean bYes_3 = num % 3 ==0;
			boolean bYes_9 = num % 9 == 0;
			//3의 배수 이면서(and) 9의 배수
			if(bYes_3&&bYes_9) {
				intSum += num; // i를 더하지 않는다
				System.out.println(num + "는 3과 9의 배수");
				
			}
		}
		System.out.println("3과 9의 배수합은 : " + intSum);
		
		int Sum = 0;
		for(int i = 0; i < 100 ; i++) {
			int num1 = i + 1;
			boolean bYes_3 = num1 % 3 == 0;
			//if() 비교연산문을 중복 처리하는 방식
			if(bYes_3) { //3의 배수를 검사하고 맞으면
				boolean bYes_9 = num1 % 9 == 0;
				if(bYes_9) { //다시 9의 배수를 검사
					Sum += num1;
					System.out.println(num1);
					}
				}
			
			}
			System.out.println(Sum);
		}
	}

