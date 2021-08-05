package chapter5;

public class ArrayEx3 {

	public static void main(String[] args) {
		int num[] = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
		
		int reverseNum[] = new int[10];
		
		for(int i = 0; i < num.length; i++){
			reverseNum[i] = num[num.length-1 - i];
			System.out.print(reverseNum[i] + " ");
			}
			
		}
}

 
