package chapter9;

public class CarFactoryTest {

	public static void main(String[] args) {
		CarFactory cf1 = CarFactory.getinstance();
		CarFactory cf2 = CarFactory.getinstance();
		CarFactory cf3 = CarFactory.getinstance();
		CarFactory cf4 = CarFactory.getinstance();
		CarFactory cf5 = CarFactory.getinstance();
		
		Car c1 = cf1.createCar();
		Car c2 = cf1.createCar();
		Car c3 = cf1.createCar();
		Car c4 = cf1.createCar();
		
		Car c5 = cf2.createCar();
		Car c6 = cf2.createCar();
		Car c7 = cf2.createCar();
		Car c8 = cf2.createCar();
		
		Car c9 = cf3.createCar();
		Car c10 = cf3.createCar();
		Car c11 = cf3.createCar();
		Car c12 = cf3.createCar();
	
		Car c13 = cf4.createCar();
		Car c14 = cf4.createCar();
		Car c15 = cf4.createCar();
		Car c16 = cf4.createCar();

		Car c17 = cf5.createCar();
		Car c18 = cf5.createCar();
		Car c19 = cf5.createCar();
		Car c20 = cf5.createCar();
		
		c1.carInfo();
		c6.carInfo();
		c9.carInfo();
		c16.carInfo();
	}

}
