/*
 * for문과 비교했을 때 for문은 반복 횟수가 정해져 있을 때 사용을 많이하고
 * while문은 조건을 먼저 확인하고 반복을 수행한다. 즉 조건이 참인 동안 계속 실행되며, 거짓일 때 반복이 종료되는데
 * 복횟수를 정하지 않았을 때 사용하는 경우가 많다.
 * 두 문법 모두 동일한 기능을 수행할 수 있지만, 상황에 따라 더 적합한 문법이 있음
 */

import java.util.Scanner;
public class WhileSample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int count=0; // count는 입력된 정수의 개수
		int sum=0; // sum은 합
		System.out.println("정수를 입력하고 마지막에 -1을 입력하세요.");

		int n = scanner.nextInt(); // 정수 입력
		while(n != -1) { // -1이 입력되면 while 문 벗어남
			sum += n;
			count++;
			n = scanner.nextInt(); /*정수 입력
			*루프가 반복될 때마다 사용자가 새로운 정수를 입력할 수 있어야 하므로, 이 과정을 통해 새로운 값을 n에 할당하는 것임
			*그렇지 않을 경우 루프가 무한히 반복되게 된다.*/
			
		}
		if(count == 0) System.out.println("입력된 수가 없습니다.");
		else {
			System.out.print("정수의 개수는 " + count + "개이며 ");
			System.out.println("평균은 " + (double)sum/count + "입니다.");
		}
		scanner.close();
	}
}
