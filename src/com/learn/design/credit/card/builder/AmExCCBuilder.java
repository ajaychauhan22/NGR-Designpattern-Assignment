package com.learn.design.credit.card.builder;

import java.util.Date;

import com.learn.design.model.AmExCC;

public class AmExCCBuilder implements CCBuilder {
	private AmExCC cc = new AmExCC();

	public AmExCCBuilder setNumber(String number) {
		cc.setNumber(number);
		return this;
	}

	public AmExCCBuilder setExpiry(Date expiry) {
		cc.setExpiry(expiry);
		return this;
	}

	public AmExCCBuilder setHolderName(String holderName) {
		cc.setHolderName(holderName);
		return this;
	}

	@Override
	public AmExCC getCreditCard() {
		return this.cc;
	}
}
