package com.wtw.inheritance;

public class UPIPayment extends Payment implements ValidationPayment {
	String upiid;
	String username,password;
	public void validation() {
		System.out.println("Validating Username and Password...");
	}
	public void check_application() {
		System.out.println("Application is verified");
	}
}
