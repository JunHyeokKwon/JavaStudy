package chapter5;

import java.util.Arrays;

public class ArrayEx2 {

	static int Array(int Num[]) {
		
		
		
			return 0;
		}
	
	
	public static void main(String[] args) {
		String å����[] = new String[10];
		String reverseå����[] = new String[10];
		String å����2[] = new String[10];
		
		å����[4] = "�ڹ��� ����";
		å����[6] = "��ǰ�ڹ�";
		å����[7] = "Do it �ڹ����α׷��� �Թ�";
		å����[8] = "���α׷��� �Թ�";
		å����2[0] = "c��� ���α׷���";
		
		// System.out.println(Arrays.toString(å����));
		
		
		
		
//		for(int i = 0; i < å����2.length; i++) {
//			for(int j = å����.length-1; j >= 0; j --) {
//				if(å����[j] != null && å����2[i] == null) {
//					å����2[i] = å����[j];
//					å����[j] = null;
//				}
//			}
//				
//		}
		
		
		for(int i = å����.length -1 ; i >= 0; i++) {
			if(å����[i] == null) {
				continue;
			}
			for(int j = 0; j < å����2.length; j ++) {
				if(å����2[j] !=null) {
					continue;
				}
				å����2[j] = å����[i];
				break;
			}
		}
		System.out.println(Arrays.toString(å����2));
		
		
		
		
		
		
		
		
		
		
//		for(int i = 0; i < å����.length; i++) {
//			if(å����[i] == null) {
//				continue;
//			}
//			System.out.print(å����[i] + " ");
//		}
//		
//		System.out.println();
//		
//		for(int i = 0; i < å����.length; i++) {
//			if(å����[i] != null) {
//				System.out.print(å����[i] + " ");
//			}
//			
//		}
//		System.out.println();
//		
//		for(int i = 0, j = å����.length-1; i < å����.length; i++, j--) {
//			if(å����[j] != null) {
//				reverseå����[i] = å����[j];
//				System.out.print(reverseå����[i] + " ");
//			}
//		}
//		
//		System.out.println();
//		
//		for(int i = 0; i < å����.length; i++) {
//			if(å����[å����.length-1 -i] != null) {
//				reverseå����[i] = å����[å����.length - 1 - i];
//				System.out.print(reverseå����[i] + " ");
//			}
//		}
	
		
		
		

	}
}			
	

		

