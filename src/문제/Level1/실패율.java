package 문제.Level1;

import java.util.*;

public class 실패율 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 5;
		int[] stages = { 2, 1, 2, 6, 2, 4, 3, 3 };
		Solution37 sol = new Solution37();
		for (int i : sol.solution(N, stages)) {
			System.out.print(i + " ");
		}
	}
}

class Solution37 {
	public int[] solution(int N, int[] stages) {
		int[] answer = new int[N];
		double passCnt = 0.0, stayCnt = 0.0, result = 0.0;
		ArrayList<Double> failureList = new ArrayList<Double>();
		ArrayList<Integer> answerList = new ArrayList<Integer>();

		for (int i = 1; i <= N; i++) {
			for (int j = 0; j < stages.length; j++) {
				if (stages[j] >= i) {
					passCnt++;
				}
				if (stages[j] == i) {
					stayCnt++;
				}
			}
			result = stayCnt / passCnt;
			failureList.add(result);
			stayCnt = 0;
			passCnt = 0;

			if (answerList.size() == 0) {
				answerList.add(i);
			} else {
				for (int j = 0; j < answerList.size(); j++) {
					if (result > failureList.get(answerList.get(j) - 1)) {
						answerList.add(j, i);
						break;
					} else if (j == answerList.size() - 1) {
						answerList.add(i);
						break;
					}
				}
			}

		}
		for (int i = 0; i < answerList.size(); i++) {
			answer[i] = answerList.get(i);
		}
		return answer;
	}
}