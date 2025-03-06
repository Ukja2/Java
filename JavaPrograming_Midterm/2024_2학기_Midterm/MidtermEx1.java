
public class MidtermEx1 {
/* 예상문제 1번
 * 
 * 다음 소스코드가 정상적으로 실행 될 수 있도록 ColorPoint 클래스를 선언하시오
 */ 
	class Point {
	private int x, y; // 한 점을 구성하는 x, y 좌표
	public void set(int x, int y) {
			this.x = x; this.y = y;
	}
	public void showPoint() { // 점의 좌표 출력
			System.out.println("(" + x + "," + y + ")");
		}
	}
	public class ColorPointEx {
		public static void main(String [] args) {
			Point p = new Point(); // Point 객체 생성
			p.set(1, 2); // Point 클래스의 set() 호출	
			p.showPoint();
	
			ColorPoint cp = new ColorPoint(); // ColorPoint 객체
			cp.set(3, 4); // Point의 set() 호출
			cp.setColor("red"); // ColorPoint의 setColor() 호출
			cp.showColorPoint(); // 컬러와 좌표 출력
		}
	}
 
 /* 실행결과
 * (1,2)
 * red(3,4)
 */
	
	
}
