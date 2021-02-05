package com.callor.start;

public class Loop_02 {
	
	public static void main(String[] args) {
		
		//for문 안의 변수는 임시변수라 하며 일반적으로 i(index)를 사용
		for(int i = 0 ; i < 10 ; i += 10) {
			
		}
		
		//num라는 변수를 1 증가시켜라
		int num = 0;
		num = num + 1;
		num += 1;
		num =+ 1; //이 코드는 사용하지 말 것
		num++;
		++num; //단항연산자
		
		//num 변수를 1씩 감소시켜라
		num = num - 1;
		num -= 1;
		num--;
		--num;
		
		//일반적인 for 반복문 형식(패턴)
		for(int i = 0 ; i < 10 ; i++ ) {
			
		}
		
		for(int i = 100 ; i > 0 ; i-- ) {
			System.out.println(i);
		}
		
		
	}

}
