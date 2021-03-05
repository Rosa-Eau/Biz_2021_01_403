package com.callor.shop;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class FileWriter_02 {

	public static void main(String[] args) {
	
		String numFileName = "src/com/callor/shop/nums.txt";
		Random rnd = new Random();

		FileWriter fileWriter = null;
		PrintWriter printWriter = null;

		try {
			fileWriter = new FileWriter(numFileName);
			printWriter = new PrintWriter(fileWriter);
			for (int i = 0 ; i < 1000 ; i++) {
				int intNum = rnd.nextInt(1000) + 1;
				printWriter.println(intNum);
			}

			printWriter.close();
			fileWriter.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
