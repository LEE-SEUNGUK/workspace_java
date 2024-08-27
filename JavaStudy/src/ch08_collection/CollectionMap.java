package ch08_collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CollectionMap {
	public static void main(String[] args) {
		// key 와 value 한쌍인 데이터를 저장
		HashMap<String, String> stuMap = new HashMap<>();
		// 제네릭의 첫번째는 key 타입, 두번째는 value 타입
		stuMap.put("첫째", "길동");	// 데이터 삽입
		stuMap.put("둘째", "동길");
		stuMap.put("셋째", "길순");
		stuMap.put("넷째", "길길");
		
		System.out.println(stuMap.get("둘째"));	// key로 value값 가져오기
		stuMap.put("둘째", "동수");				// 동일 key값이면 수정됨(key는 유니크)
		System.out.println(stuMap.size()); 		// 순서는 보장하지 않지만 사이즈는 가져올 수 있음
		System.out.println(stuMap.containsKey("첫째")); // key에서 같은게 있으면 true, 없으면 false
		System.out.println(stuMap.containsValue("길동")); //value에서 같은게 있으면 true, 없으면 false
		stuMap.remove("둘째"); // key로 삭제
		// map은 KeySet으로 for문 사용
		Set<String> keys = stuMap.keySet(); // 키 정보를 반환
		System.out.println(stuMap.keySet());
		for(String key: keys) {
			System.out.println(stuMap.get(key));
		}
		
		HashMap<String, Integer> coinMap = new HashMap<>();
		coinMap.put("비트코인", 79805524);
		coinMap.put("이더리움", 3468439);
		
		for(String coin: coinMap.keySet()) {
			System.out.println(coin + ": " + coinMap.get(coin));
		}
		
		// set은 중복을 허용하지 않음
		HashSet<String> singer = new HashSet<>();
		singer.add("임영웅");
		singer.add("임영웅");
		singer.add("아이유");
		System.out.println(singer);
		// for문
		for(String nm: singer) {
			System.out.println(nm);
		}
	}

}