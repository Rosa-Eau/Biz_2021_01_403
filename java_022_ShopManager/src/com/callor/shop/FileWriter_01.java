package com.callor.shop;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class FileWriter_01 {

	public static void main(String[] args) {

		Random rnd = new Random();
		int[] intNum = new int[100];
		String numFileName = "src/com/callor/shop/nums.txt";
		FileWriter fileWriter = null;
		PrintWriter printWriter = null;

		try {
			fileWriter = new FileWriter(numFileName);
			printWriter = new PrintWriter(fileWriter);
			for (int i : intNum) {
				intNum[i] = rnd.nextInt(1000) + 1;
				printWriter.println(intNum[i]);
			}

			printWriter.close();
			fileWriter.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
