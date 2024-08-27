package ch10_extends_interface.papacar;

public class ElectricCar implements Vehicle {

	@Override
	public void start() {
		System.out.println("ㅠ우우우우웅");
	}

	@Override
	public void stop() {
		System.out.println("이잉");
	}

}