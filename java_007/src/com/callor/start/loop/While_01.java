package com.callor.start.loop;

public class While_01 {
	
	public static void main(String[] args) {
		
		int count = 0;
		System.out.println(3 + 4 * 3 - 3);
		System.out.println(3 - 4 * 3 + 3);
		System.out.println(10 + 20 + 30 + count++);
		//변수 뒤에 ++나 --가 붙으면 콘솔에 모든 연산 계산 출력 후 계산됨.
		/*
		 * 단항연산자(++,--)가 변수의 뒤(끝)에 있을 경우
		 * 현재 명령어를 모두 실행하고 그 이후에
		 * 1을 증가(++) 또는 감소(--)
		 */
		
		//정말 무한반복
		//for(;;){}
		//while문은 조건에 따라 반복됨
		while(true) {
			System.out.println(count++ + "대한민국");
			if(count > 10) {
				break; //조건충족시 멈추어라
			}
		}
	}

}
