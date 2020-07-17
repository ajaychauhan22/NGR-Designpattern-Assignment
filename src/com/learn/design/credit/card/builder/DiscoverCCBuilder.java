package com.learn.design.credit.card.builder;

import java.util.Date;

import com.learn.design.model.DiscoverCC;

public class DiscoverCCBuilder implements CCBuilder {

	private DiscoverCC cc = new DiscoverCC();

	public DiscoverCCBuilder setNumber(String number) {
		cc.setNumber(number);
		return this;
	}

	public DiscoverCCBuilder setExpiry(Date expiry) {
		cc.setExpiry(expiry);
		return this;
	}

	public DiscoverCCBuilder setHolderName(String holderName) {
		cc.setHolderName(holderName);
		return this;
	}

	@Override
	public DiscoverCC getCreditCard() {
		return this.cc;
	}

}
