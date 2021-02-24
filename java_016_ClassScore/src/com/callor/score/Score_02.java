package com.callor.score;

import java.util.Random;

import com.callor.score.service.ScoreServiceV1;

public class Score_02 {

	public static void main(String[] args) {
		ScoreServiceV1 ssV1 = new ScoreServiceV1();

		String[] strName = new String[] { "홍길동", "이몽룡", "성춘향", "장녹수", "임꺽정" };
		int arrLen = strName.length;
		int[] intKor = new int[arrLen];
		int[] intEng = new int[arrLen];
		int[] intMath = new int[arrLen];
		int[] intSum = new int[arrLen];
		float[] fAvg = new float[arrLen];

		Random rnd = new Random();

		System.out.println("========================================================");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("--------------------------------------------------------");
		// 총점계산
		// ssV1.scoreSum() method를 호출하여 총점 계산

		for (int i = 0; i < arrLen; i++) {
			intKor[i] = rnd.nextInt(100) + 1;
			intEng[i] = rnd.nextInt(100) + 1;
			intMath[i] = rnd.nextInt(100) + 1;
		}
		// 총점을 계산하려면 3과목의 점수를 전달하고
		// 총점 결과를 다시 return 받아서 ... 해야한다.
		for (int i = 0; i < arrLen; i++) {

			// i번째 학생의 3과목 점수를
			// scoreSum()에게 전달하고
			// 결과를 다시 i 번째 학생의 총점에 저장
			// intSum[i] : i 번째 학생의 총점
			intSum[i] = ssV1.scoreSum(intKor[i], intEng[i], intMath[i]);
		}

		for (int i = 0; i < arrLen; i++) {
			fAvg[i] = ssV1.scoreAvg(intSum[i]);

		}

		for (int i = 0; i < arrLen; i++) {
			ssV1.print(strName[i], intKor[i], intEng[i], intMath[i], intSum[i], fAvg[i]);
		}
		


		//이름, 국어,영어,수학,총점,평균 배열을 통째로 매개변수로 전달하고
		//ssV1.print() method에서 리스트를 출력하도록
		ssV1.print(strName, intKor, intEng, intMath, intSum, fAvg);
		
		
	}
}
