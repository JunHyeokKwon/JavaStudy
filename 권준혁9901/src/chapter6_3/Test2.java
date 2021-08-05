package chapter6_3;

public class Test2 extends Test1 {
	
	public Test2() {
		super("자식1");
		System.out.println("자식1 클래스");
	}

	@Override // 에노테이션(어노테이션) override 남겨둘것 -> 개발자들끼리의 약속
	public void add() {
		System.out.println("세 수를 더합니다.");
	}
	
	public void sub() {
		System.out.println("세 수를 뺍니다.");
	}
}
