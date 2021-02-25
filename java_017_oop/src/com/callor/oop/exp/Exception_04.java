package com.callor.oop.exp;

import com.callor.oop.model.ProductVO;

public class Exception_04 {

	public static void main(String[] args) {

		ProductVO[] pVOs = new ProductVO[3];

		for (int i = 0; i < pVOs.length; i++) {
			pVOs[i] = new ProductVO();
		}
		pVOs[0].strDName = "초코파이";
		try {
			pVOs[0].strDName = "초코파이";
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("객체가 생성되지 않았는데 사용하려고 시도함");
		}

	}

}
