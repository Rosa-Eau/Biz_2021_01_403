package com.callor.shop;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class FileWriter_01 {
	/*
	 * main method : Java의 진입점 method
	 * 프로젝트를 가상머신에 의해 최초로 실행할 때
	 * 가상머신이 자동으로 호출하도록 만드는 method
	 * 
	 * FileWriter_01.main("...") 형식으로 호출이 된다.
	 * 
	 */

	public static void main(String[] args) {
	
		String numFileName = "src/com/callor/shop/nums.txt";
		Random rnd = new Random();
		int[] intNum = new int[100];
		
		//파일에 데이터를 저장하기 위해 2개의 클래스를 객체로 선언
		//변수를 지금 바로 생성하지 않을 경우 clear를 해준다
		//숫자형일 경우는 0 으로
		//		int num = 0;
		//클래스일 경우 null값으로
		//String str = "";
		//String str = null;
		FileWriter fileWriter = null;
		PrintWriter printWriter = null;

		try {
			fileWriter = new FileWriter(numFileName);
			printWriter = new PrintWriter(fileWriter);
			for (int i : intNum) {
				intNum[i] = rnd.nextInt(1000) + 1;
				printWriter.println(intNum[i]);
			}

			printWriter.close();
			fileWriter.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
