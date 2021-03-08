package com.com.iolist.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.com.iolist.model.IoListVO;
import com.com.iolist.service.IoListService;
import com.com.iolist.values.Values;

public class IoListServiceImplV1 implements IoListService {

	List<IoListVO> ioList;

	public IoListServiceImplV1() {
		ioList = new ArrayList<IoListVO>();
	}

	@Override
	public void loadListFromFile() {
		// TODO 파일 읽어오기
		String fileName = "src/com/com/iolist/애입매출데이터.txt";

		FileReader fileReader = null;
		BufferedReader buffer = null;

		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			
			while (true) {
				//한 줄씩 reader 변수에 저장
				String reader = buffer.readLine();
				//buffer에 의해 파일에 저장된 것 이상의 문자는 null로 표시
				//따라서 reader에 null이 저장되면 이하의 코드를 수행하지 않은 채 while 문을 종료
				if (reader == null) {
					break;
				}
				
				
				//reader에 저장된 값을 ","를 기준으로 나누어 inOut배열에 저장
				String inOut[] = reader.split(",");
				
				//inOut 배열에 저장된 값을 VO 클래스의 인스턴스 변수들에게 할당시킴
				//배열 1,2,3에 담긴 값은 필요하지 않아 무시함
				IoListVO vo = new IoListVO(inOut[0], //strDate
						inOut[4], //strPNAme
						inOut[5], //strAName
						inOut[6], //strRName
						Integer.valueOf(inOut[7]), //intDivNum
						Integer.valueOf(inOut[8]), //intIPrince
						Integer.valueOf(inOut[9]), //intOPrice
						Integer.valueOf(inOut[10]) //intQty
						);
				ioList.add(vo);
				
				

			} // end While
			buffer.close();
			fileReader.close();

		} catch (FileNotFoundException e) {
			// e.printStackTrace();
			System.out.println(fileName + "파일이 없습니다.");
		} catch (IOException e) {
			// e.printStackTrace();
			System.out.println("파일을 읽는 동안 문제 발생");
		}
		
		this.listPrint();

	}

	@Override
	public void listPrint() {
		// TODO 프린트
		
		System.out.println(Values.dLine);
		System.out.println("거래일자\t거래처\t상품명\t매입금액\t판매금액");
		System.out.println(Values.sLine);
		
		for(IoListVO vo : ioList) {
			
			System.out.print(vo.getDate()+"\t");
			System.out.print(vo.getaName()+"\t");
			System.out.print(vo.getpName()+"\t");
			
			int div = vo.getDivNum();

			if(div == 1) {//구분 번호가 1 이면 매입
				System.out.print((vo.getInPrice()*vo.getQty())+"\t");
				System.out.println("0");
			} else if (div == 2) {//구분번호가 2이면 판매
				System.out.print("0\t");
				System.out.println(vo.getOutPrice()*vo.getQty());
			}
	
		} //end for
		System.out.println(Values.dLine);

	}

}
