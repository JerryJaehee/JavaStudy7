package com.java.iu.addressbook;

import java.text.SimpleDateFormat;
import java.util.List;

public class PrintAddress {
	String pattern = null;
	SimpleDateFormat sd;
	
	public PrintAddress() {
		pattern = "yyyy년 MM월 dd일 <E>";
		sd = new SimpleDateFormat(pattern); 
	}

	//문자열을 받아서 출력하는 메서드
	public void deleteInfo (InfoDTO infoDTO) {
		if(infoDTO != null) 
			System.out.println("삭제 성공");
		else 
			System.out.println("삭제 실패");
	}
	 
	//한 사람의 정보를 출력하는 메서드
	//정보가 있으면 출력, 없으면 정보가 없음 출력
	public void printInfo (InfoDTO infoDTO) {
		if(infoDTO != null) {
			System.out.println("이름 : "+infoDTO.getName());
			System.out.println("별명 : "+infoDTO.getNickName());
			System.out.println("이메일 : "+infoDTO.getEmail());
			System.out.println("전화번호 : "+infoDTO.getPhoneNum());
			String birth = sd.format(infoDTO.getBirth().getTime());
			System.out.println("생일 : "+birth); //2000년 12월 24일 (수)
			
			
		}
		else {
			System.out.println("정보가 없습니다.");
		}
	}

	public void printInfo (List<InfoDTO> ar) {
		for(int i = 0; i<ar.size();i++) {
			InfoDTO infoDTO = ar.get(i);
			System.out.println("이름 : "+infoDTO.getName());
			System.out.println("별명 : "+infoDTO.getNickName());
			System.out.println("이메일 : "+infoDTO.getEmail());
			System.out.println("전화번호 : "+infoDTO.getPhoneNum());
			String birth = sd.format(infoDTO.getBirth().getTime());
			System.out.println("생일 : "+birth);
		}
	}
}
