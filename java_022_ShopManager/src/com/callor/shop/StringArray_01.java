package com.callor.shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.callor.shop.model.CartVO;

public class StringArray_01 {
	
	public static void main(String[] args) {
		Random rnd = new Random();
		int[] nums = new int[100];
		
		for(int i = 0; i < nums.length ; i++) {
			nums[i] = rnd.nextInt();
		}
		for(int i = 0 ; i < nums.length ; i++) {
			System.out.println(nums[i]);
		}
		
		int sum = 0;
		for(int i = 0 ; i < nums.length ; i++) {
			int n = nums[i];
			sum += nums[i];
		}
		
		sum = 0;
		//향상된 for문
		// ":" 다음에는 배열만 올 수 있음
		// nums[i]번째 값을 n에 저장하고 nums 배열에 저장된 수만큼만 반복
		for(int n : nums) {
			sum += n;
		}
		System.out.println("===================================");
		List<CartVO> cartList = new ArrayList<CartVO>();
		CartVO cartVO = new CartVO();
		cartVO.setUserName("홍길동");
		cartList.add(cartVO);
		
		cartVO = new CartVO();
		cartVO.setUserName("성춘향");
		
		cartVO = new CartVO();
		cartVO.setUserName("이몽룡");
		
		int nSize = cartList.size();
		for(int i = 0 ; i < nSize ; i++) {
			System.out.println(cartList.get(i).getUserName());
		}
		
		for(int i = 0 ; i < nSize ; i++) {
			CartVO vo = cartList.get(i);
			System.out.println(cartList.get(i).getUserName());
		}
		
		/*
		 * 향상된 for : forEach
		 * 1. cartList의 요소 개수만큼 반복하는 반복문 생성
		 * 2. cartList의 처음부터 끝까지 반복하면서
		 * 		요소들을 하나씩 getter하여 vo 객체에 담아준다
		 * 3. for() 내의 코드로 vo 객체 값을 전달하여 사용할 수 있도록 만들어 준다
		 */
		for(CartVO vo : cartList) {
			System.out.println(vo.getUserName());
		}
		
		
		
	}

}
