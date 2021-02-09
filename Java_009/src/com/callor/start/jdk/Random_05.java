package com.callor.start.jdk;
/*
 * for(int i = 0 ; i < 100 ; i++)
 * Random 클래스 이용
 * 
 * 1~100까지 범위의 임의의 숫자 100개 만들고
 * 100개 중에 짝수가 있으면 짝수들의 합을 계산 
 */
import java.util.Random;

public class Random_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Sum = 0;
		Random rnd = new Random();
		for(int i = 0 ; i < 100 ; i++) {
			int num = rnd.nextInt(100) + 1;
			boolean bYes = num % 2 ==0;
			
			if(bYes) {
				//num이 짝수면 실행되는 부분
				//num값을 다른 변수(sum)에 누적
				Sum += num;
			}
			
		}
		System.out.println(Sum);

	}

}