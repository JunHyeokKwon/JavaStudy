package chapter3;

import java.util.Scanner;

public class ForEx3 {

	public static void main(String[] args) {
		// 2 ~ 19단까지 구구단
		// 2단
		// 2 X 1 = 2
		// 2 X 2 = 4
		// 3단 
		// 3 x 1 = 3
		for(int i = 2; i < 20; i++) {
			System.out.println(i + "단");
			for(int j = 1; j < 10; j++) {
				System.out.println(i + " X " + j + " = " + i * j);
			}
			System.out.println();
//		Scanner sc = new Scanner(System.in);
//		System.out.println("구구단 출력 프로그램입니다.");
//		int y = sc.nextInt();
//		Function function[] = new Function[3];
//		
//		}
//	}
//
//class Function {
//	int x;
//	void fx() {
//		System.out.println(x + "단");
//		for(int i = 0; i < 10; i++) {
//			System.out.println(x + " X " + i + " = " + x * i);
		}
	}
	
}