package 공부;

import java.util.HashMap;

public class method_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ‘사람’을 예로 들면 누구든지 "이름" = "홍길동", "생일" = "몇 월 몇 일" 등으로 구분할 수 있다. 자바의 맵(Map)은 이러한
		 * 대응관계를 쉽게 표현할 수 있게 해 주는 자료형이다. 이것은 요즘 나오는 대부분의 언어들도 갖고 있는 자료형으로 Associative
		 * array, Hash라고도 불린다.
		 * 
		 * 맵(Map)은 사전(dictionary)과 비슷하다. 즉, people 이란 단어에 "사람", baseball 이라는 단어에 "야구"라는
		 * 뜻이 부합되듯이 Map은 Key와 Value라는 것을 한 쌍으로 갖는 자료형이다.
		 * 
		 * Map은 리스트나 배열처럼 순차적으로(sequential) 해당 요소 값을 구하지 않고 key를 통해 value를 얻는다. 맵(Map)의
		 * 가장 큰 특징이라면 key로 value를 얻어낸다는 점이다. baseball이란 단어의 뜻을 찾기 위해서 사전의 내용을 순차적으로 모두
		 * 검색하는 것이 아니라 baseball이라는 단어가 있는 곳만을 펼쳐보는 것이다.
		 */
		
		//Map 중에 가장 간단한 HashMap
		
		//선언
		HashMap<String, String> map = new HashMap<String,String>();
		//HashMap<key 자료형, value 자료형> 변수이름 = new HashMap<>();
		
		map.put("people", "사람");						//key와 value값 입력
		map.put("baseball", "야구");

		System.out.println(map.get("people"));			//key에 해당하는 값 얻기
		System.out.println(map.containsKey("people"));	//Map에 해당 키가 존재하는지 알려줌, bealoon형 (true / false) 반환
		System.out.println(map.remove("people"));		//key에 해당하는 값 제거
		System.out.println(map.size());					//Map의 크기 (현재 2개의 값을 넣었기 때문에 2가 반환됨)
	}

}
