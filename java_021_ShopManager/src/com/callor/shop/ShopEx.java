package com.callor.shop;

import com.callor.shop.service.CartService;
import com.callor.shop.service.MenuService;
import com.callor.shop.service.impl.CartServiceV1;
import com.callor.shop.service.impl.MenuServiceV1;

public class ShopEx {
	
	public static void main(String[] args) {
		
		CartService csV1 = new CartServiceV1();
		MenuService msV1 = new MenuServiceV1();
		
		while (true) {
			Integer menu = msV1.selectMenu();
			if (menu == null) {
				break;
			} else if(menu == 1) {
				csV1.inputCart();
			} else if(menu == 2) {
				csV1.printAllCart();
			} else if(menu == 3) {
				csV1.printOwnCart();
			}
		}
		
		
	}

}
