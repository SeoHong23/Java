package ch07.sec06.package1;

public class B {
	
	// 메소드 선언 같은 패키지라 A의 protected 필드, 생성자, 메소드에 접근가능
	protected void method() {
		A a = new A();
		a.field = "value";
		a.method();
		
	}

}
