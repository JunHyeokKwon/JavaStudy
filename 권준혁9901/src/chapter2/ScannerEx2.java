package chapter2;

import java.util.Scanner;

public class ScannerEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sNum1;
		String sNum2;
		int sum;

		System.out.print("ù��° ���ڸ� �Է��ϼ���: ");
		sNum1 = sc.nextLine();
		System.out.print("�ι�° ���ڸ� �Է��ϼ���: ");
		sNum2 = sc.nextLine();

		sum = Integer.parseInt(sNum1) + Integer.parseInt(sNum2);

		System.out.println("�Է��� �� ���� ���� " + sum);
	}

}
