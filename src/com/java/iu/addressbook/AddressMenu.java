package com.java.iu.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressMenu {
	public void select() {
		AddressService addressService = new AddressService(); //3. 명단추가
		PrintAddress printAd = new PrintAddress(); //1. 전체명단 출력 
		ArrayList<InfoDTO> ar =new ArrayList<>(); // info가 담겨져있는 리스트
		Scanner sc = new Scanner(System.in);
		boolean chk = true;
		while (chk) {

			System.out.println("메뉴를 선택하세요.");
			System.out.println("1. 전체명단 출력");
			System.out.println("2. 정보 검색");
			System.out.println("3. 명단 추가");
			System.out.println("4. 명단 제거");
			System.out.println("5. 종    료");
			int select = sc.nextInt();

			if (select == 1) {
				printAd.printInfo(ar);
			} else if (select == 2) {
				InfoDTO infoDTO = addressService.searchInfo(ar);
				printAd.printInfo(infoDTO);
			} else if (select == 3) {
				InfoDTO infoDTO  = addressService.inputInfo();
				ar.add(infoDTO);
			} else if (select == 4) {
				InfoDTO infoDTO = addressService.removeInfo(ar);
				printAd.deleteInfo(infoDTO);
			} else {
				System.out.println("Finish");
				break;
			}
		}
	}
}
