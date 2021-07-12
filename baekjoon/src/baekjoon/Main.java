package baekjoon;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		for(int i=0;i<c;i++) {
			int n = sc.nextInt();
			int score[] = new int[n];
			int sum = 0;
			int cnt = 0;
			for(int j=0;j<n;j++) {
				score[j] = sc.nextInt();
				sum += score[j];
			}
			double avg = (double)sum / (double)n;
			for(int k = 0;k<n;k++) {
				if(score[k] >avg) {
					cnt++;
				}
			}
			System.out.println(String.format("%.3f",(double)cnt/(double)n*100)+"%");
		}
	}
}
