import java.util.Scanner;

public class GradingSwitch {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		char grade;
		System.out.print("점수를 입력하세요(0~100): ");
		int score = scanner.nextInt();
		switch (score/10) { //score를 10으로 나눈 값이 각각 10, 9, 8, 7,6 의 case문의 값과 비교
			case 10: // score = 100, 90~99와 100은 둘다 A 학점이기 때문에 break문이 존재하지 않는다.
			case 9: // score는 90~99
				grade = 'A';
				break; 
			case 8: // score는 80~89
				grade = 'B';
				break;
			case 7: // score는 70~79
				grade = 'C';
				break;
			case 6: // score는 60~69
				grade = 'D';
				break;
			default: // score는 59 이하, case의 비교값과 일치하는 것이 없을 때 default문 실행
				grade = 'F';
		}
		System.out.println("학점은 "+grade+"입니다");
		scanner.close();
	}
}
