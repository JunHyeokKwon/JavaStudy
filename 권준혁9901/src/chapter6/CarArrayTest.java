package chapter6;

import java.util.Scanner;

public class CarArrayTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Car ����[] = new Car[3];
		for (int i = 0; i < 3; i++) {
			����[i] = new Car();
		}
		for (int i = 0; i < 3; i++) {
			System.out.print("�����縦 �Է��ϼ��� : ");
			����[i].������ = sc.next();
			System.out.print("�𵨸��� �Է��ϼ��� : ");
			����[i].�𵨸� = sc.next();
			System.out.print("������ �Է��ϼ��� : ");
			����[i].���� = sc.next();
		}

		for (int i = 0; i < 3; i++) {
			����[i].info();
			System.out.println();
		}

	}

}
