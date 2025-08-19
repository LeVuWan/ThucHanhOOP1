package com.vtd.bai1;

public class TamGiacCan extends TamGiac {
	private double canhDay;
	private double canhBen;

	public TamGiacCan(double canhDay, double canhBen) {
		super();
		this.canhDay = canhDay;
		this.canhBen = canhBen;
	}

	public TamGiacCan() {
		super();
	}

	@Override
	public double chuVi() {
		return canhDay * 2 * canhBen;
	}

	@Override
	public double dienTich() {
		double h = Math.sqrt(Math.pow(canhBen, 2) - Math.pow((canhDay / 2), 2));
		return 1 / 2 * canhDay * h;
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

}
