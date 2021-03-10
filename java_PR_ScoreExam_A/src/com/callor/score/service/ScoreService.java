package com.callor.score.service;

/*
 * 각과목의점수를입력받고평균, 총점을계산해서출력
 * 한번입력받은학번을또다시입력했을경우
 * 입력할수없다는메시지를출력하고입력할수없도록해야한다.
 */
public interface ScoreService {

	public void searchStdNum();
	public void inputScore();
	public void saveScoreToFile();
	public void scoreTotalAndAvg();
	public void loadDataToFile();
	public void printScore();

}