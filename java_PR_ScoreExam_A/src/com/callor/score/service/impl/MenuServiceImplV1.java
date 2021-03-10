package com.callor.score.service.impl;

import java.util.Scanner;

import com.callor.score.service.MenuService;
import com.callor.score.values.ValMenu;
import com.callor.score.values.Values;

public class MenuServiceImplV1 implements MenuService{

	@Override
	public Integer selectMenu() {
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.println(Values.dLine(80));
			System.out.println("성적 입력 프로그램 V1");
			System.out.println(Values.sLine(80));
			System.out.printf("%d. 학생 성적 점수 입력\n", ValMenu.MENU_INPUT);
			System.out.printf("%d. 학생 성적 점수 파일에 저장\n", ValMenu.MENU_SAVE);
			System.out.printf("%d. 성적결과 확인\n", ValMenu.MENU_PRINT);
			System.out.println("QUIT. 끝내기");
			System.out.println(Values.dLine(80));
			System.out.print("입력 >> ");
			String strMenu = scan.nextLine();
			if (strMenu.equals("QUIT")) {
				return  null;
			}
			Integer intMenu = null;
			try {
				intMenu = Integer.valueOf(strMenu);
			} catch (Exception e) {
				System.out.println(Values.sLine(80));
				System.out.printf("메뉴는 QUIT, %d ~ %d 까지만 가능\n", ValMenu.MENU_START, ValMenu.MENU_LAST);
				continue;
			}
			if (intMenu >= ValMenu.MENU_START && intMenu <= ValMenu.MENU_LAST) {
				return intMenu;
			} else {
				System.out.println(Values.sLine(80));
				System.out.printf("메뉴는 %d ~ %d 까지 중에서 선택\n", ValMenu.MENU_START, ValMenu.MENU_LAST);
			}

		}
		
	}

}