package com.callor.oop.service.impl;

import java.util.Scanner;

import com.callor.oop.service.MenuService;

public class MenuServiceImplV3 implements MenuService {

	private Scanner scan;
	public MenuServiceImplV3() {
		scan = new Scanner(System.in);
	}
	
	/*
	 * 메뉴를 보여주고
	 * 선택된 메뉴에 따라 카트에 추가, 삭제하거나 
	 * 리스트를 보여주어야 한다.
	 * 이 기능을 MenuService에서 구현하는 것이 아니라
	 * selectMenu()를 호출한 곳에서 구현을 해야 한다.
	 * 
	 * 호출하는 곳에서 selectMenu() 결과에 따라
	 * 사용자가 메뉴를 보고 선택을 했을 때 
	 * 선택된 결과값을 호출한 곳에 return을 해주어야 한다.
	 * 
	 * 이렇게 설계를 변경하려면 method를 void type이 아닌 int나 String 등
	 * 다른 type으로 변경하여야 한다.
	 * 클래스의 method를 변경하려면 interface 부터 변경하고,
	 * interface를 implement한 모든 클래스를 다 변경해야 한다.
	 * 
	 * interface, class의 원형을 변경하지 않고
	 * 현재 method에만 어떤 기능을 추가하고자 한다.
	 */
	
	public Integer menuItem = null;
	
	/*
	 * 메뉴를 환인한 후 
	 * 사용자가 메뉴를 선택하면
	 * "menuItem"에 적절한 값을 담고
	 * return을 수행하도록 코드 구현했다.
	 * 
	 * Ouit 선택하면 menuItem = null
	 * 1~3중에서 선택하면
	 */
	
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
