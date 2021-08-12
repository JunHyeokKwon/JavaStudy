package chapters12;

public class LGFactory implements Factory{

	@Override
	public void factoryStart() {
		System.out.println("LG공장을 가동합니다.");
	}

	@Override
	public void factoryStop() {
		System.out.println("LG공장을 중지합니다.");
	}

}
