package com.callor.shop.service;

public interface CartServiceV2 extends CartServcie {
	
	public void saveCartToFile();
	public void loadCartFromFile();

}
