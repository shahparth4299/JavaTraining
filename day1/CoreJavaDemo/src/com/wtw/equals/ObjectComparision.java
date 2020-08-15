package com.wtw.equals;

import com.wtw.model.Customer;

public class ObjectComparision {
	public static void main(String a[]) {
		Customer c1 = new Customer("Parth","Laptop",101,4000);
		Customer c2 = new Customer("Parth","Laptop",101,4000);
		Customer c3 = new Customer("Yash","Headset",102,7000);
		Customer c4 = new Customer("Raj","Phone",103,100000);
		
		//We will get false because the location of all the object is different
		System.out.println(c1.equals(c2));
		System.out.println(c1 == c2);
		
		//Required to generate Hashcode and equals
		//After generating Hashcode and equals
		System.out.println(c1.equals(c2));
	}
}
