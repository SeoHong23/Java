package ch07.sec09;

public class Dog extends Animal {
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
	public void fetchBall() {
		System.out.println("공 가져오기");
	}
}
