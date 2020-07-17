package com.learn.design.util;

import java.util.Date;

import com.learn.design.credit.card.builder.CCBuilder;
import com.learn.design.credit.card.builder.CreditCardBuilderFactory;
import com.learn.design.model.CreditCard;

public final class CreditCardUtils {
	private CreditCardUtils() {
	}

	// CC Builder Patter & Factory pattern
	public static CreditCard getCC(final String ccRecord) {

		String[] attributes = ccRecord.split(" ");
		if (attributes.length == 3) {
			CreditCardBuilderFactory ccBuilderFactor = new CreditCardBuilderFactory();

			CCBuilder ccbuilder = ccBuilderFactor.getCCBuilder(getType(attributes[0]));

			if (ccbuilder != null) {
				ccbuilder.setNumber(attributes[0]).setExpiry(new Date()).setHolderName(attributes[2]);
				return ccbuilder.getCreditCard();
			}
			
		}
		return null;

	}

	// Validate type of card
	public static CreditCardType getType(final String ccNumber) {

		if (ccNumber.charAt(0) == '3' && (ccNumber.charAt(1) == '4' || ccNumber.charAt(1) == 7)
				&& ccNumber.length() == 15) {
			return CreditCardType.AMEX;
		} else if (ccNumber.charAt(0) == '5' && (ccNumber.charAt(1) >= 49 && ccNumber.charAt(1) <= 53)
				&& ccNumber.length() == 16) {
			return CreditCardType.MASTER;
		} else if (ccNumber.charAt(0) == '4' && (ccNumber.length() == 16 || ccNumber.length() == 13)) {
			return CreditCardType.VISA;
		} else if (ccNumber.substring(0, 4).equals("6011") && ccNumber.length() == 16) {
			return CreditCardType.DISCOVER;
		}

		return CreditCardType.NONE;
	}
}
