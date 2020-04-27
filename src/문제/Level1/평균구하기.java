package 문제.Level1;

public class 평균구하기 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {1,2,3,4};
		Solution29 sol = new Solution29();
		System.out.println(sol.solution(num));
	}
}

class Solution29 {
	public double solution(int[] arr) {
		double answer = 0;
		for(int i : arr) {
			answer += i;
		}
		return answer/arr.length;
	}
}