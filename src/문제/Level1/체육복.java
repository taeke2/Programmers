package ����.Level1;

import java.util.*;

public class ü���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int[] lost = { 2, 4 };
		int[] reserve = { 1, 3, 5 };
		Solution5 s = new Solution5();
		System.out.println(s.solution(n, lost, reserve));
	}

}

class Solution5 {
	public int solution(int n, int[] lost, int[] reserve) {
		int answer = 0;
		int lost1 = 0;
		int count = 0;

		// ���� ���� ������ �ִ� �л��� ���� ���ϸ� ������ �� ������ �����.
		for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if (lost[i] == reserve[j]) {
					lost1++;
					lost[i] = -1;
					reserve[j] = -1;
					break;
				}
			}
		}

		// ���� �����ְ� -1�� ����� ���� �л����� �������� �ʰ� �Ѵ�.
		for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if (lost[i] == reserve[j] + 1 || lost[i] == reserve[j] - 1) {
					count++;
					reserve[j] = -1;
					break;
				}
			}
		}
		// answer�� ��ü �л������� �Ҿ���� �л� ���� ����.
		// �Ŀ� �������� ���� �л��� ���� �������� �� ����ŭ �����ְ� ���� ������ �л� �� ��ŭ �ٽ� �����ش�.
		answer = n - lost.length + lost1 + count;

		return answer;

	}
}