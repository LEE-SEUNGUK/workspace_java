package ch05_conditional;

import java.util.Scanner;

public class ConditionalEx1 {

	public static void main(String[] args) {
		/*
		 * 사용자로부터 숫자를 입력 받아 짝수인지 홀수인지 판별하시오.
		 * 조건1: 정수만 입력받음.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요(정수)");
		System.out.println(">>>");
		// if문을 사용하여 짝수이면 "짝수" 출력 (짝수 판별은 산술연산자 이용)
		// 				   or "홀수"
		int num = Integer.parseInt(scan.nextLine());
		if (num % 2 == 0) {
			System.out.printf("%d 는 %s 입니다.", num, "짝수");
		}
		else {
			System.out.printf("%d 는 %s 입니다.", num, "홀수");
		}
	}
}
