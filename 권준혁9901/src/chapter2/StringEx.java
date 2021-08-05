package chapter2;

import java.util.Scanner;

public class StringEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean treuFalse = true;
		char munja = '문';
		int number = 1000;
		double d_number = 3.14;
		String str = "안녕하세요. 반갑습니다.";

		System.out.println(str);
		
		String name;		// 권준혁
		String add;			//부산광역시 북구
		String maleFemale;	// 남자 or 여자
		String phoneNumber;	//010-4565-9901
		
		
		/*
		 * 이름 : 권준혁
		 * 주소 : 부산광역시 북구
		 * 성별 : 남자
		 * 연락처 : 010-4565-9901
		 */
		System.out.print("이름을 입력하세요 : ");
		name = sc.nextLine();
		System.out.print("주소를 입력하세요 : ");
		add = sc.nextLine();
		System.out.print("성별을 입력하세요 : ");
		maleFemale = sc.nextLine();
		System.out.print("연락처를 입력하세요 : ");
		phoneNumber = sc.nextLine();
		
		System.out.println("이름 : " + name);
		System.out.println("주소 : " + add);
		System.out.println("성별 : " + maleFemale);
		System.out.println("연락처 : " + phoneNumber);
		
		
	}

}
