
public class MidtermEx4 {
/*
 * 다음 코드가 정상적으로 작동하도록 SmartPhone 클래스를 작성 하시오. 단, 해당 클래스는 PDA 클래스를 상속받고, 
 * PhoneInterface, MobilePhoneInterface 인터페이스를 구현 해야한다.
 */
	interface PhoneInterface {
		final int TIMEOUT = 10000;
		void sendCall();
		void receiveCall();
		default void printLogo() {
			System.out.println("** Phone **");
		}
	}
	interface MobilePhoneInterface extends PhoneInterface {
		void sendSMS();
		void receiveSMS();
	}
	interface MP3Interface {
		public void play();
		public void stop();
	}
	class PDA {
		public int calculate(int x, int y) { return x + y;
		}
	}
	public class InterfaceEx {
		public static void main(String [] args) {
			SmartPhone phone = new SmartPhone();
			phone.printLogo();
			phone.sendCall();
			phone.play();
			System.out.println("3과 5를 더하면 " + phone.calculate(3,5));
			phone.schedule();
		}
	}
	/*
	 * 이때 구현된 함수에서 출력해야 할 문장은 다음과 같다. 
	 * 
	 * 	sendCall() : "따르릉따르릉~~" receiveCall() : "전화 왔어요."
		sendSMS() : "문자갑니다."
		receiveSMS() : "문자왔어요."
		play() : "음악 연주합니다."
		stop() : "음악 중단합니다."
		schedule() : "일정 관리합니다."
	 */
	
	/* 출력 결과
	 * 따르릉따르릉~~
	 * 음악 연주합니다.
	 * 3과 5를 더하면 8
	 * 일정 관리합니다.
	 */
}
