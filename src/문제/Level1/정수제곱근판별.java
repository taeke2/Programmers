package 문제.Level1;

public class 정수제곱근판별 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n = 121;
		Solution24 sol = new Solution24();
		System.out.println(sol.solution(n));
	}

}

class Solution24 {
	public long solution(long n) {
		if(n%Math.sqrt(n)==0){
	          return (long)Math.pow(Math.sqrt(n)+1,2);
	      }
	      return -1;
	}
}