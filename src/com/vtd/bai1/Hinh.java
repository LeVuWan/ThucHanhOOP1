package com.vtd.bai1;

public abstract class Hinh {
	public String mauVien;
	public String mauNen;

	public void showMe() {
		System.out.println("Mau nen: " + mauNen);
		System.out.println("Mau vien: " + mauVien);
	}

	public abstract double chuVi();

	public abstract double dienTich();
}
