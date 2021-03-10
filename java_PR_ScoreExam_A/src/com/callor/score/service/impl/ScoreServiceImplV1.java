package com.callor.score.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.model.ScoreVO;
import com.callor.score.service.ScoreService;
import com.callor.score.values.Values;

public class ScoreServiceImplV1 implements ScoreService {

	private String fileName;
	private List<ScoreVO> scoreList;
	private Scanner scan;
	private String stdNum;

	public ScoreServiceImplV1() {
		fileName = "src/com/callor/score/data/score1.txt";
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
		stdNum = null;
	}

	@Override
	public void searchStdNum() {
		// TODO Auto-generated method stub
		System.out.println(Values.dLine(80));
		System.out.println("성적 입력을 원하는 학생의 학번을 입력하여 주십시오.");
		System.out.println("학번은 00001 형식으로 입력합니다.");
		System.out.println(Values.sLine(80));
		System.out.print("학번 >> ");
		stdNum = scan.nextLine();
		System.out.println(Values.sLine(80));
		ScoreVO sVO = null;
		for (ScoreVO vo : scoreList) {
			if (stdNum.equals(vo.getStdNum())) {
				System.out.println("성적 입력이 완료된 학생입니다.");
				return; // 중단하기
			} // if end
		}
		// 못찾았을 때
		if (sVO == null) {
			this.inputScore();
		} // if end
	}// class end

	@Override
	public void inputScore() {
		// TODO 점수 입력
		System.out.println("성적을 입력하여 주십시오.");
		System.out.println(Values.sLine(80));

		// 국어 성적 입력
		Integer intKor = 0;
		while (true) {
			try {
				System.out.print("국어 >> ");
				String strKor = scan.nextLine();
				intKor = Integer.valueOf(strKor);
				System.out.println(Values.sLine(80));
			} catch (Exception e) {
				System.out.println(Values.sLine(80));
				System.out.println("알 수 없는 요청입니다.");
				System.out.println(Values.sLine(80));
				continue;
			} // try catch end
			if (intKor < 0 || intKor > 100) {
				System.out.println("0 이상 100 이하의 점수만 입력 가능합니다.");
				System.out.println(Values.sLine(80));
			} else {
				break;
			} // 유효성 검사 end
		} // while end

		// 영어 성적 입력
		Integer intEng = 0;
		while (true) {
			try {
				System.out.print("영어 >> ");
				String strEng = scan.nextLine();
				intEng = Integer.valueOf(strEng);
				System.out.println(Values.sLine(80));
			} catch (Exception e) {
				System.out.println(Values.sLine(80));
				System.out.println("알 수 없는 요청입니다.");
				System.out.println(Values.sLine(80));
				continue;
			} // try catch end
			if (intEng < 0 || intEng > 100) {
				System.out.println("0 이상 100 이하의 점수만 입력 가능합니다.");
				System.out.println(Values.sLine(80));
			} else {
				break;
			} // 유효성 검사 end

		} // while end

		// 수학 성적 입력
		Integer intMath = 0;
		while (true) {
			try {
				System.out.print("수학 >> ");
				String strMath = scan.nextLine();
				intMath = Integer.valueOf(strMath);
				System.out.println(Values.sLine(80));
			} catch (Exception e) {
				System.out.println(Values.sLine(80));
				System.out.println("알 수 없는 요청입니다.");
				System.out.println(Values.sLine(80));
				continue;
			} // try catch end
			if (intMath < 0 || intMath > 100) {
				System.out.println("0 이상 100 이하의 점수만 입력 가능합니다.");
				System.out.println(Values.sLine(80));
			} else {
				break;
			} // 유효성 검사 end

		} // while end

		Integer intMusic = 0;
		while (true) {
			try {
				System.out.print("음악 >> ");
				String strMusic = scan.nextLine();
				intMusic = Integer.valueOf(strMusic);
				System.out.println(Values.sLine(80));
			} catch (Exception e) {
				System.out.println(Values.sLine(80));
				System.out.println("알 수 없는 요청입니다.");
				System.out.println(Values.sLine(80));
				continue;
			} // try catch end
			if (intMusic < 0 || intMusic > 100) {
				System.out.println("0 이상 100 이하의 점수만 입력 가능합니다.");
				System.out.println(Values.sLine(80));
			} else {
				break;
			} // 유효성 검사 end

		} // while end

		ScoreVO sVO = new ScoreVO();
		sVO.setStdNum(stdNum);
		sVO.setIntKor(intKor);
		sVO.setIntMath(intMath);
		sVO.setIntEng(intEng);
		sVO.setIntMusic(intMusic);
		scoreList.add(sVO);

	}// class end

