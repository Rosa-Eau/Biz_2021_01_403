package com.callor.student;

import java.util.Random;

import com.callor.student.values.Values;

/*
 * 정수형 배열 100개를 선언하여
 * 10~100까지 임의 정수를 생성하여 저장
 * 100개의 배열에 담긴 정수 중에 소수들만 찾아서 
 * Console에 출력
 */
public class Ex_08 {

	public static void main(String[] args) {

		Random rnd = new Random();
		int[] num = new int[100];
		System.out.println(Values.dLine(50));
		System.out.println("소수 리스트");
		System.out.println(Values.sLine(50));
		for (int i = 0; i < num.length; i++) {
			num[i] = rnd.nextInt(91)+10;
			int count = 0;
			for (count = 2; count < num[i]; count++) {
				if (num[i] % count == 0) {
					break;
				}
				
			}
			if(count >= num[i]) {
				System.out.println(num[i]);
			}
			
		}
		
		System.out.println(Values.dLine(50));

	}

}
