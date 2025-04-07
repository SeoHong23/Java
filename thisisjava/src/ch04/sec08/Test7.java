package ch04.sec08;

import java.util.Scanner;

// while 문과 Scanner의  nextLine() 메소드를 이용해서 다음실행 결과와 같이 키보드로부터 입력된 데이터로 예금, 출금, 조회, 종료 기능을 제공하는 코드를 작성
public class Test7 {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	boolean run = true;
    	int balance = 0;
    	
    	while(run) {
    		System.out.println("-----------------------");
    		System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
    		System.out.println("선택>");
    		String strNum = scanner.nextLine();
    		
    		if(strNum.equals("1")) {
    			System.out.print("예금액>");
    			int deposit = Integer.parseInt(scanner.nextLine());
    			balance+= deposit;
    			
    		} else if(strNum.equals("2")) {
    			System.out.println("출금액>");
    			int withdraw = Integer.parseInt(scanner.nextLine());
    			if(withdraw > balance) {
    				System.out.println("잔액 부족");
    			} else {
    				balance -= withdraw;
    			}
    		} else if(strNum.equals("3")) {
    			System.out.println("잔고>" +balance);
    		} else if(strNum.equals("4")) {
    			run = false;
    			System.out.println("프로그램 종료");
    		} else {
    			System.out.println("잘못된 입력 확인후 다시 입력");
    		}
    	}
    	scanner.close();
   
    } 
}
