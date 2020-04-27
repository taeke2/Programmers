package 문제.Level1;

import java.util.*;

public class 같은숫자는싫어 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution8 s8 = new Solution8();
		int[] arr = { 1, 1, 3, 3, 0, 1, 1 };
		int[] result = s8.solution(arr);
		for (int i : result)
			System.out.println(i);

	}

}

class Solution8 {
	public int[] solution(int[] arr) {
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		arrList.add(arr[0]);
		int index = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arrList.get(index) != arr[i]) {
				index++;
				arrList.add(arr[i]);
			}
		}
		int[] answer = new int[arrList.size()];
		for (int i = 0; i < arrList.size(); i++) {
			answer[i] = arrList.get(i);
		}

		return answer;
	}
}