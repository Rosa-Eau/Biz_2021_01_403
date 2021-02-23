package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Array_04 {

	public static void main(String[] args) {

		int[] intNums = new int[100];
		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt(10) + 1;
		}

		System.out.println("1 ~ 10 사이의 정수를 입력하세요");
		System.out.print("숫자 입력 >> ");
		int keyNum = scan.nextInt();
		
		/*
		 * 변수는 앞에서 어떤 값을 지정했던 상관없이
		 * 가장 마지막에 저장한 값만 가지고 있다.
		 */

		int lastPos = 0;
		for (int position = 0; position < intNums.length; position++) {
			if (intNums[position] == keyNum) {
				//키보드로 입력한 값이 일치할때마다
				//그 위치를 lastPos에 저장한다.
				lastPos = position;
			}
		}
		//여기에서 lastPos에 저장된 값은
		//가장 마지막으로 lastPos = position이 실행된 결과만 담고 있다.
		System.out.println(keyNum + "은(는) 배열 intNums의 " + lastPos + "번째 위치에서 마지막으로 나타납니다.");

	}

}
