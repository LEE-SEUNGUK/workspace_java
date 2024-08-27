package ch05_conditional;

import java.util.Scanner;

public class ConditionalEx2 {

	public static void main(String[] args) {
		/*
		 * 각 자리의 수를 더한 값을 출력하시오
		 * 출력 결과: 2 + 9 + 8 = 19
		 * ex) 문자열로 한자리씩 or 각 자리를 나눠서
		 * ex) 문자열로 형변환은 String.valueOf(숫자) or 숫자 + ""
		 */
		int num = 298;
		String test = num +"";
		System.out.println(test);
		
		int first = Integer.parseInt(test.substring(0,1));
		int second = Integer.parseInt(test.substring(1,2));
		int third = Integer.parseInt(test.substring(2));
		
		System.out.println(first+second+third);
		
	}
}
