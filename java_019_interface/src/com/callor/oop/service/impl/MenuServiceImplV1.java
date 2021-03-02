package com.callor.oop.service.impl;

import java.util.Scanner;

public class MenuServiceImplV1 {
	/*
	 * 인스턴스 객체변수 선언
	 * 생성자에서 객체변수 초기화하여 사용할 준비
	 */
	private Scanner scan;
	public MenuServiceImplV1() {
		scan = new Scanner(System.in);
	}
	CartServiceImplV3 csIV3 = new CartServiceImplV3();

	public void selectMenu() {

		System.out.println("=====================================");
		System.out.println("Java Menu System v1");
		System.out.println("-------------------------------------");
		System.out.println("1. 카트추가");
		System.out.println("2. 카트삭제");
		System.out.println("3. 카트리스트");
		System.out.println("Q. 끝내기");

		while (true) {
			try {
				System.out.println("--------------------------------------");
				System.out.print("선택 >>");
				String strSelect = scan.nextLine();
				if (strSelect == "Q") {
					return;
				} else if (Integer.valueOf(strSelect) == 1) {
					csIV3.inputCart();
				} else if (Integer.valueOf(strSelect) == 2) {
					System.out.println("카트 삭제");
				} else if (Integer.valueOf(strSelect) == 3) {
					System.out.println("<<카트 리스트>>");
					csIV3.printCart();
				}
			} catch (Exception e) {
				System.out.println("알 수 없는 내용입니다.");
			}
		}

	}

}
