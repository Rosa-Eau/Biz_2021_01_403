package com.callor.student.model;

public class StudentVO {
	/*
	 * 0126:매재찬:경제학:2:1:울산광역시 울주군 문수로382:010-6239-1705
배열[0] : 학번
배열[1] : 학생이름
배열[2] : 학과
배열[3] : 학년
배열[4] : 반
배열[5] : 주소
배열[6] : 전화번호
	 */
	private int stdNum; //학번
	private String stdName; //학생이름
	private String stdDept; //학과
	private int stdGrade; //학년
	private int stdGroup; //반
	private String stdAdd; //주소
	private String stdPNum; //전화번호
	
	public StudentVO() {
	}

	public StudentVO(String stdName, String stdDept, int stdGrade, int stdGroup, String stdAdd,
			String stdPNum) {
		super();
		this.stdName = stdName;
		this.stdDept = stdDept;
		this.stdGrade = stdGrade;
		this.stdGroup = stdGroup;
		this.stdAdd = stdAdd;
		this.stdPNum = stdPNum;
	}


	
	public int getStdNum() {
		return stdNum;
	}
	public void setStdNum(int stdNum) {
		this.stdNum = stdNum;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public String getStdDept() {
		return stdDept;
	}
	public void setStdDept(String stdDept) {
		this.stdDept = stdDept;
	}
	public int getStdGrade() {
		return stdGrade;
	}
	public void setStdGrade(int stdGrade) {
		this.stdGrade = stdGrade;
	}
	public int getStdGroup() {
		return stdGroup;
	}
	public void setStdGroup(int stdGroup) {
		this.stdGroup = stdGroup;
	}
	public String getStdAdd() {
		return stdAdd;
	}
	public void setStdAdd(String stdAdd) {
		this.stdAdd = stdAdd;
	}
	public String getStdPNum() {
		return stdPNum;
	}
	public void setStdPNum(String stdPNum) {
		this.stdPNum = stdPNum;
	}
	@Override
	public String toString() {
		return "StudentVO [stdNum=" + stdNum + ", stdName=" + stdName + ", stdDept=" + stdDept + ", stdGrade="
				+ stdGrade + ", stdGroup=" + stdGroup + ", stdAdd=" + stdAdd + ", stdPNum=" + stdPNum + "]";
	}
	
	
	

}
