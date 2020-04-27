package 문제.Level1;

public class 서울에서김서방찾기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] seoul = {"Jane", "Kim"};
		Solution39 sol = new Solution39();
		System.out.println(sol.solution(seoul));
	}

}

class Solution39 {
	  public String solution(String[] seoul) {
	      String answer = "";
			int x = 0;
			for(String kim : seoul) {
				if(kim.equals("Kim")) {
					answer += "김서방은 "+x+"에 있다";
				}
				x++;
			}
			return answer;
	  }
	}