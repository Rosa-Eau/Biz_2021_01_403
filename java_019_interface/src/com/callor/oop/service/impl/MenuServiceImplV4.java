package com.callor.oop.service.impl;

import java.util.Scanner;

import com.callor.oop.service.MenuService;

public class MenuServiceImplV4 implements MenuService {

	private Scanner scan;
	public MenuServiceImplV4() {
		scan = new Scanner(System.in);
	}
	
	public Integer menuItem = null;

	@Override
	public void selectMenu() {
		// TODO Auto-generated method stub
		
			while(true) {
				

				System.out.println("=====================================");
				System.out.println("Java Menu System v1");
				System.out.println("-------------------------------------");
				System.out.println("1. 카트추가");
				System.out.println("2. 카트삭제");
				System.out.println("3. 카트리스트");
				System.out.println("Q. 끝내기");
				System.out.println("-------------------------------------");
				System.out.println("선택 >> ");
				String strMenu = scan.nextLine();
				if(strMenu.equals("Q")) {
					this.menuItem = null;
					break;
				}
				
				try {
					int intMenu = Integer.valueOf(strMenu);
					if(intMenu >= 1 && intMenu <=3) { 
						this.menuItem = intMenu;
						break;
					}
				} catch (Exception e) {
					System.out.println("메뉴는 Q,1~3만 입력하세요");
				}
			

				
			}
	}

}
