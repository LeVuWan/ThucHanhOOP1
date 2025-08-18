package com.vtd.bai2;

public class XeHaiBanh extends Xe {
	public ChanChong chanChong;

	public XeHaiBanh(String mauSon, double trongLuong, ChanChong chanChong) {
		super(mauSon, trongLuong);
		this.chanChong = chanChong;
	}

	public ChanChong getChanChong() {
		return chanChong;
	}

	public void setChanChong(ChanChong chanChong) {
		this.chanChong = chanChong;
	}
	
	
}
