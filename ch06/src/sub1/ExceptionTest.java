package sub1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
 *  날짜 : 2024/07/15
 *  이름 : 박서홍
 *  내용 : 예외처리 실습하기
 */
public class ExceptionTest {
	public static void main(String[] args) {
		///////////////////////////////////////
		// 실행예외(런타임, 프로그램 실행 중 발생 예외)
		///////////////////////////////////////
		// 예외상황 1. 어떤 수를 0으로 나눌 때
		int num1 = 1;
		int num2 = 0;
		
		int r1 = num1 + num2;
		int r2 = num1 - num2;
		int r3 = num1 * num2;
		int r4 = 0;
		try {
			// 예외가 발생할 코드
			r4 = num1 / num2;
		}catch (ArithmeticException e) {
			// 예외가 발생했을 때
			e.printStackTrace(); // 예외 출력  Exception(통합)
		}
		
		System.out.println("r1 : " + r1);
		System.out.println("r2 : " + r2);
		System.out.println("r3 : " + r3);
		System.out.println("r4 : " + r4);
		
		// 예외상황 2. 배열의 인덱스 참조가 잘못되었을 때
		int[] arr = {1, 2, 3, 4, 5};
		
		
		try {
			for(int i=0 ; i<10 ; i++) {
				System.out.println("arr["+i+"] : " + arr[i]);
				
			}
		}catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		
		// 예외상황 3. 객체 생성 없이 메서드 호출
		Animal ani = null;
		
		try {
			ani.move();
		}catch (NullPointerException e) {
			e.printStackTrace();
		}
		
	
		// 예외상황 4. 잘못된 캐스팅
		Animal a1 = new Tiger();
		Animal a2 = new Eagle();
		Animal a3 = new Shark();
		
		Tiger tiger = null;
		Shark shark = null;

		try {
			 tiger = (Tiger) a1;
			 shark = (Shark) a2; // 잘못된 다운캐스팅
			 
			tiger.move();
			shark.move(); 
		}catch (ClassCastException e) {
			e.printStackTrace();
		}
	
		
		
		
		///////////////////////////////////////////
		// 일반예외(컴파일타임, 프로그램 실행 전 발생 예외)
		///////////////////////////////////////////
		
		// 동적 객체 생성
		try {
			// 예외가 발생할 코드
			Class clazz = Class.forName("sub1.Eagle"); //문자열 정보를 가지고 클래스 정보 로드
			Constructor<?> constructor = clazz.getDeclaredConstructor(); // 생성자 선언
			Eagle eagle = (Eagle) constructor.newInstance(); // 동적 객체 생성
			
			eagle.move();
			
		} catch (ClassNotFoundException e) {
			// 예외가 발생 했을 때
			e.printStackTrace();
		
		} catch (NoClassDefFoundError e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} finally {
			// 예외처리 발생여부와 상관없이 마지막에 항상 실행
			System.out.println("finally 실행...");
		}
		
		
		
		System.out.println("프로그램 종료...");
		
		
	}


}
