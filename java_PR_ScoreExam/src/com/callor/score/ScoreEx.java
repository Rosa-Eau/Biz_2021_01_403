package com.callor.score;

import com.callor.score.service.MenuService;
import com.callor.score.service.ScoreService;
import com.callor.score.service.impl.MenuServiceImplV1;
import com.callor.score.service.impl.ScoreServiceImplV1;
import com.callor.score.value.ValMenu;

public class ScoreEx {

	public static void main(String[] args) {

		MenuService mService = new MenuServiceImplV1();
		ScoreService sService = new ScoreServiceImplV1();

		while (true) {
			Integer menu = mService.selectMenu();
			if (menu == null) {
				break;
			} else if (menu == ValMenu.MENU_INPUT) {
				// 성적 입력과 저장
				sService.inputScore();
			} else if (menu == ValMenu.MENU_SAVE) {	
				//성적 저장
				sService.saveScoreToFile();
			} else if (menu == ValMenu.MENU_PRINT) {
				// 성적 출력
				sService.loadDataToFile();
			}
		}
		System.out.println("업무종료");

	}

}
