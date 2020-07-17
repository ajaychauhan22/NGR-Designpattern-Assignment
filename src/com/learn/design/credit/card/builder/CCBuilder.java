package com.learn.design.credit.card.builder;

import java.util.Date;

import com.learn.design.model.CreditCard;

public interface CCBuilder {
	CreditCard getCreditCard();

	CCBuilder setNumber(String number);

	CCBuilder setExpiry(Date expiry);

	CCBuilder setHolderName(String holderName);
}
