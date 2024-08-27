package ch05_conditional;

public class ConditionalMain2 {

	public static void main(String[] args) {
		// switch문은 단순 값을 매칭하는 경우 사용
		int num = 1;
		switch (num) {
		case 0: {
			
			System.out.println("수강등록");
			break;
		}
		case 1: {
			System.out.println("기초 프로그래밍");
			break;
				}
		case 2: {
			System.out.println("취업관련");
			break;
		}
	
		default:
			System.out.println("종료");
		}
		
		//문자열 비교
		String a ="펭수";
		if(a=="펭수") { //java 7 이상에서는 문자열도 == 비교 가능
			System.out.println("펭수");
		}
		if(a.equals("펭수")) { //이전 버전에서 문자열 비교
			System.out.println("펭수!");
		}
	}

}
