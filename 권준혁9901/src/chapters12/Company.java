package chapters12;

public class Company {

	public static void main(String[] args) {
		Factory factory1 = new SamsungFactory();
		Factory factory2 = new SamsungFactory();
		
		factory1.factoryStart();
		factory2.factoryStart();
		

	}

}
