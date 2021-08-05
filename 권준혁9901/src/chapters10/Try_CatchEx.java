package chapters10;

/**
 * 예외 처리(Exception)
 * 
 *
 */
public class Try_CatchEx {
	
	public void arrTest() throws ArrayIndexOutOfBoundsException {
		int arr[] = new int[5];
		for(int i = 0; i <= 5; i++) {
			arr[i] = i;
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		Try_CatchEx tc = new Try_CatchEx();
		
		try {
			tc.arrTest();	
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 크기가 최대 5입니다. 5개 이상의 데이터는 추가할 수 없습니다.");
		} catch (Exception e) { // Exception은 가장 최상위 object, 여러개의 catch 구문을 사용할 경우 exception은 가장 마지막에 사용 할 것!
			e.printStackTrace(); // e.pritStackTrace = System.out.println()
			System.out.println("예외가 발생하였습니다. 예외코드를 복사하셔서 개발자에게 문의 하세요.");
		} finally { // 예외 발생 여부에 무관하여 항상 실행하는 구문
			System.out.println("자료저장");
		}
	
		
		
	}

}
