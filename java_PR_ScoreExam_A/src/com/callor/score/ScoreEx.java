package com.callor.score;

import com.callor.score.service.MenuService;
import com.callor.score.service.ScoreService;
import com.callor.score.service.impl.MenuServiceImplV1;
import com.callor.score.service.impl.ScoreServiceImplV1;

public class ScoreEx {

	public static void main(String[] args) {

		MenuService mService = new MenuServiceImplV1();
		ScoreService sService = new ScoreServiceImplV1();

		while (true) {
			Integer menu = mService.selectMenu();
			if (menu == null) {
				break;
			} else if (menu == 1) {
				// 성적입력
				sService.searchStdNum();
			} else if (menu == 2) {
				// 성적저장
				sService.saveScoreToFile();
			} else if (menu == 3) {
				// 성적출력
				sService.loadDataToFile();

			}
		}
		System.out.println("업무종료");

	}

}