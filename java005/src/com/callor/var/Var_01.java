package com.callor.var;

public class Var_01 {
	public static void main(String[] args) {
		//Top부분에 선언된 변수는
		//Down에서 또 선언해서는 안된다
		//한 번 선언된 변수 이름으로
		//또다시 선언할 수 없다
		int num1 =30;
		int num2 =40;
		
		/*
		 * 변수 이름 짓기
		 * 첫글자는 영문소문자
		 * 이후 숫자, 영문대소문자, _를 사용할 수 있다
		 * 두 개 이상의 단어를 좋바하여 사용하는 것을 권장
		 * 두 번째 단어부터는 첫글자를 대문자로 설정
		 * (lower)CamelCase
		 */
		int korScore = 90;
		int engScore = 100;
		int mathScore = 95;
		//변수의 이름에 카멜케이스를 적용시킬 때, 첫 글자를 소문자로 한다.
		//클래스 = TopCamelCase, UpperCamelCase
		//변수명 = lowerCamelCase
		
		//두 개 이상의 단어로 조합이 다소 불편할 때
		//변수명 접두사로 변수의 형(type)을 붙인다
		//헝가리언 표기법
		int intNum1 = 20;
		int intNum2 = 30;
		int intNum3 = 40;
		
		float floatNum1 = 20.0F;
		float floatNum2 = 30.0F;
		
		double doNum1 = 20.0;
		double doNum2 = 30.0;
		
		String strName = "홍길동";
		String strNation = "대한민국";
		String strTel = "010-1111-1111";
		String strAddr = "서울특별시";
		
		/*
		 * 변수명 단어와 단어사이에 UnderScore(_)
		 * snake case
		 * 
		 * 데이터베이스와 연동하는 프로그램을 만들 때
		 * 주로 사용하는 명명법
		 */
		String str_Name = "이몽룡";
		
		String st_name = "성춘향"; //student_name
		String st_num = "20210101"; //student_num
		
		String dept_name = "컴퓨터공학";
		
		
		
		//메인 메소드가 점유하는 범위 = local area, local scope
		//줄여서 local
		
	} //여기까지의 구역을 클래스 Var_001의 private 영역이라고 한다.

}
