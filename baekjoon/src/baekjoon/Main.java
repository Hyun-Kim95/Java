package baekjoon;

import java.util.Scanner;

public class Main {
	public static int people(int a,int b) {
		if(a==0)
			return b;
		else if(b==1)
			return 1;
		else
			return people(a-1,b) + people(a,b-1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int k = sc.nextInt();
			int n = sc.nextInt();
			System.out.println(people(k,n));				
		}
		sc.close();
	}
}