package cafe;

import java.util.Scanner;

public class CafeMain {
	public static void main(String[] args) {
		Cafe starbucks = new Cafe("스타벅스");
		Cafe aka = new Cafe("아카");
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 3; i++) {
			System.out.println("스타벅스에 추가할 메뉴를 입력하시오.");
			System.out.println("한국명, 영어명, 가격 순으로");
			String kor_name= sc.nextLine();
			String eng_name= sc.nextLine();
			int price =sc.nextInt();
			Coffee cf = new Coffee(kor_name, eng_name, price);
		}
		
		for (int i = 0; i < 3; i++) {
			System.out.println("아카에 추가할 메뉴를 입력하시오.");
			System.out.println("한국명, 영어명, 가격 순으로");
			String kor_name= sc.nextLine();
			String eng_name= sc.nextLine();
			int price =sc.nextInt();
			Coffee cf = new Coffee(kor_name, eng_name, price);
		}
		
		
		
	}
}