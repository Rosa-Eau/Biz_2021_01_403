package com.callor.shop;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FileWriter_04 {
	
	/*
	 * 클래스 영역에 변수를 선언하는 것은
	 * 현재 클래스가 포함하고 있는 모든 method들이
	 * 변수를 공유하여 코드를 수행하게 하려는 의도이다
	 * 
	 * 보통 생성자를 통해 객체를 생성하여 사용하는 클래스에 선언된 믈래스 영역 변수를
	 * "인스턴스 변수"라고 한다.
	 * 인스턴스 변수는 GC에 의해 메모리 관리가 자동으로 이루어진다.
	 * 
	 * static method에서 필요한 변수들은
	 * 변수를 선언할 때 static 키워드를 추가하여 static 변수로 만든다.
	 * static 변수는 GC이 접근하지 못한다.
	 * Project가 시작될 때 만들어지고 계속 존재하는 상태다.
	 * 프로젝트가 시작될 때 클래스가 자동으로 만들어지고
	 * 이 때 static 변수들도 자동으로 생성된다.
	 * 클래스가 생성될 때 같이 만들어진다는 의미로 
	 * static 키워드가 부착된 변수를 "클래스변수"라고 한다.
	 * 
	 * static 변수는 선언과 생성을 동시에 하도록 코드를 작성한다.
	 * 
	 * 다만, static 생성자를 만들어 별도로 생성을 하는 경우도 있다.
	 * 
	 */
	private static String numFileName;
	private static List<Integer> intList;
	static {
		numFileName = "src/com/callor/shop/nums.txt";
		intList = new ArrayList<Integer>();
	}
	/*
	 * main() method와 같은 클래스 내에 있는 다른 method를 호출하여 코드를 수행할 경우
	 * main() method의 호출을 받는 method들은 모두 static으로 선언되어야 한다.
	 * 
	 * main() method와 static으로 선언된 method들이 클래스 영역에 선언된 변수를 공유하려면
	 * 클래스 영역에 선언된 변수들도 모두 static으로 선언되어야 한다.
	 * 
	 */


	public static void main(String[] args) {
		/*
		 * static으로 선언된 method 내에서는 같은 class의 다른 method를 this.method() 형식으로 호출하지 못한다.
		 */
		makeNums();
		saveFileNums();

	} // end main

	public static void makeNums() {
		Random rnd = new Random();
		
		Integer num = rnd.nextInt();
		intList.add(num);
		
		intList.add(rnd.nextInt());

	}

	public static void saveFileNums() {
		FileWriter fileWriter = null;
		PrintWriter printWriter = null;
		try {
			fileWriter = new FileWriter(numFileName);
			printWriter = new PrintWriter(fileWriter);
			
			for(int i = 0 ; i < intList.size() ; i++) {
				printWriter.println(intList.get(i));
			}

			printWriter.close();
			fileWriter.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
