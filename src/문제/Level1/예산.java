package 문제.Level1;

import java.util.Arrays;

public class 예산 {
	public static void main(String[] args) {
		int[] d = {  2,2,3,3 };
		int budget = 9;
		Solution34 sol = new Solution34();
		System.out.println(sol.solution(d, budget));
	}
}

class Solution34 {
	public int solution(int[] d, int budget) {
		int answer = 0;
		int sum = 0;
		
		Arrays.sort(d);
		
		for(int i : d) {
			sum += i;
			if(sum <= budget) {
				answer++;
			}
		}
		
		return answer;
	}
}