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
import com.callor.student.values.StdValues;
import com.callor.student.values.Values;

public class StudentServiceImplV1 implements StudentService {

	private List<StudentVO> stdList;
	String stdName;

	public StudentServiceImplV1() {
		stdList = new ArrayList<StudentVO>();
		stdName = null;
	}

	@Override
	public void loadDataFromFile() {
		// TODO 데이터 불러오기

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

				String[] stdDatas = reader.split(":");

				StudentVO studentVO = new StudentVO(stdDatas[StdValues.STD_NAME], // 학생이름
						stdDatas[StdValues.STD_DEPT], // 학과
						Integer.valueOf(stdDatas[StdValues.STD_GRADE]), // 학년
						Integer.valueOf(stdDatas[StdValues.STD_GROUP]), // 반
						stdDatas[StdValues.STD_ADD], // 주소
						stdDatas[StdValues.STD_PNUM]); // 전화번호

				stdList.add(studentVO);
			}
			buffer.close();
			fileReader.close();
		} catch (FileNotFoundException e) {
			// e.printStackTrace();
			System.out.println(fileName + "을 찾을 수 없습니다.");
		} catch (IOException e) {
			// e.printStackTrace();
			System.out.println("파일 로딩중 오류 발생");
		}

	}

	@Override
	public void inputName() {
		// TODO 이름 입력받기
		Scanner scan = new Scanner(System.in);

		System.out.println(Values.dLine(60));
		System.out.println("찾는 학생 이름을 입력하세요");
		System.out.println(Values.sLine(60));
		System.out.print("이름 >> ");
		stdName = scan.nextLine();
		System.out.println(Values.dLine(60));

	}

	@Override
	public void checkName() {
		// TODO 파일에 동일한 이름이 있는지 확인

		for (StudentVO vo : stdList) {
			if (stdName.equals(vo.getStdName())) {
				this.printStdList(vo);
				return;
			}
		}
		System.out.println(stdName + " 자료는 없습니다");
		System.out.println(Values.dLine(60));

	}

	@Override
	public void printStdList(StudentVO vo) {
		// TODO 학생정보 프린트

		System.out.printf("이름 : %s\n", vo.getStdName());
		System.out.printf("학과 : %s\n", vo.getStdDept());
		System.out.printf("학년 : %s\n", vo.getStdGrade());
		System.out.printf("반 : %s\n", vo.getStdGroup());
		System.out.printf("주소 : %s\n", vo.getStdAdd());
		System.out.printf("전화번호 : %s\n", vo.getStdPNum());
		System.out.println(Values.dLine(60));

	}

}
