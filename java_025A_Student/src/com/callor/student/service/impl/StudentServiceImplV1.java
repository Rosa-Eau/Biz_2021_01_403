package com.callor.student.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.student.model.StudentVO;
import com.callor.student.service.StudentService;
import com.callor.student.values.Values;

public class StudentServiceImplV1 implements StudentService {

	//protected 변수는 상속된 클래스에서 계속해서 사용 가능
	protected List<StudentVO> stdList;

	public StudentServiceImplV1() {
		stdList = new ArrayList<StudentVO>();
	}

	@Override
	public void loadStudentFromFile() {

		String fileName = "src/com/callor/student/학생정보리스트.txt";
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
				String[] stds = reader.split(":");

				StudentVO stdVO = new StudentVO(
						stds[0], 
						stds[1], 
						stds[2], 
						stds[3], 
						stds[4], 
						stds[5], 
						stds[6]);
				
				stdList.add(stdVO);

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void searchStudent() {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println(Values.dLine(50));
			System.out.println("찾는 학생 이름을 입력하세요(종료 : OUIT)");
			System.out.println(Values.sLine(50));
			System.out.print("이름 >> ");
			String strName = scan.nextLine();
			
			if(strName.equals("OUIT")) {
				System.out.println("종료합니다");
				break;
			}
			
			int index = 0;
			int nSize = stdList.size();
			
			for(index = 0; index < nSize ; index++) {
				StudentVO stdVO = stdList.get(index);
				if(strName.equals(stdVO.getStName())) {
					break;
				}
				
			}
			//for 문이 종료, 중단되었을 때 index와 nSize값의 관계를 비교해 보면
			//index < nSize ==> 중단되었다(break)
			//index >= nSize ==> for 가 모두 반복, 자료가 없다.
			
			if(index < nSize) {
				
				StudentVO svo = stdList.get(index);
				this.printStVO(svo);
			
			} else {
				System.out.println(strName + " 학생은 자료가 없음");
			}
			System.out.println(Values.dLine(50));
		}


	} //end searchStudent();
	
	protected void printStVO(StudentVO svo) {
		
		System.out.println(Values.dLine(50));
		System.out.printf("학번 : %s\n", svo.getStNum());
		System.out.printf("이름 : %s\n", svo.getStName());
		System.out.printf("학년 : %s\n", svo.getStGrade());
		System.out.printf("반 : %s\n", svo.getStClass());
		System.out.printf("주소 : %s\n", svo.getStAddr());
		System.out.printf("전화번호 : %s\n", svo.getStTel());
	}

}
