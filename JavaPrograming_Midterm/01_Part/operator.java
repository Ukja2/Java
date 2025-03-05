
public class operator {

	public static void main(String[] args) {
		//산술 연산자
		System.out.println(4 + 2); //덧셈 -> 6
		System.out.println(4 - 2); //뺄셈 -> 2
		System.out.println(4 * 2); //곱셈 -> 8
		System.out.println(4 / 2); //나눗셈 -> 2
		System.out.println(4 % 2); //나머지 -> 0
		
		int a = 1;
		int b = ++a; //전위 연산자 a의 값을 먼저 증가한 후 b에 값을 저장
		
		System.out.println(a);
		System.out.println(b);
		// a = 2 b = 2
		
		int c = 1;
		int d = c++; //후위 연산자 c의 값을 d에 넣은 후 값을 증가
		
		System.out.println(c);
		System.out.println(d);
		// c = 2 d = 1 , c++ 에서 1이 먼저 d에 대입되고, 그 후에 c가 2로 증가함
		
		
		//대입 연산자
		int num = 10; // 오른쪽 값을 왼쪽에 대입
		
		/*num += 2; (왼쪽 + 오른쪽) 결과를 왼쪽에 대입
		 * num -= 2; (왼쪽 - 오른쪽) 결과를 왼쪽에 대입
		 * num *= 2; (왼쪽 * 오른쪽) 결과를 왼쪽에 대입
		 * num /= 2; (왼쪽 / 오른쪽) 결과를 왼쪽에 대입
		 * num %= 2; (왼쪽 % 오른쪽) 결과를 왼쪽에 대입
		 * 
		 */
		
		
		
		//논리 연산자
		
		/* ">" 왼쪽이 오른쪽보다 더 큰가? 
		 * ">=" 왼쪽이 오른쪽보다 크거나 같은가? 
		 * "<" 왼쪽이 오른쪽보다 작은가?
		 * "<=" 왼쪽이 오른쪽보다 작거나 같은가?
		 * "==" 왼쪽과 오른쪽이 같은가?
		 * "!="왼쪽과 오른쪽이 다른가?
		 * "&&" 왼쪽과 오른쪽이 모두 참인가? ex) (5>3) && (3>1) -> true AND연산
		 * "||" 왼쪽 또는 오른쪽이 하나라도 참인가? ex) (5>3) || (3<1) -> true OR연산
		 * "!" (참 또는 거짓)의 반대 ex)!(5==5) -> false
		 * "^" XOR 연산 왼쪽과 오른쪽이 서로 다를 때 true ex) (3>5)^(1==1) -> true
		 */
		
		
		//삼항 연산자
		/*
		 * 조건? 참일 때 : 거짓일 때, 즉 물음표 왼쪽의 조건이 참이면: 왼쪽, 거짓이면: 오른쪽을 출력
		 * int x = 3;
		 * int y = 5;
		 * int max = (x>y)? x:y;
		 * 
		 * 설명: 조건 x가 y보다 큰가? -> 거짓 -> 오른쪽 출력 -> 5 -> 5를 max에 대입
		 */
	}

}
