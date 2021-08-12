package chapters12;

public class SamsungFactory implements Factory{

	@Override
	public void factoryStart() {
		System.out.println("삼성공장을 가동합니다.");
	}

	@Override
	public void factoryStop() {
		System.out.println("삼성공장을 중지합니다.");
	}

}
