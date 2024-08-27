package ch06_method;

import java.util.Scanner;

public class MethodEx {

	public static void main(String[] args) {
		// 이름, 국어점수, 수학점수, 영어점수를 입력받아
		// 평균과 등급을 출력하는 메소드를 작성하시오
		// input: String, int, int, int
		// output: 없음
		// 등급은 평균 90 이상 A, 80 이상 B, 나머지 C
		// 출력) xxx님의 평균은(소수잠 둘째 자리까지 출력) 으로 y등급 입니다.
		
		// 함수 호출 예
		// makeCard("팽수", 100, 100, 100);
		// 팽수님의 평균은 100.00 으로 A등급 입니다.
		Scanner scan = new Scanner(System.in);
		System.out.println("이름을 입력하세요: ");
		String name = scan.nextLine();
		
		System.out.println("국어 점수를 입력하세요: ");
		int korean = scan.nextInt();
		System.out.println("수학 점수를 입력하세요: ");
		int math = scan.nextInt();
		System.out.println("영어 점수를 입력하세요: ");
		int english = scan.nextInt();

		calculate(name, korean, math, english);
		
	}
	
	public static void calculate(String name, int korean, int math, int english) {
		double avg = (korean + english + math)/3.0;
		
		String grade = "";
		if(avg >= 90) {
			grade="A";
		}else if (avg >= 80) {
			grade="B";
		}else {
			grade="C";
		}
		
		System.out.printf("%s님의 평균은 %.2f 으로 %s등급 입니다.", name, avg, grade);
	}

}
