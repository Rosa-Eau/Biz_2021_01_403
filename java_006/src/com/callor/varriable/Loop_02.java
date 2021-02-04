package com.callor.varriable;

public class Loop_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 정수형 변수 num1의 값을
		 * 1씩 증가시키고(1,2,3,4,5...)
		 * 그 값을 Console에 출력하라
		 *                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
		 */
		int num1 = 0;
		for(;;) {
			num1 += 1;
			System.out.println(num1);
		}
	//정수형 변수 최대 크기 = 2의 32승	
	//이 값이 넘어가면 -값이 나옴 --> 더이상 값을 저장할 수 없다는 메세지
	}

}
