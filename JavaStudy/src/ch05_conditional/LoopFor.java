package ch05_conditional;

public class LoopFor {

	public static void main(String[] args) {
		// for문 (1.초기식;2.조건식;4.증감식)
		//		3. 실행문 순서로 반복됨
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		// 1~10까지의 합은?
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum += i;
		}
		System.out.println("결과는 " + sum);
		
		int sum2 = 0;
		for(int i=21; i<=45; i++) {
			sum2 += i;
		}
		System.out.println("결과는 " + sum2);
		
		// 1~40까지 중에 짝수만 더한 값은?
		// 1. 반복문 만들기
		// 2. 특정 짝수일 경우 더하기
		// 3. 출력
		int sum3 = 0;
		for(int i=1;i<=40;i++) {
			if (i%2==0) {
				System.out.print(i+" ");
				sum3+=i;
			}
		}
		System.out.println("\n"+sum3);
		
		// 초기값을 0부터 시작해서 10번 * <-- 프린트하시오
		for(int i=0;i<10;i++) {
			System.out.print("*");
		}
		System.out.println();
		// 구구단 출력
		int dan = 9;
		for(int i=1;i<10;i++) {
			System.out.printf("%d x %d = %d\n",i,dan,i*dan);
		}
		// 10부터 1까지
		for (int i =10;i>=1; i--) {
			System.out.println(i);
		}
		// 5씩 증가
		for(int i=1;i<=100;i+=5) {
			System.out.print(i+" ");
		}
		System.out.println();
		// 2~9단 출력
		for(int i=2;i<=9;i++) {
			if(i==3) {
				continue; //continue를 만나면 아래 실행문 건너뜀
			}
			for(int j=1;j<=9;j++) {
				System.out.printf("%d x %d = %d\n", i, j, i*j);
			}
		}
		//break문 ->반복문 내에서 break문이 싦행되면 반복문이 즉시 종료됨
		
		//1~n까지 더한 값이 100이상이 되는 지점의 n을 구하시오.
		int sum4= 0;
		for(int i = 1; i < 9999; i++) {
			sum4 +=i;
			if(sum4 >100) {
				System.out.println("100이상이 되는 n: " +i);
				break;
			}
		}
		
		outer:
			for(int i = 0; i < 5; i++) {
				System.out.println("메인 for" + i);
				for(int j = 0; j < 5; j++) {
					System.out.println("서브 for" + j);
					if(j == 2) {
						break outer;
					}
				}
			}
		
	}
}
