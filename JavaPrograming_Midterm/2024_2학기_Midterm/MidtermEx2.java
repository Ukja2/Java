
public class MidtermEx2 {
/*
 * 다음 소스코드가 정상적으로 실행 될 수 있도록 Person class를 상속받은 Student 클래스를 작성하고, Student 클래스의 void set() 함수를 작성하시오 단, 상세 내용은 다음과 같다. 
 * 	age = 30;
	name = "홍길동";
	height = 175;
	weight = 99;	
	*/
	class Person {
		private int weight;
		int age;
		protected int height;
		public String name;
		
		public void setWeight(int weight) {
			this.weight = weight;
		}
		public int getWeight() {
			return weight;
		}
	}
	
	
	public class InheritanceEx {
		public static void main(String[] args) {
			Student s = new Student();
			s.set();
		}
	}

}
