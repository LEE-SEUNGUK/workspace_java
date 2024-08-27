package ch13_thread.issac;

public class IssacMain {
	public static void main(String[] args) throws InterruptedException {
		// 오픈 전
		Customer customer1 = new Customer("팽수", 3);
		Customer customer2 = new Customer("동길", 5);
		customer1.start();
		customer2.start();
		Thread.sleep(1000);
		System.out.println("오픈");
		Chef chef1 = new Chef(5);
		chef1.start();
		chef1.endCook = new EndCook() {
			
			@Override
			public void endOfCook() {
				System.out.println("토스트 완성");
			}
		};
		Chef chef2 = new Chef(5);
		chef2.endCook = new EndCook() {
			
			@Override
			public void endOfCook() {
				System.out.println("끝났다");
			}
		};
		chef2.start();
	}
}