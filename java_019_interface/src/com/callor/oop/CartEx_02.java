package com.callor.oop;

import com.callor.oop.service.impl.CartServiceImplV1;
import com.callor.oop.service.impl.CartServiceImplV2;

public class CartEx_02 {
	
	public static void main(String[] args) {
		
		//1.CartImplV1을 사용하여 코드 구현
		CartServiceImplV1 csIV1 = new CartServiceImplV1();
		csIV1.inputCart();
		csIV1.printCart();
		
		//2.CartImplV2로 업그레이드
		CartServiceImplV2 csIV2 = new CartServiceImplV2();
		csIV2.inputCart();
		csIV2.printCart();
		
	}

}
