package practice;

import java.util.Scanner;

public class Result03 {

	public static void main(String[] args) {
		// Q.3 업다운 게임
		// 1 ~ 50 사이의 랜덤 정수 생성
		// 기회는 5번
		Scanner scan = new Scanner(System.in);

		int randInt = (int) (Math.random() * 50 + 1); // Math.random() <-- 난수 생성 메소드 0 ~ 1 사이 실수
		int chance = 4;

		while (true) {

			System.out.print("숫자를 입력해주세요 : ");
			int num = scan.nextInt();

			if (randInt > num) {
				if (chance != 0)
					System.out.println("업!! 기회가 " + chance + "번 남았습니다.");
			} else if (randInt < num) {
				if (chance != 0)
					System.out.println("다운!! 기회가 " + chance + "번 남았습니다.");
			} else if (randInt == num) {
				System.out.println("정답입니다.");
				break;
			}

			if (chance == 0) {
				System.out.println("실패하였습니다. 정답은 " + randInt + "입니다.");
				break;
			}

			chance--;
		}
		scan.close();
	}

}
