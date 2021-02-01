package com.callor.hello;

// 여기는 클래스 시작입니다
// 슬래시를 연속 2번으로 시작하는 문장은
// 주석문이라고 한다.
// 주석문은 어떠한 내용이 있더라도
// 코드가 아닌 것으로 무시하는 문장이다.
public class HelloExec {
	/*
	 * 
	 * 주석을 여러 줄에 걸쳐 쓰고 싶을 때 / + * + Enter
	 * 여기는 주석문장(comment statement)
	 * 여러 줄에 걸쳐 주석을 작성하고자 할 때 사용
	 * 주석문(comment)은 코드에 대한 설명(왜 내가 이 코드를 만들었는가)
	 * 중요한 부분에 대한 설명 등을 작성하는 곳.
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//""내에 있는 글자, 단어 등을 문자열(리터럴)이라고 한다. String Literal
		System.out.println("반갑습니다");
		
		//우리나라 만세 문자열을
		//Console에 출력하라
		System.out.println("우리나라만세");
		
		//숫자 30과 40을 덧셈하여
		//Console에 출력하라
		//연산부호(+,-,/.*)와 숫자 사이에 빈칸의 개수는 아무런 문제가 되지 않는다
		//그러나 가독성을 위해 연산부호와 숫자 사이에 빈칸을 넣어주자
		System.out.println(30+40);
		System.out.println(30 + 40);
		System.out.println(30+ 40);
		System.out.println(30 +40);
		
		//30+40이라는 문자열을
		//Console에 출력하라
		System.out.println("30 + 40");
		
		//숫자 30을 문자열 30으로 바꾸고
		//숫자 40을 문자열 40으로 바꾸고
		//두 문자열을 연결하여
		//Console에 출력하라
		System.out.println("30" + "40");
		
		System.out.println("우리나라 + 대한민국");
		System.out.println("우리나라" + "대한민국");
		
		//문자열과 문자열은 덧셈만 가능
		System.out.println("30 * 40");
		// System.out.println("30" * "40"); --> 불가
		
		/*
		 * 연산
		 * 숫자, 숫자는 4칙연산을 모두 수행할 수 있다
		 * 숫자, 숫자의 4칙연산은 수학의 연산규칙을 그대로 따른다
		 * 문자열, 문자열의 연산은 연결(+) 연산만 가능
		 * 
		 */
		
		//문자열과 숫자를 덧셈연산하면 
		//숫자가 자동으로 문자열화(변환)된다
		System.out.println("30" + 40);
		//System.out.println("30" * 30); --> 불가
		
		
		System.out.println("30 + 40 = " + 30 + 40);
		System.out.println("30 + 40 = " + (30 + 40));
		System.out.println("30 * 40 = " + 30 * 40);
	
	}

}
