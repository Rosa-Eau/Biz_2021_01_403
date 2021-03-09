package com.callor.student;

import com.callor.student.model.StudentVO;

public class Ex_04 {
	
	public static void main(String[] args) {
		
		//배열 10개 선언
		StudentVO[] stdArray = new StudentVO[10];
		
		int index = 2;
		
		// 1 index자리에 들어있는 정수값과 같은 배열의 자리만 초기화
		stdArray[index] = new StudentVO();
		
		// 2 모든 배열 초기화
		for(int i = 0 ; i < stdArray.length ; i++) {
			stdArray[i] = new StudentVO();
		}
		
		stdArray[index].setStName("홍길동");
		stdArray[index].setStNum("0001");
		
		System.out.println("이름 : " + stdArray[index].getStName());
		System.out.println("학번 : " + stdArray[index].getStNum());
		
		
	}

}
