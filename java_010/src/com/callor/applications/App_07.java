package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

import com.callor.applications.myclass.MyGuGuDan;

public class App_07 {
	
	public static void main(String[] args) {
		
		MyGuGuDan myGu = new MyGuGuDan();
		/*
		 * MyGuGuDan클래스에
		 * 		정의된 print() method 호출
		 * MyGuGuDan클래스의 print() method 호출
		 * 
		 * Error Code
		 * print(int) ... arguments ()
		 * => ()안에 arguments(정수형 값)를 넣어라
		 * 
		 */
		myGu.print(3);
		
		Random rnd = new Random();
		//Random클래스의 
		/* nextInt() method를 호출하라 */
		rnd.nextInt(10);//호출하면서 정수 10을 주입
		rnd.nextInt(); //호출만
		
		Scanner scan = new Scanner(System.in);
		//Scanner클래스의
		//		scan.nextInt() method를 호출하라
		scan.nextInt();
		
		Random rd = new Random();
		rd.nextInt(100);
	}

}
