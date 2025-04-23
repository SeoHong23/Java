package ch06.sec15.test;

public class Member {
	String name;
	String id;
	String password;
	int age;
	
	
	// 13번 문제에서 작성한 Member 클래스에 생성자를 추가하려고합니다. 
	// 다음과 같이 name 필드와 id 필드를 외부에서 받은 값으로 초기화하도록 생성자를 선언해 보세요.
	
	// Member user1 = new Member("홍길동", "hong");
	
	public Member(String name, String id) {
	    this.name = name;
	    this.id = id;
	}
}
