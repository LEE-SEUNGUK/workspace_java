package ch05_conditional;

import java.util.Scanner;

/**
 * class Name 	: LoopWhile
 * Author 	  	: Smoothie
 * Created Date : 2024. 8. 7.
 * Version		: 1.0
 * Purpose		:
 * Description  :
 */
public class LoopWhile {

	public static void main(String[] args) {
		// while(조건식) 조건이 true이면 반복(무한루프 조심해야함)
		int i = 1;
		while(i <= 10) {
			System.out.println(i);
			i++;
		}
		
//		Scanner scan = new Scanner(System.in);
//		boolean flag = true;
//		while(flag) {
//			System.out.println("==========");
//			System.out.println("이름을 입력하시오.(종료 q)");
//			String nm = scan.nextLine();
//			
//			if(nm.equals("q")) {
//				flag = false;
//			}else {
//				System.out.println(nm + "님 환영합니다.\n");
//			}
//			System.out.println("==========");
//		}
		
		// while문으로 2~9단을 출력하시오 (중첩 while문)
		// 변수의 사용 scope 잘 생각하세요.
		
		int j=2;
		while(j<=9) {
			int k=1;
			while(k<=9) {
				System.out.printf("%d x %d = %d\n", j, k, j*k);
				k++;
			}
			j++;
		}
	}
	
}
