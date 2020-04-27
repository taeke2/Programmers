package 문제.Level1;

public class 콜라츠추측 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 626331;
		Solution28 sol = new Solution28();
		System.out.println(sol.solution(num));
	}
}

class Solution28 {
	public int solution(long num) {
		int answer = 0;
		while (answer < 500) {
			if (num == 1)
				break;
			if (num % 2 == 0) {
				num /= 2;
			} else {
				num = num * 3 + 1;
			}
			answer++;
		}
		return answer==500 ? -1 : answer;
	}
}