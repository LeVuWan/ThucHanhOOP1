package com.vtd.bai1;

public class TamGiacCan extends TamGiac {

	public double canhDay;
	public double canhBen;

	public TamGiacCan(String mauVien, String mauNen) {
		super(mauVien, mauNen);
		// TODO Auto-generated constructor stub
	}
	
	public TamGiacCan(String mauVien, String mauNen, double canhDay, double canhBen) {
		super(mauVien, mauNen);
		this.canhDay = canhDay;
		this.canhBen = canhBen;
	}

	public double getCanhDay() {
		return canhDay;
	}
	

	public void setCanhDay(double canhDay) {
		this.canhDay = canhDay;
	}

	public double getCanhBen() {
		return canhBen;
	}

	public void setCanhBen(double canhBen) {
		this.canhBen = canhBen;
	}

	public double chuVi() {
		return canhDay * 2 * canhBen;
	}

	public double dienTich() {
		double h = Math.sqrt(Math.pow(canhBen, 2) - Math.pow((canhDay / 2), 2));
		return 1 / 2 * canhDay * h;
	}
}
