package com.learn.design.credit.card.builder;

import java.util.Date;

import com.learn.design.model.VisaCC;

public class VisaCCBuilder implements CCBuilder {

	private VisaCC cc = new VisaCC();

	public VisaCCBuilder setNumber(String number) {
		cc.setNumber(number);
		return this;
	}

	public VisaCCBuilder setExpiry(Date expiry) {
		cc.setExpiry(expiry);
		return this;
	}

	public VisaCCBuilder setHolderName(String holderName) {
		cc.setHolderName(holderName);
		return this;
	}

	@Override
	public VisaCC getCreditCard() {
		return this.cc;
	}

}
