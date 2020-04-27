package 문제.Level1;

public class 비밀지도 {
	public static void main(String[] args) {
		int n = 5;
		int[] arr1 = { 9, 20, 28, 18, 11 };
		int[] arr2 = { 30, 1, 21, 17, 28 };
		Solution35 sol = new Solution35();
		Solution35_2 sol2 = new Solution35_2();
		
		for (String s : sol.solution(n, arr1, arr2)) {
			System.out.println(s);
		}
		
		for (String s : sol2.solution(n, arr1, arr2)) {
			System.out.println(s);
		}
	}
}

class Solution35 {
	public String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];
		boolean p1 = true;
		boolean p2 = true;

		for (int i = 0; i < n; i++) {
			answer[i] = "";
			for (int j = n-1; j >= 0; j--) {
				if (Math.pow(2, j) <= arr1[i]) {
					p1 = true;
					arr1[i] -= Math.pow(2, j);
				}else {
					p1 = false;
				}
				if (Math.pow(2, j) <= arr2[i]) {
					p2 = true;
					arr2[i] -= Math.pow(2, j);
				}else {
					p2 = false;
				}
				if(p1 || p2) {
					answer[i] += "#";
				}else {
					answer[i] += " ";
				}
			}
		}
		
		return answer;
	}
}

class Solution35_2{
	public String makeSharp(int n, int m) {
        if(n == 0) {
            if( m > 0) {
                String str = "";
                for(int i = 0; i < m; i++) {
                    str += " ";
                }
                return str;
            }
            else return "";
        }
        else {
            return n % 2 == 0 ? makeSharp(n/2, m-1) + " " : makeSharp(n/2, m-1) + "#"; 
        }
    }
    public String[] solution(int n, int [] arr1, int [] arr2) {
        String [] answer = new String[n];
        int [] secretMap = new int[n];
        for(int i = 0; i < n; i++) {
            secretMap[i] = arr1[i] | arr2[i];
            answer[i] = makeSharp(secretMap[i], n);
        }
        return answer;
    }
}