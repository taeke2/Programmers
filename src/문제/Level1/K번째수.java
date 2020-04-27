package 문제.Level1;

import java.util.*;

public class K번째수 {
	public static void main(String[] args) {
		int[] array = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] commands = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };
		Solution4 s = new Solution4();
		int[] result = s.solution(array, commands);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}

class Solution4 {
	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < commands.length; i++) {
			for (int j = commands[i][0]; j <= commands[i][1]; j++) {
				list.add(array[j - 1]);
			}
			Collections.sort(list);
			answer[i] = list.get(commands[i][2]-1);
			list.clear();
		}
		return answer;
	}
}