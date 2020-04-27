package 문제.Level1;

public class 소수찾기 {
	public static void main(String[] args) {
		int n = 5;
		Solution15 s = new Solution15();
		System.out.println(s.solution(n));
	}
}

class Solution15 {
	public int solution(int n) {
		int answer = 0;
		for (int i = 2; i <= n; i++) {
			boolean p = true;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0 && i != 2) {
					p = false;
					break;
				}
			}
			if (p)
				answer++;
		}
		return answer;
	}
}