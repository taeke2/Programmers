package 문제.Level1;

public class 자릿수더하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;
		Solution21 sol = new Solution21();
		System.out.println(sol.solution(n));
	}

}

class Solution21 {
	public int solution(int n) {
		int answer = 0;
		String s = Integer.toString(n);
		for (int i = 0; i < s.length(); i++) {
			answer += Integer.parseInt(s.substring(i, i + 1));
		}
		return answer;
	}
}