package 문제.Level1;

import java.util.Scanner;

public class 두정수사이의합 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Solution10 s10 = new Solution10();
		int a = sc.nextInt(), b = sc.nextInt();
		System.out.println(s10.solution(a, b));

	}

}

class Solution10 {
	public long solution(int a, int b) {
		/*long answer = 0;
		if (a == b)
			return a;
		else if (b < a) {
			int tmp = 0;
			tmp = b;
			b = a;
			a = tmp;
		}
		for (int i = a; i <= b; i++) {
			answer += i;
		}
		return answer;*/

		long answer = 0;

		for (int i = Math.min(a, b); i <= Math.max(a, b); i++)
			answer += i;

		return answer;
	}
}