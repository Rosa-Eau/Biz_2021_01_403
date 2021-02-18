package com.callor.applications;

public class Class_05 {
	
	public static void main(String[] args) {
		/*
		 * ()안의 값, 변수, 연산식의 결과를 Console에 출력
		 * 출력한 후 자동 줄바꿈을 하여 이후 출력되는
		 * 결과가 다음줄에 출력되도록 하는 기능
		 * ()안에 아무것도 없으면 빈 줄만 출력
		 */
		System.out.println();
		System.out.println(30 + 40);
		System.out.println("대한민국");
		/*
		 * ()안의 값, 변수값, 연산식 등을 Console에 표시
		 * 단, 출력 후 줄바꿈을 하지 않아 이후 출력되는 결과가
		 * 이어서(옆으로) 출력
		 * 또한, ()안의 내용을 생략할 수 없다.
		 */
		System.out.print(30 + 40);
		System.out.print("대한민국");
		
		/*
		 * print formatting
		 * 문자열을 형식(양식)에 맞추어 출력하고자 할 때
		 * %d = Integer
		 * %s : String
		 * %f : Float
		 * \t : Tap
		 * \n : 줄바꿈 특수문자, println과 유사
		 */
		
		
		System.out.printf(" %d \t%s \t%f \n", 30, "대한민국", 30.245f);
		System.out.printf("숫자 : %d\n", 3);
		System.out.printf("숫자 : %d\n", 300);
		System.out.printf("숫자 : %d\n", 3000);
		System.out.printf("숫자 : %d\n", 30000);
		System.out.println("========================================");

		System.out.printf("숫자 : %5d\n", 3);
		System.out.printf("숫자 : %5d\n", 300);
		System.out.printf("숫자 : %5d\n", 3000);
		System.out.printf("숫자 : %5d\n", 30000);
		System.out.println("========================================");
		//15개짜리 빈 공간을 만들고 숫자를 오른쪽정렬
		System.out.printf("숫자 : %015d\n", 3);
		System.out.printf("숫자 : %015d\n", 300);
		System.out.printf("숫자 : %015d\n", 3000);
		System.out.printf("숫자 : %015d\n", 30000);
		System.out.println("========================================");
		//일단 15개짜리 빈 공간을 만들고
		//숫자를 오른쪽 정렬
		//왼쪽의 빈칸을 문자열 "0"으로 채우기
		System.out.printf("숫자 : %03d\n", 3);
		System.out.printf("숫자 : %03d\n", 300);
		System.out.printf("숫자 : %03d\n", 3000);
		System.out.printf("숫자 : %03d\n", 30000);
		System.out.println("========================================");
		
		//일단 15개짜리 빈 공간을 만들고
				//숫자를 오른쪽 정렬
				//왼쪽의 빈칸을 문자열 "0"으로 채우기
		System.out.printf("숫자 : %-15d\n", 3);
		System.out.printf("숫자 : %-15d\n", 300);
		System.out.printf("숫자 : %-15\n", 3000);
		System.out.printf("숫자 : %-15d\n", 30000);
		System.out.println("========================================");
		
		System.out.printf("%s 우리나라\n", "대한민국");
		System.out.println("========================================");
		
		System.out.printf("%30s 우리나라\n", "대한민국");
		System.out.println("========================================");
		
		System.out.printf("%30s 우리나라\n", "대한");
		System.out.printf("%30s 우리나라\n", "대한민");
		System.out.printf("%30s 우리나라\n", "대한민국");
		
		System.out.printf("%-30s 우리나라\n", "KO");
		System.out.printf("%-30s 우리나라\n", "KOR");
		System.out.printf("%-30s 우리나라\n", "Republic");
		
		System.out.printf("%3.2f\n",30.6666);


		
		
	}

}
