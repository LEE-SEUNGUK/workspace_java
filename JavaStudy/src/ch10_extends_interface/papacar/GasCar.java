package ch10_extends_interface.papacar;

// implements: 인터페이스를 구현하겠다 의미
public class GasCar implements Vehicle{

	@Override
	public void start() {
		System.out.println("부릉 부르를ㅇ");
	}

	@Override
	public void stop() {
		System.out.println("타타ㅏ탈");
	}

}