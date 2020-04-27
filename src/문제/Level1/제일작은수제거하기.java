package 문제.Level1;

import java.util.ArrayList;
import java.util.Collections;

public class 제일작은수제거하기 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, 3, 2, 1 };
		Solution25 sol = new Solution25();
		for (int a : sol.solution(arr)) {
			System.out.println(a);
		}
	}
}

class Solution25 {
	public int[] solution(int[] arr) {
		if (arr.length == 1) {
			arr[0] = -1;
			return arr;
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		for (int i : arr) {
			list.add(i);
			list2.add(i);
		}
		Collections.sort(list);
		int tmp = list.get(0);
		for (int i = 0; i < list2.size(); i++) {
			if (list2.get(i) == tmp) {
				list2.remove(i);
			}
		}
		int[] answer = new int[list2.size()];
		for (int i = 0; i < list2.size(); i++) {
			answer[i] = list2.get(i);
		}
		return answer;
	}
}
