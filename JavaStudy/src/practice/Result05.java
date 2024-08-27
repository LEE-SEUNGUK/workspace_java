package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Result05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String user_select = "";
		ArrayList<Integer> weekLotto = new ArrayList<>();
		HashSet<Integer> user = new HashSet<>();

		System.out.println("=============================================");
		System.out.println("행운의 로또 번호 생성기 입니다.");
		System.out.println("입력 값이 있으면 'y', 전체 자동으로 선택하려면 'n'을 선택하세요 >>>");

		user_select = scan.nextLine();

		if (user_select.equals("n")) {
			weekLotto = makeLotto();
			System.out.println("이번주 행운의 번호는 ♥");
			System.out.println(weekLotto);
			System.out.println("GOOD LUCK ♥");
		} else if (user_select.equals("y")) {
			System.out.println("번호를 한칸씩 띄워서 입력해주세요(최대 6개)");
			user_select = scan.nextLine();
			String[] numArr = user_select.split(" ");

			int[] userLotto = new int[numArr.length];

			for (int i = 0; i < numArr.length; i++) {
				userLotto[i] = Integer.parseInt(numArr[i]);
			}

			for (int i = 0; i < userLotto.length; i++) {
				user.add(userLotto[i]);
			}

			System.out.println("선택하신 번호는 중 중복을 제외한 숫자는");
			System.out.println(user);

			weekLotto = makeLotto(user);
			System.out.println("이번주 행운의 번호는 ♥");
			System.out.println(weekLotto);
			System.out.println("GOOD LUCK ♥");
		}
	}

	public static ArrayList<Integer> makeLotto() {
		ArrayList<Integer> lotto = new ArrayList<>();

		while (lotto.size() < 6) {
			int num = (int) (Math.random() * 44 + 1);
			if (!lotto.contains(num)) {
				lotto.add(num);
			}
		}

		Collections.sort(lotto);

		return lotto;
	}

	public static ArrayList<Integer> makeLotto(HashSet<Integer> user) {
		ArrayList<Integer> lotto = new ArrayList<>(user);

		while (lotto.size() < 6) {
			int num = (int) (Math.random() * 44 + 1);
			if (!lotto.contains(num)) {
				lotto.add(num);
			}
		}

		Collections.sort(lotto);

		return lotto;
	}
}