package com.vtd.bai1;

public class Thoi extends TuGiac {
	private double canh;
	private double duongCheo1;
	private double duongCheo2;

	public Thoi(String mauVien, String mauNen, double canh, double duongCheo1, double duongCheo2) {
		super(mauVien, mauNen);
		this.canh = canh;
		this.duongCheo1 = duongCheo1;
		this.duongCheo2 = duongCheo2;
	}

	public Thoi(String mauVien, String mauNen) {
		super(mauVien, mauNen);
	}

	public double tinhChuVi() {
		return 4 * canh;
	}

	public double tinhDienTich() {
		return (duongCheo1 * duongCheo2) / 2.0;
	}

	public double getCanh() {
		return canh;
	}

	public void setCanh(double canh) {
		this.canh = canh;
	}

	public double getDuongCheo1() {
		return duongCheo1;
	}

	public void setDuongCheo1(double duongCheo1) {
		this.duongCheo1 = duongCheo1;
	}

	public double getDuongCheo2() {
		return duongCheo2;
	}

	public void setDuongCheo2(double duongCheo2) {
		this.duongCheo2 = duongCheo2;
	}
	
	
}
