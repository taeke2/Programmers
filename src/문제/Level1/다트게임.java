package 문제.Level1;

public class 다트게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dartResult = "1S2D*3T";
		Solution36 sol = new Solution36();
		// Solution36_copy sol2 = new Solution36_copy();
		System.out.println(sol.solution(dartResult));
		// System.out.println(sol2.solution(dartResult));
	}
}

class Solution36 {
	public int solution(String dartResult) {
		int answer = 0;
		char[] dr = dartResult.toCharArray();
		int[] score = new int[3];
		int round = 0;
		String strNum = "";
		int intNum = 0;
		boolean p = false;

		for (int i = 0; i < dartResult.length(); i++) {
			if (dr[i] >= '0' && dr[i] <= '9') {
				if (p) {
					score[round] = intNum;
					p = false;
					round++;
					strNum = "";
				}
				strNum += dr[i];
				intNum = Integer.parseInt(strNum);
				continue;
			}
			p = true;
			if (dr[i] == 'S') {
				intNum = (int) Math.pow(intNum, 1);
			} else if (dr[i] == 'D') {
				intNum = (int) Math.pow(intNum, 2);
			} else if (dr[i] == 'T') {
				intNum = (int) Math.pow(intNum, 3);
			} else if (dr[i] == '#') {
				intNum *= -1;
			} else if (dr[i] == '*') {
				if (round > 0) {
					score[round-1] *= 2;
				}
				intNum *= 2;
			}
			if (round == 2) {
				score[round] = intNum;
			}

		}
		for (int i : score) {
			answer += i;
		}
		return answer;
	}
}

//---------------------------------------------------------------------------------------

class Solution36_copy {
	public int solution(String dartResult) {
		int answer = 0; // 답
		int[] anArr = new int[3]; // 세번의기회
		int anArrCnt = 0; // 기회 카운트
		char[] arr = dartResult.toCharArray(); // 다트 결과 각 자리마다 char형으로
		int intNum = 0; // 점수 1~10까지 담는 변수
		boolean ck = false; // ???

		String proc = ""; // intNum에 넣을 숫자 String

		for (int i = 0; i < dartResult.length(); i++) {
			if (arr[i] >= 48 && arr[i] <= 57) { // 점수 or SDT*# 구분
				if (ck) { // ck가 true면 점수 기록
					anArr[anArrCnt] = intNum; // anArrCnt번째 점수 입력
					anArrCnt++; // 기회 카운트 +1
					ck = false; // 점수 입력 위해 ck false
					proc = ""; // 점수 String 초기화
					intNum = 0; // 점수 변수 초기화
				}
				proc += String.valueOf(arr[i]);
				intNum = Integer.valueOf(proc);

				continue; // continue가 나오면 아래문장 계속이 아니라 반복문 다음으로 계속 : 20200404 처음 앎;
			}
			ck = true;
			if (arr[i] == 'S') {
				intNum = (int) Math.pow(intNum, 1);
			} else if (arr[i] == 'D') {
				intNum = (int) Math.pow(intNum, 2);
			} else if (arr[i] == 'T') {
				intNum = (int) Math.pow(intNum, 3);
			} else if (arr[i] == '*') {
				intNum *= 2;
				if (anArrCnt > 0)
					anArr[anArrCnt - 1] *= 2;
			} else if (arr[i] == '#') {
				intNum *= -1;
			}
			if (anArrCnt == 2)
				anArr[anArrCnt] = intNum;
		}

		for (int s : anArr) {
			answer += s;
		}

		return answer;
	}
}