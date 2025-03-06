public class DoWhileSample {
	public static void main (String[] args) {
		char c = 'a';
		
		do {
			System.out.print(c); //맨 처음 a를 출력
			c = (char)(c + 1); //c의 값을 1 증가 (a -> b) , ASCII CODE로 (97 -> 98) 이를 형변환하면 a, b, c ... 가 됨 
		} while (c <= 'z'); //c가 문자'z'와 같아질 때까지 반복
	}
}


/*
 * do-while문의 특징 
 * 1. 무조건 최소 한번 작업문 실행
 * 2. 반복 조건이 true이면 반복, false이면 반복 종료
 * 3. 반복 조건이 없으며 컴파일 오류
 * 예시로 사용자가 No 입력을 하기 전까지 계속해서 메시지를 출력하는 프로그램 등이 있다.
 * 
 */
