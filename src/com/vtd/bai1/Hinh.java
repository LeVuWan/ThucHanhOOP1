package com.vtd.bai1;

public class Hinh {
	public String mauVien;
	public String mauNen;

	public Hinh(String mauVien, String mauNen) {
		super();
		this.mauVien = mauVien;
		this.mauNen = mauNen;
	}

	public Hinh() {
	}

	public String getMauVien() {
		return mauVien;
	}

	public void setMauVien(String mauVien) {
		this.mauVien = mauVien;
	}

	public String getMauNen() {
		return mauNen;
	}

	public void setMauNen(String mauNen) {
		this.mauNen = mauNen;
	}

	public void showMe() {
		System.out.println("Mau nen: " + mauNen);
		System.out.println("Mau vien: " + mauVien);
	}
}
