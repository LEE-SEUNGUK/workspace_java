package practice;


public class Result02 {

	public static void main(String[] args) {
	
		long factorial = 1;
		
		for(int i=10;i>=1;i--) {
			factorial*=i;
		}
		System.out.println("10팩토리얼 결과값은 " + factorial);
		
		factorial = 1;
		
		for(int i=15;i>=1;i--) {
			factorial*=i;
		}
		System.out.println("15팩토리얼 결과값은 " + factorial);
		
	}
}