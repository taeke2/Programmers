package 문제.Level1;

public class 문자열을정수로바꾸기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "-1234";
		Solution17 sol = new Solution17();
		System.out.println(sol.solution(s));
	}

}

class Solution17{
	public int solution(String s) {
		return Integer.parseInt(s);
	}
}
