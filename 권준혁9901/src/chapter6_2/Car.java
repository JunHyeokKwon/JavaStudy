package chapter6_2;

public class Car {
	private String company; // 회사
	private String model; // 모델명
	private String color; // 색상
	private int year; // 연식

	// get은 매개변수 X 반환형 O
	// set은 매개변수 O 반환형 X

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
