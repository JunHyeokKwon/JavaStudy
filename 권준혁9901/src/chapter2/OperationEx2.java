package chapter2;
/**
 * �� ������
 * ---------------------------------------------------------Z
 * 
 * &&(��) AND������		true(1) && true(1) => true(1)
 * 						true(1) && false(0) => false(0)
 * 						fasle(0) && false(0) => false(0)
 * �Ѵ� ���϶��� ������ �ؾ��ϴ� ���
 * 
 * ---------------------------------------------------------
 * 
 * ||(��) OR ������		true(1) || true(1) => true(1)
 * 						true(1) || false(0) => true(1)
 * 						false(0) || false(0) => false(0)
 * ���߿� �ϳ��� ���̸� ����
 * 
 * ---------------------------------------------------------
 * 
 * !(����) NOT������
 * true�� ����� false�� �Ǵ� false�� ����� true�� ��ȯ
 * 
 * ---------------------------------------------------------
 */
public class OperationEx2 {

	public static void main(String[] args) {
		char select = 'y';
		char select2 = 'y';

		System.out.println(select == 'y' ? 1 : 0);
		System.out.println(select == 'y' && select2 == 'y');
		System.out.println(!(select == 'y' || select == 'Y'));

	}

}
