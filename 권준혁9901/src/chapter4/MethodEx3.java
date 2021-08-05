package chapter4;

import java.util.Scanner;

public class MethodEx3 {
	Scanner sc = new Scanner(System.in);
	
	String mainDisplay() {
		System.out.println("1. 더하기");
		System.out.println("2. 빼기");
		System.out.println("3. 곱하기");
		System.out.println("4. 나누기");
		System.out.println("q. 프로그램 종료");
		System.out.print("명령을 선택해주세요: ");
		return sc.nextLine();
	}
	
	double calc(String selecter, double num1, double num2) {
		double result = 0;
		if(selecter.equals("1")) {
			// 더하기
			result = num1 + num2;
		}
		else if(selecter.equals("2")) {
			// 빼기
			result = num1 - num2;
		}
		else if(selecter.equals("3")) {
			result = num1 * num2;
		}
		else if(selecter.equals("4")) {
			if(num2 == 0) {
				result = 0;
			}
			else {
				result = num1 / num2;
			}
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		MethodEx3 me3 = new MethodEx3();						// MethodEx3 class를 me3라는 객체로 지정.
		String selecter; 										// 문자열 selecter 변수를 선언
		
		String sc1, sc2;
		double num1, num2;
		
		// 무한 반복 시작
		while(true) {
			selecter = me3.mainDisplay();						// me3라는 객체의 mainDisplay라는 메소드를 selecter에 저장
			if(selecter.equals("q")) {
				break;
			}
			else if(selecter.equals("1") || selecter.equals("2") || selecter.equals("3") || selecter.equals("4")) {
				System.out.print("첫번째 숫자를 입력하여 주세요: ");
				sc1 = me3.sc.nextLine();
				System.out.print("두번째 숫자를 입력하여 주세요: ");
				sc2 = me3.sc.nextLine();
				
				num1 = Double.parseDouble(sc1);				// 문자열을 실수(소수점 단위)로 변환
				num2 = Double.parseDouble(sc2);		
				
				System.out.println("계산결과: " + me3.calc(selecter, num1, num2));
				
		
			}
			else {
				System.out.println("입력오류입니다.");
			}
			System.out.println();
		}
 		System.out.println("프로그램이 종료되었습니다.");
	}

}
