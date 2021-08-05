package chapter6;

import java.util.Scanner;

public class CarArrayTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Car 차고[] = new Car[3];
		for (int i = 0; i < 3; i++) {
			차고[i] = new Car();
		}
		for (int i = 0; i < 3; i++) {
			System.out.print("제조사를 입력하세요 : ");
			차고[i].제조사 = sc.next();
			System.out.print("모델명을 입력하세요 : ");
			차고[i].모델명 = sc.next();
			System.out.print("색상을 입력하세요 : ");
			차고[i].색상 = sc.next();
		}

		for (int i = 0; i < 3; i++) {
			차고[i].info();
			System.out.println();
		}

	}

}
