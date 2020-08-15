package com.wtw.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1 = new ArrayList();
		l1.add(500);
		l1.add(300);
		l1.add(700);
		l1.add(1100);
		l1.add(100);
		
		System.out.println("Ascending Order Sorting");
		Collections.sort(l1);
		
		for(int i : l1) {
			System.out.println(i);
		}
		System.out.println();
		
		System.out.println("Descending Order Sorting");
		Collections.sort(l1);
		Collections.reverse(l1);
		for(int i : l1) {
			System.out.println((i));
		}
	}

}
