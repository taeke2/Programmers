package 문제.Level1;

public class 최대공약수와최소공배수 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3, m = 12;
		Solution27 sol = new Solution27();
		for(int a : sol.solution(n, m)) {
			System.out.println(a);
		}
	}
}

class Solution27 {
	public int[] solution(int n, int m) {
		int[] answer = new int[2];
		int max = 0;
		for (int i = 1; i <= (n < m ? n : m); i++) {
			if (n % i == 0 && m % i == 0) {
				max = i;
			}
		}
		answer[0] = max;
		answer[1] = (n * m) / max;
		return answer;
	}
}