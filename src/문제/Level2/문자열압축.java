package 문제.Level2;

//코딩테스트 문제 ( 문자열 압축 ) 2020.01.05 
//2020 카카오 공채 코딩 테스트 문제

public class 문자열압축 {

	public static void main(String[] args) {
		String s = "abcabcdede";
		Solution str = new Solution();
		System.out.println(str.solution(s));
	}
}

class Solution {
	public int solution(String s) {
		int len = s.length();
		int answer = len;

		for (int i = 1; i <= len / 2; i++) {
			String ss = s.substring(0, i);
			String ss2 = s.substring(0, len);
			String result = "";
			int cnt = 1;
			int cnt2 = len / i;

			for (int j = i; j < len; j += i) {
				if (len % i != 0) {
					if (cnt2 == 1)
						break;
					cnt2--;
				}

				if (ss.equals(s.substring(j, j + i))) {
					cnt += 1;
				} else {
					if (cnt == 1) {
						result += ss;
						ss = s.substring(j, j + i);
					} else {
						result += (cnt + ss);
						ss = s.substring(j, j + i);
						cnt = 1;
					}

				}

				ss2 = s.substring(j, len);
			}

			if (cnt == 1) {
				result += ss2;
			} else {
				result += (cnt + ss2);
			}
			answer = (answer > result.length()) ? result.length() : answer;
			/* 의미 같음
			if (answer > result.length())
				answer = result.length(); */
		}

		return answer;
	}
}
