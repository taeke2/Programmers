package ����.Level1;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class �����������Ѽ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] participant = { "mislav", "stanko", "mislav", "ana" };
		String[] completion = { "stanko", "ana", "mislav" };
		Solution2 slt = new Solution2();
		/*
		 * Arrays.sort(participant); Arrays.sort(completion);
		 * System.out.println("participant : " + Arrays.toString(participant)); //�迭
		 * ����ϱ� System.out.println("completion : " + Arrays.toString(completion)); //�迭
		 * ����ϱ�
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
		// getOrDefault(key, �⺻��) : key���� ������ value�� ��ȯ, ������ �⺻�� ��ȯ
		// -> player�� ���ٸ� 0�� ��ȯ�Ǿ� +1�̶� value�� 1�� ����.
		// -> player�� ������ 1���� +1�̵Ǿ 2�� �ȴ�. 
		// -> ���������� �� ������ �� �ִ¸�ŭ ���� �����ȴ�.
		
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