package chapter6_5;

import java.util.Arrays;
import java.util.Collections;

public class SortEx {

	public static void main(String[] args) {
		Integer arr[] = { 4, 23, 44, 34, 27, 17, 19 };
		Arrays.sort(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}
		
		Arrays.sort(arr, Collections.reverseOrder()); // reverseOrder 오버라이딩을 안해도 되는 이유는 기본 값이 Integer로 되어있기 때문
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		//----------------------------------------
		People p[] = new People[5];
		
		for(int i = 0; i < p.length; i++) {
			p[i] = new People("김준일" + i, 20 + i);
		}
		
		for(People pe : p) {
			pe.print();
		}
		
		System.out.println();
		
		Arrays.sort(p, Collections.reverseOrder());
		
		for(People pe : p) {
			pe.print();
		}
		
	}
	
		
}
			



class People implements Comparable<People> {
	private String name;
	private int age;

	public People(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void print() {
		System.out.println("이름" + name + " 나이 : " + age);
	}
	
	// return 값이 마이너스(-)값이면 상대 값이 더 크다.
	// return 값이 플러스(+)값이면 상대 값이 더 작다.
	// return 값이 0이면 서로 같다.
	// compareTo 오버라이딩 하는 이유는 기본 값이 Integer라서 원하는 age값으로 변환해주기 위해서.
	@Override
	public int compareTo(People o) {
		return this.age - o.age;
	}
}
