package 문제.Level1;

public class 시저암호 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "AB";
		int n = 1;
		Solution18 sol = new Solution18();
		System.out.println(sol.solution(s, n));
	}

}

class Solution18 {
	public String solution(String s, int n) {
		String answer = "";
		char c;
		for (int i = 0; i < s.length(); i++) {
			c = s.charAt(i);
			if ('A' <= c && c <= 'Z') {
				c += n;
				if (c > 'Z')
					c -= 26;
			}
			if ('a' <= c && c <= 'z') {
				c += n;
				if (c > 'z')
					c -= 26;
			}
			answer += c;
		}
		return answer;
	}
}