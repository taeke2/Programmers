package 문제.Level1;

import java.util.*;

public class 문자열내림차순배치 {
	public static void main(String[] args) {
		String s = "Zbdcefg";
		Solution13 s13 = new Solution13();
		System.out.println(s13.solution(s));
	}
}

class Solution13 {
	public String solution(String s) {
		/*
		 * String answer = "";
		 * 
		 * 
		 * char[] n = new char[s.length()]; for(int i=0;i<n.length;i++) { n[i] =
		 * s.charAt(i); }
		 * 
		 * 
		 * Arrays.sort(n); for(int i=n.length-1;i>=0;i--) { answer += n[i]; }
		 * 
		 * return answer;
		 */

		char[] ch = s.toCharArray();
		Arrays.sort(ch);
		return new StringBuilder(new String(ch)).reverse().toString();
	}
}
