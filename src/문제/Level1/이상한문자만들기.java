package 문제.Level1;

public class 이상한문자만들기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "try hello world";
		Solution20 sol = new Solution20();
		System.out.println(sol.solution(s));
	}

}

class Solution20 {
	public String solution(String s) {
		String answer = "";
		String[] ss = s.split(" ", -1);
		for (String word : ss) {
			for (int i = 0; i < word.length(); i++) {
				if (i % 2 == 0) {
					answer += word.valueOf(word.charAt(i)).toUpperCase();
				} else if (i % 2 == 1) {
					answer += word.valueOf(word.charAt(i)).toLowerCase();
				}
			}
			answer += " ";
		}

		return answer.substring(0, answer.length() - 1);
	}
}