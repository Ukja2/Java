
public class MidtermEx3 {
/*
 *  다음 코드가 정상적으로 작동하도록 오버라이딩을 구현하시오. 
 */
	
	abstract class Calculator {
		 public abstract int add(int a, int b);
		 public abstract int subtract(int a, int b);
		 public abstract double average(int[] a);
	}
	public class GoodCalc extends Calculator {
		//오버라이딩 구현하기
		public static void main(String [] args) {
			GoodCalc c = new GoodCalc();
			System.out.println(c.add(2,3));
			System.out.println(c.subtract(2,3));
			System.out.println(c.average(new int [] { 2,3,4 }));
		}
	}
}
	
	/*
	 * 실행 결과 
	 * 5
	 * -1
	 * 3.0
	 */
