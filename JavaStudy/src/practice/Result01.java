package practice;

import java.util.Scanner;

public class Result01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("국어 점수를 입력해주세요.");
		System.out.print(">>> ");
		int korean = scan.nextInt();
		
		System.out.println("영어 점수를 입력해주세요.");
		System.out.print(">>> ");
		int english = scan.nextInt();
		
		System.out.println("수학 점수를 입력해주세요.");
		System.out.print(">>> ");
		int math = scan.nextInt();
		
		double avg = (korean + english + math)/3.0;
		
		String grade="";
		
		if(avg>=90) {
			grade="A";
		}else if(avg>=80) {
			grade="B";
		}else if(avg>=70) {
			grade="C";
		}else {
			grade="D";
		}
		System.out.printf("평균 : %.14f\n",avg);
		System.out.printf("등급 : %s 등급", grade);
	}

}
