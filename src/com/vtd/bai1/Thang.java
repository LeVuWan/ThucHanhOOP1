package com.vtd.bai1;

public class Thang extends TuGiac {
	private double dayLon;
	private double dayNho;
	private double canhBenTrai;
	private double canhBenPhai;
	
	public Thang() {
		super();
	}

	public Thang(double dayLon, double dayNho, double canhBenTrai, double canhBenPhai) {
		super();
		this.dayLon = dayLon;
		this.dayNho = dayNho;
		this.canhBenTrai = canhBenTrai;
		this.canhBenPhai = canhBenPhai;
	}

	@Override
	public double chuVi() {
		return dayLon + dayNho + canhBenTrai + canhBenPhai;
	}

	@Override
	public double dienTich() {
		double delta = dayLon - dayNho;

		double h = Math.sqrt(canhBenTrai * canhBenTrai
				- Math.pow(((canhBenTrai * canhBenTrai - canhBenPhai * canhBenPhai) + delta * delta) / (2 * delta), 2));

		return (dayLon + dayNho) / 2.0 * h;
	}

	public double getDayLon() {
		return dayLon;
	}

	public void setDayLon(double dayLon) {
		this.dayLon = dayLon;
	}

	public double getDayNho() {
		return dayNho;
	}

	public void setDayNho(double dayNho) {
		this.dayNho = dayNho;
	}

	public double getCanhBenTrai() {
		return canhBenTrai;
	}

	public void setCanhBenTrai(double canhBenTrai) {
		this.canhBenTrai = canhBenTrai;
	}

	public double getCanhBenPhai() {
		return canhBenPhai;
	}

	public void setCanhBenPhai(double canhBenPhai) {
		this.canhBenPhai = canhBenPhai;
	}
}
