package com.vtd.bai1;

public class Thoi extends TuGiac {
	private double canh;
	private double duongCheo1;
	private double duongCheo2;
	
	public Thoi() {
		super();
	}

	public Thoi(double canh, double duongCheo1, double duongCheo2) {
		super();
		this.canh = canh;
		this.duongCheo1 = duongCheo1;
		this.duongCheo2 = duongCheo2;
	}

	@Override
	public double chuVi() {
		return 4 * canh;
	}

	@Override
	public double dienTich() {
		return (duongCheo1 * duongCheo2) / 2.0;
	}

}
