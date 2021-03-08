package com.callor.score.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.callor.score.model.ScoreVO;
import com.callor.score.service.ScoreService;
import com.callor.score.values.Values;

public class ScoreServiceImplV1 implements ScoreService {
	
	private List<ScoreVO> scoreList;
	private ScoreVO scVO; 
	private String fileName;
	List<String> strLines;
	
	public ScoreServiceImplV1() {
		scoreList = new ArrayList();
		scVO = new ScoreVO();
		fileName = "src/com/callor/score/score.txt";
		strLines = new ArrayList<String>();
	}
	

	@Override
	public void makeScore() {
		// TODO Random 정수 만들기
		System.out.println("학생 점수 생성");
		Random rnd = new Random();
		
		
		for(int i = 0 ; i < 20 ; i++) {	
			scVO.setNum(String.valueOf(i + 1));
			scVO.setKor(rnd.nextInt(100) + 1);
			scVO.setEng(rnd.nextInt(100) + 1);
			scVO.setMath(rnd.nextInt(100) + 1);
			scVO.setMusic(rnd.nextInt(100) + 1);
			scVO.setHistory(rnd.nextInt(100) + 1);
			scoreList.add(scVO);
		}

		

	}

	@Override
	public void saveScoreToFile() {
		// TODO 만들어진 정수를 파일에 저장하기
		
		
		FileWriter fWriter = null;
		PrintWriter printer = null;
	
		try {
			fWriter = new FileWriter(fileName);
			printer = new PrintWriter(fWriter);
			printer.println(Values.dLine);
			printer.println("순번\t국어\t영어\t수학\t음악\t국사\t총점\t평균");
			printer.println(Values.sLine);

			for(int i = 0 ; i < 20 ; i++) {
				printer.println(scoreList);						
			}
			
			printer.println(Values.dLine);
			printer.close();
			fWriter.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 System.out.println("파일 저장 완료");
		

	}

	@Override
	public void loadScoreFromFile() {
		// TODO 파일을 Console에 불러오기
		
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			
			while(true) {
				String str = buffer.readLine();
				if(str == null) {
					break;
				}
				strLines.add(str);
			}
			buffer.close();
			fileReader.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
