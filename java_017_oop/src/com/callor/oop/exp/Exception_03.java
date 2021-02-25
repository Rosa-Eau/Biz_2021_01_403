package com.callor.oop.exp;

import com.callor.oop.model.ProductVO;

public class Exception_03 {
	
	public static void main(String[] args) {
		
		ProductVO pVO = null;
		int[] intNums = new int[3];
		try {
			intNums[2] = 100; //exception 처리완료
			intNums[2] = Integer.valueOf("3");
			pVO.strDName = "야채참치";
		}catch(NullPointerException ep) {
			System.out.println("객체가 생성되지 않았는데 사용하려고 시도함");
		}catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("배열의 범위를 벗어났음");
		} catch(NumberFormatException en) {
			System.out.println("문자열을 정수로 변환하는 과정에서 문제 발생");
		} //발생할 수 있는 문제들을 Exception 으로 퉁치지 않고 catch문 여러개를 겹쳐 써서 알려줌
		
		
	}

}
