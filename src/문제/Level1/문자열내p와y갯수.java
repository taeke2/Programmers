package 문제.Level1;

public class 문자열내p와y갯수 {
	public static void main(String[] args) {
		Solution12 s12 = new Solution12();
		String s = "pTTY";
		System.out.println(s12.solution(s));
	}
}

class Solution12 {
	public boolean solution(String s) {
		boolean answer = true;
		int cntP = 0, cntY = 0;
		
		for (int i = 0; i < s.length(); i++) {
			if (s.toLowerCase().charAt(i) == 'p')
				cntP++;
			if (s.toLowerCase().charAt(i) == 'y')
				cntY++;
		}
		answer = (cntP == cntY) ? true : false;
		return answer;
	}
}
