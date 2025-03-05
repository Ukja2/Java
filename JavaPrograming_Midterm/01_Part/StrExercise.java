
public class StrExercise {

	public static void main(String[] args) {
		//문자열 기능
		
		String s = "I like Java";
		
		/*
		 * length:길이 /  ex) 예시: s.length(); 결과 : 11 *이는 공백포함임
		 * toUpperCase: 대문자로 / 결과: I LIKE JAVA
		 * toLowerCase: 소문자로 / 결과: i like java
		 * contains: 포함 여부 / 예시: s.contains("Java"); 결과 : true
		 * indexOf: 위치 정보 / 예시: s.indexOf("Java"); 결과 : 7
		 * lastIndexOf: 마지막 위치 정보 / 예시: s.lastIndexOf("a"); 결과: 10
		 * startsWith: 문자열로 시작하는가? / 예시: s.startsWith("I like"); 결과 : ture
		 * endsWith: 문자열로 끝나는가? / 예시: s.endsWith("."); 결과 : false
		 * replace: 문자열로 변환 / 예시 s.replace("like", "love"); 결과 : i love Java
		 * substring: 문자열 자르기 / 예시 s.substring(7); 결과 : Java 
		 * trim: 앞뒤 공백 제거 / 예시 s.trim(); I like Java
		 * concat: 문자열 결합 / s.concat("and Python"); 결과 : I like Java and Python
		 */

		
		
		//문자열 비교
		/*
		 * String s1 = "Java";
		 * String s2 = "Java";
		 * System.out.println(s1 == s2); 
		 * 위의 명령문에 대해 결과 자체는 true가 나올 것이다. 하지만 문자열의 비교는 이렇게 하면 안된다.
		 * 위와 같은 경우에는 실제 메모리 공간에서 어딘가 Java라는 위치가 생기고 s1은 이 위치를 참조하게 된다. 그러나 s2도 똑같은 위치를 참조하게 되는데   
		 * 즉 s1과 s2가 똑같은 문자열을 갖고 있기 때문에 메모리 상에서 한 군데에 Java라는 문자열을 저장해두고, s1과 s2가 같은 공간을 참조하게 되는 것임 그렇기에 true가 나온다.
		 * 
		 * 하지만
		 * String s1 = new String("Java");
		 * String s2 = new String("Java");
		 * System.out.println(s1 == s2); 
		 * 위와 같은 코드를 작성하게 되면, s1은 메모리 공간 상 어딘가에 Java라는 곳을 참조하게 되고, s2도 다른 공간의 Java를 가리키게 돼서, 각각을 등호로 비교했을 때는 false가 나오게 된다.
		 * 
		 * 즉 문자열을 서로 비교할 때는 위와 같은 등호로 비교하기 보단
		 * System.out.println(s1 equals(s2)); 
		 * 위와 같이 equals를 사용하여 문자열 자체의 값을 비교하면 된다. 
		 * 출력은 true가 나온다.
		 */
	}

}
