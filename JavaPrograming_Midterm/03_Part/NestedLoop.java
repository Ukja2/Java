public class NestedLoop {
	public static void main(String[] args) {
		for(int i=1; i<10; i++) { // 1단에서 9단
			for(int j=1; j<10; j++) { // 각 단의 구구셈 출력
				System.out.print(i + "*" + j + "=" + i*j); // 구구셈 출력
				System.out.print('\t'); // 하나씩 탭으로 띄기
			}
			System.out.println(); // 한 단이 끝나면 다음 줄로 커서 이동
		}
	}
}

/* 두 번째 for문에서 j가 9가 될 때까지 반복하면 첫 번째 for문의 1 * j 의 형태로 가로로 정렬
 * 만약 구구단을 세로로 정렬하고 싶으면 i와 j의 순서를 바꿔주면 된다.
 */
