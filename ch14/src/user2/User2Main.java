package user2;

import java.util.Scanner;

public class User2Main {
	
	public static void main(String[] args) {
	
		System.out.println("------------------");
		System.out.println("회원 관리 매니저 v1.0");
		System.out.println("------------------");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("종료:0, 입력:1, 조회:2, 검색:3, 수정:4,삭제:5");
			System.out.print("선택>");
			
			int answer  = sc.nextInt();
			
			if(answer == 0) {
				break;
			}else if (answer == 1) {
				
				System.out.print("아이디 입력 : ");
				String uid = sc.next();
				
				System.out.print("이름 입력 : ");
				String name = sc.next();
				
				System.out.print("생년월일 입력 : ");
				String birth = sc.next();
				
				System.out.print("주소 입력 : ");
				String addr = sc.next();
				
				User2VO vo = new User2VO(uid, name, birth, addr);
				
				User2DAO dao = User2DAO.getInstnace();
				dao.insertUser(vo);
				
				System.out.println("입력 완료...");				
				
			}else if (answer == 2) {
				
				
				
			}else if (answer == 3) {
			}else if (answer == 4) {
			}else if (answer == 5) {
				
			}
		}
		
		
		
	}
	

}
