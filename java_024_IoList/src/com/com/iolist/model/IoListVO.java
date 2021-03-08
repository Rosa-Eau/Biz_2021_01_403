package com.com.iolist.model;

public class IoListVO {
	
	private String date;
	private String pName;
	private String aName;
	private String rName;
	private int divNum;
	private int inPrice;
	private int outPrice;
	private int qty;
	
	
	
	public IoListVO() {
	}
	
	
	public IoListVO(String date, String pName, String aName, String rName, int divNum, int inPrice, int outPrice,
			int qty) {
		super();
		this.date = date;
		this.pName = pName;
		this.aName = aName;
		this.rName = rName;
		this.divNum = divNum;
		this.inPrice = inPrice;
		this.outPrice = outPrice;
		this.qty = qty;
	}


	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	public String getrName() {
		return rName;
	}
	public void setrName(String rName) {
		this.rName = rName;
	}
	public int getDivNum() {
		return divNum;
	}
	public void setDivNum(int divNum) {
		this.divNum = divNum;
	}
	public int getInPrice() {
		return inPrice;
	}
	public void setInPrice(int inPrice) {
		this.inPrice = inPrice;
	}
	public int getOutPrice() {
		return outPrice;
	}
	public void setOutPrice(int outPrice) {
		this.outPrice = outPrice;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	@Override
	public String toString() {
		return "IoListVO [date=" + date + ", pName=" + pName + ", aName=" + aName + ", rName=" + rName + ", divNum="
				+ divNum + ", inPrice=" + inPrice + ", outPrice=" + outPrice + ", qty=" + qty + "]";
	}
	
	
	
}
