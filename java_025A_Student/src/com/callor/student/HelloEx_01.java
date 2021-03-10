package com.callor.student;

import java.util.ArrayList;
import java.util.List;

public class HelloEx_01 {
	
	/*
	 * Java 클래스의 진입점(시작점) method
	 * Java 프로젝트는 1개의 main() method를 필요로 하며
	 * JVM에 의해서 자동 호출되어 프로젝트를 시작하게 된다
	 */
	public static void main(String[] args) {
		
		//한 줄 주석
		/*
		 * 여러 줄 주석
		 */
		
		/*
		 * 변수를 선언한 후 초기화를 하지 않았을 경우
		 * 변수를 읽는 명령에서 오류가 발생한다
		 */
		int num; //변수의 선언
		num = 10; //변수를 초기화하며 값 10을 저장
		System.out.println(num);
		
		int num1 = 0;//변수의 선언과 초기화
		num1 = 50; 
		System.out.println(num1);
		
		/*
		 * 클래스를 배열로 선언한 후 
		 * 각 배열 요소를 반드시 초기화, 생성을 해 주어야
		 * 요소에 접근이 가능하다
		 */
		BBsVO[] bbsArray = new BBsVO[10];
		//배열 1이 있는 자리만 초기화
		bbsArray[1] = new BBsVO();
		//모든 배열요소 초기화
		for(int i = 0 ; i < bbsArray.length ; i++) {
			bbsArray[i] = new BBsVO();
		}
		bbsArray[1].setAuth("이몽룡");
		System.out.println(bbsArray[1].getAuth());
		
		/*
		 * 인터페이스가 있는 클래스는
		 * 인터페이스(List)를 사용하여 객체를 선언하고
		 * 실제 사용할 클래스(ArrayList)의 생성자(ArrayList())를 사용하여
		 * 객체를 초기화한다(인스턴스 생성)
		 */
		List<BBsVO> bbsList; // 객체 선언
		bbsList = new ArrayList<BBsVO>(); //초기화
		
		/*
		 * 객체에 값을 저장하고
		 * List에 추가할 때는 먼저
		 * 객체를 생성하고, 값을 세팅한 후
		 * add() method로 리스트에 추가한다.
		 */
		BBsVO bbsVO = new BBsVO();
		bbsVO.setAuth("이몽룡");
		bbsList.add(bbsVO);
		
		
	}

}
