package ch09_class.quiz;

import java.util.ArrayList;

public class MovieDB {
	
	// 싱글톤 패턴
	// 인스턴스를 1개만 만들게하는 방법(최초에 한번만 메모리에 할당)
	// 메모리 낭비를 방지할 수 있으며, 단 하나의 객체로 존재해도 되는 클래스에 적용
	private ArrayList<Movie> movieList = new ArrayList<>();
	
	private MovieDB() {
		movieList.add(new Movie("신세계", "거 죽기 딱 좋은 날씨네", "박성웅", "ㅅㅅㄱ"));
		movieList.add(new Movie("기생충", "넌 계획이 다 있구나", "최우식", "ㄱㅅㅊ"));
		movieList.add(new Movie("인터스텔라", "우린 답을 찾을 거야, 늘 그랬듯이", "매튜 맥커너히", "ㅇㅌㅅㅌㄹ"));
		movieList.add(new Movie("어벤져스", "어벤져스, 어셈블!", "로버트 다우니 주니어", "ㅇㅂㅈㅅ"));
		movieList.add(new Movie("라라랜드", "여기서부터는 내 꿈이야", "엠마 스톤", "ㄹㄹㄹㄷ"));
		movieList.add(new Movie("인셉션", "우리가 다시 만날 때까지", "레오나르도 디카프리오", "ㅇㅅㅍㅅ"));
		movieList.add(new Movie("해리 포터", "네가 바로 살아남은 자야, 해리", "앨런 릭먼", "ㅎㄹㅍㅌ"));
		movieList.add(new Movie("포레스트 검프", "인생은 초콜릿 상자와 같아", "톰 행크스", "ㅍㄹㅅㅌ ㄱㅍ"));
		movieList.add(new Movie("파이트 클럽", "첫 번째 규칙, 파이트 클럽에 대해 말하지 않는다", "에드워드 노튼", "ㅍㅇㅌㅋㄹ"));
		movieList.add(new Movie("반지의 제왕", "나를 따라와, 프로도", "일라이저 우드", "ㅂㅈㅇ ㅈㅇ"));
	}
	// 인스턴스 생성을 해당 클래스에서 하기 때문에(private) 외부에서 인스턴스 못만듬
	private static MovieDB intstance = new MovieDB();
	
	// 외부에서 접근
	public static MovieDB getInstance() {
		return intstance;
	}
	
	public ArrayList<Movie> getMovieList(){
		return movieList;
	}
}