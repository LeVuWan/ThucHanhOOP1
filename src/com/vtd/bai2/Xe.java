package com.vtd.bai2;

public abstract class Xe {
	public String mauSon;
	public double trongLuong;

	public void chay() {
		System.out.println("Xe dang chay");
	}
	
	public void dung() {
		System.out.println("Dung");
	}
	
	public void choNguoi() {
		System.out.println("Cho nguoi");
	}
	
	public void showMe() {
		System.out.println("Trong luong: " + trongLuong);
		System.out.println("Mau xe: " + mauSon);
	}
}
