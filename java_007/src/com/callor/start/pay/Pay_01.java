package com.callor.start.pay;

public class Pay_01 {
	public static void main(String[] args) {
		int pay = 4_789_800;
		int paper = 50_000;
		//for()반복문의 무한반복을 막기 위해
		//for()문을 종료하는 조건을 부여해야 함
		int sw = -1;
		for (;pay > 0;) {
			int count = pay / paper;
			pay -= (paper * count);	
			System.out.println(paper + " 원권 : " + count);
			if(sw<0) {
				paper /= 5;
			}
			if(sw>0) {
				paper /= 2;
			}
			
			//최초에는 sw가 -1이다가
			//두 번째 for()반복문을 시작하기 전에
			// -1을 곱하여 sw를 1로 바꾼다
			sw *=-1;
			}
		}
	}

