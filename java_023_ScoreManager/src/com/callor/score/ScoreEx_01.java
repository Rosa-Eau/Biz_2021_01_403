package com.callor.score;

import com.callor.score.service.MenuService;
import com.callor.score.service.ScoreService;
import com.callor.score.service.impl.MenuServiceImplV1;
import com.callor.score.service.impl.ScoreServiceImplV1;

public class ScoreEx_01 {
	
	public static void main(String[] args) {
		
		MenuService mService = new MenuServiceImplV1();
		ScoreService sService = new ScoreServiceImplV1();
		
		mService.selectMenu();
		while (true) {
			Integer menu = mService.selectMenu();
			if (menu == null) {
				break;
			} else if(menu == 1) {
				//학생 성적 생성
				sService.makeScore();
			} else if(menu == 2) {
				//학생 성적 저장
				sService.saveScoreToFile();
			} else if(menu == 3) {
				//불러오기
				sService.loadScoreFromFile();

			}
		}
		System.out.println("업무종료");

		
	}

}
