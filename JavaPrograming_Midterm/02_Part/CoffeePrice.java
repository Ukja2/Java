/*
 * case문의 값
 * case문은 문자, 정수, 문자열 리터럴만 허용한다. 실수 리터럴은 허용되지 않음 *리터럴: 데이터의 값 그 자체
 * 아래 같은 경우는 허용됨
 * 
 * int b;
	switch(b%2) {
		case 1 : ...; break;
		case 2 : ...; break;
	}

	char c;
	switch(c) {
		case '+' : ...; break;
		case '-' : ...; break;
	}

	String s = "예";
	switch(s) {
		case "예" : ...; break;
		case "아니요" : ...; break;
	}
	
	추가적으로 아래와 같은 경우는 오류가 발생한다.
	
	switch(a) {
		case a : 		// 오류. 변수 사용 안됨
		case a > 3 : 	// 오류. 수식 안됨
		case a == 1 : 	// 오류. 수식 안됨
	}

 */
import java.util.Scanner;

public class CoffeePrice {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("무슨 커피 드릴까요? ");
		String order = scanner.next();
		int price=0;
		switch (order) {
			case "에스프레소":
			case "카푸치노":
			case "카페라떼":
				price = 3500;
				break;
			case "아메리카노" :
				price = 2000;
				break;
			default:
				System.out.println("메뉴에 없습니다!");
		}
		if(price != 0)
			System.out.print(order + "는 " + price + "원입니다");
		scanner.close();
	}
}
