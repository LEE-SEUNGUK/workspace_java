package ch12_exception;

import java.text.ParseException;

public class ExceptionMain {
	public static void main(String[] args) {
		System.out.println("메인 시작!");
		int[] arr = { 1, 2, 3 };
		String str = null;
		try {
//			System.out.println(arr[3]); // 오류가 발생 가능한 로직을 예외처리
			str.length();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 문제 발생");
		} catch (NullPointerException e) {
			System.out.println("\n널임");
		} catch (Exception e) {
			System.out.println();
//			e.printStackTrace(); // 예외 발생 코드에 대해 추적한 내용을 콘솔에 출력
			System.out.println(e.toString()); // 문자열 출력
		}
		System.out.println("\n메인 종료");
		
		System.out.println(ExMethod.dateMillsec2("2024/01/01"));
		try {
			System.out.println(ExMethod.dateMillsec("2024/01/01"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("종료");
		
		try {
			ExMethod.printName("");
			ExMethod.printName("길"); // 해당 문장 실행전에 오류를 발견하면 건더 뛴다
		} catch(BizException e) {
			System.out.println(e.getErrCode()); // BizException 메서드
			System.out.println(e.getMessage()); // 부모 메서드
		}
	}
}
