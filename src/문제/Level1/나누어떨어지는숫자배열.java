package 문제.Level1;

import java.util.*;

public class 나누어떨어지는숫자배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution9 s9 = new Solution9();
		int[] arr = { 2, 36, 1, 3 };
		int divisor = 1;

		System.out.println(Arrays.toString(s9.solution(arr, divisor)));
	}

}

class Solution9 {
	public int[] solution(int[] arr, int divisor) {
//		ArrayList<Integer> arrList = new ArrayList<Integer>();
//
//		for (int i : arr) {
//			if (i % divisor == 0) {
//				arrList.add(i);
//			}
//		}
//
//		if (arrList.size() == 0) {
//			int[] answer = new int[1];
//			answer[0] = -1;
//			return answer;
//		}
//
//		int[] answer = new int[arrList.size()];
//
//		for (int i = 0; i < answer.length; i++) {
//			answer[i] = arrList.get(i);
//		}
//		Arrays.sort(answer);
//
//		return answer;
		
		int[] answer =Arrays.stream(arr).filter(factor -> factor % divisor == 0).toArray(); 
		Arrays.sort(answer);
		return answer;
	}
}