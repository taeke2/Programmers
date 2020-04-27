package 문제.Level1;

import java.lang.reflect.Array;
import java.util.*;

public class 문자열내맘대로정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strings = { "sun", "bed", "car" };
		Solution11 s11 = new Solution11();
		for (String str : s11.solution(strings, 1))
			System.out.println(str);
	}

}

class Solution11 {
	public String[] solution(String[] strings, int n) {
		String[] answer = new String[strings.length];

		for (int i = 0; i < strings.length; i++) {
			strings[i] = strings[i].charAt(n) + strings[i];
		}
		// s = {"usun", "ebed", "acar"}
		Arrays.sort(strings);
		for (int i = 0; i < strings.length; i++) {
			answer[i] = strings[i].substring(1, strings[i].length());
		}
		return answer;
	}
}