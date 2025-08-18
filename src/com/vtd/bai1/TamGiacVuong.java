package com.vtd.bai1;

public class TamGiacVuong extends TamGiac {
	public double canhGocVuong;
	public double canhHuyen;
	
	

	public TamGiacVuong(String mauVien, String mauNen, double canhGocVuong, double canhHuyen) {
		super(mauVien, mauNen);
		this.canhGocVuong = canhGocVuong;
		this.canhHuyen = canhHuyen;
	}

	
	
	public TamGiacVuong(String mauVien, String mauNen) {
		super(mauVien, mauNen);
	}



	public double chuVi() {
		double c = Math.sqrt(Math.pow(canhHuyen, 2) + Math.pow(canhHuyen, 2));

		return canhGocVuong + canhHuyen + c;
	}

	public double dienTich() {
		return 1 / 2 * canhGocVuong * canhHuyen;
	}



	public double getCanhGocVuong() {
		return canhGocVuong;
	}



	public void setCanhGocVuong(double canhGocVuong) {
		this.canhGocVuong = canhGocVuong;
	}



	public double getCanhHuyen() {
		return canhHuyen;
	}



	public void setCanhHuyen(double canhHuyen) {
		this.canhHuyen = canhHuyen;
	}
	
	
}
