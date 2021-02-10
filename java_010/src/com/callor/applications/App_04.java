package com.callor.applications;

import com.callor.applications.myclass.MyGuGuDan;

public class App_04 {
	
	public static void main(String[] args) {
		//MyGuGuDan클래스를 이용해 myGu라는 객체를 선언한 뒤, 초기화 시켜 인스턴스로 변환.
		//MyGuGuDan클래스 속의 내용을 메인메소드가 존재하는 다른 클래스에서 실행 가능.
		
		//내가 프로젝트에 선언(정의, 만든다)한
		//MyGuGuDan클래스에 있는 어떤 기능들을
		//사용하기 위하여
		//클래스를 객체로 선언하고
		//초기화하여 준비를 하는 절차
		//이후에는 myGu 객체를 사용하여
		//매서드들을 실행하는 코드를 사용할 수 있다.
		MyGuGuDan myGu = new MyGuGuDan();
		
		//MyGuGuDan클래스에 선언(정의, 만들기)된
		//gugu() 매서드를 실행하라
		//myGu 객체(Object, instance)의
		//gugu() method를 호출한다(실행한다)
		myGu.gugu();
		
		
	}

}
