package chapter2;
/**
 * 문자열 형변환
 * 
 * int(정수)			->		integer
 * double(실수)		-> 		Double
 * boolean(논리) 	-> 		Boolean
 * 
 * 자료형 ->	문자열(toString)
 *
 *
 * 문자열 ->	자료형(parse자료형)
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
