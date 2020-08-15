package com.wtw.inheritance;

public class Payment {
	int amount;
	int id;
	String payment_method;
	public void payment_operation() {
		System.out.println("Select Payment Method...");
	}
	public void transaction_status() {
		System.out.println("Success...");
	}
}
