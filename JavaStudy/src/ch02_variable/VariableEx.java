package ch02_variable;

import java.util.Scanner;

/**
 * class Name 	: VariableEx
 * Author 	  	: Smoothie
 * Created Date : 2024. 8. 5.
 * Version		: 1.0
 * Purpose		: 퀴즈~
 * Description  :
 */

public class VariableEx {

	public static void main(String[] args) { // 메인 메서드 설마?
		// 사용자의 이름: 나이를 입력받아
		// 각각 변수에 할당 후 출력하시오
	
		// 콘솔에서 사용자 입력을 받는 객체
	    Scanner scan = new Scanner(System.in);
	    System.out.println("이름:나이를 입력하세요!");
	    String userString = scan.nextLine();
	    System.out.println(userString);
	    int idx = userString.indexOf(":"); // :의 인덱스
	    String name=userString.substring(0,idx); // :기준으로 앞의 내용
	    String age=userString.substring(idx+1); // :기준으로 뒤의 내용
	    System.out.println("입력하신 이름은 " + name + "이고, 나이는:" + age +" 입니다.");
	    // indexOf와 substring을 사용하여 위 내용을 완성하시오.
	}
}
