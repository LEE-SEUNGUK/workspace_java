package practice;

import java.util.Scanner;

public class Result04 {
	public static void main(String[] args) {
		Elelevator A = new Elelevator(10);
		Elelevator B = new Elelevator(4);
		Scanner sc = new Scanner(System.in);
		String user;

		while (true) {
			System.out.println("===============  엘리베이터  ===============\n");
			System.out.println("승강기 A의 현재 위치: " + A.floor);
			System.out.println("승강기 B의 현재 위치: " + B.floor);
			System.out.print("몇층에 계시나요?[종료는 q 또는 exit]: ");

			user = sc.nextLine();

			if (user.equalsIgnoreCase("q") || user.equalsIgnoreCase("exit")) {
				break;
			}

			int user_floor = Integer.parseInt(user);

			if (Math.abs(A.floor - user_floor) < Math.abs(B.floor - user_floor)) { // 1 , 5
				A.move(user_floor);
				System.out.println("엘리베이터 A가 " + A.floor + "층으로 이동하였습니다.\n");
			} else if (Math.abs(A.floor - user_floor) > Math.abs(B.floor - user_floor)) { // 10 (2) 8 (4)4
				B.move(user_floor);
				System.out.println("엘리베이터 B가 " + B.floor + "층으로 이동하였습니다.\n");
			} else {
				if (A.floor > user_floor) {
					A.floor = user_floor;
					System.out.println("엘리베이터 A가 " + A.floor + "층으로 이동하였습니다.\n");
				} else {
					B.floor = user_floor;
					System.out.println("엘리베이터 B가 " + B.floor + "층으로 이동하였습니다.\n");
				}
			}
		}

	}
}

class Elelevator {
	int floor;

	Elelevator(int floor) {
		this.floor = floor;
	}

	void move(int user_floor) {
		floor = user_floor;
	}
}