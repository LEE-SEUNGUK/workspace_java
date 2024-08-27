package ch04_operator;

import java.util.Scanner;

public class OperatorEx {

	public static void main(String[] args) {
		// 사용자에게 이메일 주소를 입력받으세요.
		// email 형식이 아니면 "이메일 형식이 아닙니다." 맞으면 "사용 가능" 출력
		// ex) indexOf는 특정 문자열을 찾아 인덱스를 반환하는데 없으면 -1을 리턴함.
		// 조건: @를 포함하면 email형식으로 인정, 없으면 email형식이 아님
		
		Scanner scan = new Scanner(System.in);
		System.out.println("email 주소를 입력하세요.");
		System.out.print(">>>");
		String email = scan.nextLine();
		
		String msg=(email.indexOf("@") == -1)?"이메일 형식이 아닙니다":"이메일 사용 가능";
		System.out.println(msg);
		
	}

}
