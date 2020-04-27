package 문제.Level1;

public class 약수의합 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 9;
		Solution19 sol = new Solution19();
		System.out.println(sol.solution(n));
	}

}

class Solution19 {
	public int solution(int n) {
		int answer = 0;
		int tmp = (int)Math.sqrt(n);
		for (int i = 1; i < Math.sqrt(n); i++) {
			if(n%i==0) {
				answer += i + n/i;
			}
		}
		if((int)Math.sqrt(n) * (int)Math.sqrt(n) == n)
			answer += (int)Math.sqrt(n);
		return answer;
	}
}