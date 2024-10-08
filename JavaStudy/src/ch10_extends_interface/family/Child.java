package ch10_extends_interface.family;

// child는 parent를 상속받음
public class Child extends Parent{

	public Child() {
		super();
	}

	public Child(String name, int age) {
		super(name, age);	// 부모 생성자
	}

	@Override
	public String toString() {
		return "Child [getName()=" + getName() + ", getAge()=" + getAge() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	@Override	// 부모의 sayHello
	public void sayHello() {
		System.out.println("자식입니다. 소리 질러");
	}
}