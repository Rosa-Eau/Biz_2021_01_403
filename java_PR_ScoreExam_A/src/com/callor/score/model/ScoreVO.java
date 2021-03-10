package com.callor.score.model;

public class ScoreVO {

	private String stdNum;
	private int intKor;
	private int intMath;
	private int intEng;
	private int intMusic;

	private int Total;
	private float Avg;

	public ScoreVO() {
	}

	public ScoreVO(String stdNum, int intKor, int intMath, int intEng, int intMusic) {
		super();
		this.stdNum = stdNum;
		this.intKor = intKor;
		this.intMath = intMath;
		this.intEng = intEng;
		this.intMusic = intMusic;
	}

	public String getStdNum() {
		return stdNum;
	}

	public void setStdNum(String stdNum) {
		this.stdNum = stdNum;
	}

	public int getIntKor() {
		return intKor;
	}

	public void setIntKor(int intKor) {
		this.intKor = intKor;
	}

	public int getIntMath() {
		return intMath;
	}

	public void setIntMath(int intMath) {
		this.intMath = intMath;
	}

	public int getIntEng() {
		return intEng;
	}

	public void setIntEng(int intEng) {
		this.intEng = intEng;
	}

	public int getIntMusic() {
		return intMusic;
	}

	public void setIntMusic(int intMusic) {
		this.intMusic = intMusic;
	}

	public int getTotal() {
		return Total;
	}

	public void setTotal(int total) {
		Total = total;
	}

	public float getAvg() {
		return Avg;
	}

	public void setAvg(float avg) {
		Avg = avg;
	}

	@Override
	public String toString() {
		return "ScoreVO [stdNum=" + stdNum + ", intKor=" + intKor + ", intMath=" + intMath + ", intEng=" + intEng
				+ ", intMusic=" + intMusic + ", Total=" + Total + ", Avg=" + Avg + "]";
	}

}