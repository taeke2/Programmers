package ¹®Á¦.Level1;

import java.util.*;

public class _2016³â {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Solution6 s6 = new Solution6();
		int a = sc.nextInt(), b = sc.nextInt();
		System.out.println(s6.solution(a, b));
	}

}

class Solution6 {
	public String solution(int a, int b) {
		String answer = "";
		String[] day = { "THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED" };
		int[] month = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int sum = 0;
		
		for(int i=0;i<a-1;i++)
			sum += month[i];
		sum += b;
		
		answer = day[sum%7];
		
		return answer;
	}
}