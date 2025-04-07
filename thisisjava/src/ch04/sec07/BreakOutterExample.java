package ch04.sec07;

public class BreakOutterExample {
	// 랜덤으로 숫자를 뽑고 그 숫자가 6이 나오면 break를 사용하여 프로그램을 종료한다.
	public static void main(String[] args) {
		while(true) {
			int num = (int)(Math.random()*6) + 1;
			System.out.println(num);
			if(num == 6) {
				break;
			}
		}
		System.out.println("프로그램 종료");
	}

}
