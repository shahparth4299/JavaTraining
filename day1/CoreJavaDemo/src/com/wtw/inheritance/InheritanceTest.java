package com.wtw.inheritance;

public class InheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payment p1 = new CardPayment();
		p1.payment_operation();
		p1.transaction_status();
		CardPayment c1 = new CardPayment();
		c1.checkbank();
		c1.validation();

		Payment p2 = new UPIPayment();
		p2.payment_operation();
		p2.transaction_status();
		UPIPayment c2 = new UPIPayment();
		c2.check_application();
		c2.validation();
		
		ValidationPayment p3 = new UPIPayment();
		p3.validation();
		
		ValidationPayment p4 = new CardPayment();
		p4.validation();
	}

}
