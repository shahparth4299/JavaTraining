package com.wtw.training.assignments;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Version2 {
	public static void main(String args[]) {
		
		HashMap<String,String> mlst  = new HashMap();
		File f = new File("assignment2.csv");
		FileReader fr = null;
		BufferedReader br = null;
		String reading = "";
		String data = "";
		String arr2[];
		try {
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			
			while((reading = br.readLine()) != null) {
				arr2 = reading.split(",");
				data = "";
				for(int i=1;i<arr2.length;i++) 
					data = data + arr2[i] + " ";
				mlst.put(arr2[0],data);		
			}
			for(HashMap.Entry<String, String> entry : mlst.entrySet() ) {
				System.out.println(entry.getKey());
				System.out.println(entry.getValue());
			}
			System.out.println(mlst.containsKey("119736"));
			System.out.println(mlst.get("119736"));
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
