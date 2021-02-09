package com.callor.start.loop;

public class While_02 {
	
	public static void main(String[] args) {
		
		int count = 0;
		
		while(count++ < 10) {
			//0인 count 다음 번 반복부터 +1씩 추가가 되어 저장되며
			//count에 10이 저장되는 순간 while문이 끝나게 된다.
			System.out.println(count);
		}
		//1
		System.out.println(count++);
		//풀어쓰면
		System.out.println(count);
		count += 1;
		
		//2
		System.out.println(++count);
		//풀어쓰면
		count++;
		System.out.println(count);
		
		
		//int i - 0;
		for(int i = 0 ; i < 10 ; i++) {
			
		}
		//int i = 100;
	}

}
