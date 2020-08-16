package com.wtw.training.assignments;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FileMapAssignment {
	public static void main(String args[]) {
		List<HashMap<String,String>> lst = new ArrayList();
		HashMap<String,String> mlst;
		File f = new File("assignment2.csv");
		FileReader fr = null;
		BufferedReader br = null;
		String reading = "";
		String arr[];
		String arr2[];
		try {
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			reading = br.readLine();
			arr = reading.split(",");
			for(int i=0;i<arr.length;i++) {
				System.out.println(arr[i]);
			}
			while((reading = br.readLine()) != null) {
				arr2 = reading.split(",");
				//System.out.println(arr.length);
				mlst = new HashMap();
				for(int i=0;i<arr2.length;i++) 
					mlst.put(arr[i],arr2[i]);
				lst.add(mlst);		
			}
			for(HashMap<String,String> a : lst) {
				System.out.println(a);
			}
		}catch(Exception e) {}
		finally {
			try {
				br.close();
				fr.close();
			}
			catch(Exception e) {}
		}
	}

}
