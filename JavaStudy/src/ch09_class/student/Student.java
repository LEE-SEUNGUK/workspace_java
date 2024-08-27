package ch09_class.student;

import ch09_class.common.UtilClass;

public class Student {

	// 1. 필드, 속성값
	// public: 공개, 프로젝트 어디서든 접근가능
	// private: 비공개, 현재 클래스 내에서만 접근가능
	// (default): 같은 폴더 내에 있는 클래스에서 접근가능
	// 캡슐화는 필드 변수 접근제어자를 전부 private로 만듬

	private String name;
	private int kor;
	private int eng;
	private int math;
	private double avg;

	// 2. 생성자 (class는 생성자를 정의하지 않아도 무조건 클래스명의 생성자가 있음)
	public Student() {
	}
	// 단축키 shift + alt + s
    
    public Student(String nm) {
    	this.name = nm;	//this는 객체 자신을 의미함(this는 인스턴스화를 진행한 객체 자신)
    }
    
    // 생성자 오버로딩
    // 해당 객체를 다양하게 인스턴스화 한다면 다양하게 만들 수 있음.
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		setAvg();
	}

	public void nm() {
		System.out.println(name + "입니다.");
	}
	
	// 부모의 기능을 재정의하는 기능
	// 3. toString 추가
	@Override	// @Override 어노테이션은 컴파일러에게 이 메서드가 부모 클래스의 메서드를 오버라이딩 하고 있음을 명시적으로 알림
	public String toString() {
		return "학생 객체 [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", avg=" + avg + "]";
	}

	// 4. getter setter 추가
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
		setAvg();
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
		setAvg();
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
		setAvg();
	}

	public double getAvg() {
		return avg;
	}
	
	
	private void setAvg() {
		// this.avg랑 동일함
		avg = UtilClass.weRound((kor + eng + math) / 3.0, 1);
	}
}