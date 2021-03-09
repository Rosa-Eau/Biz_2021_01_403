package com.callor.iolist;

import com.callor.iolist.values.Values;

public class LineEx_01 {
	
	public static void main(String[] args) {
		//.out.println 도 System이라는 클래스에 들어있는 static변수
		System.out.println(Values.dLine(50));
		System.out.println(Values.dLine(20));
		System.out.println(Values.dLine(100));
		
		System.out.println(Values.sLine(50));
		System.out.println(Values.sLine(100));
		
	}

}
