package chapter6_3;

/**
 * ���(extends)
 * �θ�� �ڽ� ����
 * �޼ҵ� �������̵�(�޼ҵ� ������)
 * -> �θ��� ������ ������ �ڽ��� ���� �ʰ� �� ���� �������� ������Ű�� ��
 * -> �θ��� �޼ҵ� ������ �״�� ������� �ʰ� ���Ӱ� �����Ͽ� ����ϴ� ��
 * this(�ڽ�), super(�θ�)
 *
 */
class Person { // ���
	private String name; // ��� �̸�
	private String job; // ��� ����
	private String maleFemale; // ��� ����
	
	// getter / setter ����Ű -> Alt + Shift + S
	
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
		System.out.println(name + "���� ���� �մϴ�.");
	}
}

public class Student extends Person { //�л�
	
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
		System.out.println("<�л�����>");
		System.out.println("�̸� : " + super.getName());
		System.out.println("���� : " + super.getJob());
		System.out.println("���� : " + super.getMaleFemale());
		System.out.println("�з±��� : " + student_type);
		System.out.println("�б��� : " + schooleName);
		
		System.out.println("�г� : " + year);
	}
	
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("������");
		s1.setJob("����");
		s1.setMaleFemale("����");
		s1.setStudent_type("���п�");
		s1.setSchooleName("�λ걳�����п�");
		s1.setYear(2);
		
		s1.studentInfo();
	}

}
