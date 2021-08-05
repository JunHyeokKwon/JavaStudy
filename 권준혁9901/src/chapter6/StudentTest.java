package chapter6;

public class StudentTest {

	public static void main(String[] args) {
		// kim, pack, lee, song 4명의 인스턴스를 생성
//      수정전 ------------------------------------------------------------------------
//		
//		Student kim = new Student();		// 대학생		20210702	김기태	4	89
//		Student pack = new Student();		// 고등학생		20210703	박강민	3	85
//		Student lee = new Student();		// 중학생		20210704	이주엽	2	90
//		Student song = new Student();		// 초등학생		20210705	송지효	6	95
		
//		kim.student_type = "대학생";
//		pack.student_type = "고등학생";
//		lee.student_type = "중학생";
//		song.student_type = "초등학생";
//		
//		kim.student_code = 20210702;
//		pack.student_code = 20210703;
//		lee.student_code = 20210704;
//		song.student_code = 20210705;
//
//		kim.student_name = "김기태";
//		pack.student_name = "박강민";
//		lee.student_name = "이주엽";
//		song.student_name = "송지효";
//		
//		kim.student_score = 89;
//		pack.student_score = 85;
//		lee.student_score = 90;
//		song.student_score = 95; 

//		수정후 ------------------------------------------------------------------------
		
		Student kim = new Student("대학생", 20210702, "김기태", 4, 89);
		Student pack = new Student("고등학생",	20210703, "박강민", 3, 85);
		Student lee = new Student("중학생", 20210704, "이주엽", 2, 90);		
		Student song = new Student("초등학생", 20210705, "송지효", 6, 95);
		Student ham = new Student();
		
		kim.student_info();
		pack.student_info();
		lee.student_info();
		song.student_info();
		ham.student_info();
	}
}
