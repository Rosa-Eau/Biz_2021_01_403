package com.callor.iolist.model;

/*
 * 거래일자[0], ioDate String
 * 상품명[4], ioPName String
 * 거래처명[5], ioDept String
 * 대표자명[6], ioDeptCeo String
 * 구분[7], ioInout Integer 1==In, 2==OUT
 * 매입단가[8], ioIprice Integer
 * 판매단가[9], ioOprice Integer
 * 수량[10], ioQty Integer
 */

public class IolistVO {
	
	//추상화 단계, Modeling
	private String ioDate;
	private String ioPName;
	private String ioDept;
	private String ioDeptCeo;
	
	private int ioInout; //구분
	private int ioIprice; //매입단가
	private int ioOprice; //판매단가
	private int ioQty;
	
	private int ioITotal; //매입금액 : 매입단가 * 수량
	private int ioOTotal; //판매금액 : 판매단가 * 수량
	
	//기본 생성자
	//기본 생성자만 필요할 경우는 별도로 만들지 않아도 된다. 그러나 필드 생성자를 1개라도 만들면
	//기본 생성자도 반드시 만들어 주어야 한다.
	//필드 생성자를 만들면 기본 생성자가 자동으로 구현되지 않는다.
	//필드 생성자만 있고 기본 생성자를 만들지 않으면 다음 코드에서 오류발생
	/// IOListVO ioList = new IOListVO
		// TODO Auto-generated constructor stub

	public IolistVO() {
	}
		
	//대표자명이 생략된 생성자
	public IolistVO(String ioDate, String ioPName, String ioDept, int ioInout, int ioIprice, int ioOprice, int ioQty) {
		super();
		this.ioDate = ioDate;
		this.ioPName = ioPName;
		this.ioDept = ioDept;
		this.ioInout = ioInout;
		this.ioIprice = ioIprice;
		this.ioOprice = ioOprice;
		this.ioQty = ioQty;
	}

	//전체 필드가 포함된 생성자
	public IolistVO(String ioDate, String ioPName, String ioDept, String ioDeptCeo, int ioInout, int ioIprice,
			int ioOprice, int ioQty) {
		super();
		this.ioDate = ioDate;
		this.ioPName = ioPName;
		this.ioDept = ioDept;
		this.ioDeptCeo = ioDeptCeo;
		this.ioInout = ioInout;
		this.ioIprice = ioIprice;
		this.ioOprice = ioOprice;
		this.ioQty = ioQty;
	}

	public String getIoDate() {
		return ioDate;
	}

	public void setIoDate(String ioDate) {
		this.ioDate = ioDate;
	}

	public String getIoPName() {
		return ioPName;
	}

	public void setIoPName(String ioPName) {
		this.ioPName = ioPName;
	}

	public String getIoDept() {
		return ioDept;
	}

	public void setIoDept(String ioDept) {
		this.ioDept = ioDept;
	}

	public String getIoDeptCeo() {
		return ioDeptCeo;
	}

	public void setIoDeptCeo(String ioDeptCeo) {
		this.ioDeptCeo = ioDeptCeo;
	}

	public int getIoInout() {
		return ioInout;
	}

	public void setIoInout(int ioInout) {
		this.ioInout = ioInout;
	}

	public int getIoIprice() {
		return ioIprice;
	}

	public void setIoIprice(int ioIprice) {
		this.ioIprice = ioIprice;
	}

	public int getIoOprice() {
		return ioOprice;
	}

	public void setIoOprice(int ioOprice) {
		this.ioOprice = ioOprice;
	}

	public int getIoQty() {
		return ioQty;
	}

	public void setIoQty(int ioQty) {
		this.ioQty = ioQty;
	}

	public int getIoITotal() {
		return ioITotal;
	}

	public void setIoITotal(int ioITotal) {
		this.ioITotal = ioITotal;
	}

	public int getIoOTotal() {
		return ioOTotal;
	}

	public void setIoOTotal(int ioOTotal) {
		this.ioOTotal = ioOTotal;
	}

	@Override
	public String toString() {
		return "IoListVO [ioDate=" + ioDate + ", ioPName=" + ioPName + ", ioDept=" + ioDept + ", ioDeptCeo=" + ioDeptCeo
				+ ", ioInout=" + ioInout + ", ioIprice=" + ioIprice + ", ioOprice=" + ioOprice + ", ioQty=" + ioQty
				+ ", ioITotal=" + ioITotal + ", ioOTotal=" + ioOTotal + "]";
	}
	
	



}
