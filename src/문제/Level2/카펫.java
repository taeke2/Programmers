package ¹®Á¦.Level2;

public class Ä«Æê {
	public int[] solution(int brown, int red) {
		int[] answer = new int[2];

		int x1 = ((brown + 4) + (int) Math.sqrt(Math.pow(brown + 4, 2) - (8 * (red + brown)))) / 4;
		int x2 = ((brown + 4) - (int) Math.sqrt(Math.pow(brown + 4, 2) - (8 * (red + brown)))) / 4;
		System.out.println(x1 + " " + x2);

		return answer;
	}
}
