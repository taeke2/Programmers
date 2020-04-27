package 문제.Level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class 모의고사 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] answers = {3,1,2,1,2,3,4,2,1,3,2,3,1,2,5,4,5,3,4,5,3,2,1,3,4,5,4,3,2,3,1,5,3,3,1};
		Solution3 s = new Solution3();
		int[] result = s.solution(answers);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}

	}
}

class Solution3 {
	public int[] solution(int[] answers) {
		int[] p1 = { 1, 2, 3, 4, 5 };
		int[] p2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] p3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };

		HashMap<Integer, Integer> data = new HashMap<>();
		data.put(1, 0);
		data.put(2, 0);
		data.put(3, 0);

		for (int i = 0; i < answers.length; i++) {
			int num = answers[i];
			if (p1[i % 5] == num)
				data.replace(1, data.get(1) + 1);
			if (p2[i % 8] == num)
				data.replace(2, data.get(2) + 1);
			if (p3[i % 10] == num)
				data.replace(3, data.get(3) + 1);
		}

		// ** data의 모든 key와 value값 불러오기
		// data.forEach((k,v) -> System.out.println("key : " + k + ", value : " + v));

		int max = data.get(1);
		for (Integer val : data.values()) {
			if (val > max)
				max = val;
		}

		ArrayList<Integer> answerList = new ArrayList<>();
		for (Integer key : data.keySet()) {
			if (data.get(key) == max)
				answerList.add(key);
		}

		int[] answer = new int[answerList.size()];
		Collections.sort(answerList);
		/**/
		for (int i = 0; i < answer.length; i++)
			answer[i] = answerList.get(i);
		
		return answer;
	}
}
