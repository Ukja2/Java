/*
 *Scanner란 System.in에게 키를 읽게 하고, 읽은 바이트를 문자, 정수, 실수, 불린, 문자열 등 다양한 타입으로 변환하여 리턴 
 *
 *Scanner라는 클래스를 import후 Scanner라는 클래스를 통해 scanner 객체를 새로 생성 후 이 객체를 통해 Scanner 클래스 내부의 메서드를 활용해서 쓸 수 있게 됨
 */

import java.util.Scanner; //스캐너를 사용할 때는 반드시 import 해줘야 함


public class ScannerEx {
	public static void main(String args[]) { 
		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요");
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next(); // 문자열 읽기
		System.out.print("이름은 " + name + ", ");
		
		String city = scanner.next(); // 문자열 읽기
		System.out.print("도시는 " + city + ", ");
		
		int age = scanner.nextInt(); // 정수 읽기
		System.out.print("나이는 " + age + "살, ");
		 
		double weight = scanner.nextDouble(); // 실수 읽기
		System.out.print("체중은 " + weight + "kg, ");
		
		boolean single = scanner.nextBoolean(); // 논리값 읽기
		System.out.println("독신 여부는 " + single + "입니다.");
		
		scanner.close(); // scanner 닫기 , 사용 후에 반드시 닫아줘야 한다.
	}

}
