package test1;

/*
 * 날짜 : 2024/07/03
 * 이름 : 박서홍
 * 내용 : 자바 기본 입출력 연습문제
 */
public class Test03 {
	public static void main(String[] args) {
		
		int num = 1;
		int result =0;
		
		result = num++;
		// num 값을 대입하고 증가
		System.out.println("result : " + result);
		
		result = ++num; // 증가 연산 후 대입
		System.out.println("result : " + result);
		
		result = num--; 
		System.out.println("result : " + result);
		
		result = --num;
		System.out.println("result : " + result);
		
	}


}
