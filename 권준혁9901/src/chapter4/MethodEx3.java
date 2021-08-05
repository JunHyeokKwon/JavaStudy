package chapter4;

import java.util.Scanner;

public class MethodEx3 {
	Scanner sc = new Scanner(System.in);
	
	String mainDisplay() {
		System.out.println("1. ���ϱ�");
		System.out.println("2. ����");
		System.out.println("3. ���ϱ�");
		System.out.println("4. ������");
		System.out.println("q. ���α׷� ����");
		System.out.print("����� �������ּ���: ");
		return sc.nextLine();
	}
	
	double calc(String selecter, double num1, double num2) {
		double result = 0;
		if(selecter.equals("1")) {
			// ���ϱ�
			result = num1 + num2;
		}
		else if(selecter.equals("2")) {
			// ����
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
		MethodEx3 me3 = new MethodEx3();						// MethodEx3 class�� me3��� ��ü�� ����.
		String selecter; 										// ���ڿ� selecter ������ ����
		
		String sc1, sc2;
		double num1, num2;
		
		// ���� �ݺ� ����
		while(true) {
			selecter = me3.mainDisplay();						// me3��� ��ü�� mainDisplay��� �޼ҵ带 selecter�� ����
			if(selecter.equals("q")) {
				break;
			}
			else if(selecter.equals("1") || selecter.equals("2") || selecter.equals("3") || selecter.equals("4")) {
				System.out.print("ù��° ���ڸ� �Է��Ͽ� �ּ���: ");
				sc1 = me3.sc.nextLine();
				System.out.print("�ι�° ���ڸ� �Է��Ͽ� �ּ���: ");
				sc2 = me3.sc.nextLine();
				
				num1 = Double.parseDouble(sc1);				// ���ڿ��� �Ǽ�(�Ҽ��� ����)�� ��ȯ
				num2 = Double.parseDouble(sc2);		
				
				System.out.println("�����: " + me3.calc(selecter, num1, num2));
				
		
			}
			else {
				System.out.println("�Է¿����Դϴ�.");
			}
			System.out.println();
		}
 		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	}

}
