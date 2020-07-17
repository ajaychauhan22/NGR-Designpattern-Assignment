package com.learn.design.model;

import java.util.Date;

public class VisaCC implements CreditCard {
	private String number;
	private Date expiry;
	private String holderName;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Date getExpiry() {
		return expiry;
	}

	public void setExpiry(Date expiry) {
		this.expiry = expiry;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	@Override
	public String toString() {
		return "VisaCC [number=" + number + ", expiry=" + expiry + ", holderName=" + holderName + "]";
	}
}
