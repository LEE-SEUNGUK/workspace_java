package ch02_variable;

public class VariableName {
	public static void main(String[] args) {
		
		// 변수명, 클래스명 명명 규칙
		
		/* <--여러줄 주석
		 * 프로젝트, 클래스명 이름은 앞에 대문자를 씀(JavaStudy)
		 * 패키지 이름은 전부 소문자로 작성
		 * 필요하다면 단어 사이에 언더바(_)를 넣어서 사용
		 * 
		 * 변수명(or 함수명)
		 * java는 카멜표기법(Camel, 낙타 표기법이라함)
		 * 첫글자는 소문자, 다음 단어들은 대문자로 시작
		 * ex) todayIsHappy
		 * 
		 * python은 스네이크 표기법 사용
		 * ex) today_is_happy
		 * */
		
		// 정수 타입
		// [데이터 타입][변수명]
		int todayIsHappy = 0;
		todayIsHappy = todayIsHappy + 10;
		System.out.println(todayIsHappy);
		
		String strToday = "오늘은 8월 5일";
		System.out.println(strToday);
		
		// 정수 long l 븉움
		long size =100000000000L;
		System.out.println(size);
		// 실수 float f 붙음
		float floatVar = 3.14f;
		System.out.println(floatVar);
		// 불리언(true, false)
		boolean flag = false;
		System.out.println(flag);
	}
}