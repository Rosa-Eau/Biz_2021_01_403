package com.callor.student.service;

import com.callor.student.model.StudentVO;

/*
 * 
 *학생정보리스트.txt 파일을 읽어 List에 저장
 *키보드로 학생이름을 입력받아서
 *있으면 학생정보를 출력
 *없으면 없는 학생이라는 메시지출력
 */
public interface StudentService {
	
	public void loadDataFromFile();
	public void inputName();
	public void checkName();
	public void printStdList(StudentVO vo);

}
