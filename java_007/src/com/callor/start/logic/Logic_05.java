package com.callor.start.logic;

/*
 * 화폐 매수 계산
 * 
 * 4789800
//	5 	= 95
//	1 	= 3 오만원/5
//	5 	= 1 만원/2
//	1	= 4 오천원/5
//	5 	= 1 천원/2
//	1 	= 3 오백원/5
//	107
 */
public class Logic_05 {

	public static void main(String[] args) {
		int pay = 4_789_800;
		//5만원권 계산
		int paper = 50_000;
		int count = pay / paper;
		System.out.println(paper + " 원권 : " + count);
		
		//1만원권 계산
		//pay에서 5만원구너 금액만큼 제외하고
		//1만원권 매수를 계산한다.
		pay -= (paper * count); //5만원권 제외 금액
		paper = paper/5;
		count = pay / paper;
		System.out.println(paper + " 원권 : " + count);
		
		//5천원권 계산
		//pay에서 1만원 금액을 제외한 금액
		pay -= (paper * count);
		paper /= 2;
		count = pay / paper;
		System.out.println(paper + " 원권 : " + count);
		
		//천원권 계산
		pay -= (paper * count);
		paper = paper/5;
		count = pay / paper;
		System.out.println(paper + " 원권 : " + count);
		
		//오백원권 계산
		pay -= (paper * count);
		paper /= 2;
		count = pay / paper;
		System.out.println(paper + " 원권 : " + count);
		
		//백원권 계산
		pay -= (paper * count);
		paper = paper/5;
		count = pay / paper;
		System.out.println(paper + " 원권 : " + count);
		}
		
		
		
	}


