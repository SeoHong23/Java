package ch04.sec07;

public class BreakExample {
	// 바깥쪽 for문은 A~Z까지 반복 중첩 for 문은 a~z 반복 중첩 for문에서 lower변수가 g를 가지면 바깥쪽 for문까지 빠져나옴 
	public static void main(String[] args) throws Exception {
		Outter: for(char upper='A'; upper<='Z'; upper++) {
			for(char lower='a'; lower<='z'; lower++) {
				System.out.println(upper + "-" + lower);
				if(lower=='g' ) {
					break Outter;
				}
			}
		}
		System.out.println("프로그램 실행 종료");
	}
}
