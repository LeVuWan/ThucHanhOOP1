package com.vtd.bai1;

public class Thang extends TuGiac {
	public double dayLon;
	public double dayNho;
	public double canhBenTrai;
	public double canhBenPhai;
	
	public Thang(String mauVien, String mauNen, double dayLon, double dayNho, double canhBenTrai, double canhBenPhai) {
		super(mauVien, mauNen);
		this.dayLon = dayLon;
		this.dayNho = dayNho;
		this.canhBenTrai = canhBenTrai;
		this.canhBenPhai = canhBenPhai;
	}
	
	

	public Thang(String mauVien, String mauNen) {
		super(mauVien, mauNen);
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



	public double chuVi() {
		return dayLon + dayNho + canhBenTrai + canhBenPhai;
	}

	public double dienTich() {
		double delta = dayLon - dayNho;

		double h = Math.sqrt(canhBenTrai * canhBenTrai
				- Math.pow(((canhBenTrai * canhBenTrai - canhBenPhai * canhBenPhai) + delta * delta) / (2 * delta), 2));

		return (dayLon + dayNho) / 2.0 * h;
	}
}
