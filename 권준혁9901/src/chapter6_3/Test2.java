package chapter6_3;

public class Test2 extends Test1 {
	
	public Test2() {
		super("�ڽ�1");
		System.out.println("�ڽ�1 Ŭ����");
	}

	@Override // �������̼�(������̼�) override ���ܵѰ� -> �����ڵ鳢���� ���
	public void add() {
		System.out.println("�� ���� ���մϴ�.");
	}
	
	public void sub() {
		System.out.println("�� ���� ���ϴ�.");
	}
}
