package 문제.Level1;

public class 핸드폰번호가리기 {
	public static void main(String[] args) {
		String phone_number = "027778888";
		Solution31 sol = new Solution31();
		System.out.println(sol.solution(phone_number));
	}
}

class Solution31{
	public String solution(String phone_number) {
		String answer = "";
		for(int i=0;i<phone_number.substring(0, phone_number.length()-4).length();i++) {
			answer += "*";
		}
		return answer + phone_number.substring(phone_number.length()-4, phone_number.length());
	}
}