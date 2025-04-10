package ch05.test;

import java.util.Scanner;

public class Test9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		
		while (run) {
			System.out.println("---------------------------------");
			System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
			System.out.println("---------------------------------");
			System.out.println("선택>");
			
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			switch (selectNo) {
			case 1:
				System.out.println("학생수> ");
				studentNum = Integer.parseInt(scanner.nextLine());
				scores = new int[studentNum];
				break;
				
			case 2:
				for (int i= 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]>");
					scores[i] = Integer.parseInt(scanner.nextLine());
				}
				break;
				
			case 3:
				for (int i = 0; i< scores.length; i++) {
					System.out.println("scores[" + i + "]: " + scores[i]);
				}
				break;
				
			case 4:
				int max = 0;
				int sum = 0;
				for (int score : scores) {
					if (score > max) max = score;
					sum += score;
				}
				
				double avg = (double) sum /scores.length;
				System.out.println("최고 점수 : " + max);
				System.out.println("평균 점수 : " + avg);
				
				break;
				
			case 5:
				run = false;
				System.out.println("프로그램 종료");
				break;
				
			default:
				System.out.println("1~5번 중에서 선택하세요.");
				break;
			}
		}
	}

}
