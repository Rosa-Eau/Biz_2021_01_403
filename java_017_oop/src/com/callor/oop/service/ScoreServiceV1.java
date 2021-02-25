package com.callor.oop.service;

import java.util.Scanner;

public class ScoreServiceV1 {
	
	Scanner scan = new Scanner(System.in);
	
	public int inputScore(String subject) {
		
		while(true) {
			System.out.println(subject + " 점수를 입력하세요");
			System.out.println(">> ");
			String strScore = scan.nextLine();
			
			try {
				int intScore = Integer.valueOf(strScore);
				if(intScore >= 50 && intScore <= 100) {
					return intScore;
				} else {
					System.out.println("점수는 50 이상 100 이하");
				}
			} catch (NumberFormatException e) {
				// TODO: handle exception
				System.out.println("!! 반드시 숫자로 입력해주세요 !!");
			}
		}
		
		
	}
	
}
