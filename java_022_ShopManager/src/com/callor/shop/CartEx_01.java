package com.callor.shop;

import com.callor.shop.service.CartServcie;
import com.callor.shop.service.MenuService;
import com.callor.shop.service.impl.CartServiceImplV1;
import com.callor.shop.service.impl.MenuServiceImplV1;

public class CartEx_01 {
	
	public static void main(String[] args) {
		
		//클래스로 선언, 클래스로 생성
		MenuServiceImplV1 mS = new MenuServiceImplV1();
		//인터페이스로 선언, 클래스로 생성
		//인터페스를 implements하여 작성된 클래스는
		//인터페이스로 선언을 하자       
		//코드 업그레이드가 조금 쉬워진다.
		MenuService mService = new MenuServiceImplV1();
		CartServcie cService = new CartServiceImplV1();
		
		while (true) {
			Integer menu = mService.selectMenu();
			if (menu == null) {
				break;
			} else if(menu == 1) {
				//System.out.println("장바구니 추가");
				cService.inputCart();
			} else if(menu == 2) {
				//System.out.println("장바구니 리스트 보기");
				cService.printAllCart();
			} else if(menu == 3) {
				//System.out.println("구매자별 리스트 보기")
				cService.printUserCart();

			}
		}
		System.out.println("업무종료");
		
		
	}

}
