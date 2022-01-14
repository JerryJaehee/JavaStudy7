package com.java.iu.addressbook;

import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class AddressService {
	private Scanner sc;
	
	public AddressService() { //생성자
		sc = new Scanner(System.in);
	}
	
	//이름을 입력받아서 같은 이름이 잇는 InfoDTO의 인덱스 번호 찾기
	//찾아서 삭제
	//삭제여부 리턴(0 : 성공 / 1 : 실패 or S : 성공 F : 실패 / true:성공 false:실패
	public InfoDTO removeInfo(List<InfoDTO> ar) {
		System.out.println("삭제를 원하는 이름을 입력하세요.");
		String name = sc.next();
		InfoDTO infoDTO = null;
		for(int i = 0; i<ar.size();i++) {
			if(name.equals(ar.get(i).getName())) {
				infoDTO = ar.remove(i);
				break;
			}
		}
		
		return infoDTO;
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
		String birth = sc.next(); //20001224 패턴
		int year = Integer.parseInt(birth.substring(0,4));
		int month = Integer.parseInt(birth.substring(4,6))-1; //달이 0부터 시작되니 1부터 시작되게끔 -1 
		int day = Integer.parseInt(birth.substring(6));
		Calendar ca = Calendar.getInstance();
		ca.set(year, month, day);
		infoDTO.setBirth(ca);
		
		return infoDTO;
	}
}
