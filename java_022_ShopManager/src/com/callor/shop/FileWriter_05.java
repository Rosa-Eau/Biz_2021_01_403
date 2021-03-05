package com.callor.shop;

import com.callor.shop.service.impl.RndServiceImplV1;

public class FileWriter_05 {
	
	public static void main(String[] args) {
		RndServiceImplV1 rsV1 = new RndServiceImplV1();
		
		rsV1.makeNums();
		rsV1.saveFileNums();
		System.out.println("Mission Complete");
	}

}
