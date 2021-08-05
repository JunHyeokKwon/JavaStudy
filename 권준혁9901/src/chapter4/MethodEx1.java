package chapter4;

public class MethodEx1 {
/**
 * 	
 * 함수(fuction)
 * 메소드(method) - 클래스 안에서 정의한 함수
 * 메소드를 사용하는 이유
 * 재사용성(유사한 소스코드를 반복적으로 작성할 필요가 없다.)
 * 소스코드의 구조화(복잡한 프로그램을 간결하게 구조화하여 프로그램을 유지 보수하기 쉽다.)
 */
	
	/* 
	 * 반환자료형 메소드명(매개변수자료형 매개변수명, ...){
	 * 		실행문(명령문);
	 * 		반환형이 있다면 return 리턴할 값;
	 * 		반환형이 void면 메소드 중간에 메소드를 탈출(메소드 내의 실행문을 중지)하고 싶으면 return;
	 * 	}
	 */
	
	String 빵공장(String 재료1, String 재료2) {
		String 빵 = "빵";
		빵 = 재료1 + 재료2 + 빵; 
		return 빵;
	}
	public static void main(String[] args) {
		MethodEx1 me1 = new MethodEx1();
		 System.out.println(me1.빵공장("초코","브라우니"));
	}

}
//빵공장 -> 메소드명(이름)

//메소드 명령문(실행문)
//빵을 만들려면?
//밀가루, 우유, 사람, 발효기, 오븐

//(매개변수)
//초코렛
//설탕

//결과물(~빵)
//리턴값(반환값)

