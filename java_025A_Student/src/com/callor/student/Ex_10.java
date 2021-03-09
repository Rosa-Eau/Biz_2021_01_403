package com.callor.student;

import com.callor.student.values.Values;

/*
 * 구구단 7단
 */
public class Ex_10 {
	
	public static void main(String[] args) {
		
		System.out.println(Values.dLine(50));
		System.out.println("구구단 7단");
		System.out.println(Values.sLine(50));
		for(int i = 0 ; i < 9 ; i++) {
			
			int num1 = 7;
			int num2 = i + 1;
			int result = num1 * num2;
			System.out.printf("%d * %d = %d\n", num1 , num2, result);
			
		}
		System.out.println(Values.dLine(50));
		
	}

}
