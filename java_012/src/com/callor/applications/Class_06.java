package com.callor.applications;

import com.callor.applications.service.ClassServiceV4;

public class Class_06 {
	public static void main(String[] args) {
		ClassServiceV4 csV4 = new ClassServiceV4();
		
		csV4.result();
		/*
		 * method의 return type이 void일 경우 단독으로 호출만 할 수 있다.
		 * print() 명령문에 포함하거나
		 * 변수에 값을 할당할 수 없다.
		 * 			= 오른쪽에 있을 수 없다.
		 */

//		cs.V4.print();
//		System.out.println(csV4.print());
//		result = cs.V4.print();
	}

}
