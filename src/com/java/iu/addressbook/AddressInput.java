package com.java.iu.addressbook;

import java.util.Scanner;

public class AddressInput {
	private Scanner sc;
	
	public AddressInput() { //생성자
		sc = new Scanner(System.in);
	}
	public InfoDTO inputInfo( ) {
		InfoDTO infoDTO = new InfoDTO();
		System.out.println("이름을 입력하세요.");
		infoDTO.setName(sc.next());
		System.out.println("별명을 입력하세요.");
		infoDTO.setNickName(sc.next());
		System.out.println("이메일을 입력하세요.");
		infoDTO.setEmail(sc.next());
		System.out.println("전화번호를 입력하세요.");
		infoDTO.setPhoneNum(sc.next());
		System.out.println("생일을 입력하세요.");
		infoDTO.setBirth(sc.next());
		
		return infoDTO;
	}
}
