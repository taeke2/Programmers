package 문제.Level1;

import java.util.*;

public class 가운데글자가져오기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Solution7 s7 = new Solution7();
		String s = sc.next();
		System.out.println(s7.solution(s));
	}

}

class Solution7 {
	public String solution(String s) {
		String answer = "";
		answer = (s.length() % 2 == 0)? s.substring(s.length() / 2 -1, s.length() / 2 + 1) : s.substring(s.length()/2, s.length() / 2 + 1);

		return answer;
	}
}
