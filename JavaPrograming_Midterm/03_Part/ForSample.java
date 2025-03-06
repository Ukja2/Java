
public class ForSample {
	public static void main(String[] args) {
		
		int sum = 0; //합을 받아줄 변수 생성
		
		for(int i = 1; i <= 10; i++) {
			sum += i;
			System.out.println(i);
		
		
		if(i<10)
			System.out.println('+');
		else {
			System.out.println('=');
			System.out.println(sum);
			
			}
		}
	}
}