	@Override
	public void saveScoreToFile() {
		// TODO 입력받은 점수를 파일에 저장

		FileWriter fileWriter = null;
		PrintWriter printer = null;

		try {
			fileWriter = new FileWriter(fileName);
			printer = new PrintWriter(fileWriter);

			// scoreList에 담긴 데이터를 파일로 출력
			for (ScoreVO vo : scoreList) {
				printer.print(vo.getStdNum() + ":");
				printer.print(vo.getIntKor() + ":");
				printer.print(vo.getIntEng() + ":");
				printer.print(vo.getIntMath() + ":");
				printer.print(vo.getIntMusic() + ":");
			}
			printer.close();
			fileWriter.close();
			System.out.println("파일 저장 성공");
		} catch (IOException e) {
			// e.printStackTrace();
			System.out.println("파일 생성 중 문제 발생");
		}

	}

	@Override
	public void scoreTotalAndAvg() {
		// TODO 총점과 평균 계산

		for (ScoreVO vo : scoreList) {
			int sum = vo.getIntKor();
			sum += vo.getIntEng();
			sum += vo.getIntMath();
			sum += vo.getIntMusic();

			float avg = (float) sum / 4;

			vo.setTotal(sum);
			vo.setAvg(avg);
		}

	}

	@Override
	public void loadDataToFile() {
		// TODO 파일에 있는 데이터를 불러오기

		FileReader fileReader = null;
		BufferedReader buffer = null;

		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			while (true) {
				String reader = buffer.readLine();
				if (reader == null) {
					break;
				}

				String scores[] = reader.split(":");

				ScoreVO vo = new ScoreVO(scores[0], // stdNum
						Integer.valueOf(scores[1]), // intKor
						Integer.valueOf(scores[2]), // intEng
						Integer.valueOf(scores[3]), // intMath
						Integer.valueOf(scores[4]) // intMusic
				);
				scoreList.add(vo);

			} // end While
			buffer.close();
			fileReader.close();

		} catch (FileNotFoundException e) {
			// e.printStackTrace();
			System.out.println(fileName + "파일이 없습니다.");
		} catch (IOException e) {
			// e.printStackTrace();
			System.out.println("파일을 읽는 동안 문제 발생");
		}

		this.printScore();

	}

	@Override
	public void printScore() {
		// TODO 점수 출력

		this.scoreTotalAndAvg();
		System.out.println(Values.dLine(80));
		System.out.println(Values.dLine(80));
		System.out.println("학번\t국어\t영어\t수학\t음악\t총점\t평균");
		System.out.println(Values.sLine(80));

		int totalSum = 0;
		int count = 0;
		for (ScoreVO vo : scoreList) {
			System.out.print(vo.getStdNum() + "\t");
			System.out.print(vo.getIntKor() + "\t");
			System.out.print(vo.getIntEng() + "\t");
			System.out.print(vo.getIntMath() + "\t");
			System.out.print(vo.getIntMusic() + "\t");

			System.out.print(vo.getTotal() + "\t");
			System.out.printf("%3.2f\n", vo.getAvg());

			totalSum += vo.getTotal();
			count += 4;
		} // end for

		float avgSum = (float) totalSum / count;

		System.out.println(Values.sLine(80));
		System.out.println("총점 : " + totalSum);
		System.out.println("평균 : " + avgSum);

	}

}