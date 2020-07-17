package com.learn.design.model;

import java.util.Date;

public interface CreditCard {
	String getNumber();

	void setNumber(String number);

	Date getExpiry();

	void setExpiry(Date expiry);

	String getHolderName();

	void setHolderName(String holderName);
}
