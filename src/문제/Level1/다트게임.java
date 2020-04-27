package ����.Level1;

public class ��Ʈ���� {

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
		int answer = 0; // ��
		int[] anArr = new int[3]; // �����Ǳ�ȸ
		int anArrCnt = 0; // ��ȸ ī��Ʈ
		char[] arr = dartResult.toCharArray(); // ��Ʈ ��� �� �ڸ����� char������
		int intNum = 0; // ���� 1~10���� ��� ����
		boolean ck = false; // ???

		String proc = ""; // intNum�� ���� ���� String

		for (int i = 0; i < dartResult.length(); i++) {
			if (arr[i] >= 48 && arr[i] <= 57) { // ���� or SDT*# ����
				if (ck) { // ck�� true�� ���� ���
					anArr[anArrCnt] = intNum; // anArrCnt��° ���� �Է�
					anArrCnt++; // ��ȸ ī��Ʈ +1
					ck = false; // ���� �Է� ���� ck false
					proc = ""; // ���� String �ʱ�ȭ
					intNum = 0; // ���� ���� �ʱ�ȭ
				}
				proc += String.valueOf(arr[i]);
				intNum = Integer.valueOf(proc);

				continue; // continue�� ������ �Ʒ����� ����� �ƴ϶� �ݺ��� �������� ��� : 20200404 ó�� ��;
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