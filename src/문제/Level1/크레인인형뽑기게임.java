package 문제.Level1;

import java.util.ArrayList;

public class 크레인인형뽑기게임 {
	public static void main(String[] args) {
		int[][] board = { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 3 }, { 0, 2, 5, 0, 1 }, { 4, 2, 4, 4, 2 },
				{ 3, 5, 1, 3, 1 } };
		int[] moves = { 1, 5, 3, 5, 1, 2, 1, 4 };
		Solution38 sol = new Solution38();
		System.out.println(sol.solution(board, moves));
	}
}

class Solution38 {
	public int solution(int[][] board, int[] moves) {
		int answer = 0;
		int cnt = 0;
		ArrayList<Integer> bag = new ArrayList<Integer>();

		for (int i = 0; i < moves.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (board[j][moves[i] - 1] != 0) {
					bag.add(board[j][moves[i] - 1]);
					if (cnt >= 1) {
						if (bag.get(cnt - 1) == bag.get(cnt)) {
							bag.remove(cnt);
							bag.remove(cnt - 1);
							cnt -= 2;
							answer += 2;
						}
					}
					cnt++;
					board[j][moves[i] - 1] = 0;
					break;
				}
			}
		}
		return answer;
	}
}