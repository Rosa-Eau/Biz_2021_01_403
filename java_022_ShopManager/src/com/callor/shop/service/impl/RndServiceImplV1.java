package com.callor.shop.service.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RndServiceImplV1 {
	
	//makeNums()와 saveFileNums() method가 공용으로 사용할 객체이므로 인스턴스 객체변수로 선언
	
	private List<Integer> intList;

	public RndServiceImplV1() {
		intList = new ArrayList<Integer>();
		
		
	}

	// Random 수를 생성하여 List에 담을 method
	public void makeNums() {
		Random rnd = new Random();
		for (int i = 0; i < 100; i++) {
			Integer num = rnd.nextInt(1000) + 1;
			intList.add(num);
		}

	}

	// List에 담긴 숫자들을 파일에 저장하는 method
	public void saveFileNums() {
		String fileName = "src/com/callor/shop/files/nums.txt";
		FileWriter fWriter = null;
		PrintWriter pWriter = null;
		try {
			fWriter = new FileWriter(fileName);
			pWriter = new PrintWriter(fWriter);
			for (int i = 1; i < intList.size() + 1; i++) {

				if (i % 5 == 0) {
					pWriter.print(intList.get(i - 1) + ":\n");
				} else {
					pWriter.print(intList.get(i - 1) + ":");
				}
			}
			pWriter.close();
			fWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
