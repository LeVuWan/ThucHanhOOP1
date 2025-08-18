package com.vtd.bai2;

public class Xe {
	public String mauSon;
	public double trongLuong;

	public Xe(String mauSon, double trongLuong) {
		super();
		this.mauSon = mauSon;
		this.trongLuong = trongLuong;
	}

	public Xe() {
		super();
	}

	public void showMe() {
		System.out.println("Mau son: " + mauSon + ", " + "trong luong: " + trongLuong);
	}

	public void chay() {
		System.out.print("Xe chay");
	}

	public void choNguoi() {
		System.out.println("Cho nguoi");
	}

	public void dungXe() {
		System.out.println("Dung xe");
	}

	public String getMauSon() {
		return mauSon;
	}

	public void setMauSon(String mauSon) {
		this.mauSon = mauSon;
	}

	public double getTrongLuong() {
		return trongLuong;
	}

	public void setTrongLuong(double trongLuong) {
		this.trongLuong = trongLuong;
	}
}
