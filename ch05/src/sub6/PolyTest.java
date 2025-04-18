package sub6;
/*
 * 날짜 : 2024/07/10
 * 이름 : 박서홍
 * 내용 : 다형성 실습하기
 * 
 * ※다형성(Polymorphism)※
 * 	- 상속관계에서 부모클래스의 기능을 자식클래스에서 다양한 기능으로 정의하는 특성
 * 	- 객체(참조변수)의 타입선언을 부모클래스 타입으로 선언(업캐스팅)
 * 	- 다형성을 활용해서 효율적인 프로그래밍을 수행
 * 
 *  */
public class PolyTest {
	public static void main(String[] args) {
		
		// 다형성 적용된 객체 생성(업캐스팅) 참조타입을 부모타입으로 (a1,a2,a3 참조변수)
		Animal a1 = new Tiger(); 
		Animal a2 = new Eagle();
		Animal a3 = new Shark();
		
		a1.move();
		a1.hunt();
		
		a2.move();
		a2.hunt();
		
		
		a3.move();
		a3.hunt();
		
		// 다운캐스팅
		Tiger tiger = (Tiger) a1;
		Eagle eagle = (Eagle) a2;
		Shark shark = (Shark) a3;
		
		tiger.move();
		tiger.hunt();
		
		eagle.move();
		eagle.hunt();
		
		shark.move();
		shark.hunt();
		
		// 객체 타입 비교연산
		if(a1 instanceof Tiger) {
			System.out.println("a1은 Tiger 입니다.");
		}
		if(a2 instanceof Eagle) {
			System.out.println("a2는 Eagle 입니다.");
		}
		if(a3 instanceof Shark) {
			System.out.println("a3는 Shark 입니다.");
		}
		
		// 다형성을 활용한 객체배열( 반복문 외우기)
		Animal arr[] = {tiger, eagle, shark};
		
		for (int i = 0; i<arr.length; i++) {
			arr[i].move();
			arr[i].hunt();
		}
			
			Dog dog = new Dog();
			Cat cat = new Cat();
		
			printSound(dog);
			printSound(cat);
			
		}
		
		public static void printSound(Pet pet) {
			pet.makeSound();
			
		}
 		
		
	}


