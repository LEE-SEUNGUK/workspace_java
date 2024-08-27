package ch09_class.common;

/**
 * class Name 	: UtilClass
 * Author 	  	: Smoothie
 * Created Date : 2024. 8. 13.
 * Version		: 1.0
 * Purpose		: 공통 class
 * Description  : 유용한 메서드를 보통 common, commons .. 패키지로 관리함
 */
public class UtilClass {
	
	// static 정적 메서드, 어디서든 사용할 수 있는 메서드
	// 인스턴스화 하지 않아도 사용 가능
	
	/**
	 * @Method Name: weRound
	 * @작성일: 2024.08.13
	 * @설명: 입력한 소수를 반올림하여 소수 n번째 자리로 리턴
	 * @param: num(반올림하고자 하는 소수)
	 * @param: 소수 n 번째 자리까지 리턴
	 * @return: 반올림된 소수를 리턴
	 */
	
	public static double weRound(double num, int n) {
		int ten = 1;
		for(int i = 0; i < n; i++) {
			ten *= 10;
		}
		num *= ten;
		long temp = Math.round(num);
		double result = (double) temp/ten;
		
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(weRound(75.123456789, 3));
	}
}
