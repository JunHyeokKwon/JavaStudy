package chapter6;

public class CarTest2 {

	public static void main(String[] args) {
		Car[] ���� = new Car[5];
		����[0] = new Car("�׽���", "S", "BLACK");

		Car �ڵ���1 = new Car("�׽���", "S", "BLACK");
		Car �ڵ���2 = new Car("�����ڵ���", "�Ÿ", "WHITE");
		Car �ڵ���3 = new Car();
		Car �ڵ���4 = new Car("����ڵ���", "K8", "red", 280);
		�ڵ���1.info();
		System.out.println();
		�ڵ���2.info();
		System.out.println();
		�ڵ���3.info();
		System.out.println();
		�ڵ���4.info();

		for (int i = 0; i < ����.length; i++) {
			����[i] = new Car("�׽���", "S", "����", 270 + (i * 10));
		}

	}

}
