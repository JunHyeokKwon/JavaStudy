package chapter6_2;

public class Car {
	private String company; // ȸ��
	private String model; // �𵨸�
	private String color; // ����
	private int year; // ����

	// get�� �Ű����� X ��ȯ�� O
	// set�� �Ű����� O ��ȯ�� X

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCompany() {
		return company;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setYear(int year) {
		this.year = year + 1;
	}

	public int getYear() {
		return year - 1;
	}

}
