package com.java.iu.addressbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressMenu {
	public void select() {
		AddressInput addressInput = new AddressInput(); //3. 명단추가
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
				InfoDTO infoDTO = addressInput.searchInfo(ar);
				printAd.printInfo(infoDTO);
			} else if (select == 3) {
				InfoDTO infoDTO  = addressInput.inputInfo();
				ar.add(infoDTO);
				System.out.println(ar);
			} else if (select == 4) {
				System.out.println("4");
			} else {
				System.out.println("Finish");
				break;
			}
		}
	}
}
