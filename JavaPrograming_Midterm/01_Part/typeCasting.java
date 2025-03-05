
public class typeCasting {

	public static void main(String[] args) {
		/*정수, 실수, 문자열 간의 형 변환
		 * 형 변환을 하기 위해서는 변환하고 싶은 변수명이나 값 앞에 (자료형)을 붙여 명시하면 된다.
		 */
		int score = 93; //실수로 변환?
		float score_f = (float)score; //score라는 변수를 실수로 변환
		double score_d = (double)93; //93이라는 값을 실수로 변환
		
		/*하지만 int -> long -> float -> double 로 형 변환 할때는 
		 * (자료형) 부분을 명시하지 않고, 묵시적 형 변환이 가능하다 (= 자동 형 변환)  
		 */
		
		
		
		double score_a = 98.8;
		int score_i= (int)score_a;
		/*반대로 double -> float -> long -> int 처럼 데이터의 손실이 발생하는 경우에는 
		 * 명시적 형 변환이 필요하다.
		 */
	
	}

}
