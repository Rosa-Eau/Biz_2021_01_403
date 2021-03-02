package com.callor.oop.service.impl;

import java.util.Scanner;

public class MenuServiceImplV2 {
	/*
	 * 인스턴스 객체변수 선언 생성자에서 객체변수 초기화하여 사용할 준비
	 */
	private Scanner scan;

	public MenuServiceImplV2() {
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

			System.out.println("--------------------------------------");
			System.out.print("선택 >>");
			String strSelect = scan.nextLine();

			// 1. Q를 입력하면 끝내기
			if (strSelect == "Q") {
				System.out.println("종료");
				return;
			}

			try {
				int intMenu = Integer.valueOf(strSelect);

				if (intMenu == 1) {
					csIV3.inputCart();
				} else if (intMenu == 2) {
					System.out.println("카트 삭제");
				} else if (intMenu == 3) {
					System.out.println("<<카트 리스트>>");
					csIV3.printCart();
				} else {
					System.out.println("메뉴는 1 ~ 3 까지만 입력");
				}
			} catch (Exception e) {
				System.out.println("알 수 없는 내용입니다.");
			}
		}

	}

}
