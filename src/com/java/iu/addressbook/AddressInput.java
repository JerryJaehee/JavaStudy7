package com.java.iu.addressbook;

import java.util.List;
import java.util.Scanner;

public class AddressInput {
	private Scanner sc;
	
	public AddressInput() { //생성자
		sc = new Scanner(System.in);
	}
	
	//이름을 입력받아서 같은 이름이 있는 InfoDTO를 찾아서 리턴
	
	public InfoDTO searchInfo(List<InfoDTO> ar) {
		System.out.println("출력을 원하는 이름을 입력하세요.");
		String name = sc.next();
		InfoDTO infoDTO = null;
		for(int i = 0; i<ar.size();i++) {
			
			if(ar.get(i).getName().equals(name)) {
				infoDTO = ar.get(i);
				break;
			}
		}
		return infoDTO;
	}
	public InfoDTO inputInfo() {
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
