package com.callor.score.service.impl;

import java.util.Scanner;

import com.callor.score.service.MenuService;
import com.callor.score.values.Values;

public class MenuServiceImplV1 implements MenuService {

	private final Scanner scan;

	public MenuServiceImplV1() {
		scan = new Scanner(System.in);
	}

	@Override
	public Integer selectMenu() {

		while (true) {
			System.out.println(Values.dLine);
			System.out.println("빛나라 고교 성적처리 시스템");
			System.out.println(Values.sLine);
			System.out.printf("%d. 학생 성적 점수 생성\n", Values.MENU_RND);
			System.out.printf("%d. 학생 성적 점수 파일에 저장\n", Values.MENU_SAVE);
			System.out.printf("%d. 성적결과 확인\n", Values.MENU_CHECK);
			System.out.println("QUIT. 끝내기");
			System.out.println(Values.dLine);
			System.out.print("입력 >> ");
			String strMenu = scan.nextLine();
			if (strMenu.equals("QUIT")) {
				return null;
			}
			Integer intMenu = null;
			try {
				intMenu = Integer.valueOf(strMenu);
			} catch (Exception e) {
				System.out.println(Values.sLine);
				System.out.printf("메뉴는 QUIT, %d ~ %d 까지만 가능\n", Values.MENU_START, Values.MENU_LAST);
				continue;
			}
			if (intMenu >= Values.MENU_START && intMenu <= Values.MENU_LAST) {
				return intMenu;
			} else {
				System.out.println(Values.sLine);
				System.out.printf("메뉴는 %d ~ %d 까지 중에서 선택\n", Values.MENU_START, Values.MENU_LAST);
			}

		}

	}

}
