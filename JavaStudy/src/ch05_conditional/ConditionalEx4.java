package ch05_conditional;

public class ConditionalEx4 {

	public static void main(String[] args) {
		/*
		 * 거꾸로 트리를 5층 만들어 주세요.
		 실행결과 
		 *****
		 ****
		 ***
		 **
		 * 
		 * */ 
		 String star = "*****";
		 //반복문 사용
		 for(int i=5;i>0;i--) {
			 star = star.substring(0,i);
			 System.out.println(star);
		 }
		 
	}

}
