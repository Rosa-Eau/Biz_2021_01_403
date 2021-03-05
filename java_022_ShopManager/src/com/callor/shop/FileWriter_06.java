package com.callor.shop;

import com.callor.shop.service.impl.RndServiceImplV2;

public class FileWriter_06 {
	
	public static void main(String[] args) {
		String fileName = "src/com/callor/shop/files/nums.txt";
		RndServiceImplV2 rsV1 = new RndServiceImplV2(fileName);
		rsV1.makeRnd();
		rsV1.saveFileRnd(fileName);
		System.out.println("Mission Complete");
	}

}
