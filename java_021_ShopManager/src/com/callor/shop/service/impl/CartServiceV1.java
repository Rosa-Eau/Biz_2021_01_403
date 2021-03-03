package com.callor.shop.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.shop.model.CartVO;
import com.callor.shop.service.CartService;

public class CartServiceV1 implements CartService {
	private List<CartVO> cartList;
	private Scanner scan;

	public CartServiceV1() {
		cartList = new ArrayList<CartVO>();
		scan = new Scanner(System.in);
	}

	@Override
	public void inputCart() {
		System.out.println("===========================================");
		System.out.println("장바구니에 넣기");
		System.out.println("-------------------------------------------");
		String strUserName = null;
		while (true) {
			try {
				System.out.print("성명 >> ");
				strUserName = scan.nextLine();
				break;
			} catch (Exception e) {
				System.out.println("알 수 없는 요청입니다.");
			}
		}
		String strProName = null;
		while (true) {
			try {
				System.out.print("상품명 >> ");
				strProName = scan.nextLine();
				break;
			} catch (Exception e) {
				System.out.println("알 수 없는 요청입니다.");
			}
		}
		int intPrice = 0;
		while (true) {
			try {
				System.out.print("단가 >> ");
				String strPrice = scan.nextLine();
				intPrice = Integer.valueOf(strPrice);
				if (intPrice < 1) {
					System.out.println("단가는 1 이상 입력하세요");
				} else {
					break;
				}

			} catch (Exception e) {
				System.out.println("알 수 없는 요청입니다.");
			}

		}
		int intQty = 0;
		while (true) {
			try {
				System.out.print("수량 >> ");
				String strQty = scan.nextLine();
				intQty = Integer.valueOf(strQty);
				if (intQty < 1) {
					System.out.println("수량은 1개 이상 입력하세요");
				} else {
					break;
				}
			} catch (Exception e) {
				System.out.println("알 수 없는 요청입니다.");
			}
		}

		CartVO cartVO = new CartVO();
		cartVO.setUserName(strUserName);
		cartVO.setProName(strProName);
		cartVO.setPrice(intPrice);
		cartVO.setQty(intQty);
		cartVO.setTotal(intPrice * intQty);
		cartList.add(cartVO);

	}

	@Override
	public void printAllCart() {
		int nSize = cartList.size();
		System.out.println("=========================================== ");
		System.out.println("구매자\t상품명\t단가\t수량\t합계");
		System.out.println("-------------------------------------------");
		int count = 0;
		int intTotalSum = 0;
		for (int i = 0; i < nSize; i++) {
			System.out.print(cartList.get(i).getUserName()+"\t");
			System.out.print(cartList.get(i).getProName()+"\t");
			System.out.print(cartList.get(i).getPrice()+"\t");
			System.out.print(cartList.get(i).getQty()+"\t");
			System.out.println(cartList.get(i).getTotal());
			count += 1;
			intTotalSum += cartList.get(i).getTotal();
		}
		System.out.println("-------------------------------------------");
		System.out.printf("합계\t%d가지\t\t\t%d\n", count, intTotalSum);
	}

	public void printOwnCart() {
	
		System.out.println("===========================================");
		System.out.println("출력할 구매자 이름을 입력하세요");
		System.out.println("-------------------------------------------");
		System.out.print("이름 >> ");
		String strInputName = scan.nextLine();
		System.out.println("===========================================");
		System.out.println("구매자\t상품명\t단가\t수량\t합계");
		System.out.println("-------------------------------------------");
		int nSize = cartList.size();
		int count = 0;
		int intTotalSum = 0;
		for (int i = 0; i < nSize; i++) {
			boolean bYes = cartList.get(i).getUserName().equals(strInputName);
			if (bYes) {
				System.out.print(cartList.get(i).getUserName() + "\t");
				System.out.print(cartList.get(i).getProName() + "\t");
				System.out.print(cartList.get(i).getPrice() + "\t");
				System.out.print(cartList.get(i).getQty() + "\t");
				System.out.print(cartList.get(i).getTotal() + "\t\n");
				count += 1;
				intTotalSum += cartList.get(i).getTotal();
			}
		}
		System.out.println("-------------------------------------------");
		System.out.printf("합계\t%d가지\t\t\t%d\n", count, intTotalSum);
	}

}
