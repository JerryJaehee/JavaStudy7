package com.java.iu.addressbook;

import java.util.ArrayList;

public class PrintAddress {
	public void printInfo (ArrayList<InfoDTO> ar) {
		for(int i = 0; i<ar.size();i++) {
			System.out.println("이름 : "+ar.get(i).getName());
			System.out.println("별명 : "+ar.get(i).getNickName());
			System.out.println("이메일 : "+ar.get(i).getEmail());
			System.out.println("전화번호 : "+ar.get(i).getPhoneNum());
			System.out.println("생일 : "+ar.get(i).getBirth());
		}
	}
}
