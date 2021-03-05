package com.callor.shop.files;

import com.callor.shop.service.impl.RndServiceImplV1_1;

public class FileWriter_07 {
	
	public static void main(String[] args) {
		
		String fileName = "src/com/callor/shop/files/score.txt";
		
		RndServiceImplV1_1 rV1 = new RndServiceImplV1_1();
		rV1.makeRnd();
		rV1.saveFileRnd();
		rV1.loadFileRnd();
		

		
	}

}
