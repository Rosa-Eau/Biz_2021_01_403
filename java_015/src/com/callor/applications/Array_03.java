package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Array_03 {
	
	public static void main(String[] args) {

		int[] intNums = new int[100];
		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0 ; i < intNums.length ; i++) {
			intNums[i] = rnd.nextInt(10) + 1;
		}
		
		System.out.println("1 ~ 10 사이의 정수를 입력하세요");
		System.out.print("정수 >> ");
		int keyNum = scan.nextInt();
		System.out.print(keyNum + "은 배열 intNums의 ");
		for(int i = 0 ; i < intNums.length ; i++) {
			if(intNums[i] == keyNum) {
				System.out.print(i + " ");
				break;
			}
		}	
		System.out.println("번째 위치에서 최초로 나타납니다.");
	}

}
