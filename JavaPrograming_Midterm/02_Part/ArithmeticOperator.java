import java.util.Scanner;

public class ArithmeticOperator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			
		System.out.println("정수를 입력하세요: ");
		int time = scanner.nextInt();
		int second = time % 60;
		int minute = (time/60) % 60;
		int hour = ((time /60) /60) % 24;
		int day = (time/86400);
		
		System.out.print(time + "초는");
		System.out.print(day + "일");
		System.out.print(hour + "시");
		System.out.print(minute + "분");
		System.out.println(second + "초입니다.");
		
		scanner.close();
		//여기서 print와 println의 차이는 줄바꿈에 있다. print는 값 출력이후 줄바꿈을 하지 않고 println은 줄바꿈을 한다.
		//본래 예제에서 "일"을 나타내는 day변수 추가와 24시간이 지났을 때 hour이 0이 될 수 있게 %24 추가
	}

}
