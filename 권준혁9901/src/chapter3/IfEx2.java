package chapter3;

import java.util.Scanner;

public class IfEx2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		int 나이 = sc.nextInt();
		if(나이 >= 14 && 나이 <=16) {
			System.out.println("중학생");
		}
		else if(나이 >= 17 && 나이 <= 19) {
			System.out.println("고등학생");
		}
		else if(나이 >=20 && 나이 <= 26) {
			System.out.println("대학생");
		}
		else {
			System.out.println("백수");
		}
	}

}
