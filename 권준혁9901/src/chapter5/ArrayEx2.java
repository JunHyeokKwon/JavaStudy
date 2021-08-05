package chapter5;

import java.util.Arrays;

public class ArrayEx2 {

	static int Array(int Num[]) {
		
		
		
			return 0;
		}
	
	
	public static void main(String[] args) {
		String Ã¥²ÈÀÌ[] = new String[10];
		String reverseÃ¥²ÈÀÌ[] = new String[10];
		String Ã¥²ÈÀÌ2[] = new String[10];
		
		Ã¥²ÈÀÌ[4] = "ÀÚ¹ÙÀÇ Á¤¼®";
		Ã¥²ÈÀÌ[6] = "¸íÇ°ÀÚ¹Ù";
		Ã¥²ÈÀÌ[7] = "Do it ÀÚ¹ÙÇÁ·Î±×·¡¹Ö ÀÔ¹®";
		Ã¥²ÈÀÌ[8] = "ÇÁ·Î±×·¡¹Ö ÀÔ¹®";
		Ã¥²ÈÀÌ2[0] = "c¾ð¾î ÇÁ·Î±×·¡¹Ö";
		
		// System.out.println(Arrays.toString(Ã¥²ÈÀÌ));
		
		
		
		
//		for(int i = 0; i < Ã¥²ÈÀÌ2.length; i++) {
//			for(int j = Ã¥²ÈÀÌ.length-1; j >= 0; j --) {
//				if(Ã¥²ÈÀÌ[j] != null && Ã¥²ÈÀÌ2[i] == null) {
//					Ã¥²ÈÀÌ2[i] = Ã¥²ÈÀÌ[j];
//					Ã¥²ÈÀÌ[j] = null;
//				}
//			}
//				
//		}
		
		
		for(int i = Ã¥²ÈÀÌ.length -1 ; i >= 0; i++) {
			if(Ã¥²ÈÀÌ[i] == null) {
				continue;
			}
			for(int j = 0; j < Ã¥²ÈÀÌ2.length; j ++) {
				if(Ã¥²ÈÀÌ2[j] !=null) {
					continue;
				}
				Ã¥²ÈÀÌ2[j] = Ã¥²ÈÀÌ[i];
				break;
			}
		}
		System.out.println(Arrays.toString(Ã¥²ÈÀÌ2));
		
		
		
		
		
		
		
		
		
		
//		for(int i = 0; i < Ã¥²ÈÀÌ.length; i++) {
//			if(Ã¥²ÈÀÌ[i] == null) {
//				continue;
//			}
//			System.out.print(Ã¥²ÈÀÌ[i] + " ");
//		}
//		
//		System.out.println();
//		
//		for(int i = 0; i < Ã¥²ÈÀÌ.length; i++) {
//			if(Ã¥²ÈÀÌ[i] != null) {
//				System.out.print(Ã¥²ÈÀÌ[i] + " ");
//			}
//			
//		}
//		System.out.println();
//		
//		for(int i = 0, j = Ã¥²ÈÀÌ.length-1; i < Ã¥²ÈÀÌ.length; i++, j--) {
//			if(Ã¥²ÈÀÌ[j] != null) {
//				reverseÃ¥²ÈÀÌ[i] = Ã¥²ÈÀÌ[j];
//				System.out.print(reverseÃ¥²ÈÀÌ[i] + " ");
//			}
//		}
//		
//		System.out.println();
//		
//		for(int i = 0; i < Ã¥²ÈÀÌ.length; i++) {
//			if(Ã¥²ÈÀÌ[Ã¥²ÈÀÌ.length-1 -i] != null) {
//				reverseÃ¥²ÈÀÌ[i] = Ã¥²ÈÀÌ[Ã¥²ÈÀÌ.length - 1 - i];
//				System.out.print(reverseÃ¥²ÈÀÌ[i] + " ");
//			}
//		}
	
		
		
		

	}
}			
	

		

