package com.vtd.bai1;

public class TamGiacVuong extends TamGiac {
	private double canhGocVuong;
	private double canhHuyen;

	public TamGiacVuong(double canhGocVuong, double canhHuyen) {
		super();
		this.canhGocVuong = canhGocVuong;
		this.canhHuyen = canhHuyen;
	}
	
	public TamGiacVuong() {
		super();
	}

	@Override
	public double chuVi() {
		double c = Math.sqrt(Math.pow(canhHuyen, 2) + Math.pow(canhHuyen, 2));
		return canhGocVuong + canhHuyen + c;
	}

	@Override
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
