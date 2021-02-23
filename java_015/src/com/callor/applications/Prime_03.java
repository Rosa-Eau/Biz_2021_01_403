package com.callor.applications;

import java.util.Scanner;
import com.callor.applications.service.PrimeServiceV2;

public class Prime_03 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		PrimeServiceV2 psV2 = new PrimeServiceV2();
		System.out.println("숫자를 입력하시오");
		System.out.print(">> ");
		int keyNum = scan.nextInt();
		psV2.prime(keyNum);
		
		boolean bYes = psV2.prime(keyNum) < 0;
		if(bYes) {
			System.out.println("소수가 아닙니다.");
		} else{
			System.out.println("소수입니다.");
		}
		
	}

}
