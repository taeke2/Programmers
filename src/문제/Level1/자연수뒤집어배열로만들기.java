package ����.Level1;

public class �ڿ���������迭�θ���� {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n = 12345;
		Solution22 sol = new Solution22();
		System.out.println(sol.solution(n));
	}

}

class Solution22 {
	public int[] solution(long n) {
		String s = Long.toString(n);
		int[] answer = new int[s.length()];
		int cnt = 0;
		for (int i = answer.length; i > 0; i--) {
			answer[cnt] = Integer.parseInt(s.substring(i - 1, i));
			cnt++;
		}
		return answer;
	}
}