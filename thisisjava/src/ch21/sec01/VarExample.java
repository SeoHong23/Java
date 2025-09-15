package ch21.sec01;

public class VarExample {
	public static void main(String[] args) {
		String name = getData();
		var userName = getData();
	}
	
	public static String getData() {
		return "홍길동";
	}

}
