package chapter2;
/**
 * ���ڿ� ����ȯ
 * 
 * int(����)			->		integer
 * double(�Ǽ�)		-> 		Double
 * boolean(��) 	-> 		Boolean
 * 
 * �ڷ��� ->	���ڿ�(toString)
 *
 *
 * ���ڿ� ->	�ڷ���(parse�ڷ���)
 *
 */


public class ConversionString {

	public static void main(String[] args) {
		int num = 10;
		int num2;
		String sNum = "20";
		String sNum2;

		num2 = Integer.parseInt(sNum);
		sNum2 = Integer.toString(num);
		System.out.println(num2);
		System.out.println(sNum2);

		double dNum = 10.05;
		String dNum2 = Double.toString(dNum);
		double dNum3 = Double.parseDouble(dNum2);

		Integer num3 = 100;

	}

}
