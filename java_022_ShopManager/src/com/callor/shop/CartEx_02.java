package com.callor.shop;

import com.callor.shop.service.CartServcie;
import com.callor.shop.service.MenuService;
import com.callor.shop.service.impl.CartServiceImplV2;
import com.callor.shop.service.impl.MenuServiceImplV1;

public class CartEx_02 {
	
	public static void main(String[] args) {
		

		MenuService mService = new MenuServiceImplV1();
		CartServcie cService = new CartServiceImplV2();
		
		while (true) {
			Integer menuItem = mService.selectMenu();
			if (menuItem == null) {
				break;
			} else if(menuItem == 1) {
				cService.inputCart();
			} else if(menuItem == 2) {
				cService.printAllCart();
			} else if(menuItem == 3) {
				cService.printUserCart();

			}
		}
		System.out.println("업무종료");
		
		
	}

}
