package chapter6_2;

public class TakeTrans {

	public static void main(String[] args) {
		Student Kwon = new Student("������", 20000);
		Student Kim = new Student("��ȣ", 30000);
		
		Bus b1 = new Bus("43�� 1317");
		Bus b2 = new Bus("15�� 4150");
		
		Subway s1 = new Subway("1ȣ��");
		Subway s2 = new Subway("2ȣ��");
		
		Kwon.takeBus(b1, 13000);
		Kim.takeBus(b1, 13000);
		
		Kwon.showInfo();
		Kim.showInfo();
		b1.showInfo();
		
		Kwon.getOffBus(b1);
		Kim.getOffBus(b1);
		b1.showInfo();
		
		Kwon.takeSubway(s1);
		Kim.takeSubway(s2);
		s1.showInfo();
		s2.showInfo();
		Kwon.showInfo();
		Kim.showInfo();
		
		
		
	}

}
