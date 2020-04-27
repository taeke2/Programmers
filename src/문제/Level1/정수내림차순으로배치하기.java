package 문제.Level1;

import java.util.ArrayList;
import java.util.Collections;

public class 정수내림차순으로배치하기 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n = 118372;
		Solution23 sol = new Solution23();
		System.out.println(sol.solution(n));
	}

}

class Solution23 {
	public long solution(long n) {
		long answer = 0;
		int ten = 1;
		ArrayList<Long> num = new ArrayList<Long>();
		while (n > 0) {
			num.add((long) (n % 10));
			n /= 10;
		}
		Collections.sort(num);
		for (int i = 0; i < num.size(); i++) {
			answer += num.get(i) * ten;
			ten *= 10;
		}
		return answer;
	}
}