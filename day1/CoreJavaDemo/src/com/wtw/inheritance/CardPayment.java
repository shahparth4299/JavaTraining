package com.wtw.inheritance;

public class CardPayment extends Payment implements ValidationPayment {
	int card_number;
	int cvv;
	public void validation() {
		System.out.println("Validating Card Nuber and CVV Number...");
	}
	public void checkbank() {
		System.out.println("Bank Name Validated");
	}
}
