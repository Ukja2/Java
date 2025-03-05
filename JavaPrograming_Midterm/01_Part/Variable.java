public class Variable {
	public static void main(String[] args) {
		 //자바의 자료형 변수의 종류
		int a = 1; // 정수형태 크기 4byte
		long b =  1; // 정수형태 크기 8byte
		float c = 0.12f; // 실수형태 크기 4byte 표기할 때 숫자뒤에 "f" 또는 "F"를 붙여야 한다 그렇지 않으면 double로 간주 
		double d = 1.1; // 실수형태 크기 8byte 
		boolean e = true; // 참 또는 거짓 
		char f = 'a'; //문자 형태 문자열은 큰따옴표를 사용하는 반면 문자 형태의 char은 단일 문자만 사용되며 작은따옴표 ('')을 사용한다.
	
		//위의 경우는 자료형 변수명을 생성함과 동시에 값을 저장하는 형태인데 아래와 같이 변수 선언을 먼저 하고 이후에 값을 설정할 수도 있다.
		
		int g;
		g = 1;
		
		/*변수명 이름 지을 때 유의사항
		 * 1.밑줄(_), 문자(a,b,c), 숫자(123) 사용 가능(공백은 불가능하다.)
		 * 2.하지만 밑줄 또는 문자로만 시작할 수 있다.
		 * 한 단어 또는 2개 이상 단어의 연속
		 * 3.(권장사항) 소문자로 시작해서 각 단어의 시작 글자는 대문자(첫 단어는 제외) ex)myNameIsJaeuk
		 * 4.예약어 사용 불가 (public, static, void, int, double, float 등등)
		 * 5.대소문자 구분 myName과 myname은 전혀 다른 변수
		 */
		
	}
	
}
