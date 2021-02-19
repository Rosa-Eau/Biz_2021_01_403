package com.callor.var;

public class Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 숫자의 체계
		 * 프로그래밍에서 숫자는
		 * 정수와 실수가 있다
		 * 정수는 0과 10진수 양수, 음수가 있다
		 * 		정소눈 부동소수점 수라고 표현하기도 한다.
		 * 실수는 소수점 이하 값을 표현한다
		 * 실수는 소수점 이하 6자리, 16자리 표현 방법이 있다
		 * 단정도 실수 : 소수점 이하 6자리(4자리)
		 * 배정도 실수 : 소수점 이하 16자리
		 * 
		 * 사칙연산 수행할 때
		 * 정수와 정수의 연산은 결과도 정수로 표현된다
		 * 실수와 실수의 연산은 결과도 실수로 표현된다
		 * 실수와 정수의 연산은 정수가 실수로 바뀌어
		 * 실수 연산을 수행하고, 실수로 표현된다 
		 * 
		 * 정수와 실수가 달리 표현되는 것은
		 * 1. 기억장치에 저장하는 방법의 차이 때문
		 * 2. 연산장치의 효과적인 사용 때문
		 * 
		 * 정수는 32비트, 실수는 64비트를 차지함
		 * 
		 */
		
		
		System.out.println(40 / 30);
		System.out.println(40.0 / 30.0);
		//단정도 실수 --> 소수점을 여섯자리까지 표기
		//배정도 실수 --> 소수점을 열여섯자리까지 표기
		//부동 소수점 값 --> 소수점 이하 값이 없음(정수)
		//원본값(Source)이 정수일 때의 사칙연산은 언제나 정수,
		//실수일 때는 언제나 실수의 결과값을 가짐.
		//실수와 정수를 저장하는 공간이 다르기 때문에 다른 값이 나오게 됨.
		System.out.println(40.0 / 30);
		System.out.println(40 / 30.0);
		//실수와 정수의 연산값은 실수
		//실수와 정수의 사칙연산에서 정수는 모두 실수로 변환됨 
		

	}

}