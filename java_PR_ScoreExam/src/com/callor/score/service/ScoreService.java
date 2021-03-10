package com.callor.score.service;
/*
 * 각 과목의 점수를 입력받고 평균, 총점을 계산해서 출력
 * 한 번 입력받은 학번을 또 다시 입력했을 경우 
 * 입력할 수 없다는 메시지를 출력하고 입력할 수 없도록 해야 한다.
 */
public interface ScoreService {
	
	public void inputScore();
	public void saveScoreToFile();
	public void scoreTotalAndAvg();
	public void loadDataToFile();
	public void printScore();

}
