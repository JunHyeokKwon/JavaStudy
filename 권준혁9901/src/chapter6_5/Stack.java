package chapter6_5;

/**
 * ����(stack)
 * LIFO(Last In First Out)
 * ���� �������� ���� ���� ���� ���� ������ �ڷᱸ��.
 * ���� �߰� -> push(Ǫ��)
 * ���� ���� -> pop(��)
 */
public interface Stack {
	void push(String title);
	String pop();
	int getStackSize();
}
