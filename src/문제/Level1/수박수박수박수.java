package ����.Level1;

public class ���ڼ��ڼ��ڼ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		Solution16 s = new Solution16();
		System.out.println(s.solution(n));
	}

}

class Solution16 {
	public String solution(int n) {
		/*
		 * String answer = ""; for (int i = 0; i < (n / 2); i++) { answer += "����"; } if
		 * (n % 2 == 1) { answer += "��"; } return answer;
		 */
		return new String(new char[n/2+1]).replace("\0", "����").substring(0,n);
	}
}
