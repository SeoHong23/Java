package ch04.sec08;

public class Test4 {
    public static void main(String[] args) {
        int dice1, dice2;

        while (true) {
            // Math.random()을 사용하여 1부터 6까지의 값을 생성
            dice1 = (int)(Math.random() * 6) + 1;
            dice2 = (int)(Math.random() * 6) + 1;

            System.out.println("(" + dice1 + ", " + dice2 + ")");

            // 지정된 4가지 경우만 프로그램을 종료
            if ((dice1 == 1 && dice2 == 4) || 
                (dice1 == 4 && dice2 == 1) || 
                (dice1 == 2 && dice2 == 3) || 
                (dice1 == 3 && dice2 == 2)) {
                
                System.out.println("주사위 눈의 합이 5입니다. 종료합니다.");
                break;
            }
        }
    }
}
