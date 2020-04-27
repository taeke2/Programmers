package 공부;

import java.util.*;
import java.util.stream.Stream;

public class Java_Stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Stream은 "컬렉션, 배열 등의 저장 요소를 하나씩 참조하며 함수형 인터페이스(람다식)을 적용하며
		// 반복적으로 처리할 수 있도록 해주는 기능

		Double[] dArray = { 3.1, 3.2, 3.3 };
		Arrays.stream(dArray); // 배열로 스트림 생성

		Stream<Integer> str = Stream.of(1, 2); // 스트림 직접 생성

		List<String> names = Arrays.asList("jeong", "pro", "jdk", "java");
		names.stream(); // Collection에서 스트림 생성
		// -------------------------------------------------------------------

		// 기존의 코딩방식
		long count = 0;
		for (String name : names) {
			if (name.contains("o"))
				count++;
		}
		System.out.println("Normal Count : " + count);

		// 스트림을 이용한 방식
		count = 0;
		count = names.stream().filter(x -> x.contains("o")).count();
		System.out.println("Stream Count : " + count);
	}

}
