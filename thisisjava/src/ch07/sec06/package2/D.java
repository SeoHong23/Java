package ch07.sec06.package2;

import ch07.sec06.package1.A;

public class D extends A{
	// 생성자 선언 
	public D() {
		//A() 생성자 호출
		super();
	}
	
	// 메소드 선언		상속을 통해서만 사용가능
	public void method1() {
		// A 필드값 변경
		this.field = "value";
		// A 메소드 호출
		this.method();
	}
	
	// 메소드 선언    직접 객체 생성해서 사용하는것은 안됨
	public void method2() {
//		A a = new A();
//		a.field = "value";
//		a.method();
	}

}
