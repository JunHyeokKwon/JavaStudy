package chapter2;

import java.util.Scanner;

public class StringEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean treuFalse = true;
		char munja = '��';
		int number = 1000;
		double d_number = 3.14;
		String str = "�ȳ��ϼ���. �ݰ����ϴ�.";

		System.out.println(str);
		
		String name;		// ������
		String add;			//�λ걤���� �ϱ�
		String maleFemale;	// ���� or ����
		String phoneNumber;	//010-4565-9901
		
		
		/*
		 * �̸� : ������
		 * �ּ� : �λ걤���� �ϱ�
		 * ���� : ����
		 * ����ó : 010-4565-9901
		 */
		System.out.print("�̸��� �Է��ϼ��� : ");
		name = sc.nextLine();
		System.out.print("�ּҸ� �Է��ϼ��� : ");
		add = sc.nextLine();
		System.out.print("������ �Է��ϼ��� : ");
		maleFemale = sc.nextLine();
		System.out.print("����ó�� �Է��ϼ��� : ");
		phoneNumber = sc.nextLine();
		
		System.out.println("�̸� : " + name);
		System.out.println("�ּ� : " + add);
		System.out.println("���� : " + maleFemale);
		System.out.println("����ó : " + phoneNumber);
		
		
	}

}
