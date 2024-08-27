package ch06_method;

import java.util.Scanner;

public class MethodEx2 {
	public static void main(String[] args) {
		shop(2);
	}
	// input: 고객 수
	// output: 없음
	// 고객 수만큼 커피 주문을 받아 금액을 출력하는 메소드 생성
	
	public static void shop(int num) {
		System.out.println(num + "명의 고객님 오셨습니다.");
		Scanner scan = new Scanner(System.in);
		int i = 0;
		while(num > i) {
			// 주문 받기
			System.out.println((i+1) + "번째 고객님 어떤걸 드릴까요?");
			String order = scan.nextLine();
			int price = 0;
			
			// 2. 조건문
			switch (order) {
			case "아아", "아메리카노": {
				// 3. 해당 조건의 값 할당
				price=3000;
				break;
			}
			case "카푸치노": {
				price=4500;
				break;
			}
			case "밀크티": {
				price=5000;
				break;
			}
			default:
				System.out.println("메뉴 없음");	
				break;
			}
			// 4. 출력
			if (price>0) {
				System.out.println("선택한 음료는 " + price + "원 입니다.");
				i++;
			}
		}
		scan.close();
		System.out.println(num + "명의 고객님 모두 주문완료.");
	}
	
}