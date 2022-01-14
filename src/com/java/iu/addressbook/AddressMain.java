package com.java.iu.addressbook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class AddressMain {

	public static void main(String [] args) {
		AddressMenu am = new AddressMenu();
		am.select();
 		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ArrayList<Integer> ar2 = new ArrayList<Integer>();
		
		HashMap<String, ArrayList<Integer>> map = new HashMap<String, ArrayList<Integer>>();
		map.put("a",ar);
		map.put("b", ar2);
	}

}
