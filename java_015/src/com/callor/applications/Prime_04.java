package com.callor.applications;

import java.util.Random;

/*
 * 배열없이 단순하게 난수를 생성하고
 * 소수인지 판별하여 출력하기
 * 중복(이중) 반복문
 */
public class Prime_04 {
	
	public static void main(String[] args) {
		
		for(int i = 0 ; i < 10 ; i++) {
			for(int j = 0 ; j < 10 ; j++) {
				//여기 코드는 i 반복횟수 * j 반복횟수만큼 반복됨
			}
		}
		
		
		
		Random rnd = new Random();
		
		for(int i = 0 ; i < 10 ; i++) {
			int rndNum = rnd.nextInt(1000) + 1;
			int index = 0;
			for(index = 2 ; index < rndNum ; index++) {
				if(rndNum % index == 0) {
					break;
				}
				
			}
			if(index < rndNum) {
				System.out.println(rndNum + "은 소수아님");
			}
			
		}
		
	}

}
