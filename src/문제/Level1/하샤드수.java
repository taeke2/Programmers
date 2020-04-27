package 문제.Level1;

public class 하샤드수 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 11;
		Solution30 sol = new Solution30();
		System.out.println(sol.solution(num));
	}
}

class Solution30 {
	public boolean solution(int x) {
		String s = Integer.toString(x);
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			sum += Integer.parseInt(s.substring(i, i + 1));
		}
		return x % sum == 0 ;
	}
}