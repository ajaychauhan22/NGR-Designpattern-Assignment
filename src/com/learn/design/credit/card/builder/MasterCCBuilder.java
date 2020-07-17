package com.learn.design.credit.card.builder;

import java.util.Date;

import com.learn.design.model.MasterCC;

public class MasterCCBuilder implements CCBuilder {

	private MasterCC cc = new MasterCC();

	public MasterCCBuilder setNumber(String number) {
		cc.setNumber(number);
		return this;
	}

	public MasterCCBuilder setExpiry(Date expiry) {
		cc.setExpiry(expiry);
		return this;
	}

	public MasterCCBuilder setHolderName(String holderName) {
		cc.setHolderName(holderName);
		return this;
	}

	@Override
	public MasterCC getCreditCard() {
		return this.cc;
	}

}
