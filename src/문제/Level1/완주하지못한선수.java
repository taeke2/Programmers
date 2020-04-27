package 문제.Level1;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class 완주하지못한선수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] participant = { "mislav", "stanko", "mislav", "ana" };
		String[] completion = { "stanko", "ana", "mislav" };
		Solution2 slt = new Solution2();
		/*
		 * Arrays.sort(participant); Arrays.sort(completion);
		 * System.out.println("participant : " + Arrays.toString(participant)); //배열
		 * 출력하기 System.out.println("completion : " + Arrays.toString(completion)); //배열
		 * 출력하기
		 */
		System.out.println(slt.solution(participant, completion));

	}
}

class Solution2 {
	public String solution(String[] participant, String[] completion) {
		String answer = "";
		
		Map<String, Integer> map = new HashMap<>();
		for (String player : participant) {
			map.put(player, map.getOrDefault(player, 0) + 1);
		}
		// getOrDefault(key, 기본값) : key값이 있으면 value값 반환, 없으면 기본값 반환
		// -> player가 없다면 0이 반환되어 +1이라 value가 1이 들어간다.
		// -> player가 있으면 1에서 +1이되어서 2가 된다. 
		// -> 동명이인이 더 있으면 더 있는만큼 수가 증가된다.
		
		for (String player : completion) {
			map.put(player, map.get(player) - 1);
		}
		
		for(String key:map.keySet()) {
			if(map.get(key)!=0)
				answer = key;
		}

		return answer;
	}
}