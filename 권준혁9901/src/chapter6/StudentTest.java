package chapter6;

public class StudentTest {

	public static void main(String[] args) {
		// kim, pack, lee, song 4���� �ν��Ͻ��� ����
//      ������ ------------------------------------------------------------------------
//		
//		Student kim = new Student();		// ���л�		20210702	�����	4	89
//		Student pack = new Student();		// ����л�		20210703	�ڰ���	3	85
//		Student lee = new Student();		// ���л�		20210704	���ֿ�	2	90
//		Student song = new Student();		// �ʵ��л�		20210705	����ȿ	6	95
		
//		kim.student_type = "���л�";
//		pack.student_type = "����л�";
//		lee.student_type = "���л�";
//		song.student_type = "�ʵ��л�";
//		
//		kim.student_code = 20210702;
//		pack.student_code = 20210703;
//		lee.student_code = 20210704;
//		song.student_code = 20210705;
//
//		kim.student_name = "�����";
//		pack.student_name = "�ڰ���";
//		lee.student_name = "���ֿ�";
//		song.student_name = "����ȿ";
//		
//		kim.student_score = 89;
//		pack.student_score = 85;
//		lee.student_score = 90;
//		song.student_score = 95; 

//		������ ------------------------------------------------------------------------
		
		Student kim = new Student("���л�", 20210702, "�����", 4, 89);
		Student pack = new Student("����л�",	20210703, "�ڰ���", 3, 85);
		Student lee = new Student("���л�", 20210704, "���ֿ�", 2, 90);		
		Student song = new Student("�ʵ��л�", 20210705, "����ȿ", 6, 95);
		Student ham = new Student();
		
		kim.student_info();
		pack.student_info();
		lee.student_info();
		song.student_info();
		ham.student_info();
	}
}
