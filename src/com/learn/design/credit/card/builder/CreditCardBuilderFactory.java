package com.learn.design.credit.card.builder;

import com.learn.design.util.CreditCardType;

public class CreditCardBuilderFactory {

	public CCBuilder getCCBuilder(CreditCardType ccType) {
		CCBuilder ccbuilder = null;
		if (ccType == CreditCardType.AMEX) {
			ccbuilder = new AmExCCBuilder();

		} else if (ccType == CreditCardType.MASTER) {
			ccbuilder = new MasterCCBuilder();

		} else if (ccType == CreditCardType.VISA) {
			ccbuilder = new VisaCCBuilder();

		} else if (ccType == CreditCardType.DISCOVER) {
			ccbuilder = new DiscoverCCBuilder();
		}
		return ccbuilder;
	}

}
