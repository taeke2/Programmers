package ¹®Á¦.Level1;

public class Â¦¼ö¿ÍÈ¦¼ö {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 3;
		Solution26 sol = new Solution26();
		System.out.println(sol.solution(num));
	}
}

class Solution26 {
	public String solution(int num) {
		return num%2==0 ?"Even" : "Odd";
	}
}
