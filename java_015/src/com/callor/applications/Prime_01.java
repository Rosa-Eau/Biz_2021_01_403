package com.callor.applications;

import java.util.Scanner;

public class Prime_01 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("2 이상 숫자 입력 >> ");

		int intInput = scan.nextInt();

		// break 사용
		for (int i = 2; i < intInput; i++) { // 1과 자신을 제외한 숫자로 intInput을 나누어야 하기 때문에 i를 2 이상, intInput 이하로 설정
			if (intInput % i == 0) { // 다른 수를 약수로 가지는지 확인
				System.out.printf("%d(은)는 소수가 아닙니다.\n", intInput); // 다른 수를 약수로 가질 경우 소수가 아니기 때문에 이 문장을 출력함
				break; // break로 for문을 끝내고 for문 바깥으로 나감.
			}
			System.out.printf("%d(은)는 소수입니다.\n", intInput);
			// if문의 조건에 들어가지 않았을 경우에만 이 문장이 출력됨(break로 for문이 끝나면 for문 안쪽에 존재하는 이 문장은 출력되지 않은
			// 채로 method가 끝남)
		}

		// 변수 사용
		int pos = 0; //for문 바깥에 pos변수 선언 및 초기화
		for (pos = 2; pos < intInput; pos++) {
			if (intInput % pos == 0) {
				break;
			}
		}
		//for문이 정상적으로 끝났을 시 pos 변수에는 intInput과 같은 정수가 저장되어 있음.
		//따라서 if문을 사용해 for문이 break 되었는지 확인
		if (pos < intInput) {
			System.out.println(intInput + "는 소수가 아님");
		} else {
			System.out.println(intInput + "는 소수가 아님");
		}

		// return 사용
		for (int i = 2; i < intInput; i++) { // 1과 자신을 제외한 숫자로 intInput을 나누어야 하기 때문에 i를 2 이상, intInput 이하로 설정
			if (intInput % i == 0) { // 다른 수를 약수로 가지는지 확인
				System.out.printf("%d(은)는 소수가 아닙니다.\n", intInput); // 다른 수를 약수로 가질 경우 소수가 아니기 때문에 이 문장을 출력함
				return; // return으로 메소드 자체를 종료시켜 for문 바깥의 문장을 출력하지 않도록 만듬
			}
		}
		System.out.printf("%d(은)는 소수입니다.\n", intInput);
		// if문의 조건에 걸리지 않고(method가 종료되지 않고) 그 어떤 약수도 가지지 않은 소수일 경우에만 이 문장이 출력됨.
	}
}