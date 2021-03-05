package com.callor.shop.service.impl;

import java.util.Scanner;

import com.callor.shop.service.MenuService;

public class MenuServiceV1 implements MenuService {
	//Scanner 클래스를 사용해서 scan 객체를 선언
	private Scanner scan;
	private Integer intSelect;

	public MenuServiceV1() {
		scan = new Scanner(System.in);
	}

	@Override
	public Integer selectMenu() {
		System.out.println("===========================================");
		System.out.println("빛나라 쇼핑몰 2021");
		System.out.println("-------------------------------------------");
		System.out.println("1. 장바구니 상품 담기");
		System.out.println("2. 장바구니 전체 리스트 보기");
		System.out.println("3. 구매자별 장바구니 리스트 보기");
		System.out.println("QUIT. 끝내기");
		System.out.println("===========================================");

		while (true) {
			System.out.print("선택 >> ");
			String strSelect = scan.nextLine();
			if (strSelect.equalsIgnoreCase("QUIT")) {
				break;
			}

			try {
				intSelect = Integer.valueOf(strSelect);
				if (intSelect >= 1 && intSelect <= 3) {
					return intSelect;
				} else {
					System.out.println("업무 선택은 1 ~ 3까지 중에 선택하세요");
				}
			} catch (Exception e) {
				System.out.println("업무 선택은 QUIT(끝내기), 1 ~ 3까지 정수만 입력할 수 있습니다");
			}
		}

		return null;
	}

}
