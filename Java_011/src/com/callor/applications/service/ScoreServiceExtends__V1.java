package com.callor.applications.service;

import java.util.Scanner;

/*
 * class extends(확장, 상속)
 * 
 * ScoreServiceV4 : Parent(부모)클래스
 * ScoreServiceExtends : child(자식)클래스
 * 
 * 단순한 extends
 * 		부모 클래스에 정의된 모든 method를 코드 한줄 추가, 수정 없이
 * 		그대로 사용할 수 있다.
 * 
 * 추가 extends
 * 		부모 클래스에 정의된 method와 새롭괴 추가된 method가 있는
 *		확장된 클래스의 생성
 * 
 */

public class ScoreServiceExtends__V1 extends ScoreServiceV4{
		
	public void input() {
		System.out.println("여기는 ExtendsV1의 input()");
	}
	/*
	 * 문자열형 변수 1개를 매개변수로 갖는 input() method 생성
	 * 
	 * input() method는 사용자에게 정수인 점수(intScore)를 Scanner 클래스를 통해 입력받은 후 입력받은 점수가 0이나 100사이의 정수인지 확인하고 
	 * 0과 100사이의 정수면 입력받은 점수를 Console에 출력한 뒤 종료하며, 0이하이거나 100이상일 시에는 경고문을 출력한 뒤 값을 다시 입력받는 method이다.  
	 * 
	 */
	public void input(String subject) { //문자열형 변수 1개를 매개변수로 갖는 input() method를 선언(생성)해 이하의 명령을 수행한다.
		Scanner scan = new Scanner(System.in); 
		//Scanner 클래스를 객체로 생성해 scan이라 이름짓고 사용자에게 값을 입력 받을 수 있도록 준비한다.
		System.out.println("점수 입력 >> "); 
		//글자에 "", ''를 씌워 문자열을 만들 수 있다. System.out.println(); 클래스를 통해 괄호 안의 내용을 Console에 출력한다.
		//문자열 출력을 위해서는 필수적으로 ""를 씌워주어야 한다.
		int intScore = 0;
		//변수 intScore를 정수(integer)자료형으로 선언한 뒤 clear한다.
		//클래스이름이나 변수명에는 띄어쓰기가 불가능하기 때문에 intScore처럼 이어지는 단어의 첫 문자를 대문자로 사용하거나 _(언더바)로 대체한다.
		//java에서는 대부분 이어지는 단어의 첫문자를 대문자로 쓰는 CamelCase를 사용한다.
		//_(언더바)를 사용해 이름을 짓는 것은 뱀과 닮았다하여 snake_case라고 한다. 
		while(true) { //while은 ()안의 조건이 true일 경우 이하의 명령을 반복하는 반복문이며, 따라서 ()안에 true의 값을 적어넣었을 경우 무한정 반복된다.
			intScore = scan.nextInt(); 
			//사용자에게 키보드로 정수값을 입력받고, 변수 intScore에 입력받은 정수값을 넣는다.
			if(intScore < 0) { //만약 변수 intScore에 들어있는 값이 0보다 작다면 이하의 식을 수행하라.
				System.out.println("점수는 0점 이상 입력!"); 
				//"점수는 0점 이상 입력!"이라는 내용을 Console에 출력하라.
			} else if(intScore > 100) { //만약 intScore에 들어있는 값이 100보다 크다면 이하의 식을 수행하라.
					System.out.println("점수는 100점 이하 입력!");
					//"점수는 100점 이하 입력!"이라는 내용을 Console에 출력하라.
			} else { //만약 변수 intScore에 들어있는 값이 0보다 작지도 100보다 크지도 않다면(위의 모든 조건에 충족되지 않다면) 이하의 식을 수행하라.
				break; 
				//반복문을 중단하고 빠져나가라.
			}

		}
		System.out.println("입력한 점수 : " + intScore); //문자열과 숫자열은 + 연산만 가능하며, 이는 Console에 이어진 채로 출력된다.
			
	}
	
}

