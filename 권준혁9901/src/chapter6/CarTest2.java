package chapter6;

public class CarTest2 {

	public static void main(String[] args) {
		Car[] 차고 = new Car[5];
		차고[0] = new Car("테슬라", "S", "BLACK");

		Car 자동차1 = new Car("테슬라", "S", "BLACK");
		Car 자동차2 = new Car("현대자동차", "쏘나타", "WHITE");
		Car 자동차3 = new Car();
		Car 자동차4 = new Car("기아자동차", "K8", "red", 280);
		자동차1.info();
		System.out.println();
		자동차2.info();
		System.out.println();
		자동차3.info();
		System.out.println();
		자동차4.info();

		for (int i = 0; i < 차고.length; i++) {
			차고[i] = new Car("테슬라", "S", "레드", 270 + (i * 10));
		}

	}

}
