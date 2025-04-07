package ch07.sec05.exam02;

import java.security.PublicKey;

public class SportsCar extends Car {
	@Override
	public void speedUp() {
		speed += 10;
		
		//오버라이딩을 할 수 없음.
		@Override
		Public void stop() {
			System.out.println("스포츠카를 멈춤");
			speed = 0; //Car 클래스에 final 메소드 사용
		}
	}
	

}
