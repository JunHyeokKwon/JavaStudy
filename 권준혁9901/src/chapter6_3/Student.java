package chapter6_3;

/**
 * 상속(extends)
 * 부모와 자식 관계
 * 메소드 오버라이딩(메소드 재정의)
 * -> 부모의 안좋은 버릇을 자식이 닮지 않고 더 좋은 방향으로 개선시키는 것
 * -> 부모의 메소드 내용을 그대로 사용하지 않고 새롭게 정의하여 사용하는 것
 * this(자신), super(부모)
 *
 */
class Person { // 사람
	private String name; // 사람 이름
	private String job; // 사람 직업
	private String maleFemale; // 사람 성별
	
	// getter / setter 단축키 -> Alt + Shift + S
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getMaleFemale() {
		return maleFemale;
	}

	public void setMaleFemale(String maleFemale) {
		this.maleFemale = maleFemale;
	}

	
	public Person() {
		
	}

	public Person(String name, String job, String maleFemale) {
		this.name = name;
		this.job = job;
		this.maleFemale = maleFemale;
	}
	
	public void speak() {
		System.out.println(name + "님이 말을 합니다.");
	}
}

public class Student extends Person { //학생
	
	private String student_type;
	private String schooleName;
	private int year;
	
	public String getStudent_type() {
		return student_type;
	}

	public void setStudent_type(String student_type) {
		this.student_type = student_type;
	}

	public String getSchooleName() {
		return schooleName;
	}

	public void setSchooleName(String schooleName) {
		this.schooleName = schooleName;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void studentInfo() {
		System.out.println("<학생정보>");
		System.out.println("이름 : " + super.getName());
		System.out.println("직업 : " + super.getJob());
		System.out.println("성별 : " + super.getMaleFemale());
		System.out.println("학력구분 : " + student_type);
		System.out.println("학교명 : " + schooleName);
		
		System.out.println("학년 : " + year);
	}
	
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("강준일");
		s1.setJob("강사");
		s1.setMaleFemale("남자");
		s1.setStudent_type("대학원");
		s1.setSchooleName("부산교육대학원");
		s1.setYear(2);
		
		s1.studentInfo();
	}

}
