package chapter3;

import java.util.Scanner;

public class IfEx2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("���̸� �Է��ϼ��� : ");
		int ���� = sc.nextInt();
		if(���� >= 14 && ���� <=16) {
			System.out.println("���л�");
		}
		else if(���� >= 17 && ���� <= 19) {
			System.out.println("����л�");
		}
		else if(���� >=20 && ���� <= 26) {
			System.out.println("���л�");
		}
		else {
			System.out.println("���");
		}
	}

}
