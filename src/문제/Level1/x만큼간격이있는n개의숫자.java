package ����.Level1;

public class x��ŭ�������ִ�n���Ǽ��� {
	public static void main(String[] args) {
		int x = 2, n = 5;
		Solution33 sol = new Solution33();
	}
}

class Solution33 {
	  public long[] solution(int x, int n) {
	      long[] answer = new long[n];
	      long cnt = x;
	      for(int i=0;i<n;i++) {
	    	  answer[i] = cnt;
	    	  cnt += x;
	      }
	      return answer;
	  }
	}